package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class tlj {
    private long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f12446le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private long f12447lh;
    public boolean ouw;
    private final ouw vt;
    private long yu;

    public interface ouw {
        void ouw();
    }

    public static void ouw(vpp vppVar, boolean z10, final int i10) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, uoy.ouw(vppVar), z10 ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.tlj.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i10);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public final void lh() {
        if (this.vt != null) {
            long jElapsedRealtime = (this.fkw + (this.yu > 0 ? SystemClock.elapsedRealtime() - this.yu : 0L)) / 1000;
            if (this.ouw) {
                return;
            }
            if (this.f12446le || jElapsedRealtime >= this.f12447lh) {
                this.vt.ouw();
            }
        }
    }

    public final void ouw(long j10) {
        if (j10 <= this.f12447lh) {
            return;
        }
        this.f12447lh = j10;
    }

    public final void vt() {
        if (this.ouw) {
            return;
        }
        this.yu = SystemClock.elapsedRealtime();
    }

    public tlj(ouw ouwVar) {
        this.ouw = true;
        this.vt = ouwVar;
        int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("reward_callback_fallback", 0);
        if (iOuw != 0) {
            this.ouw = false;
            if (iOuw == 2) {
                this.f12446le = true;
            }
        }
    }

    public final void ouw() {
        if (!this.ouw && this.yu > 0) {
            this.fkw += SystemClock.elapsedRealtime() - this.yu;
            this.yu = 0L;
        }
    }
}
