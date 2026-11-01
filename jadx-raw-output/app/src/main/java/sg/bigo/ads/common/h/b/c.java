package sg.bigo.ads.common.h.b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
class c extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f69708a;

    private c(TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(5, 8, 3000L, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    public static synchronized c a(boolean z10) {
        if (f69708a == null) {
            synchronized (c.class) {
                if (f69708a == null) {
                    b(z10);
                }
            }
        }
        return f69708a;
    }

    private static synchronized void b(boolean z10) {
        f69708a = new c(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new sg.bigo.ads.common.n.c("Download", z10), new ThreadPoolExecutor.AbortPolicy());
    }
}
