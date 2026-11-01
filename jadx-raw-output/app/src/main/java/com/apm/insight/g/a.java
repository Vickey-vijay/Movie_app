package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.e;
import com.apm.insight.k.h;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.m;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: CrashCatchDispatcher.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f6433a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile boolean f6434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile ThreadLocal<Boolean> f6435j = new ThreadLocal<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile long f6436l = 10000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ArrayList<b> f6437m = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f6438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f6439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f6440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f6441e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f6442f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6443g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6444h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONArray f6445k;

    public static a a() {
        if (f6433a == null) {
            f6433a = new a();
        }
        return f6433a;
    }

    private void c(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6438b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }

    private void d() {
        synchronized (this) {
            this.f6442f--;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (this.f6442f != 0 && SystemClock.uptimeMillis() - jUptimeMillis < f6436l) {
            SystemClock.sleep(50L);
        }
    }

    private static int f() {
        int iA = 0;
        for (int i10 = 0; i10 < f6437m.size(); i10++) {
            try {
                try {
                    iA |= f6437m.get(i10).a();
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    j.a(th2, "NPTH_CATCH");
                }
            } catch (Throwable unused) {
            }
        }
        return iA;
    }

    private static Throwable g() {
        for (int i10 = 0; i10 < f6437m.size(); i10++) {
            try {
                f6437m.get(i10);
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    public final void b(c cVar) {
        this.f6440d = cVar;
    }

    private static boolean b(Thread thread, Throwable th2) {
        ICrashFilter iCrashFilterB = e.b().b();
        if (iCrashFilterB != null) {
            try {
                if (!iCrashFilterB.onJavaCrashFilter(th2, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    private a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f6438b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a("data", (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a aVarA = f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (aVarA != null) {
                            com.apm.insight.k.d.a().c(aVarA.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void e() {
        File fileA = com.apm.insight.l.j.a(e.g());
        File fileA2 = com.apm.insight.l.j.a();
        if (com.apm.insight.l.f.b(fileA) && com.apm.insight.l.f.b(fileA2)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!h.a() && SystemClock.uptimeMillis() - jUptimeMillis < f6436l) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        do {
            th2 = a(thread, th2);
        } while (th2 != null);
    }

    public static boolean c() {
        Boolean bool = f6435j.get();
        return bool != null && bool.booleanValue();
    }

    public final void a(c cVar) {
        this.f6439c = cVar;
    }

    public final boolean b(String str) {
        return this.f6443g.containsKey(str);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d0 A[Catch: all -> 0x01fd, TRY_LEAVE, TryCatch #13 {all -> 0x01fd, blocks: (B:105:0x01ca, B:107:0x01d0), top: B:170:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:160:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [long] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private Throwable a(Thread thread, Throwable th2) {
        boolean zC;
        boolean z10;
        CrashType crashType;
        ?? r10;
        ?? r11;
        ?? r12;
        boolean z11;
        ?? ValueOf;
        ?? r13;
        CrashType crashType2;
        String strA;
        c cVar;
        boolean z12;
        if (this.f6441e >= 3) {
            return null;
        }
        this.f6441e++;
        this.f6442f++;
        if (f6434i) {
            f6435j.set(Boolean.TRUE);
        }
        f6434i = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z13 = false;
        boolean z14 = (com.apm.insight.runtime.a.b.c() == -1 || jCurrentTimeMillis - com.apm.insight.runtime.a.b.c() <= e.i().getLaunchCrashInterval()) && !(e.n() && e.q() == 0);
        try {
            zC = com.apm.insight.l.m.c(th2);
            if (zC) {
                try {
                    if (com.apm.insight.l.m.d(th2)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } catch (Throwable unused) {
                    z10 = false;
                }
            } else {
                z12 = false;
            }
            z10 = z12;
        } catch (Throwable unused2) {
            zC = false;
        }
        try {
            if (z14) {
                try {
                    crashType = CrashType.LAUNCH;
                } catch (Throwable th3) {
                    th = th3;
                    z11 = false;
                    r10 = z10;
                    r11 = jCurrentTimeMillis;
                    r12 = 1;
                    try {
                        if (!com.apm.insight.l.m.c(th)) {
                            com.apm.insight.a.a(th);
                        }
                        if (!z13) {
                            if (r10 != 0) {
                                a(thread, th2, z14, r11);
                            }
                            e();
                            d();
                            c(thread, th2);
                            return null;
                        }
                        synchronized (this) {
                            this.f6442f -= r12;
                            this.f6441e -= r12;
                            return g();
                        }
                    } catch (Throwable th4) {
                        if (!z13) {
                            if (r10 != 0 && !z11) {
                                try {
                                    a(thread, th2, z14, r11);
                                } catch (Throwable unused3) {
                                    throw th4;
                                }
                            }
                            e();
                            d();
                            c(thread, th2);
                            throw th4;
                        }
                        synchronized (this) {
                            this.f6442f -= r12;
                            this.f6441e -= r12;
                            return g();
                        }
                    }
                }
            } else {
                try {
                    crashType = CrashType.JAVA;
                } catch (Throwable th5) {
                    th = th5;
                    r10 = z10;
                    r11 = jCurrentTimeMillis;
                    r12 = 1;
                    z11 = false;
                    if (!com.apm.insight.l.m.c(th)) {
                        com.apm.insight.a.a(th);
                    }
                    if (!z13) {
                        if (r10 != 0 && !z11) {
                            a(thread, th2, z14, r11);
                        }
                        e();
                        d();
                        c(thread, th2);
                        return null;
                    }
                    synchronized (this) {
                        this.f6442f -= r12;
                        this.f6441e -= r12;
                    }
                    return g();
                }
            }
            String strA2 = e.a(jCurrentTimeMillis, crashType, zC, false);
            File file = new File(com.apm.insight.l.j.a(e.g()), strA2);
            ?? r14 = "logEventStack";
            String strA3 = a(new File(file, "logEventStack"), th2, thread, z10);
            boolean z15 = (f() & 1) != 0 || (strA3 != null && e.i().isCrashIgnored(strA3));
            try {
                JSONArray jSONArrayA = com.apm.insight.entity.b.a(th2, thread, file);
                this.f6445k = jSONArrayA;
                boolean z16 = jSONArrayA == null;
                if (z16 || z15) {
                    if (z14) {
                        try {
                            crashType2 = CrashType.LAUNCH;
                        } catch (Throwable th6) {
                            th = th6;
                            z11 = false;
                            ValueOf = z10;
                            r14 = jCurrentTimeMillis;
                            r13 = 1;
                            z13 = z15;
                            r10 = ValueOf;
                            r12 = r13;
                            r11 = r14;
                            if (!com.apm.insight.l.m.c(th)) {
                                com.apm.insight.a.a(th);
                            }
                            if (!z13) {
                                if (r10 != 0) {
                                    a(thread, th2, z14, r11);
                                }
                                e();
                                d();
                                c(thread, th2);
                                return null;
                            }
                            synchronized (this) {
                                this.f6442f -= r12;
                                this.f6441e -= r12;
                                return g();
                            }
                        }
                    } else {
                        crashType2 = CrashType.JAVA;
                    }
                    strA = e.a(jCurrentTimeMillis, crashType2, zC, true);
                    File file2 = new File(com.apm.insight.l.j.a(e.g()), strA);
                    file.renameTo(file2);
                    new File(file2, "logEventStack");
                    r13 = "logEventStack";
                } else {
                    strA = strA2;
                    r13 = z16;
                }
                com.apm.insight.a.d();
                com.apm.insight.k.b.a().b();
                z11 = com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1;
                if (z10 && z11) {
                    r13 = z14;
                    r14 = jCurrentTimeMillis;
                    try {
                        a(thread, th2, r13, r14);
                    } catch (Throwable th7) {
                        th = th7;
                        ValueOf = z10;
                        r14 = jCurrentTimeMillis;
                        r13 = 1;
                        z13 = z15;
                        r10 = ValueOf;
                        r12 = r13;
                        r11 = r14;
                        if (!com.apm.insight.l.m.c(th)) {
                            com.apm.insight.a.a(th);
                        }
                        if (!z13) {
                            if (r10 != 0) {
                                a(thread, th2, z14, r11);
                            }
                            e();
                            d();
                            c(thread, th2);
                            return null;
                        }
                        synchronized (this) {
                            this.f6442f -= r12;
                            this.f6441e -= r12;
                            return g();
                        }
                    }
                }
                ValueOf = String.valueOf(z14);
                com.apm.insight.a.a((Object) "[uncaughtException] isLaunchCrash=".concat(ValueOf));
                com.apm.insight.a.a.a();
                boolean zB = b(thread, th2);
                try {
                    if (!zB || (cVar = this.f6439c) == null || !z14) {
                        ValueOf = z10;
                        r14 = jCurrentTimeMillis;
                        r13 = 1;
                        if (zB) {
                            ?? r15 = this.f6440d;
                            if (r15 != 0) {
                                ValueOf = ValueOf;
                                r13 = r13;
                                r14 = r14;
                                r15.a(r14, thread, th2, strA, strA3, z15);
                                com.apm.insight.a.a((Object) ("[uncaughtException] mLaunchCrashDisposer " + th2.toString()));
                                ValueOf = ValueOf;
                                r13 = r13;
                                r14 = r14;
                            }
                        }
                        if (!z15) {
                            if (ValueOf != 0 && !z11) {
                                a(thread, th2, z14, r14);
                            }
                            e();
                            d();
                            c(thread, th2);
                            return null;
                        }
                        synchronized (this) {
                            this.f6442f -= r13;
                            this.f6441e -= r13;
                        }
                        return g();
                    }
                    ValueOf = z10;
                    r14 = jCurrentTimeMillis;
                    r13 = 1;
                    cVar.a(jCurrentTimeMillis, thread, th2, strA, strA3, z15);
                    com.apm.insight.a.a((Object) ("[uncaughtException] mLaunchCrashDisposer " + th2.toString()));
                    ValueOf = ValueOf;
                    r13 = r13;
                    r14 = r14;
                    if (!z15) {
                        if (ValueOf != 0) {
                            a(thread, th2, z14, r14);
                        }
                        e();
                        d();
                        c(thread, th2);
                        return null;
                    }
                    synchronized (this) {
                        this.f6442f -= r13;
                        this.f6441e -= r13;
                        return g();
                    }
                } catch (Throwable th8) {
                    th = th8;
                    z13 = z15;
                    r10 = ValueOf;
                    r12 = r13;
                    r11 = r14;
                    if (!com.apm.insight.l.m.c(th)) {
                        com.apm.insight.a.a(th);
                    }
                    if (!z13) {
                        if (r10 != 0) {
                            a(thread, th2, z14, r11);
                        }
                        e();
                    } else {
                        synchronized (this) {
                            this.f6442f -= r12;
                            this.f6441e -= r12;
                            return g();
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                ValueOf = z10;
                r14 = jCurrentTimeMillis;
                r13 = 1;
                z11 = false;
            }
        } catch (Throwable unused4) {
        }
    }

    public static boolean b() {
        return f6434i;
    }

    private String a(File file, Throwable th2, Thread thread, boolean z10) {
        String absolutePath = file.getAbsolutePath();
        this.f6444h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String strA = null;
        if (z10) {
            int iH = NativeImpl.h(absolutePath);
            if (iH > 0) {
                try {
                    e.g();
                    NativeImpl.a(iH, com.apm.insight.l.a.b());
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, th2.getMessage());
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, th2.getClass().getName());
                    if (th2.getMessage() != null) {
                        NativeImpl.a(iH, ": ");
                        NativeImpl.a(iH, th2.getMessage());
                    }
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, thread.getName());
                    NativeImpl.a(iH, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(iH, "stack:");
                    NativeImpl.a(iH, "\n");
                } catch (Throwable unused3) {
                }
                com.apm.insight.l.m.a(th2, iH);
                NativeImpl.b(iH);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    e.g();
                    sb2.append(com.apm.insight.l.a.b());
                    sb2.append("\n");
                    fileOutputStream.write(sb2.toString().getBytes());
                    fileOutputStream.write((th2.getMessage() + "\n").getBytes());
                    fileOutputStream.write((th2 + "\n").getBytes());
                    fileOutputStream.write((thread.getName() + "\n").getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused5) {
                }
                try {
                    strA = com.apm.insight.l.m.a(th2, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new com.apm.insight.l.e.a() { // from class: com.apm.insight.g.a.1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private boolean f6446a = false;

                        @Override // com.apm.insight.l.e.a
                        public final boolean a(String str) {
                            if (!this.f6446a && str.contains("android.os.Looper.loop")) {
                                this.f6446a = true;
                            }
                            return !this.f6446a;
                        }
                    } : new com.apm.insight.l.e.a());
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                } catch (Throwable th3) {
                    try {
                        th2.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                            fileOutputStream.write((th4 + "\n").getBytes());
                        } catch (Throwable unused6) {
                        }
                    }
                }
                com.apm.insight.a.a((Closeable) fileOutputStream);
            } catch (Throwable unused7) {
            }
        }
        return strA;
    }

    public final void a(Thread thread, Throwable th2, boolean z10, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> listC;
        CrashType crashType;
        if (z10) {
            listC = l.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            listC = l.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : listC) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, com.apm.insight.l.m.a(th2), thread, this.f6445k);
                } else {
                    iCrashCallback.onCrash(crashType, com.apm.insight.l.m.a(th2), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (Throwable th3) {
                com.apm.insight.a.b(th3);
                aVar.b("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    private void a(Thread thread, Throwable th2, boolean z10, long j10) {
        List<IOOMCallback> listA = l.a().a();
        CrashType crashType = z10 ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : listA) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iOOMCallback).a(crashType, th2, thread, j10, this.f6445k);
                } else {
                    iOOMCallback.onCrash(crashType, th2, thread, j10);
                }
            } catch (Throwable th3) {
                com.apm.insight.a.b(th3);
            }
        }
    }

    public final void a(String str) {
        this.f6443g.put(str, new Object());
    }

    public static void a(final Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVarA = com.apm.insight.entity.a.a(System.currentTimeMillis(), e.g(), th2);
                        aVarA.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a aVarA2 = f.a().a(CrashType.CUSTOM_JAVA, aVarA);
                        if (aVarA2 != null) {
                            com.apm.insight.k.d.a().c(aVarA2.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void a(long j10) {
        f6436l = j10;
    }
}
