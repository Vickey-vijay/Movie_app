package com.applovin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class d6 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ExecutorService f7258r = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7267i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ExecutorService f7269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ExecutorService f7270l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f7275q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f7268j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f7271m = new ArrayList(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f7272n = new Object();

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    public static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f7283f;

        public c(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar, long j10) {
            super(kVar, i5Var, bVar);
            this.f7283f = j10;
        }
    }

    public class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7284a;

        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                com.applovin.impl.sdk.o unused = d6.this.f7260b;
                if (com.applovin.impl.sdk.o.a()) {
                    d6.this.f7260b.a("TaskManager", "Caught unhandled exception", th2);
                }
            }
        }

        public d(String str) {
            this.f7284a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f7284a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) d6.this.f7259a.a(x4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f7287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f7289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i5 f7290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f7291e;

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.a();
                if (!this.f7287a.E0() || this.f7290d.d()) {
                    ScheduledFuture scheduledFutureB = this.f7290d.b(Thread.currentThread(), ((Long) this.f7287a.a(x4.f10053v)).longValue());
                    this.f7290d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7289c.d(this.f7288b, "Task re-scheduled...");
                    }
                    this.f7287a.q0().a(this.f7290d, this.f7291e, 2000L);
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7289c.d(this.f7288b, this.f7291e + " queue finished task " + this.f7290d.c());
                }
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7289c.a(this.f7288b, "Task failed execution", th2);
                    }
                    this.f7290d.a(th2);
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7289c.d(this.f7288b, this.f7291e + " queue finished task " + this.f7290d.c());
                    }
                }
            }
        }

        public e(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar) {
            this.f7287a = kVar;
            this.f7289c = kVar.O();
            this.f7288b = i5Var.c();
            this.f7290d = i5Var;
            this.f7291e = bVar;
        }
    }

    public Executor c() {
        return this.f7274p ? this.f7263e : this.f7262d;
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7276a;

        static {
            int[] iArr = new int[b.values().length];
            f7276a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7276a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7276a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7276a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ExecutorService a() {
        return this.f7269k;
    }

    public ScheduledFuture b(i5 i5Var, b bVar, long j10) {
        return this.f7274p ? a(new e(this.f7259a, i5Var, bVar)).schedule(i5Var, j10, TimeUnit.MILLISECONDS) : this.f7261c.schedule(i5Var, j10, TimeUnit.MILLISECONDS);
    }

    public ExecutorService d() {
        return this.f7270l;
    }

    public boolean f() {
        return this.f7273o;
    }

    public void g() {
        synchronized (this.f7272n) {
            this.f7273o = true;
            for (e eVar : this.f7271m) {
                if (this.f7275q) {
                    c cVar = (c) eVar;
                    a(cVar.f7290d, cVar.f7291e, cVar.f7283f);
                } else {
                    a(eVar.f7290d, eVar.f7291e);
                }
            }
            this.f7271m.clear();
        }
    }

    public void h() {
        synchronized (this.f7272n) {
            this.f7273o = false;
        }
    }

    public d6(com.applovin.impl.sdk.k kVar) {
        this.f7259a = kVar;
        this.f7260b = kVar.O();
        this.f7274p = ((Boolean) kVar.a(x4.T)).booleanValue();
        this.f7275q = ((Boolean) kVar.a(x4.S6)).booleanValue();
        this.f7261c = b("auxiliary_operations", ((Integer) kVar.a(x4.O)).intValue());
        this.f7262d = b("shared_thread_pool", ((Integer) kVar.a(x4.N)).intValue());
        this.f7263e = b("core", ((Integer) kVar.a(x4.U)).intValue());
        this.f7265g = b("caching", ((Integer) kVar.a(x4.V)).intValue());
        this.f7266h = b("mediation", ((Integer) kVar.a(x4.W)).intValue());
        this.f7264f = b("timeout", ((Integer) kVar.a(x4.X)).intValue());
        this.f7267i = b("other", ((Integer) kVar.a(x4.Y)).intValue());
        if (((Boolean) kVar.a(x4.I0)).booleanValue() && ((Boolean) kVar.a(x4.J0)).booleanValue()) {
            this.f7269k = Executors.newFixedThreadPool(((Integer) kVar.a(x4.K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f7270l = Executors.newFixedThreadPool(((Integer) kVar.a(x4.L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public void a(i5 i5Var, b bVar) {
        a(i5Var, bVar, 0L);
    }

    public boolean e() {
        if (a() != null && d() != null) {
            return true;
        }
        return false;
    }

    public void a(i5 i5Var, b bVar, long j10) {
        a(i5Var, bVar, j10, false);
    }

    public void a(i5 i5Var, b bVar, long j10, boolean z10) {
        e eVar;
        if (i5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 >= 0) {
            if (this.f7275q) {
                eVar = new c(this.f7259a, i5Var, bVar, j10);
            } else {
                eVar = new e(this.f7259a, i5Var, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j10, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7260b.d(i5Var.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
    }

    public ExecutorService b() {
        return this.f7274p ? this.f7265g : f7258r;
    }

    private boolean b(e eVar) {
        if (eVar.f7290d.d()) {
            return false;
        }
        synchronized (this.f7272n) {
            if (this.f7273o) {
                return false;
            }
            this.f7271m.add(eVar);
            return true;
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f7274p) {
            com.applovin.impl.sdk.k kVar = this.f7259a;
            e eVar = new e(kVar, new r6(kVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f7261c.submit(runnable);
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new d(str));
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.n9
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f8544b.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new r6(this.f7259a, str, runnable));
    }

    public void a(i5 i5Var) {
        if (i5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f7274p ? this.f7263e : this.f7262d;
            try {
                if (n7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f7259a, i5Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = i5Var.b(Thread.currentThread(), ((Long) this.f7259a.a(x4.f10053v)).longValue());
                i5Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7260b.a(i5Var.c(), "Task failed execution", th2);
                }
                i5Var.a(th2);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(i5 i5Var, k3 k3Var) {
        String strB = k3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f7268j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f7268j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f7259a, i5Var, b.MEDIATION));
    }

    private void a(final e eVar, long j10, boolean z10) {
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f7274p ? a(eVar) : this.f7262d;
        if (j10 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z10) {
            g0.a(j10, this.f7259a, new Runnable() { // from class: com.applovin.impl.m9
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorA.execute(eVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i10 = a.f7276a[eVar.f7291e.ordinal()];
        if (i10 == 1) {
            return this.f7263e;
        }
        if (i10 == 2) {
            return this.f7265g;
        }
        if (i10 == 3) {
            return this.f7266h;
        }
        if (i10 != 4) {
            return this.f7267i;
        }
        return this.f7264f;
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7260b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f7260b.a("TaskManager", "Awaiting tasks were interrupted", th2);
            return null;
        }
    }
}
