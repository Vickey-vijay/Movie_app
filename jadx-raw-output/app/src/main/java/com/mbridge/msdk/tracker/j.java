package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ExecutorManager.java */
/* JADX INFO: loaded from: classes8.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f38131a;

    /* JADX INFO: compiled from: ExecutorManager.java */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    /* JADX INFO: compiled from: ExecutorManager.java */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f38133a;

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.f38133a)) {
                return;
            }
            try {
                this.f38133a.run();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f38101a) {
                    Log.e("TrackManager", "execute error", e10);
                }
            }
        }

        public b(Runnable runnable) {
            this.f38133a = runnable;
        }
    }

    public void a(Runnable runnable) {
        if (this.f38131a == null) {
            this.f38131a = a();
        }
        if (this.f38131a.isShutdown()) {
            return;
        }
        this.f38131a.execute(new b(runnable));
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
