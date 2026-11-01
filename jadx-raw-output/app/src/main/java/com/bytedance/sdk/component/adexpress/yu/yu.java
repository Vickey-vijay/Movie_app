package com.bytedance.sdk.component.adexpress.yu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class yu {
    public static void ouw(com.bytedance.sdk.component.pno.pno pnoVar, int i10) {
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh;
        ExecutorService executorServiceRyl = lhVar != null ? lhVar.ryl() : null;
        if (executorServiceRyl == null) {
            com.bytedance.sdk.component.pno.le.lh(pnoVar);
        } else {
            pnoVar.setPriority(i10);
            executorServiceRyl.execute(pnoVar);
        }
    }

    public static void ouw(com.bytedance.sdk.component.pno.pno pnoVar) {
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh;
        ExecutorService executorServiceCf = lhVar != null ? lhVar.cf() : null;
        if (executorServiceCf != null) {
            pnoVar.setPriority(10);
            executorServiceCf.execute(pnoVar);
        } else {
            com.bytedance.sdk.component.pno.le.ouw(pnoVar);
        }
    }

    public static ScheduledFuture ouw(Runnable runnable, long j10, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.pno.le.vt().schedule(runnable, j10, timeUnit);
    }
}
