import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBackedMethodImplementation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.util.ReferenceUtil;
import java.io.File;

/** Usage: DexInspect <dex> <classDescriptor> [methodName] -- dumps methods with instruction unit offsets. */
public class DexInspect {
    static int insnsStart(DexBackedMethodImplementation impl) throws Exception {
        java.lang.reflect.Method g = DexBackedMethodImplementation.class.getDeclaredMethod("getInstructionsStartOffset");
        g.setAccessible(true);
        return (Integer) g.invoke(impl);
    }
    public static void main(String[] a) throws Exception {
        DexBackedDexFile dex = DexFileFactory.loadDexFile(new File(a[0]), Opcodes.forApi(33));
        for (ClassDef c : dex.getClasses()) {
            if (!c.getType().equals(a[1])) continue;
            for (Method m : c.getMethods()) {
                if (a.length > 2 && !m.getName().equals(a[2])) continue;
                DexBackedMethodImplementation impl = (DexBackedMethodImplementation) m.getImplementation();
                StringBuilder ps = new StringBuilder();
                for (CharSequence p : m.getParameterTypes()) ps.append(p);
                System.out.printf("METHOD %s(%s)%s  access=0x%x%n", m.getName(), ps, m.getReturnType(), m.getAccessFlags());
                if (impl == null) { System.out.println("  (no code)"); continue; }
                System.out.printf("  registers=%d insnsFileOffset=0x%x tries=%d%n", impl.getRegisterCount(), insnsStart(impl), impl.getTryBlocks().size());
                int unit = 0;
                for (Instruction i : impl.getInstructions()) {
                    String ref = "";
                    if (i instanceof ReferenceInstruction) ref = "  " + ReferenceUtil.getReferenceString(((ReferenceInstruction) i).getReference());
                    System.out.printf("    @%-4d %-22s units=%d%s%n", unit, i.getOpcode().name, i.getCodeUnits(), ref);
                    unit += i.getCodeUnits();
                }
            }
        }
    }
}
