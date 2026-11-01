package com.bytedance.sdk.openadsdk.zin;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class vt {
    public pno vt;
    public int yu;
    public ScheduledExecutorService ouw = null;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f13662lh = 0;

    public final void ouw() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.ouw = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.vt.1
            @Override // java.lang.Runnable
            public final void run() {
                ra.ouw("Playable_CrashMonitor", "-- check page stuck  " + (System.currentTimeMillis() - vt.this.f13662lh));
                long jCurrentTimeMillis = System.currentTimeMillis();
                vt vtVar = vt.this;
                if (jCurrentTimeMillis - vtVar.f13662lh > vtVar.yu) {
                    vtVar.ouw.shutdown();
                    pno pnoVar = vt.this.vt;
                    if (pnoVar != null) {
                        pnoVar.vt(0, "Automatic detection of stuck");
                    }
                }
            }
        }, 0L, 500L, TimeUnit.MILLISECONDS);
    }

    public final boolean lh() {
        ScheduledExecutorService scheduledExecutorService = this.ouw;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public final void vt() {
        ScheduledExecutorService scheduledExecutorService = this.ouw;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public vt(pno pnoVar, int i10) {
        this.vt = pnoVar;
        this.yu = i10;
    }
}
