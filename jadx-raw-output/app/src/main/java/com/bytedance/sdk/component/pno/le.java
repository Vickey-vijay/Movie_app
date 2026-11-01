package com.bytedance.sdk.component.pno;

import com.ironsource.C3426d4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class le extends fkw {
    private static volatile ThreadPoolExecutor fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f11886le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static volatile ScheduledExecutorService f11888ra;
    public static lh vt;
    public static final int ouw = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f11887lh = 120;
    public static boolean yu = true;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.pno.le$1, reason: invalid class name */
    public static class AnonymousClass1 implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    public static void le() {
        f11887lh = -1;
    }

    public static void lh(pno pnoVar) {
        vt(pnoVar);
    }

    public static void ouw(pno pnoVar) {
        if (fkw == null) {
            ra();
        }
        if (pnoVar == null || fkw == null) {
            return;
        }
        fkw.execute(pnoVar);
    }

    public static void vt(pno pnoVar) {
        if (f11886le == null) {
            pno();
        }
        if (f11886le != null) {
            f11886le.execute(pnoVar);
        }
    }

    public static lh fkw() {
        return vt;
    }

    public static boolean lh() {
        return yu;
    }

    private static ExecutorService pno() {
        if (f11886le == null) {
            synchronized (le.class) {
                if (f11886le == null) {
                    ouw.C0094ouw c0094ouw = new ouw.C0094ouw();
                    c0094ouw.ouw = "io";
                    c0094ouw.vt = 2;
                    c0094ouw.pno = 10;
                    c0094ouw.f11899lh = 20L;
                    c0094ouw.yu = TimeUnit.SECONDS;
                    c0094ouw.fkw = new LinkedBlockingQueue();
                    c0094ouw.f11900ra = new AnonymousClass1();
                    c0094ouw.f11898le = fkw.ouw().ouw(10, "io");
                    ouw ouwVarOuw = c0094ouw.ouw();
                    f11886le = ouwVarOuw;
                    ouwVarOuw.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f11886le;
    }

    private static ExecutorService ra() {
        if (fkw == null) {
            synchronized (le.class) {
                if (fkw == null) {
                    ouw.C0094ouw c0094ouw = new ouw.C0094ouw();
                    c0094ouw.ouw = C3426d4.a.f28413f;
                    c0094ouw.vt = 0;
                    c0094ouw.pno = 10;
                    c0094ouw.f11899lh = 5L;
                    c0094ouw.yu = TimeUnit.SECONDS;
                    c0094ouw.fkw = new SynchronousQueue();
                    c0094ouw.f11900ra = new AnonymousClass1();
                    c0094ouw.f11898le = fkw.ouw().ouw(10, C3426d4.a.f28413f);
                    fkw = c0094ouw.ouw();
                }
            }
        }
        return fkw;
    }

    public static RejectedExecutionHandler yu() {
        return new AnonymousClass1();
    }

    public static void ouw(boolean z10) {
        yu = z10;
    }

    public static ScheduledExecutorService vt() {
        if (f11888ra == null) {
            synchronized (le.class) {
                if (f11888ra == null) {
                    f11888ra = Executors.newSingleThreadScheduledExecutor(fkw.ouw().ouw(5, "scheduled"));
                }
            }
        }
        return f11888ra;
    }

    public static void ouw(lh lhVar) {
        vt = lhVar;
    }
}
