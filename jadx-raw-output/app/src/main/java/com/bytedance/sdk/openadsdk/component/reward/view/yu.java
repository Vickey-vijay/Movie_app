package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.zih;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yu extends qbp {
    public static float ouw = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f12478le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public zih f12479lh;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.zin.ouw.ouw f12480ra;
    public ko vt;
    public int yu;

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/yu;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(g.f44975u, this, motionEvent);
        return safedk_yu_dispatchTouchEvent_24f56d0061c620f535955f898ef2ad21(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.lh();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void pno() {
        this.f12554vm = true;
        this.f12548rn = new FrameLayout(this.ryl);
        if (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.f12541ko) && !com.bytedance.sdk.openadsdk.core.cf.yu.vt(this.f12541ko)) {
            addView(this.f12548rn, new FrameLayout.LayoutParams(-1, -1));
        }
        super.pno();
        com.bytedance.sdk.component.bly.le webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        setBackupListener(new com.bytedance.sdk.component.adexpress.vt.lh() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.2
            @Override // com.bytedance.sdk.component.adexpress.vt.lh
            public final boolean ouw(ViewGroup viewGroup) {
                try {
                    ((qbp) viewGroup).rn();
                    yu.this.f12479lh = new zih(viewGroup.getContext());
                    yu yuVar = yu.this;
                    yuVar.f12479lh.ouw(yuVar.f12541ko, (qbp) viewGroup, yu.this.fkw.rrs);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mwh.ra() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.1
            @Override // com.bytedance.sdk.openadsdk.mwh.ra
            public final void ouw(jg jgVar) {
                yu.this.ouw(jgVar);
            }
        });
    }

    public yu(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, AdSlot adSlot, String str) {
        super(ouwVar.jvy, ouwVar.vt, adSlot, str, ouwVar.f12373cj, !ouwVar.euf);
        this.yu = 1;
        this.f12478le = -1.0f;
        this.fkw = ouwVar;
        setVideoBusiness(ouwVar.fqk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final boolean bly() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f12374gh;
        if (pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
            return true;
        }
        return this.fkw.pv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        ko koVar = this.vt;
        if (koVar != null) {
            return koVar.fkw();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean l_() {
        return com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(this.fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        ko koVar = this.vt;
        if (koVar == null) {
            return 0;
        }
        int iLe = koVar.le();
        le(iLe);
        return iLe;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void mwh() {
        try {
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12480ra;
            if (ouwVar != null) {
                ouwVar.yu();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.ouw("TTAD.FRExpressView", th2);
        }
        super.mwh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.ko
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, jg jgVar) {
        FrameLayout frameLayout;
        boolean z10;
        boolean z11;
        bs bsVar;
        this.fvf = yuVar;
        vpp vppVar = this.f12541ko;
        if (vppVar != null && vppVar.lso()) {
            super.ouw(yuVar, jgVar);
            return;
        }
        if ((yuVar instanceof ex) && (bsVar = ((ex) yuVar).f12507jg) != null) {
            bsVar.f12579cf = this;
        }
        if (jgVar != null && jgVar.vt) {
            ouw(jgVar);
            this.yu = yuVar.vt();
            if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) && od.lh(this.f12541ko)) {
                try {
                    if ((jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt) && (frameLayout = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).f12617th) != null) {
                        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f12374gh;
                        if (pnoVar == null || pnoVar.hun() == null) {
                            z10 = false;
                            z11 = true;
                        } else {
                            com.bytedance.sdk.openadsdk.activity.pno pnoVarCf = this.fkw.f12374gh.hun().tlj.cf();
                            com.bytedance.sdk.openadsdk.activity.pno pnoVar2 = this.fkw.f12374gh;
                            z10 = pnoVarCf == pnoVar2;
                            z11 = pnoVar2.hun().tlj.fkw() || !z10;
                        }
                        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.zin.ouw.ouw(this.ryl, this.f12541ko, this.fkw.ucs, z11, frameLayout);
                        this.f12480ra = ouwVar;
                        ouwVar.ouw(this.fkw.fqk);
                        this.f12480ra.ouw(false, (com.bytedance.sdk.openadsdk.mwh.le) null);
                        this.f12480ra.ouw();
                        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.FRExpressView", "initPlayable success mute = " + this.fkw.f12373cj + ",isCurrentScene->" + z10 + ",isMute = " + z11);
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.ouw("TTAD.FRExpressView", th2);
                }
            }
            if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = this.fkw.ex;
                koVar.f12351cf = true;
                com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = koVar.f12357ra;
                if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                    ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).wp = true;
                }
            }
        }
        super.ouw(yuVar, jgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ra();
        }
    }

    public boolean safedk_yu_dispatchTouchEvent_24f56d0061c620f535955f898ef2ad21(MotionEvent p10) {
        th thVar;
        ryl rylVar = this.fkw.ey;
        if (rylVar != null && (thVar = rylVar.f12468rn) != null && thVar.fkw()) {
            int action = p10.getAction();
            if (action == 0) {
                this.f12478le = p10.getY();
            } else if (action == 1) {
            }
            if (osn.ouw(this.f12478le, p10.getY(), this.ryl)) {
                thVar.vt(5);
            }
        }
        return super.dispatchTouchEvent(p10);
    }

    public final void setExpressVideoListenerProxy(ko koVar) {
        this.vt = koVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final boolean tlj() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f12374gh;
        return pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void vt(int i10) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.vt(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        ko koVar = this.vt;
        if (koVar != null) {
            return koVar.yu();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void cf() {
        super.cf();
        if (this.f12480ra != null) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f12374gh;
            if (pnoVar != null && pnoVar.hun() != null) {
                this.f12480ra.ouw(this.fkw.f12374gh.hun().tlj.fkw());
            }
            this.f12480ra.vt();
        }
    }

    public final View getBackupContainerBackgroundView() {
        if (zih()) {
            return this.f12479lh.getBackupContainerBackgroundView();
        }
        return null;
    }

    public final FrameLayout getVideoFrameLayout() {
        if (zih()) {
            return this.f12479lh.getVideoContainer();
        }
        return this.f12548rn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw lh(int i10) {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw ouwVarLh = super.lh(i10);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.fkw;
        if (ouwVar.euf && (pnoVar = ouwVar.f12374gh) != null) {
            ouwVarLh.vt = pnoVar.f12105cf;
        }
        return ouwVarLh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void ryl() {
        super.ryl();
        if (this.f12480ra != null) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f12374gh;
            if (pnoVar != null && pnoVar.hun() != null) {
                this.f12480ra.ouw(true);
            }
            this.f12480ra.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.dynamic.yu
    public final void setSoundMute(boolean z10) {
        super.setSoundMute(z10);
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f12480ra;
        if (ouwVar != null) {
            ouwVar.ouw(z10);
        }
    }

    public final void ouw(final jg jgVar) {
        if (jgVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.3
            @Override // java.lang.Runnable
            public final void run() {
                yu.ouw(yu.this, jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(String str, JSONObject jSONObject) {
        super.ouw(str, jSONObject);
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(boolean z10, String str) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onMuteVideo,mute:".concat(String.valueOf(z10)));
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(z10, str);
        }
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean ouw(JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "setPlaybackSpeed,params:".concat(String.valueOf(jSONObject)));
        ko koVar = this.vt;
        if (koVar != null) {
            return koVar.ouw(jSONObject);
        }
        return super.ouw(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onSkipVideo");
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onChangeVideoState,stateType:".concat(String.valueOf(i10)));
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10, jg jgVar) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i10, jgVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.pno
    public final void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i10 != -1 && lhVar != null && i10 == 3) {
            ra();
        } else {
            super.ouw(view, i10, lhVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10, String str) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i10, str);
        }
    }

    public final void ouw(long j10, long j11) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).ouw(j10, j11);
        }
    }

    public static /* synthetic */ void ouw(yu yuVar, jg jgVar) {
        if (jgVar != null) {
            double d10 = jgVar.fkw;
            double d11 = jgVar.f11587le;
            double d12 = jgVar.f11584cf;
            double d13 = jgVar.ryl;
            int iOuw = osn.ouw(yuVar.ryl, (float) d10);
            int iOuw2 = osn.ouw(yuVar.ryl, (float) d11);
            int iOuw3 = osn.ouw(yuVar.ryl, (float) d12);
            int iOuw4 = osn.ouw(yuVar.ryl, (float) d13);
            com.bytedance.sdk.component.utils.ko.vt("ExpressView", "vW x vH =" + d12 + VastAttributes.HORIZONTAL_POSITION + d13);
            if ((d13 != 0.0d && d12 != 0.0d) || yuVar.fvf.vt() == 7 || yuVar.fvf.vt() == 10 || (yuVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu)) {
                if ((yuVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) && (jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt)) {
                    FrameLayout frameLayout = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).zih;
                    if (frameLayout != null) {
                        if (yuVar.f12548rn.getParent() != null) {
                            ((ViewGroup) yuVar.f12548rn.getParent()).removeView(yuVar.f12548rn);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        frameLayout.addView(yuVar.f12548rn, layoutParams);
                        return;
                    }
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) yuVar.f12548rn.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new FrameLayout.LayoutParams(iOuw3, iOuw4);
                }
                layoutParams2.width = iOuw3;
                layoutParams2.height = iOuw4;
                layoutParams2.topMargin = iOuw2;
                layoutParams2.leftMargin = iOuw;
                layoutParams2.setMarginStart(iOuw);
                layoutParams2.setMarginEnd(layoutParams2.rightMargin);
                yuVar.f12548rn.setLayoutParams(layoutParams2);
            }
        }
    }
}
