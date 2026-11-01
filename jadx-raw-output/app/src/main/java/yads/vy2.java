package yads;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class vy2 implements nr {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f84046j = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f84047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur f84048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls f84049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wr f84050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f84051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f84052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f84053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kr f84055i;

    public vy2(File file, bf1 bf1Var, ls lsVar, wr wrVar) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f84047a = file;
        this.f84048b = bf1Var;
        this.f84049c = lsVar;
        this.f84050d = wrVar;
        this.f84051e = new HashMap();
        this.f84052f = new Random();
        this.f84053g = true;
        this.f84054h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new uy2(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final void a(yy2 yy2Var) {
        this.f84049c.a(yy2Var.f85570b).f78341c.add(yy2Var);
        ArrayList arrayList = (ArrayList) this.f84051e.get(yy2Var.f85570b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bf1 bf1Var = (bf1) ((ur) arrayList.get(size));
                bf1Var.f75800b.add(yy2Var);
                bf1Var.f75801c += yy2Var.f85572d;
                bf1Var.a(this, 0L);
            }
        }
        bf1 bf1Var2 = (bf1) this.f84048b;
        bf1Var2.f75800b.add(yy2Var);
        bf1Var2.f75801c += yy2Var.f85572d;
        bf1Var2.a(this, 0L);
    }

    public final synchronized long b(String str, long j10, long j11) {
        hs hsVar;
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        hsVar = (hs) this.f84049c.f79894a.get(str);
        return hsVar != null ? hsVar.a(j10, j11) : -j11;
    }

    public final synchronized void c(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            b((zr) it.next());
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f84049c.f79894a.values()).iterator();
        while (it.hasNext()) {
            for (zr zrVar : ((hs) it.next()).f78341c) {
                if (zrVar.f85574f.length() != zrVar.f85572d) {
                    arrayList.add(zrVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b((zr) arrayList.get(i10));
        }
    }

    public final synchronized jc0 b(String str) {
        jc0 jc0Var;
        hs hsVar = (hs) this.f84049c.f79894a.get(str);
        if (hsVar != null) {
            jc0Var = hsVar.f78343e;
        } else {
            jc0Var = jc0.f78970c;
        }
        return jc0Var;
    }

    public final void b() {
        long j10;
        if (!this.f84047a.exists()) {
            try {
                a(this.f84047a);
            } catch (kr e10) {
                this.f84055i = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f84047a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f84047a;
            ih1.b("SimpleCache", str);
            this.f84055i = new kr(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                j10 = -1;
                break;
            }
            File file = fileArrListFiles[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    ih1.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i10++;
        }
        this.f84054h = j10;
        if (j10 == -1) {
            try {
                this.f84054h = b(this.f84047a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f84047a;
                ih1.b("SimpleCache", ih1.a(str2, e11));
                this.f84055i = new kr(str2, e11);
                return;
            }
        }
        try {
            this.f84049c.a(this.f84054h);
            wr wrVar = this.f84050d;
            if (wrVar != null) {
                wrVar.a(this.f84054h);
                HashMap mapA = this.f84050d.a();
                a(this.f84047a, true, fileArrListFiles, mapA);
                this.f84050d.a(mapA.keySet());
            } else {
                a(this.f84047a, true, fileArrListFiles, null);
            }
            ls lsVar = this.f84049c;
            ja3 it = u51.a(lsVar.f79894a.keySet()).iterator();
            while (it.hasNext()) {
                lsVar.b((String) it.next());
            }
            try {
                this.f84049c.a();
            } catch (Throwable th2) {
                ih1.b("SimpleCache", ih1.a("Storing index file failed", th2));
            }
        } catch (Throwable th3) {
            String str3 = "Failed to initialize cache indices: " + this.f84047a;
            ih1.b("SimpleCache", ih1.a(str3, th3));
            this.f84055i = new kr(str3, th3);
        }
    }

    public final synchronized yy2 c(String str, long j10, long j11) {
        yy2 yy2VarB;
        File file;
        a();
        hs hsVar = (hs) this.f84049c.f79894a.get(str);
        if (hsVar == null) {
            yy2VarB = new yy2(str, j10, j11, -9223372036854775807L, null);
        } else {
            while (true) {
                yy2VarB = hsVar.b(j10, j11);
                if (!yy2VarB.f85573e || yy2VarB.f85574f.length() == yy2VarB.f85572d) {
                    break;
                }
                c();
            }
        }
        int i10 = 0;
        if (yy2VarB.f85573e) {
            if (this.f84053g) {
                File file2 = yy2VarB.f85574f;
                file2.getClass();
                String name = file2.getName();
                long j12 = yy2VarB.f85572d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                wr wrVar = this.f84050d;
                if (wrVar != null) {
                    try {
                        wrVar.a(name, j12, jCurrentTimeMillis);
                    } catch (IOException unused) {
                        ih1.d("SimpleCache", "Failed to update index with new touch timestamp.");
                    }
                } else {
                    i10 = 1;
                }
                hs hsVar2 = (hs) this.f84049c.f79894a.get(str);
                if (hsVar2.f78341c.remove(yy2VarB)) {
                    File file3 = yy2VarB.f85574f;
                    file3.getClass();
                    if (i10 != 0) {
                        File parentFile = file3.getParentFile();
                        parentFile.getClass();
                        long j13 = yy2VarB.f85571c;
                        int i11 = hsVar2.f78339a;
                        Pattern pattern = yy2.f85150h;
                        File file4 = new File(parentFile, i11 + "." + j13 + "." + jCurrentTimeMillis + ".v3.exo");
                        if (file3.renameTo(file4)) {
                            file = file4;
                        } else {
                            ih1.d("CachedContent", "Failed to rename " + file3 + " to " + file4);
                            file = file3;
                        }
                    } else {
                        file = file3;
                    }
                    if (yy2VarB.f85573e) {
                        yy2 yy2Var = new yy2(yy2VarB.f85570b, yy2VarB.f85571c, yy2VarB.f85572d, jCurrentTimeMillis, file);
                        hsVar2.f78341c.add(yy2Var);
                        ArrayList arrayList = (ArrayList) this.f84051e.get(yy2VarB.f85570b);
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                bf1 bf1Var = (bf1) ((ur) arrayList.get(size));
                                bf1Var.f75800b.remove(yy2VarB);
                                bf1Var.f75801c -= yy2VarB.f85572d;
                                bf1Var.f75800b.add(yy2Var);
                                bf1Var.f75801c += yy2Var.f85572d;
                                bf1Var.a(this, 0L);
                            }
                        }
                        bf1 bf1Var2 = (bf1) this.f84048b;
                        bf1Var2.f75800b.remove(yy2VarB);
                        bf1Var2.f75801c -= yy2VarB.f85572d;
                        bf1Var2.f75800b.add(yy2Var);
                        bf1Var2.f75801c += yy2Var.f85572d;
                        bf1Var2.a(this, 0L);
                        yy2VarB = yy2Var;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return yy2VarB;
        }
        hs hsVarA = this.f84049c.a(str);
        long j14 = yy2VarB.f85572d;
        while (true) {
            if (i10 < hsVarA.f78342d.size()) {
                gs gsVar = (gs) hsVarA.f78342d.get(i10);
                long j15 = gsVar.f77914a;
                if (j15 <= j10) {
                    long j16 = gsVar.f77915b;
                    if (j16 == -1 || j15 + j16 > j10) {
                        break;
                    }
                    i10++;
                } else {
                    if (j14 == -1 || j10 + j14 > j15) {
                        break;
                    }
                    i10++;
                }
            } else {
                hsVarA.f78342d.add(new gs(j10, j14));
                return yy2VarB;
            }
        }
        return null;
    }

    public final synchronized void a(String str, rz rzVar) {
        a();
        ls lsVar = this.f84049c;
        hs hsVarA = lsVar.a(str);
        jc0 jc0Var = hsVarA.f78343e;
        jc0 jc0VarA = jc0Var.a(rzVar);
        hsVarA.f78343e = jc0VarA;
        if (!jc0VarA.equals(jc0Var)) {
            lsVar.f79898e.a(hsVarA);
        }
        try {
            this.f84049c.a();
        } catch (Throwable th2) {
            throw new kr(th2);
        }
    }

    public vy2(File file, bf1 bf1Var, jn0 jn0Var) {
        this(file, bf1Var, new ls(jn0Var, file), new wr(jn0Var));
    }

    public final synchronized void a() {
        kr krVar = this.f84055i;
        if (krVar != null) {
            throw krVar;
        }
    }

    public static void a(File file) throws kr {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        ih1.b("SimpleCache", str);
        throw new kr(str);
    }

    public final synchronized long a(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 < 0 ? Long.MAX_VALUE : j13;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long jB = b(str, j15, j14 - j15);
            if (jB > 0) {
                j12 += jB;
            } else {
                jB = -jB;
            }
            j15 += jB;
        }
        return j12;
    }

    public final synchronized TreeSet a(String str) {
        TreeSet treeSet;
        hs hsVar = (hs) this.f84049c.f79894a.get(str);
        if (hsVar != null && !hsVar.f78341c.isEmpty()) {
            treeSet = new TreeSet((Collection) hsVar.f78341c);
        } else {
            treeSet = new TreeSet();
        }
        return treeSet;
    }

    public final void a(File file, boolean z10, File[] fileArr, HashMap map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                long j10 = -1;
                long j11 = -9223372036854775807L;
                vr vrVar = map != null ? (vr) map.remove(name) : null;
                if (vrVar != null) {
                    j10 = vrVar.f83993a;
                    j11 = vrVar.f83994b;
                }
                yy2 yy2VarA = yy2.a(file2, j10, j11, this.f84049c);
                if (yy2VarA != null) {
                    a(yy2VarA);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void b(zr zrVar) {
        hs hsVar = (hs) this.f84049c.f79894a.get(zrVar.f85570b);
        if (hsVar == null || !hsVar.f78341c.remove(zrVar)) {
            return;
        }
        File file = zrVar.f85574f;
        if (file != null) {
            file.delete();
        }
        if (this.f84050d != null) {
            String name = zrVar.f85574f.getName();
            try {
                wr wrVar = this.f84050d;
                wrVar.f84302b.getClass();
                try {
                    wrVar.f84301a.getWritableDatabase().delete(wrVar.f84302b, "name = ?", new String[]{name});
                } catch (Throwable th2) {
                    throw new v30(th2);
                }
            } catch (IOException unused) {
                pk1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f84049c.b(hsVar.f78340b);
        ArrayList arrayList = (ArrayList) this.f84051e.get(zrVar.f85570b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bf1 bf1Var = (bf1) ((ur) arrayList.get(size));
                bf1Var.f75800b.remove(zrVar);
                bf1Var.f75801c -= zrVar.f85572d;
            }
        }
        bf1 bf1Var2 = (bf1) this.f84048b;
        bf1Var2.f75800b.remove(zrVar);
        bf1Var2.f75801c -= zrVar.f85572d;
    }

    public final synchronized void a(zr zrVar) {
        ls lsVar = this.f84049c;
        hs hsVar = (hs) lsVar.f79894a.get(zrVar.f85570b);
        hsVar.getClass();
        long j10 = zrVar.f85571c;
        for (int i10 = 0; i10 < hsVar.f78342d.size(); i10++) {
            if (((gs) hsVar.f78342d.get(i10)).f77914a == j10) {
                hsVar.f78342d.remove(i10);
                this.f84049c.b(hsVar.f78340b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public static long b(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized boolean c(File file) {
        return f84046j.add(file.getAbsoluteFile());
    }
}
