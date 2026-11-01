package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.ironsource.C3426d4;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class fkw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f12346lh;
    public final com.bytedance.sdk.openadsdk.component.reward.view.pno ouw;
    public ouw vt;

    public interface ouw {
        void ouw(boolean z10, boolean z11, boolean z12, int i10);
    }

    private boolean vt(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        boolean z10;
        this.f12346lh.pno = vt();
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "showEndCard: cT2=" + this.f12346lh.pno);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12346lh;
        vpp vppVar = ouwVar.vt;
        if (vppVar.f12842an) {
            return false;
        }
        int i10 = ouwVar.pno;
        if (i10 != -1) {
            if (i10 >= 0) {
                ouwVar.zin.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f12346lh;
                messageObtain.arg1 = ouwVar2.pno;
                ouwVar2.ux.sendMessage(messageObtain);
                if (!od.ra(this.f12346lh.vt)) {
                    z10 = true;
                }
            }
            z10 = false;
        } else if (ouwVar.f12374gh == null && od.pno(vppVar) && this.f12346lh.bs.ryl.get()) {
            vtVar.zin();
            z10 = false;
        } else {
            vtVar.jg();
            z10 = true;
        }
        if (this.f12346lh.bs.cf() ? false : z10) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.f12346lh;
            if (ouwVar3.f12385sd == null || !ouwVar3.vt()) {
                return true;
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.f12346lh;
            ouwVar4.f12385sd.ouw(ouwVar4.pno);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    public final void ouw(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (this.f12346lh != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.f12346lh.vt);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(this.f12346lh.vt);
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "showEndCard() called with: isSkip = [" + z10 + "], force = [" + z11 + "], isFromLandingPage = [" + z12 + "], mAdType = [" + vtVar + C3426d4.j.f28588e);
        if (this.f12346lh.jvy.isFinishing() || vtVar == null) {
            return;
        }
        this.f12346lh.ey.ryl();
        if (z11) {
            this.f12346lh.f12377ko.set(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12346lh;
        boolean z13 = false;
        if (ouwVar.lvd && !ouwVar.f12384rn.get() && !th.ryl(this.f12346lh.vt) && !th.cf(this.f12346lh.vt) && (!th.vt(this.f12346lh.vt) || !this.f12346lh.f12377ko.get() || !this.f12346lh.zih.get())) {
            if ((th.vt(this.f12346lh.vt) && z12) || !ouw(z11)) {
                return;
            }
            if (th.vt(this.f12346lh.vt) || th.yu(this.f12346lh.vt) || th.ra(this.f12346lh.vt)) {
                this.f12346lh.uoy.lh(false);
                vtVar.jg();
                return;
            }
        }
        if (this.f12346lh.jvy.isDestroyed() || this.f12346lh.jvy.isFinishing()) {
            return;
        }
        if (this.f12346lh.vt.lso()) {
            com.bytedance.sdk.openadsdk.core.bly.lh brandBannerController = null;
            com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.f12346lh.jae;
            if (tljVar != null && (yuVar = tljVar.ouw) != null) {
                brandBannerController = yuVar.getBrandBannerController();
            }
            if (brandBannerController != null) {
                brandBannerController.ouw();
            }
            this.f12346lh.jvy.finish();
            return;
        }
        ouw ouwVar2 = this.vt;
        if (ouwVar2 != null) {
            ouwVar2.ouw(z10, z11, z12, i10);
            return;
        }
        this.f12346lh.ex.tlj();
        this.f12346lh.bs.mwh();
        this.f12346lh.f12372cf.set(false);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.f12346lh;
        if (ouwVar3.njr) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar3.f12374gh;
            if (!(pnoVar instanceof com.bytedance.sdk.openadsdk.activity.fkw) || pnoVar.fqk()) {
                this.f12346lh.ryl.set(false);
            }
        } else {
            this.f12346lh.ryl.set(false);
        }
        this.f12346lh.f12382pd.ouw();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.f12346lh;
        ryl rylVar = ouwVar4.uoy;
        if (!ouwVar4.f12383ra && ouwVar4.vt.ksc()) {
            z13 = true;
        }
        rylVar.ouw(z13);
        if (this.f12346lh.tlj.getAndSet(true)) {
            return;
        }
        if (!od.vt(this.f12346lh.vt) || !this.f12346lh.odc) {
            ouw(z10, vtVar);
            return;
        }
        ouw(z10, z11, z12, i10);
        this.f12346lh.ey.yu(8);
        this.f12346lh.uoy.lh(true);
        this.f12346lh.ey.lh();
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar2 = this.f12346lh.jae;
        if (tljVar2 != null) {
            tljVar2.vt();
        }
        this.f12346lh.ksc.pno();
    }

    private void lh() {
        if (!vpp.yu(this.f12346lh.vt)) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "TimeTrackLog report 408 from backup page");
            this.f12346lh.bs.ouw(false, 408, "end_card_timeout");
        }
        this.f12346lh.bs.ko();
        this.f12346lh.bs.ouw(8);
        this.f12346lh.fak.ouw(8);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12346lh;
        if (ouwVar.f12383ra) {
            osn.ouw((View) ouwVar.coz.f12489jg, 8);
            this.f12346lh.ey.le(0);
        }
        this.f12346lh.ey.yu(8);
        if (!this.f12346lh.vt.cd()) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.f12346lh.f12374gh;
            if (pnoVar != null) {
                this.ouw.ouw(pnoVar.hun().tlj.tlj());
            }
            this.ouw.ouw();
        } else if (!this.ouw.ouw(this.f12346lh.ex)) {
            this.f12346lh.jvy.finish();
        }
        this.f12346lh.ey.ra();
        vt(this.f12346lh.coz);
        this.f12346lh.uoy.lh(false);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f12346lh;
        ouwVar2.f12371cd.ouw(ouwVar2.vt.ey());
    }

    public fkw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.f12346lh = ouwVar;
        this.ouw = new com.bytedance.sdk.openadsdk.component.reward.view.pno(ouwVar);
    }

    private int vt() {
        int i10 = this.f12346lh.vt.xne;
        if (i10 <= 5000 && i10 >= 0) {
            if (i10 < 1000) {
                i10 += 1000;
            }
            com.bytedance.sdk.openadsdk.core.zih.yu();
            int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.ouw(this.f12346lh.vt.fqk());
            if (iOuw <= 5000 && iOuw >= 0) {
                if (iOuw < 1000) {
                    iOuw += 1000;
                }
                return Math.min(i10, iOuw);
            }
        }
        return -1;
    }

    private void ouw(boolean z10, boolean z11, boolean z12, int i10) {
        int i11;
        HashMap map = new HashMap();
        if (this.f12346lh.bs.vm()) {
            i11 = 1;
        } else {
            i11 = !this.f12346lh.bs.mwh ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12346lh;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(ouwVar.vt, ouwVar.fkw, z10, z11, z12, ouwVar.jvy.isFinishing(), i10, map);
    }

    public final void ouw(boolean z10, com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        mwh mwhVar;
        this.f12346lh.f12391vm.set(z10);
        vtVar.mwh();
        this.f12346lh.vt.cd();
        this.f12346lh.uoy.yu(false);
        this.f12346lh.uoy.lh(false);
        this.f12346lh.bs.jg();
        th thVar = this.f12346lh.ey.f12468rn;
        if (thVar != null) {
            thVar.yu();
        }
        this.f12346lh.ey.lh();
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.f12346lh.jae;
        if (tljVar != null) {
            tljVar.vt();
        }
        pno pnoVar = this.f12346lh.ksc;
        if (pnoVar != null) {
            pnoVar.vt(pno.f12393lh);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12346lh;
        if (!TextUtils.isEmpty(vpp.ouw(ouwVar.hun, ouwVar.vt))) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f12346lh;
            com.bytedance.sdk.openadsdk.utils.vpp.ouw(ouwVar2.jvy, od.cf(ouwVar2.vt), this.f12346lh.vt, com.bytedance.sdk.openadsdk.yu.vt.ouw.f13588lh);
            return;
        }
        if (vpp.lh(this.f12346lh.vt) && (mwhVar = this.f12346lh.fak) != null) {
            mwhVar.pno = SystemClock.elapsedRealtime();
        }
        if (!vpp.ouw(this.f12346lh.vt) && (vpp.lh(this.f12346lh.vt) || !this.f12346lh.bs.th())) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.f12346lh;
            vpp vppVar = ouwVar3.vt;
            boolean z11 = ouwVar3.bs.ryl.get();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.f12346lh;
            if (vpp.ouw(vppVar, z11, ouwVar4.bs.ucs, ouwVar4.fak.yu.get(), this.f12346lh.bs.zih)) {
                if (!vpp.yu(this.f12346lh.vt) && !vpp.lh(this.f12346lh.vt)) {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "TimeTrackLog report Success from Android");
                    this.f12346lh.bs.ouw(true, 0, (String) null);
                }
                vt(vtVar);
                ouw(vtVar);
                return;
            }
        }
        lh();
    }

    private void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        if (!vpp.lh(this.f12346lh.vt)) {
            this.f12346lh.fak.ouw(8);
            this.f12346lh.bs.ouw(0);
            this.f12346lh.bs.qbp();
        } else {
            this.f12346lh.bs.ouw(8);
            this.f12346lh.fak.ouw(0);
            this.f12346lh.fak.vt();
        }
        if (this.f12346lh.f12383ra) {
            osn.ouw((View) vtVar.f12489jg, 0);
            this.f12346lh.ey.le(8);
        }
        this.f12346lh.ey.yu(8);
        this.f12346lh.ey.ra();
        if (vpp.lh(this.f12346lh.vt)) {
            this.f12346lh.ux.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12346lh;
        ouwVar.bs.vt(ouwVar.f12373cj);
        this.f12346lh.bs.bly();
        this.f12346lh.bs.le();
        bs bsVar = this.f12346lh.bs.f12409ra;
        if (bsVar != null) {
            bsVar.ouw("prerender_page_show", (JSONObject) null);
        }
        if (!od.vt(this.f12346lh.vt)) {
            this.f12346lh.uoy.lh(false);
        }
        com.bytedance.sdk.component.bly.le leVar = this.f12346lh.bs.f12405le;
        if (leVar == null || leVar.getWebView() == null) {
            return;
        }
        leVar.le();
        leVar.getWebView().resumeTimers();
    }

    public final void ouw() {
        zih zihVar = this.ouw.yu;
        if (zihVar != null) {
            DeviceUtils.AudioInfoReceiver.vt(zihVar);
            com.bytedance.sdk.component.bly.le leVar = zihVar.f12425lh;
            if (leVar != null) {
                ey.ouw(leVar.getWebView());
            }
        }
    }

    private boolean ouw(boolean z10) {
        if (!th.lh(this.f12346lh.vt)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f12346lh;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar = ouwVar.jae.ouw;
        if (yuVar == null || yuVar.yu != 0 || z10) {
            return true;
        }
        ouwVar.uoy.lh(false);
        return false;
    }
}
