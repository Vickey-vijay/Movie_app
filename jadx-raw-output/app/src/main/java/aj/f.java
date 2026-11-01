package aj;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SchedulerPoolFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f3656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f3658c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<ScheduledThreadPoolExecutor, Object> f3659d = new ConcurrentHashMap();

    /* JADX INFO: compiled from: SchedulerPoolFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3661b;

        public void a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f3660a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f3660a = true;
            }
            if (!this.f3660a || !properties.containsKey("rx2.purge-period-seconds")) {
                this.f3661b = 1;
                return;
            }
            try {
                this.f3661b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                this.f3661b = 1;
            }
        }
    }

    /* JADX INFO: compiled from: SchedulerPoolFactory.java */
    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(f.f3659d.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    f.f3659d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        c(f3656a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.a(properties);
        f3656a = aVar.f3660a;
        f3657b = aVar.f3661b;
        b();
    }

    public static void b() {
        d(f3656a);
    }

    public static void c(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f3659d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static void d(boolean z10) {
        if (!z10) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f3658c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (androidx.lifecycle.e.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                b bVar = new b();
                int i10 = f3657b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(bVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
