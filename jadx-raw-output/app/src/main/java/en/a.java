package en;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ExecutorThreadPool.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends ym.a implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final zm.c f52688l = zm.b.a(a.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f52689k;

    public a(ExecutorService executorService) {
        this.f52689k = executorService;
    }

    @Override // en.d
    public boolean G() {
        ExecutorService executorService = this.f52689k;
        if (!(executorService instanceof ThreadPoolExecutor)) {
            return false;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        return threadPoolExecutor.getPoolSize() == threadPoolExecutor.getMaximumPoolSize() && threadPoolExecutor.getQueue().size() >= threadPoolExecutor.getPoolSize() - threadPoolExecutor.getActiveCount();
    }

    @Override // en.d
    public boolean Z(Runnable runnable) {
        try {
            this.f52689k.execute(runnable);
            return true;
        } catch (RejectedExecutionException e10) {
            f52688l.e(e10);
            return false;
        }
    }

    public a() {
        this(new ThreadPoolExecutor(256, 256, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
    }

    @Override // ym.a
    public void e0() throws Exception {
        super.e0();
        this.f52689k.shutdownNow();
    }
}
