package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes10.dex */
public class th extends qbp implements com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu {
    public int bly;
    private long bs;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.mwh.vt.le f12564cf;
    private long fak;
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12565le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12566lh;
    private com.bytedance.sdk.openadsdk.multipro.vt.ouw ouw;
    public boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f12567ra;
    public boolean tlj;
    private com.bytedance.sdk.openadsdk.ouw.vt.lh uoy;
    public rn vt;
    public boolean yu;

    public th(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str, boolean z10) {
        super(context, vppVar, adSlot, str, false, true);
        this.f12566lh = 1;
        this.yu = false;
        this.fkw = true;
        this.f12567ra = true;
        this.pno = true;
        this.bly = -1;
        this.tlj = z10;
        this.f12548rn = new FrameLayout(this.ryl);
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f12541ko;
        int iFqk = vppVar2 != null ? vppVar2.fqk() : 0;
        this.f12565le = iFqk;
        ra(iFqk);
        try {
            this.ouw = new com.bytedance.sdk.openadsdk.multipro.vt.ouw();
            rn rnVar = new rn(this.ryl, this.f12541ko, this.mwh, this.f12545od, this.tlj);
            this.vt = rnVar;
            rnVar.setShouldCheckNetChange(false);
            this.vt.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.2
                @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt
                public final void ouw(boolean z11, long j10, long j11, long j12, boolean z12) {
                    th.this.ouw.ouw = z11;
                    th.this.ouw.fkw = j10;
                    th.this.ouw.f13265le = j11;
                    th.this.ouw.f13267ra = j12;
                    th.this.ouw.yu = z12;
                }
            });
            this.vt.setVideoAdLoadListener(this);
            this.vt.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.mwh)) {
                this.vt.setIsAutoPlay(this.yu ? this.f12539jg.isAutoPlay() : this.fkw);
            } else if ("open_ad".equals(this.mwh)) {
                this.vt.setIsAutoPlay(true);
            } else {
                this.vt.setIsAutoPlay(this.fkw);
            }
            if ("open_ad".equals(this.mwh)) {
                this.vt.ouw(true, "initVideo");
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                boolean zVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(String.valueOf(this.f12565le));
                this.f12550tc = zVt;
                this.vt.ouw(zVt, "initVideo");
            }
            this.vt.yu();
        } catch (Exception unused) {
            this.vt = null;
        }
        addView(this.f12548rn, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mwh.ra() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.1
            @Override // com.bytedance.sdk.openadsdk.mwh.ra
            public final void ouw(final com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        th.ouw(th.this, jgVar);
                    }
                });
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void h_() {
        this.f12567ra = false;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoAdStartPlay");
        this.f12566lh = 2;
        com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar = this.uoy;
        if (lhVar != null) {
            lhVar.vt();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void i_() {
        this.f12567ra = false;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoAdContinuePlay");
        this.zih = false;
        this.f12566lh = 2;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void j_() {
        this.f12567ra = false;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoComplete");
        this.f12566lh = 5;
        com.bytedance.sdk.component.adexpress.vt.vt vtVar = this.f12546pd;
        if (vtVar != null && vtVar.vt() != null) {
            this.f12546pd.vt().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar = this.uoy;
        if (lhVar != null) {
            lhVar.yu();
        }
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).onvideoComplate();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
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

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
    }

    public static /* synthetic */ boolean ouw(th thVar, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        return thVar.ouw(jgVar, true);
    }

    private void setShowAdInteractionView(boolean z10) {
        rn rnVar = this.vt;
        if (rnVar != null) {
            rnVar.setShowAdInteractionView(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        return this.bs;
    }

    public rn getExpressVideoView() {
        return this.vt;
    }

    public com.bytedance.sdk.openadsdk.ouw.vt.lh getVideoAdListener() {
        return this.uoy;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.mwh.vt.lh getVideoController() {
        rn rnVar = this.vt;
        if (rnVar != null) {
            return rnVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.vt.ouw getVideoModel() {
        return this.ouw;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu
    public final void k_() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoLoad");
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        rn rnVar;
        if (this.f12566lh == 3 && (rnVar = this.vt) != null) {
            rnVar.yu();
        }
        rn rnVar2 = this.vt;
        if (rnVar2 != null && rnVar2.getNativeVideoController().f12917tc) {
            this.f12566lh = 1;
        }
        le(this.f12566lh);
        return this.f12566lh;
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar) {
        this.f12564cf = leVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar) {
        this.uoy = lhVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void vt() {
        this.f12567ra = false;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoAdPaused");
        this.zih = true;
        this.f12566lh = 3;
        com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar = this.uoy;
        if (lhVar != null) {
            lhVar.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        return this.bs;
    }

    private void ra(int i10) {
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(i10);
        if (3 == iVt) {
            this.yu = false;
            this.fkw = false;
        } else if (4 == iVt) {
            this.yu = true;
        } else {
            int iOuw = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
            if (1 == iVt) {
                this.yu = false;
                this.fkw = uoy.yu(iOuw);
            } else if (2 == iVt) {
                if (uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw)) {
                    this.yu = false;
                    this.fkw = true;
                }
            } else if (5 == iVt && (uoy.yu(iOuw) || uoy.le(iOuw))) {
                this.yu = false;
                this.fkw = true;
            }
        }
        if (!this.fkw) {
            this.f12566lh = 3;
        }
        com.bytedance.sdk.component.utils.ko.lh("NativeVideoAdView", "mIsAutoPlay=" + this.fkw + ",status=" + iVt);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.ko
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, final com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        this.fvf = yuVar;
        this.bly = yuVar.vt();
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar2 = this.fvf;
        if ((yuVar2 instanceof ex) && ((ex) yuVar2).f12507jg != null) {
            ((ex) yuVar2).f12507jg.f12579cf = this;
        }
        if (jgVar != null && jgVar.vt) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.3
                @Override // java.lang.Runnable
                public final void run() {
                    th.vt(th.this, jgVar);
                }
            });
        }
        super.ouw(yuVar, jgVar);
    }

    public static /* synthetic */ void vt(th thVar, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh videoController;
        if (thVar.ouw(jgVar, false)) {
            thVar.f12548rn.removeAllViews();
            rn rnVar = thVar.vt;
            if (rnVar != null) {
                if ((thVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) && (jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt)) {
                    FrameLayout frameLayout = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).zih;
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                        if (thVar.bly == 10) {
                            thVar.vt.setClickable(false);
                        }
                        frameLayout.addView(thVar.vt, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((thVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) && (videoController = thVar.getVideoController()) != null) {
                        videoController.rrs = false;
                    }
                } else {
                    View view = jgVar.f11590rn;
                    if (view != null) {
                        if (thVar.pno) {
                            view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.f11421le, 1);
                            ((FrameLayout) jgVar.f11590rn).removeAllViews();
                            ((FrameLayout) jgVar.f11590rn).addView(thVar.vt, new FrameLayout.LayoutParams(-1, -1));
                            thVar.pno = false;
                        }
                    } else {
                        thVar.f12548rn.addView(rnVar);
                    }
                }
                thVar.vt.ouw(0L, true, false);
                thVar.ra(thVar.f12565le);
                if (!com.bytedance.sdk.component.utils.vm.ouw(thVar.ryl) && !thVar.fkw && thVar.f12567ra) {
                    thVar.vt.fkw();
                }
                if (TextUtils.equals("embeded_ad", thVar.mwh)) {
                    return;
                }
                thVar.setShowAdInteractionView(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(boolean z10, String str) {
        rn rnVar;
        com.bytedance.sdk.component.utils.ko.ouw("TTAD.NativeExpressVideoView", "onMuteVideo,mute:", Boolean.valueOf(z10), str);
        if (this.f12541ko.jvy() || (rnVar = this.vt) == null) {
            return;
        }
        rnVar.ouw(z10, str);
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onSkipVideo");
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onChangeVideoState,stateType:".concat(String.valueOf(i10)));
        rn rnVar = this.vt;
        if (rnVar == null) {
            com.bytedance.sdk.component.utils.ko.fkw("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
            return;
        }
        if (i10 == 1) {
            rnVar.ouw(0L, true, false);
            return;
        }
        if (i10 == 2 || i10 == 3) {
            rnVar.setCanInterruptVideoPlay(true);
            this.vt.performClick();
        } else if (i10 == 4) {
            rnVar.getNativeVideoController().ko();
        } else {
            if (i10 != 5) {
                return;
            }
            rnVar.ouw(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.pno
    public final void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i10 == -1 || lhVar == null) {
            return;
        }
        if (i10 == 11) {
            try {
                rn rnVar = this.vt;
                if (rnVar != null) {
                    rnVar.setCanInterruptVideoPlay(true);
                    this.vt.performClick();
                    if (this.zih) {
                        this.vt.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f13417ki).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.ouw(view, i10, lhVar);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void ouw(long j10, long j11) {
        this.f12567ra = false;
        int i10 = this.f12566lh;
        if (i10 != 5 && i10 != 3 && j10 > this.bs) {
            this.f12566lh = 2;
        }
        this.bs = j10;
        this.fak = j11;
        com.bytedance.sdk.component.adexpress.vt.vt vtVar = this.f12546pd;
        if (vtVar != null && vtVar.vt() != null) {
            this.f12546pd.vt().setTimeUpdate(((int) (j11 - j10)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).setTimeUpdate(((int) (j11 - j10)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) this.fvf).ouw(j10, j11);
        }
        int iAbs = (int) Math.abs(((long) this.zin) - j10);
        int i11 = this.zin;
        if (i11 < 0 || iAbs > 500 || i11 > j11 || iAbs >= 500 || this.jqy.contains(this.vpp)) {
            return;
        }
        if (this.zin > j10) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.4
                @Override // java.lang.Runnable
                public final void run() {
                    th.this.vt.setCanInterruptVideoPlay(true);
                    th.this.vt.performClick();
                    th thVar = th.this;
                    thVar.vt(thVar.zin, thVar.vpp);
                }
            }, iAbs);
        } else {
            this.vt.setCanInterruptVideoPlay(true);
            this.vt.performClick();
            vt(this.zin, this.vpp);
        }
        this.jqy.add(this.vpp);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu
    public final void ouw(int i10, int i11) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoError,errorCode:" + i10 + ",extraCode:" + i11);
        this.bs = this.fak;
        this.f12566lh = 4;
        com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar = this.uoy;
        if (lhVar != null) {
            lhVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10, String str) {
        this.zin = i10;
        this.vpp = str;
    }

    private boolean ouw(com.bytedance.sdk.component.adexpress.vt.jg jgVar, boolean z10) {
        int i10;
        double d10 = jgVar.fkw;
        double d11 = jgVar.f11587le;
        double d12 = jgVar.f11584cf;
        double d13 = jgVar.ryl;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "videoWH=" + d12 + VastAttributes.HORIZONTAL_POSITION + d13);
        if ((d12 == 0.0d || d13 == 0.0d) && (i10 = this.bly) != 7 && i10 != 10 && i10 != 9 && !(this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu)) {
            return false;
        }
        int iOuw = osn.ouw(this.ryl, (float) d10);
        int iOuw2 = osn.ouw(this.ryl, (float) d11);
        int iOuw3 = osn.ouw(this.ryl, (float) d12);
        int iOuw4 = osn.ouw(this.ryl, (float) d13);
        float fMin = Math.min(Math.min(osn.ouw(this.ryl, jgVar.f11589ra), osn.ouw(this.ryl, jgVar.pno)), Math.min(osn.ouw(this.ryl, jgVar.bly), osn.ouw(this.ryl, jgVar.tlj)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12548rn.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iOuw3, iOuw4);
        }
        layoutParams.width = iOuw3;
        layoutParams.height = iOuw4;
        layoutParams.topMargin = iOuw2;
        layoutParams.leftMargin = iOuw;
        layoutParams.setMarginStart(iOuw);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.f12548rn.setLayoutParams(layoutParams);
        osn.vt(this.f12548rn, fMin);
        rn rnVar = this.vt;
        if (rnVar == null || !z10) {
            return true;
        }
        rnVar.ouw(iOuw3, iOuw4);
        return true;
    }
}
