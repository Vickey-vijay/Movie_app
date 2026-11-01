package com.bytedance.sdk.openadsdk.yu.ouw;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class pno implements com.bytedance.sdk.component.le.ouw.fkw {
    private final String ouw = "[7808]";

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final com.bytedance.sdk.component.le.ouw.le fkw() {
        com.bytedance.sdk.component.le.ouw.le leVarOuw;
        synchronized (this) {
            leVarOuw = com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw());
        }
        return leVarOuw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final com.bytedance.sdk.component.le.ouw.ra le() {
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final String lh() {
        return uoy.fkw();
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final String ouw(String str) {
        return com.bytedance.sdk.component.yu.ouw.vt(str, com.bytedance.sdk.openadsdk.core.ouw.ouw());
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final String vt(String str) {
        return com.bytedance.sdk.component.yu.ouw.ouw(str, com.bytedance.sdk.openadsdk.core.ouw.ouw());
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final com.bytedance.sdk.component.le.ouw.fkw.lh yu() {
        return new yu();
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final boolean bly() {
        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("batch_log_config", a.f29888j, 0) == 1;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final int cf() {
        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("batch_log_config", "once_max", 10);
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final int lh(String str) {
        cf cfVarFqk = com.bytedance.sdk.openadsdk.core.settings.cf.vt().fqk();
        if (cfVarFqk == null) {
            return 3;
        }
        return cfVarFqk.ouw(str);
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final Executor ouw() {
        return bs.yu();
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final long pno() {
        long jOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("log_queue_timeout", 40000);
        if (jOuw < 30000 || jOuw > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return jOuw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final boolean ra() {
        return BinderPoolService.ouw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final boolean tlj() {
        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final Executor vt() {
        return bs.pno();
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final HandlerThread yu(String str) {
        return com.bytedance.sdk.component.utils.pno.ouw(str, 10);
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final void ouw(boolean z10, com.bytedance.sdk.component.le.ouw.le.yu yuVar) {
        int i10;
        if (yuVar == null) {
            return;
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.rn.lh.ouw("track_link_result", false, new tlj(true, yuVar));
            return;
        }
        cf cfVarFqk = com.bytedance.sdk.openadsdk.core.settings.cf.vt().fqk();
        if (cfVarFqk != null && yuVar.yu < cfVarFqk.ouw(yuVar.f11780le)) {
            if (cfVarFqk.yu) {
                Runnable runnableOuw = com.bytedance.sdk.component.le.ouw.le.ouw.ouw().ouw(yuVar, ryl.ouw(zih.ouw()), null);
                if (runnableOuw != null) {
                    ScheduledExecutorService scheduledExecutorServiceOuw = bs.ouw();
                    cf.ouw ouwVar = cfVarFqk.f13569lh.get(yuVar.f11780le);
                    if (ouwVar == null) {
                        cf.ouw ouwVar2 = cfVarFqk.vt;
                        i10 = ouwVar2 != null ? ouwVar2.vt : 30;
                    } else {
                        i10 = ouwVar.vt;
                    }
                    scheduledExecutorServiceOuw.schedule(runnableOuw, i10, TimeUnit.SECONDS);
                    return;
                }
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.rn.lh.ouw("track_link_result", false, new tlj(false, yuVar));
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw
    public final boolean ouw(Context context) {
        return ksc.ouw(context, 60000L) != 0;
    }
}
