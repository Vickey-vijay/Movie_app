package com.bytedance.sdk.openadsdk.tc.ouw;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class vt {
    public final vpp vt;
    public int ouw = lh.vt;
    private final AtomicBoolean pno = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final AtomicBoolean f13345lh = new AtomicBoolean(true);
    public final AtomicInteger yu = new AtomicInteger(0);
    public long fkw = 0;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f13344le = 0;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final Runnable f13346ra = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tc.ouw.vt.3
        @Override // java.lang.Runnable
        public final void run() {
            vt.ouw(vt.this);
        }
    };

    public final void ouw() {
        this.yu.set(3);
        Handler handlerOuw = ouw.ouw();
        if (handlerOuw != null) {
            handlerOuw.removeCallbacks(this.f13346ra);
        }
    }

    public final boolean vt() {
        return this.yu.get() == 3;
    }

    public vt(vpp vppVar) {
        this.vt = vppVar;
    }

    public final void ouw(final int i10) {
        Handler handlerOuw;
        if (this.yu.get() == 3 || (handlerOuw = ouw.ouw()) == null) {
            return;
        }
        handlerOuw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tc.ouw.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                if (i10 == 4 && vt.this.f13345lh.get()) {
                    vt vtVar = vt.this;
                    if (vtVar.yu.get() == 2) {
                        vtVar.fkw = SystemClock.elapsedRealtime();
                        Handler handlerOuw2 = ouw.ouw();
                        if (handlerOuw2 != null) {
                            handlerOuw2.postDelayed(vtVar.f13346ra, ((long) vtVar.ouw) - vtVar.f13344le);
                        }
                        vtVar.yu.set(1);
                        return;
                    }
                    return;
                }
                int i11 = i10;
                if (i11 != 8) {
                    if (i11 == 5) {
                        vt.ouw(vt.this);
                        return;
                    }
                    return;
                }
                vt vtVar2 = vt.this;
                if (vtVar2.yu.get() != 1 || vtVar2.fkw == 0) {
                    return;
                }
                Handler handlerOuw3 = ouw.ouw();
                if (handlerOuw3 != null) {
                    handlerOuw3.removeCallbacks(vtVar2.f13346ra);
                }
                vtVar2.f13344le += SystemClock.elapsedRealtime() - vtVar2.fkw;
                vtVar2.fkw = 0L;
                vtVar2.yu.set(2);
            }
        });
    }

    public static /* synthetic */ void ouw(vt vtVar) {
        if (vtVar.pno.compareAndSet(false, true)) {
            vtVar.ouw();
            final long jElapsedRealtime = vtVar.f13344le + (SystemClock.elapsedRealtime() - vtVar.fkw);
            vtVar.f13344le = jElapsedRealtime;
            bs.lh(new pno("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.tc.ouw.vt.1
                @Override // java.lang.Runnable
                public final void run() {
                    String strOuw = uoy.ouw(vt.this.vt);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", vt.this.vt.xdk() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e10) {
                        qbp.lh("EvTracker", e10.getMessage());
                    }
                    vpp vppVar = vt.this.vt;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, strOuw, vppVar.zvq(), jSONObject);
                }
            });
        }
    }
}
