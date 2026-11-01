package fn;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import mn.g;
import no.i;
import no.o;
import no.p;
import no.q;
import no.r;
import po.e;
import po.f;
import po.h;
import po.l;
import un.j;
import un.k;
import yn.s;

/* JADX INFO: compiled from: DefaultUpnpServiceConfiguration.java */
/* JADX INFO: loaded from: classes7.dex */
@Alternative
public class a implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Logger f52987i = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f52989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final po.d f52990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f52991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f52992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kn.a f52993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kn.c f52994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f52995h;

    /* JADX INFO: renamed from: fn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultUpnpServiceConfiguration.java */
    public static class C0471a extends ThreadPoolExecutor {
        public C0471a() {
            this(new b(), new C0472a());
        }

        /* JADX INFO: renamed from: fn.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultUpnpServiceConfiguration.java */
        public class C0472a extends ThreadPoolExecutor.DiscardPolicy {
            @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                a.f52987i.info("Thread pool rejected execution of " + runnable.getClass());
                super.rejectedExecution(runnable, threadPoolExecutor);
            }
        }

        public C0471a(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory, rejectedExecutionHandler);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th2) {
            super.afterExecute(runnable, th2);
            if (th2 != null) {
                Throwable thA = so.a.a(th2);
                if (!(thA instanceof InterruptedException)) {
                    a.f52987i.warning("Thread terminated " + runnable + " abruptly with exception: " + th2);
                    Logger logger = a.f52987i;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Root cause: ");
                    sb2.append(thA);
                    logger.warning(sb2.toString());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DefaultUpnpServiceConfiguration.java */
    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ThreadGroup f52996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f52997c = new AtomicInteger(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f52998d = "cling-";

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f52996b, runnable, "cling-" + this.f52997c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }

        public b() {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f52996b = threadGroup;
        }
    }

    public a() {
        this(0);
    }

    @Override // fn.c
    public int a() {
        return 1000;
    }

    @Override // fn.c
    public pn.c e(k kVar) {
        return null;
    }

    @Override // fn.c
    public int m() {
        return 0;
    }

    @Override // fn.c
    public s[] q() {
        return new s[0];
    }

    @Override // fn.c
    public boolean t() {
        return false;
    }

    @Override // fn.c
    public Integer v() {
        return null;
    }

    @Override // fn.c
    public pn.c x(j jVar) {
        return null;
    }

    public a(int i10) {
        this(i10, true);
    }

    public ExecutorService A() {
        return new C0471a();
    }

    public kn.a B() {
        return new kn.d();
    }

    public e C() {
        return new no.g();
    }

    public g D() {
        return new g();
    }

    public po.g E(int i10) {
        return new no.j(i10);
    }

    public h F() {
        return new o();
    }

    public kn.c G() {
        return new kn.e();
    }

    public ExecutorService H() {
        return this.f52989b;
    }

    @Override // fn.c
    public po.j b() {
        return new q(new p(h()));
    }

    @Override // fn.c
    public kn.c c() {
        return this.f52994g;
    }

    @Override // fn.c
    public po.g d() {
        return E(this.f52988a);
    }

    @Override // fn.c
    public g getNamespace() {
        return this.f52995h;
    }

    @Override // fn.c
    public f i(po.g gVar) {
        return new i(new no.h(gVar.d(), gVar.g()));
    }

    @Override // fn.c
    public l j(po.g gVar) {
        return new no.s(new r(gVar.e()));
    }

    @Override // fn.c
    public h k() {
        return this.f52991d;
    }

    @Override // fn.c
    public kn.a l() {
        return this.f52993f;
    }

    @Override // fn.c
    public po.d o() {
        return this.f52990c;
    }

    @Override // fn.c
    public e r() {
        return this.f52992e;
    }

    @Override // fn.c
    public void shutdown() {
        f52987i.fine("Shutting down default executor service");
        H().shutdownNow();
    }

    @Override // fn.c
    public po.c w(po.g gVar) {
        return new no.d(new no.c());
    }

    public po.d z() {
        return new no.e();
    }

    public a(int i10, boolean z10) {
        if (z10 && mn.f.f64631a) {
            throw new Error("Unsupported runtime environment, use org.fourthline.cling.android.AndroidUpnpServiceConfiguration");
        }
        this.f52988a = i10;
        this.f52989b = A();
        this.f52990c = z();
        this.f52991d = F();
        this.f52992e = C();
        this.f52993f = B();
        this.f52994g = G();
        this.f52995h = D();
    }

    @Override // fn.c
    public Executor f() {
        return H();
    }

    @Override // fn.c
    public Executor g() {
        return H();
    }

    @Override // fn.c
    public ExecutorService h() {
        return H();
    }

    @Override // fn.c
    public Executor n() {
        return H();
    }

    @Override // fn.c
    public Executor p() {
        return H();
    }

    @Override // fn.c
    public Executor s() {
        return H();
    }

    @Override // fn.c
    public ExecutorService u() {
        return H();
    }
}
