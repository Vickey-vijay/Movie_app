package com.bytedance.sdk.component.pno.lh;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ko;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class le extends ThreadPoolExecutor {
    private int fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11889lh;
    public boolean ouw;
    private final String vt;
    private int yu;

    public static class ouw {
        public String ouw = "cache";
        public int vt = 4;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f11891lh = 100;
        public int yu = 0;
        public long fkw = 30000;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public boolean f11890le = false;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public TimeUnit f11892ra = TimeUnit.MILLISECONDS;
        public boolean pno = false;
        public BlockingQueue<Runnable> bly = new PriorityBlockingQueue();
        public ThreadFactory tlj = null;

        public final le ouw() {
            if (this.tlj == null) {
                this.tlj = new yu(this.ouw);
            }
            if (this.vt < 0) {
                this.vt = 8;
            }
            if (this.vt == 0) {
                this.bly = new SynchronousQueue();
            }
            if (this.bly == null) {
                this.bly = new LinkedBlockingQueue();
            }
            if (this.f11891lh > 100) {
                this.f11891lh = 100;
            }
            int i10 = this.f11891lh;
            int i11 = this.vt;
            if (i10 < i11) {
                this.f11891lh = i11;
            }
            return new le(this, (byte) 0);
        }
    }

    public /* synthetic */ le(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    private le(ouw ouwVar) {
        super(ouwVar.vt, Integer.MAX_VALUE, ouwVar.fkw, ouwVar.f11892ra, ouwVar.bly, ouwVar.tlj);
        this.ouw = false;
        ko.vt("PAGThreadPoolExecutor", "create poolType = ", ouwVar.ouw, " coreSize=", Integer.valueOf(ouwVar.vt), " maxSize=", Integer.valueOf(ouwVar.f11891lh), " keepAlive=", Long.valueOf(ouwVar.fkw), " createSize=", Integer.valueOf(ouwVar.yu), " isUseConfig=", Boolean.valueOf(ouwVar.pno), "  workQueue", ouwVar.bly);
        this.vt = ouwVar.ouw;
        this.f11889lh = ouwVar.vt;
        this.yu = ouwVar.f11891lh;
        this.fkw = ouwVar.yu;
        allowCoreThreadTimeOut(ouwVar.f11890le);
        this.ouw = ouwVar.pno;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        int corePoolSize;
        int size;
        boolean z10 = runnable instanceof vt;
        if (z10) {
            ((vt) runnable).f11896ra = SystemClock.elapsedRealtime();
        }
        super.afterExecute(runnable, th2);
        if (z10) {
            vt vtVar = (vt) runnable;
            ko.vt("PAGThreadPoolExecutor", "submit  poolType = ", this.vt, " taskName=", vtVar.yu, "    ", "priority = ", Integer.valueOf(vtVar.f11895lh), " SubmitTimestamp=", Long.valueOf(vtVar.fkw), "  BeforeTimestamp=", Long.valueOf(vtVar.f11894le), "  AfterTimestamp=", Long.valueOf(vtVar.f11896ra));
        }
        try {
            if (this.f11889lh != 0 && (corePoolSize = getCorePoolSize()) > this.f11889lh && (size = getQueue().size()) == 0) {
                setCorePoolSize(this.f11889lh);
                ko.vt("PAGThreadPoolExecutor", this.vt, " reduceToCoreThread  queueSize=", Integer.valueOf(size), "    ", Integer.valueOf(corePoolSize), " --> ", Integer.valueOf(this.f11889lh));
            }
        } catch (Exception e10) {
            ko.lh("PAGThreadPoolExecutor", e10.getMessage());
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof vt) {
            ((vt) runnable).f11894le = SystemClock.elapsedRealtime();
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int corePoolSize;
        com.bytedance.sdk.component.pno.lh.ouw ouwVarOuw;
        if (!(runnable instanceof vt)) {
            runnable = new vt("unknown", runnable) { // from class: com.bytedance.sdk.component.pno.lh.le.2
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnableOuw = ouw();
                    if (runnableOuw != null) {
                        runnableOuw.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.vt)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(yu.ouw(this.vt)) && (ouwVarOuw = lh.ouw()) != null) {
                ouwVarOuw.ouw((vt) runnable);
            }
        }
        ((vt) runnable).fkw = SystemClock.elapsedRealtime();
        try {
            try {
                super.execute(runnable);
                try {
                    if (this.f11889lh != 0 && (corePoolSize = getCorePoolSize()) < this.yu) {
                        int size = getQueue().size();
                        if (getActiveCount() < this.f11889lh || size < this.fkw) {
                            return;
                        }
                        setCorePoolSize(this.yu);
                        ko.vt("PAGThreadPoolExecutor", this.vt, " increaseToMaxThread  queueSize=", Integer.valueOf(size), "    ", Integer.valueOf(corePoolSize), " --> ", Integer.valueOf(this.yu));
                    }
                } catch (Exception e10) {
                    ko.lh("PAGThreadPoolExecutor", e10.getMessage());
                }
            } catch (Throwable th2) {
                ko.lh("PAGThreadPoolExecutor", "try exc failed", th2);
            }
        } catch (Throwable unused) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                runnable.run();
                return;
            }
            Handler handlerVt = lh.vt();
            if (handlerVt != null) {
                handlerVt.post(runnable);
            }
        }
    }

    public final void ouw(ouw ouwVar) {
        try {
            int i10 = ouwVar.vt;
            if (i10 >= 0 && this.f11889lh != i10) {
                this.f11889lh = i10;
                setCorePoolSize(i10);
            }
            this.yu = ouwVar.f11891lh;
            this.fkw = ouwVar.yu;
            allowCoreThreadTimeOut(ouwVar.f11890le);
            this.ouw = ouwVar.pno;
        } catch (Throwable th2) {
            ko.fkw("PAGThreadPoolExecutor", th2.getMessage());
        }
        ko.vt("PAGThreadPoolExecutor", "update poolType = ", ouwVar.ouw, " coreSize=", Integer.valueOf(ouwVar.vt), " maxSize=", Integer.valueOf(ouwVar.f11891lh), " keepAlive=", Long.valueOf(ouwVar.fkw), " createSize=", Integer.valueOf(ouwVar.yu), " isUseConfig=", Boolean.valueOf(ouwVar.pno), "  workQueue", ouwVar.bly);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
        if ("aidl".equals(this.vt)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return "aidl".equals(this.vt) ? Collections.emptyList() : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        String str;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        int i10 = 6;
        if (runnable instanceof vt) {
            vt vtVar = (vt) runnable;
            i10 = vtVar.f11895lh;
            str = vtVar.yu;
        } else {
            str = "";
        }
        if (i10 == 0 || TextUtils.isEmpty(str)) {
            ko.ouw("PAGThreadPoolExecutor", " submit poolType = ", this.vt, new RuntimeException());
        }
        execute(new vt(i10, str) { // from class: com.bytedance.sdk.component.pno.lh.le.1
            @Override // java.lang.Runnable
            public final void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }
}
