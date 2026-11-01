package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PriorityThreadFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33344a;

    /* JADX INFO: compiled from: PriorityThreadFactory.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f33345a;

        public a(Runnable runnable) {
            this.f33345a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f33344a);
            } catch (Throwable unused) {
            }
            try {
                this.f33345a.run();
            } catch (Exception unused2) {
            }
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }

    public o(int i10) {
        this.f33344a = i10;
    }
}
