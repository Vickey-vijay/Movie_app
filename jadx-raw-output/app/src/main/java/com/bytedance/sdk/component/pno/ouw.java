package com.bytedance.sdk.component.pno;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ko;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
final class ouw extends ThreadPoolExecutor {
    public String ouw;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.pno.ouw$ouw, reason: collision with other inner class name */
    public static class C0094ouw {

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public RejectedExecutionHandler f11900ra;
        public String ouw = "io";
        public int vt = 1;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public long f11899lh = 30;
        public TimeUnit yu = TimeUnit.SECONDS;
        private int bly = Integer.MAX_VALUE;
        public BlockingQueue<Runnable> fkw = null;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public ThreadFactory f11898le = null;
        public int pno = 5;

        public final ouw ouw() {
            if (this.f11898le == null) {
                this.f11898le = fkw.ouw().ouw(this.pno, this.ouw);
            }
            if (this.f11900ra == null) {
                this.f11900ra = le.yu();
            }
            if (this.fkw == null) {
                this.fkw = new LinkedBlockingQueue();
            }
            return new ouw(this.ouw, this.vt, this.bly, this.f11899lh, this.yu, this.fkw, this.f11898le, this.f11900ra);
        }
    }

    public ouw(String str, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.ouw = str;
    }

    private void ouw(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
            vt(runnable);
        } catch (Throwable unused2) {
            vt(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof pno) {
            ouw(new vt((pno) runnable, this));
        } else {
            ouw(new vt(new pno("unknown") { // from class: com.bytedance.sdk.component.pno.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!le.lh() || TextUtils.isEmpty(this.ouw) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.ouw;
        str.hashCode();
        switch (str) {
            case "io":
                ouw(queue, le.ouw + 2, getCorePoolSize() * 2);
                break;
            case "log":
                ouw(queue, 8, 8);
                break;
            case "aidl":
                ouw(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
        if ("io".equals(this.ouw) || "aidl".equals(this.ouw)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return ("io".equals(this.ouw) || "aidl".equals(this.ouw)) ? Collections.emptyList() : super.shutdownNow();
    }

    private static void vt(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                ko.lh("", "try exc failed", th2);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th2);
        if (le.lh() && !TextUtils.isEmpty(this.ouw) && (queue = getQueue()) != null) {
            String str = this.ouw;
            str.hashCode();
            switch (str) {
                case "io":
                    ouw(queue, 2);
                    break;
                case "log":
                    ouw(queue, 4);
                    break;
                case "aidl":
                    ouw(queue, 2);
                    break;
            }
        }
    }

    private void ouw(BlockingQueue<Runnable> blockingQueue, int i10) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i10);
            ko.vt("ADThreadPoolExecutor", "reduceCoreThreadSize: reduce poolType =  ", this.ouw, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
        } catch (Exception e10) {
            ko.lh("ADThreadPoolExecutor", e10.getMessage());
        }
    }

    private void ouw(BlockingQueue<Runnable> blockingQueue, int i10, int i11) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() < i11) {
            return;
        }
        try {
            setCorePoolSize(i10);
            ko.vt("ADThreadPoolExecutor", "increaseCoreThreadSize: increase poolType =  ", this.ouw, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
        } catch (Exception e10) {
            ko.lh("ADThreadPoolExecutor", e10.getMessage());
        }
    }
}
