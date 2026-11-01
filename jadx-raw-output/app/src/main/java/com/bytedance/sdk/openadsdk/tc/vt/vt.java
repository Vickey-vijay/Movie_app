package com.bytedance.sdk.openadsdk.tc.vt;

import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vt {
    private volatile boolean bly = false;
    public final Integer fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final AtomicLong f13350le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public vpp f13351lh;
    public final AtomicBoolean ouw;
    private final int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final fkw.ouw f13352ra;
    public WeakReference<View> vt;
    public final AtomicBoolean yu;

    public abstract int fkw();

    public abstract boolean lh();

    public void ouw() {
        if (this.yu.compareAndSet(false, true)) {
            ra.ouw(this);
        }
    }

    public final void pno() {
        this.bly = true;
        ra.vt(this);
    }

    public abstract void vt(int i10);

    public boolean bly() {
        return this.yu.get();
    }

    public final void le() {
        if (this.ouw.get()) {
            return;
        }
        if (!this.yu.get()) {
            ra();
        } else if (!this.f13350le.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.f13350le.get() >= this.pno) {
            yu();
        }
    }

    public final void ra() {
        this.f13350le.set(-1L);
    }

    public final int vt() {
        if (this.ouw.get()) {
            return 1;
        }
        WeakReference<View> weakReference = this.vt;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.bly) {
            return 3;
        }
        if (this.fkw.equals(view.getTag(InputDeviceCompat.SOURCE_HDMI))) {
            return this.fkw.equals(view.getTag(InputDeviceCompat.SOURCE_HDMI)) && lh() ? 1 : 2;
        }
        pno();
        fkw.vt(this.fkw);
        return 3;
    }

    public void yu() {
        final ouw ouwVar;
        if (this.ouw.compareAndSet(false, true)) {
            final vpp vppVar = this.f13351lh;
            WeakReference<View> weakReference = this.vt;
            if (weakReference == null) {
                ouwVar = new ouw(-1, -1, -1.0f);
            } else {
                View view = weakReference.get();
                ouwVar = view == null ? new ouw(0, 0, 0.0f) : new ouw(view.getWidth(), view.getHeight(), view.getAlpha());
            }
            final fkw.ouw ouwVar2 = this.f13352ra;
            vppVar.vrp = true;
            final String str = "mrc_report";
            bs.lh(new com.bytedance.sdk.component.pno.pno(str) { // from class: com.bytedance.sdk.openadsdk.tc.vt.yu.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (vppVar.fvf()) {
                        if (vppVar.lso()) {
                            vpp vppVar2 = vppVar;
                            com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(vppVar2.rrs, new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt("show_urls", vppVar2));
                        } else {
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar);
                        }
                    }
                    String strOuw = uoy.ouw(vppVar);
                    final JSONObject jSONObject = new JSONObject();
                    final JSONObject jSONObjectOuw = null;
                    ouw ouwVar3 = ouwVar;
                    if (ouwVar3 != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("width", ouwVar3.ouw);
                            jSONObject2.put("height", ouwVar3.vt);
                            jSONObject2.put("alpha", ouwVar3.f13348lh);
                            jSONObject.put("root_view", jSONObject2);
                            fkw.ouw ouwVar4 = ouwVar2;
                            if (ouwVar4 != null) {
                                int i10 = ouwVar4.ouw;
                                if (i10 != -1) {
                                    jSONObject.put("dynamic_show_type", i10);
                                }
                                int i11 = ouwVar2.vt;
                                if (i11 != -1) {
                                    jSONObjectOuw = com.bytedance.sdk.openadsdk.yu.lh.ouw(i11 + 1);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, strOuw, "mrc_show", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.tc.vt.yu.1.1
                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject lh() {
                            return jSONObject;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject ouw() {
                            return jSONObjectOuw;
                        }
                    });
                }
            });
        }
    }

    public vt(Integer num, View view, vpp vppVar, int i10, fkw.ouw ouwVar) {
        this.fkw = num;
        this.pno = i10;
        this.f13351lh = vppVar;
        this.f13352ra = ouwVar;
        ouw(view);
        this.yu = new AtomicBoolean(false);
        this.f13350le = new AtomicLong(-1L);
        this.ouw = new AtomicBoolean(false);
    }

    public final void ouw(int i10) {
        if (i10 == 4) {
            ouw();
            return;
        }
        if (i10 == 8) {
            this.yu.set(false);
            ra();
        } else if (i10 == 9) {
            yu();
        } else {
            vt(i10);
        }
    }

    public final void ouw(View view) {
        if (view != null) {
            view.setTag(InputDeviceCompat.SOURCE_HDMI, this.fkw);
        }
        this.vt = new WeakReference<>(view);
    }
}
