package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.ouw.rn;
import com.bytedance.sdk.openadsdk.component.reward.view.ryl;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes8.dex */
public class ouw {
    public com.bytedance.sdk.openadsdk.core.mwh.yu.vt bly;
    public final ko fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final ryl f12481le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12482lh;
    public com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ryl pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final rn f12483ra;
    public jae tlj;
    public vpp vt;
    public int yu;

    public void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, jae jaeVar) {
        this.bly = vtVar;
        this.tlj = jaeVar;
    }

    public final void lh() {
        if (od.vt(this.ouw.vt) && DeviceUtils.ra() == 0) {
            this.ouw.f12373cj = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        ouwVar.uoy.vt(ouwVar.f12373cj);
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar.f12374gh == null && ouwVar.ex.vt() && (th.lh(this.ouw.vt) || !vpp.fkw(this.ouw.vt))) {
            return false;
        }
        if (!th.vt(this.ouw.vt) || !this.ouw.f12387th.get()) {
            return (this.ouw.tlj.get() || this.ouw.f12372cf.get()) ? false : true;
        }
        FrameLayout frameLayoutLe = this.ouw.ey.le();
        frameLayoutLe.setVisibility(4);
        frameLayoutLe.setVisibility(0);
        return false;
    }

    public ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.ouw = ouwVar;
        this.vt = ouwVar.vt;
        this.f12482lh = ouwVar.yib;
        this.yu = ouwVar.yhj;
        this.fkw = ouwVar.ex;
        this.f12481le = ouwVar.ey;
        this.f12483ra = ouwVar.bs;
        this.pno = ouwVar.uoy;
    }

    public final boolean ouw() {
        int i10;
        return this.ouw.vt.cd() || (i10 = this.ouw.vt.ucs) == 15 || i10 == 5 || i10 == 50;
    }

    public final void ouw(boolean z10) {
        if (this.ouw.tlj.get()) {
            return;
        }
        vpp vppVar = this.vt;
        if (vppVar != null && vppVar.lso()) {
            this.pno.lh(false);
            this.pno.ouw(true);
            this.ouw.ey.vt(8);
            this.ouw.ey.yu(8);
            return;
        }
        if (!z10) {
            this.pno.lh(false);
            this.pno.ouw(false);
            this.pno.yu(false);
            this.ouw.ey.le(8);
        } else {
            this.pno.ouw(this.ouw.vt.ksc());
            if (ouw()) {
                this.pno.lh(true);
            }
            if (!ouw() && (!(this instanceof ra) || !this.ouw.vt.lh())) {
                this.pno.yu();
                this.ouw.ey.le(0);
            } else {
                this.pno.yu(true);
            }
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            if (ouwVar.f12389vh != com.bytedance.sdk.openadsdk.component.reward.view.yu.ouw) {
                ouwVar.ey.vt(8);
                this.ouw.ey.yu(8);
                return;
            } else {
                ouwVar.ey.vt(0);
                this.ouw.ey.lh(0);
                this.ouw.ey.yu(0);
                return;
            }
        }
        this.ouw.ey.vt(4);
        this.ouw.ey.lh(8);
        this.ouw.ey.yu(8);
    }
}
