import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBackedMethodImplementation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.OffsetInstruction;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.util.ReferenceUtil;

import java.io.File;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.*;
import java.util.zip.Adler32;

/**
 * In-place DEX instruction patcher. Overwrites a handful of instructions inside existing
 * method bodies (never changing any size or offset), then fixes the DEX checksum + SHA-1.
 *
 * Usage: DexPatch <dexDir> <specFile> <outDir>
 *
 * Spec line:  CLASS | METHOD | PROTO | ACTION | ARG      ('#' starts a comment)
 *   GETTER_NULL            iget-object+return-object  ->  const/4 v0,0 ; return-object v0 ; nop
 *   RET_VOID               method starts with return-void (rest becomes dead code)
 *   RET_TRUE               boolean method starts with: const/4 v0,1 ; return v0
 *   NOP_INVOKE <substr>    the single invoke whose reference contains <substr> (and a directly
 *                          following move-result*) becomes nops
 * Every action first checks the code still has the shape that was inspected, and refuses to
 * patch if a branch / switch / exception handler targets the overwritten interior.
 */
public class DexPatch {
    static final int NOP = 0x0000, RETURN_VOID = 0x000e, RETURN = 0x000f, RETURN_OBJECT = 0x0011;
    static final int CONST4_V0_0 = 0x0012, CONST4_V0_1 = 0x1012;

    record Spec(String cls, String name, String proto, String action, String arg, int line) {}
    record Write(int offset, int[] units, String what) {}

    static int insnsStart(DexBackedMethodImplementation impl) throws Exception {
        java.lang.reflect.Method g = DexBackedMethodImplementation.class.getDeclaredMethod("getInstructionsStartOffset");
        g.setAccessible(true);
        return (Integer) g.invoke(impl);
    }

    static String proto(Method m) {
        StringBuilder sb = new StringBuilder("(");
        for (CharSequence p : m.getParameterTypes()) sb.append(p);
        return sb.append(')').append(m.getReturnType()).toString();
    }

    public static void main(String[] args) throws Exception {
        File dexDir = new File(args[0]), spec = new File(args[1]), outDir = new File(args[2]);
        outDir.mkdirs();
        List<Spec> specs = new ArrayList<>();
        int ln = 0;
        for (String raw : Files.readAllLines(spec.toPath())) {
            ln++;
            String s = raw.strip();
            if (s.isEmpty() || s.startsWith("#")) continue;
            String[] p = s.split("\\s*\\|\\s*", -1);
            specs.add(new Spec(p[0], p[1], p[2], p[3], p.length > 4 ? p[4] : "", ln));
        }

        File[] dexFiles = dexDir.listFiles((d, n) -> n.matches("classes\\d*\\.dex"));
        Arrays.sort(dexFiles);
        Map<String, List<Write>> writes = new TreeMap<>();
        Set<Spec> done = new HashSet<>();

        for (File f : dexFiles) {
            DexBackedDexFile dex = DexFileFactory.loadDexFile(f, Opcodes.forApi(33));
            for (ClassDef c : dex.getClasses()) {
                for (Spec sp : specs) {
                    if (!c.getType().equals(sp.cls)) continue;
                    Method target = null;
                    for (Method m : c.getMethods())
                        if (m.getName().equals(sp.name) && proto(m).equals(sp.proto)) target = m;
                    if (target == null) fail(sp, "method not found in " + f.getName());
                    List<Write> w = plan(sp, target);
                    writes.computeIfAbsent(f.getName(), k -> new ArrayList<>()).addAll(w);
                    if (!done.add(sp)) fail(sp, "class/method matched twice");
                    for (Write x : w) System.out.printf("  %-12s %s.%s%s  %s @0x%x%n", f.getName(), sp.cls, sp.name, sp.proto, x.what, x.offset);
                }
            }
        }
        for (Spec sp : specs) if (!done.contains(sp)) fail(sp, "class not found in any dex");

        for (Map.Entry<String, List<Write>> e : writes.entrySet()) {
            byte[] b = Files.readAllBytes(new File(dexDir, e.getKey()).toPath());
            boolean[] touched = new boolean[b.length];
            for (Write w : e.getValue())
                for (int i = 0; i < w.units.length; i++) {
                    int o = w.offset + i * 2;
                    if (touched[o] || touched[o + 1]) throw new IllegalStateException("overlapping writes in " + e.getKey() + " @0x" + Integer.toHexString(o));
                    touched[o] = touched[o + 1] = true;
                    b[o] = (byte) (w.units[i] & 0xff);
                    b[o + 1] = (byte) ((w.units[i] >> 8) & 0xff);
                }
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            sha.update(b, 32, b.length - 32);
            System.arraycopy(sha.digest(), 0, b, 12, 20);
            Adler32 ad = new Adler32();
            ad.update(b, 12, b.length - 12);
            long v = ad.getValue();
            for (int i = 0; i < 4; i++) b[8 + i] = (byte) ((v >> (8 * i)) & 0xff);
            Files.write(new File(outDir, e.getKey()).toPath(), b);
            System.out.println("patched " + e.getKey() + ": " + e.getValue().size() + " edit(s), checksum+sha1 fixed");
        }
        System.out.println("DONE: " + specs.size() + " spec line(s) applied across " + writes.size() + " dex file(s)");
    }

    static void fail(Spec s, String why) {
        System.err.println("REFUSING (spec line " + s.line + ": " + s.cls + "." + s.name + s.proto + " " + s.action + "): " + why);
        System.exit(2);
    }

    static boolean isMoveResult(Instruction i) { return i.getOpcode().name.startsWith("move-result"); }

    static List<Write> plan(Spec sp, Method m) throws Exception {
        DexBackedMethodImplementation impl = (DexBackedMethodImplementation) m.getImplementation();
        if (impl == null) fail(sp, "method has no code");
        int base = insnsStart(impl);
        List<Instruction> ins = new ArrayList<>();
        List<Integer> at = new ArrayList<>();
        int u = 0;
        for (Instruction i : impl.getInstructions()) { ins.add(i); at.add(u); u += i.getCodeUnits(); }
        if (impl.getRegisterCount() < 1) fail(sp, "no registers");

        // Which instruction range [from,to) (indexes) gets rewritten, and with what.
        int from, to;
        int[] repl;
        String what;
        switch (sp.action) {
            case "GETTER_NULL": {
                if (ins.size() != 2 || !ins.get(0).getOpcode().name.equals("iget-object") || !ins.get(1).getOpcode().name.equals("return-object") || u != 3)
                    fail(sp, "not a plain 'iget-object; return-object' getter");
                if (impl.getRegisterCount() < 2) fail(sp, "need a free v0 distinct from 'this'");
                from = 0; to = 2; repl = new int[]{CONST4_V0_0, RETURN_OBJECT, NOP};
                what = "getter -> null";
                break;
            }
            case "RET_VOID": {
                if (!m.getReturnType().equals("V")) fail(sp, "not a void method");
                from = 0; to = 1;
                if (to < ins.size() && isMoveResult(ins.get(to))) to++;
                repl = fill(units(ins, from, to), RETURN_VOID);
                what = "return-void at entry";
                break;
            }
            case "RET_TRUE": {
                if (!m.getReturnType().equals("Z")) fail(sp, "not a boolean method");
                if (impl.getRegisterCount() < 2) fail(sp, "need a free v0 distinct from 'this'");
                from = 0; to = 0; int n = 0;
                while (n < 2) { n += ins.get(to).getCodeUnits(); to++; }
                if (to < ins.size() && isMoveResult(ins.get(to))) to++;
                repl = fill(units(ins, from, to), CONST4_V0_1, RETURN);
                what = "boolean method -> return true";
                break;
            }
            case "NOP_INVOKE": {
                int hit = -1, cnt = 0;
                for (int i = 0; i < ins.size(); i++) {
                    Instruction x = ins.get(i);
                    if (x.getOpcode().name.startsWith("invoke") && x instanceof ReferenceInstruction
                            && ReferenceUtil.getReferenceString(((ReferenceInstruction) x).getReference()).contains(sp.arg)) { hit = i; cnt++; }
                }
                if (cnt != 1) fail(sp, "expected exactly 1 invoke containing '" + sp.arg + "', found " + cnt);
                from = hit; to = hit + 1;
                if (to < ins.size() && isMoveResult(ins.get(to))) to++;
                repl = fill(units(ins, from, to));
                what = "nop invoke " + sp.arg;
                break;
            }
            default: fail(sp, "unknown action " + sp.action); return null;
        }

        int startU = at.get(from);
        int endU = (to < ins.size()) ? at.get(to) : u;
        if (repl.length != endU - startU) fail(sp, "internal: replacement length " + repl.length + " != " + (endU - startU));

        // Nothing may jump / handle into the interior of the overwritten range.
        Set<Integer> targets = new HashSet<>();
        for (int i = 0; i < ins.size(); i++)
            if (ins.get(i) instanceof OffsetInstruction) targets.add(at.get(i) + ((OffsetInstruction) ins.get(i)).getCodeOffset());
        for (TryBlock<? extends ExceptionHandler> tb : impl.getTryBlocks())
            for (ExceptionHandler h : tb.getExceptionHandlers()) targets.add(h.getHandlerCodeAddress());
        // (a switch's own payload targets are relative to the switch; none of our targets use switches)
        for (int t : targets) {
            if (t > startU && t < endU) fail(sp, "a branch/handler targets unit " + t + " inside the overwritten range " + startU + ".." + endU);
        }
        return List.of(new Write(base + startU * 2, repl, what));
    }

    static int units(List<Instruction> ins, int from, int to) {
        int n = 0;
        for (int i = from; i < to; i++) n += ins.get(i).getCodeUnits();
        return n;
    }

    /** head instructions followed by nops up to total length n (n supplied via first call overload). */
    static int[] fill(int total, int... head) {
        if (head.length > total) throw new IllegalStateException("replacement (" + head.length + ") longer than range (" + total + ")");
        int[] r = new int[total];
        System.arraycopy(head, 0, r, 0, head.length);
        return r;
    }
}
