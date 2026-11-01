package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.vm;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class bly extends com.bytedance.sdk.openadsdk.core.bly.ouw implements com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f13163jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.mwh.vt.le f13164ko;
    private qbp mwh;
    public boolean ouw;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private String f13165rn;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private PAGBannerAdWrapperListener f13166vm;
    private long zih;

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void h_() {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void i_() {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void j_() {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu
    public final void k_() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu
    public final void ouw(int i10, int i11) {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void vt() {
    }

    public static class ouw {
        public com.bytedance.sdk.openadsdk.core.le.yu fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.core.le.yu f13167lh;
        public FrameLayout ouw;
        public ryl vt;
        public PAGLogoView yu;

        private ouw() {
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    public long getVideoProgress() {
        return this.zih;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i10, ko koVar) {
        com.bytedance.sdk.openadsdk.core.ryl.le leVar;
        qbp qbpVar = this.mwh;
        if (qbpVar != null) {
            qbpVar.ouw(view, i10, koVar);
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = this.f13164ko;
            if (leVar2 == null || !(leVar2.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.lh) || (leVar = this.f13164ko.getNativeVideoController().f12907cd) == null) {
                return;
            }
            leVar.ouw(13);
        }
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f13166vm = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.f13165rn = str;
    }

    public bly(@NonNull Context context) {
        super(context);
        this.ouw = true;
        this.vt = context;
    }

    public final void ouw(vpp vppVar, qbp qbpVar, com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar) {
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f12534lh = vppVar;
        this.mwh = qbpVar;
        this.f13163jg = lhVar;
        this.f12533le = "banner_ad";
        qbpVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        vm vmVarOuw = vt.ouw(this.mwh.getExpectExpressWidth(), this.mwh.getExpectExpressHeight());
        if (this.mwh.getExpectExpressWidth() > 0 && this.mwh.getExpectExpressHeight() > 0) {
            this.f12535ra = osn.ouw(this.vt, this.mwh.getExpectExpressWidth());
            this.pno = osn.ouw(this.vt, this.mwh.getExpectExpressHeight());
        } else {
            int iYu = osn.yu(this.vt);
            this.f12535ra = iYu;
            this.pno = Float.valueOf(iYu / vmVarOuw.vt).intValue();
        }
        int i10 = this.f12535ra;
        if (i10 > 0 && i10 > osn.yu(this.vt)) {
            float fYu = osn.yu(this.vt) / this.f12535ra;
            this.f12535ra = osn.yu(this.vt);
            this.pno = Float.valueOf(this.pno * fYu).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f12535ra, this.pno);
        }
        layoutParams.width = this.f12535ra;
        layoutParams.height = this.pno;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        vpp vppVar2 = this.f12534lh;
        if (vppVar2 != null) {
            int i11 = vppVar2.ucs;
            ouw ouwVar2 = new ouw((byte) 0);
            ouwVar2.ouw = new FrameLayout(this.vt);
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            ouwVar2.ouw.setLayoutParams(layoutParams2);
            ouwVar2.vt = new ryl(this.vt);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
            layoutParams3.gravity = 17;
            ouwVar2.vt.setLayoutParams(layoutParams3);
            ouwVar2.ouw.addView(ouwVar2.vt);
            int iOuw = osn.ouw(this.vt, 5.0f);
            if (vmVarOuw != null && vmVarOuw.ouw == 1) {
                ouwVar2.f13167lh = com.bytedance.sdk.openadsdk.core.widget.le.ouw(getContext());
            } else {
                ouwVar2.f13167lh = com.bytedance.sdk.openadsdk.core.widget.le.vt(getContext());
            }
            ouwVar2.f13167lh.setId(520093697);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = GravityCompat.END;
            layoutParams4.setMargins(iOuw, iOuw, iOuw, iOuw);
            ouwVar2.f13167lh.setLayoutParams(layoutParams4);
            ouwVar2.ouw.addView(ouwVar2.f13167lh);
            ouwVar2.yu = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f12534lh);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.gravity = BadgeDrawable.BOTTOM_START;
            layoutParams5.setMargins(iOuw, iOuw, iOuw, iOuw);
            ouwVar2.yu.setLayoutParams(layoutParams5);
            ouwVar2.ouw.addView(ouwVar2.yu);
            ouwVar2.fkw = new com.bytedance.sdk.openadsdk.core.le.yu(this.vt);
            int iOuw2 = osn.ouw(this.vt, 11.0f);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iOuw2, iOuw2);
            layoutParams6.gravity = BadgeDrawable.BOTTOM_END;
            layoutParams6.rightMargin = iOuw;
            layoutParams6.bottomMargin = iOuw;
            ouwVar2.fkw.setVisibility(8);
            ouwVar2.fkw.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ouwVar2.fkw.setLayoutParams(layoutParams6);
            ouwVar2.ouw.addView(ouwVar2.fkw);
            View view = ouwVar2.ouw;
            if (view != null) {
                addView(view);
                com.bytedance.sdk.openadsdk.core.le.yu yuVar = ouwVar2.f13167lh;
                PAGLogoView pAGLogoView = ouwVar2.yu;
                com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = ouwVar2.fkw;
                if (yuVar2 != null && this.f12534lh.le()) {
                    osn.ouw((View) yuVar2, 0);
                    com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(zih.ouw(), 11.0f, true), yuVar2, this.f12534lh);
                }
                com.bytedance.sdk.openadsdk.core.mwh.vt.le videoView = getVideoView();
                if (videoView instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.le) {
                    this.f13164ko = videoView;
                    videoView.setVideoAdLoadListener(this);
                    this.f13164ko.setVideoAdInteractionListener(this);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair(yuVar, FriendlyObstructionPurpose.CLOSE_AD));
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                    arrayList.add(new Pair(yuVar2, friendlyObstructionPurpose));
                    this.f13164ko.ouw(arrayList);
                    this.f13164ko.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.bly.1
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
                        public final void ouw(View view2, int i12) {
                            if (bly.this.f13166vm != null) {
                                bly.this.f13166vm.onAdClicked();
                            }
                        }
                    });
                }
                if (pAGLogoView != null) {
                    pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.bly.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/bly$2;->onClick(Landroid/view/View;)V");
                            CreativeInfoManager.onViewClicked(g.f44975u, view2);
                            safedk_bly$2_onClick_7dcc1bb59792f354507c36f914741c6f(view2);
                        }

                        public void safedk_bly$2_onClick_7dcc1bb59792f354507c36f914741c6f(View p10) {
                            TTWebsiteActivity.ouw(bly.this.vt, bly.this.f12534lh, bly.this.f12533le);
                        }
                    });
                }
                if (yuVar != null) {
                    yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.bly.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/bly$3;->onClick(Landroid/view/View;)V");
                            CreativeInfoManager.onViewClicked(g.f44975u, view2);
                            safedk_bly$3_onClick_b07980cd2916976fc3967a969a7ea8f8(view2);
                        }

                        public void safedk_bly$3_onClick_b07980cd2916976fc3967a969a7ea8f8(View p10) {
                            bly.this.ouw();
                        }
                    });
                }
                ryl rylVar = ouwVar2.vt;
                vpp vppVar3 = this.f12534lh;
                if (vppVar3 != null && (ouwVar = vppVar3.cu) != null && rylVar != null) {
                    int i12 = ouwVar.bly;
                    float f10 = ouwVar.tlj;
                    if (i12 > 0 && f10 > 0.0f) {
                        rylVar.setRatio(i12 / f10);
                    } else if (i11 == 15) {
                        rylVar.setRatio(0.5625f);
                    } else if (i11 == 5) {
                        rylVar.setRatio(1.7777778f);
                    } else {
                        rylVar.setRatio(1.0f);
                    }
                }
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                if (videoView != null && rylVar != null) {
                    rylVar.addView(videoView, layoutParams7);
                    videoView.setTag(520093762, Boolean.TRUE);
                }
                ouw((View) videoView, true);
                ouw((View) this, true);
                ouw(rylVar);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fkw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lh.lh lhVar = this.yu;
        if (lhVar != null) {
            lhVar.ouw();
        } else {
            TTDelegateActivity.ouw(this.f12534lh, this.f13165rn);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void ouw(long j10, long j11) {
        this.zih = j10;
    }
}
