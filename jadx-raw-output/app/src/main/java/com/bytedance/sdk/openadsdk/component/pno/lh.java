package com.bytedance.sdk.openadsdk.component.pno;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;

/* JADX INFO: loaded from: classes11.dex */
public class lh implements com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw {
    private vpp fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f12297lh = false;
    public Context ouw;
    public vt vt;
    private FrameLayout yu;

    public final boolean ouw() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        vt vtVar = this.vt;
        return (vtVar == null || (lhVar = vtVar.f12911le) == null || !lhVar.le()) ? false : true;
    }

    private long le() {
        vt vtVar = this.vt;
        if (vtVar != null) {
            return vtVar.zih();
        }
        return 0L;
    }

    private long ra() {
        vt vtVar = this.vt;
        if (vtVar != null) {
            return vtVar.th() + this.vt.zih();
        }
        return 0L;
    }

    public final long fkw() {
        vt vtVar = this.vt;
        if (vtVar != null) {
            return vtVar.bly;
        }
        return 0L;
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        vt vtVar = this.vt;
        return (vtVar == null || (lhVar = vtVar.f12911le) == null || !lhVar.ra()) ? false : true;
    }

    public final void yu() {
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.ryl();
        }
    }

    public lh(Context context) {
        this.ouw = context.getApplicationContext();
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw
    public long getVideoProgress() {
        return fkw();
    }

    public final void lh() {
        try {
            if (ouw()) {
                this.vt.cf();
            }
        } catch (Throwable th2) {
            qbp.yu("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th2.getMessage());
        }
    }

    public final boolean ouw(float f10) {
        try {
            vt vtVar = this.vt;
            if (vtVar != null) {
                return vtVar.ouw(f10);
            }
        } catch (Throwable th2) {
            qbp.yu("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th2.getMessage());
        }
        return false;
    }

    public final void ouw(int i10) {
        if (this.vt != null) {
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.ouw(fkw());
            ouwVar.vt(ra());
            ouwVar.vt = le();
            ouwVar.tlj = i10;
            ouwVar.ryl = this.vt.vm();
            ouwVar.f13478le = this.vt.jae();
            this.vt.ouw(ouwVar);
        }
    }

    public final boolean ouw(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.ouw ouwVar, vpp vppVar) {
        this.yu = frameLayout;
        this.fkw = vppVar;
        vt vtVar = new vt(this.ouw, frameLayout, vppVar);
        this.vt = vtVar;
        vtVar.f12913od = ouwVar;
        try {
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(0).vt(), this.fkw);
            vtVarOuw.f10445le = this.fkw.pv;
            vtVarOuw.f10448ra = this.yu.getWidth();
            vtVarOuw.pno = this.yu.getHeight();
            vtVarOuw.bly = this.fkw.yhj;
            vtVarOuw.tlj = 0L;
            vtVarOuw.f10442cf = true;
            return this.vt.ouw(vtVarOuw);
        } catch (Throwable th2) {
            qbp.yu("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th2.getMessage());
            return false;
        }
    }
}
