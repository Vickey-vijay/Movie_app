package com.bytedance.sdk.openadsdk.ouw.vt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.bly.bly;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.model.zih;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ouw {
    public com.bytedance.sdk.openadsdk.core.lh.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public WeakReference<com.bytedance.sdk.openadsdk.core.ryl.le> f13280cf;
    public com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f13281jg = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public PAGMediaView f13282le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public WeakReference<com.bytedance.sdk.openadsdk.core.mwh.vt.le> f13283lh;
    private final String mwh;
    public final vpp ouw;
    public PAGMediaView pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public qbp f13284ra;
    private final Context ryl;
    public com.bytedance.sdk.openadsdk.core.lh.vt tlj;
    public boolean vt;
    public vt yu;

    public final PAGImageItem ouw() {
        zih zihVar;
        vpp vppVar = this.ouw;
        if (vppVar == null || (zihVar = vppVar.fak) == null) {
            return null;
        }
        return new PAGImageItem(zihVar.f12895lh, zihVar.vt, zihVar.ouw, (float) zihVar.yu);
    }

    public final String vt() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
        if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
            return vppVar.wp.vt;
        }
        if (TextUtils.isEmpty(vppVar.f12883vh)) {
            return !TextUtils.isEmpty(vppVar.fqk) ? vppVar.fqk : "";
        }
        return vppVar.f12883vh;
    }

    public final void bly() {
        Context context = this.ryl;
        if (context != null) {
            TTWebsiteActivity.ouw(context, this.ouw, this.mwh);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    @SuppressLint({"ClickableViewAccessibility"})
    public final PAGMediaView fkw() {
        PAGMediaView pAGMediaViewLe;
        com.bytedance.sdk.openadsdk.utils.vt.ouw(this.ouw);
        if (this.ouw.rn() == 2) {
            if (vpp.fkw(this.ouw)) {
                com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh lhVar = this.fkw;
                if (lhVar == null || !(lhVar instanceof com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt)) {
                    pAGMediaViewLe = null;
                } else {
                    th thVar = (th) lhVar.yu();
                    thVar.setTag(520093762, Boolean.TRUE);
                    if (!this.f13281jg) {
                        this.fkw.fkw();
                    }
                    this.f13281jg = true;
                    pAGMediaViewLe = ouw(thVar);
                }
            } else {
                com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh lhVar2 = this.fkw;
                if (lhVar2 != null) {
                    qbp qbpVarYu = lhVar2.yu();
                    qbpVarYu.setTag(520093762, Boolean.TRUE);
                    if (!this.f13281jg) {
                        this.fkw.fkw();
                    }
                    this.f13281jg = true;
                    pAGMediaViewLe = ouw(qbpVarYu);
                } else {
                    pAGMediaViewLe = null;
                }
            }
            if (pAGMediaViewLe != null) {
                try {
                    pAGMediaViewLe.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                } catch (Exception unused) {
                }
            }
        } else {
            pAGMediaViewLe = le();
        }
        if (pAGMediaViewLe != null) {
            pAGMediaViewLe.setMrcTrackerKey(com.bytedance.sdk.openadsdk.tc.vt.fkw.vt(this.ouw));
        } else {
            pAGMediaViewLe = new PAGMediaView(this.ryl) { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.1
                @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent me2) {
                    DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
                    return super.dispatchTouchEvent(me2);
                }

                @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.widget.FrameLayout, android.view.View
                protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                    if (1 == 0) {
                        setMeasuredDimension(0, 0);
                    } else {
                        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.yu.ouw(this, ouw.this.ouw);
                }
            };
        }
        if (pAGMediaViewLe instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewLe).setMaterialMeta(this.ouw);
        }
        this.pno = pAGMediaViewLe;
        return pAGMediaViewLe;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    public final PAGMediaView le() {
        if (!vpp.fkw(this.ouw)) {
            List<zih> list = this.ouw.f12877tc;
            if (list == null || list.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.ryl);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            zih zihVar = list.get(0);
            if (zihVar != null) {
                com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f12895lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar.f12894le)).lh(1).vt(com.bytedance.sdk.openadsdk.tlj.lh.ouw(this.ouw, zihVar.ouw, imageView));
            }
            PAGMediaView pAGMediaViewOuw = ouw(imageView);
            if (this.bly != null) {
                cf.vt();
                if (cf.lh(String.valueOf(this.ouw.fqk()))) {
                    pAGMediaViewOuw.setOnClickListener(this.bly);
                    pAGMediaViewOuw.setOnTouchListener(this.bly);
                } else {
                    pAGMediaViewOuw.setOnClickListener(null);
                    pAGMediaViewOuw.setOnTouchListener(null);
                }
            } else {
                pAGMediaViewOuw.setOnClickListener(null);
                pAGMediaViewOuw.setOnTouchListener(null);
            }
            pAGMediaViewOuw.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.f13282le;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.f13282le.setOnTouchListener(null);
            }
            this.f13282le = pAGMediaViewOuw;
            return pAGMediaViewOuw;
        }
        vt vtVar = this.yu;
        if (vtVar == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewLe = vtVar.le();
        if (viewLe == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewLe.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewLe.getParent()).removeView(viewLe);
        }
        PAGMediaView pAGMediaView2 = this.f13282le;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.f13282le.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.ryl, viewLe, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.bly != null) {
            cf.vt();
            if (cf.lh(String.valueOf(this.ouw.fqk()))) {
                pAGVideoMediaView.setOnClickListener(this.bly);
                pAGVideoMediaView.setOnTouchListener(this.bly);
            } else {
                com.bytedance.sdk.openadsdk.core.lh.lh lhVar = new com.bytedance.sdk.openadsdk.core.lh.lh() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.2
                    @Override // com.bytedance.sdk.openadsdk.core.lh.lh
                    public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray, boolean z10) {
                        try {
                            ((PAGVideoMediaView) view).handleInterruptVideo();
                        } catch (Exception unused) {
                        }
                    }
                };
                pAGVideoMediaView.setOnClickListener(lhVar);
                pAGVideoMediaView.setOnTouchListener(lhVar);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.lh.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.lh.lh() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.2
                @Override // com.bytedance.sdk.openadsdk.core.lh.lh
                public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray, boolean z10) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(lhVar2);
            pAGVideoMediaView.setOnTouchListener(lhVar2);
        }
        this.f13282le = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    public final String lh() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(vppVar.fqk)) {
            return !TextUtils.isEmpty(vppVar.hun) ? vppVar.hun : "";
        }
        return vppVar.fqk;
    }

    public final String yu() {
        vpp vppVar = this.ouw;
        if (vppVar != null) {
            return vppVar.vpp();
        }
        return null;
    }

    public ouw(Context context, vpp vppVar, String str) {
        this.ryl = context;
        this.ouw = vppVar;
        this.mwh = str;
    }

    public final View pno() {
        vpp vppVar;
        if (com.bytedance.sdk.openadsdk.core.zih.ouw() != null && (vppVar = this.ouw) != null) {
            if (!vppVar.cd() || !this.ouw.le()) {
                return null;
            }
            ImageView imageView = new ImageView(com.bytedance.sdk.openadsdk.core.zih.ouw());
            com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 14.0f, true), imageView, this.ouw);
            return imageView;
        }
        ko.fkw("TTNativeAdImpl", "getAdChoicesView mContext == null");
        return null;
    }

    public final View ra() {
        if (com.bytedance.sdk.openadsdk.core.zih.ouw() == null) {
            ko.fkw("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(com.bytedance.sdk.openadsdk.core.zih.ouw()) { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.4
            public int ouw = 0;
            public int vt = 0;

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me2) {
                DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
                return super.dispatchTouchEvent(me2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public final void onMeasure(int i10, int i11) {
                if (this.ouw == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i11);
                    this.ouw = getMeasuredWidth();
                    this.vt = this.containerHeight;
                }
                setMeasuredDimension(this.ouw, this.vt);
            }

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                super.onLayout(z10, i10, i11, i12, i13);
                try {
                    Object parent = getParent();
                    if (parent != null && this.ouw != 0 && this.vt != 0) {
                        int width = ((View) parent).getWidth();
                        int height = ((View) parent).getHeight();
                        int i14 = this.ouw;
                        if (width >= i14 && height >= this.vt) {
                            return;
                        }
                        float fMin = Math.min(height / this.vt, width / i14);
                        int i15 = (width - this.ouw) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i15);
                        }
                    }
                } catch (Throwable th2) {
                    ko.fkw("PAGExtraFuncationHelper", th2.getMessage());
                }
            }
        };
        pAGLogoView.initData(this.ouw);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/ouw/vt/ouw$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_ouw$5_onClick_955ea70f00b0edefe00e635d5617aab3(view);
            }

            public void safedk_ouw$5_onClick_955ea70f00b0edefe00e635d5617aab3(View p10) {
                ouw.this.bly();
            }
        });
        return pAGLogoView;
    }

    private PAGMediaView ouw(final View view) {
        int i10;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        qbp qbpVar = this.f13284ra;
        if (qbpVar != null) {
            qbpVar.setClickListener(null);
            this.f13284ra.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar = this.tlj;
        if (vtVar != null && (vtVar instanceof bly) && (view instanceof qbp)) {
            ((qbp) view).setClickListener((bly) vtVar);
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.bly;
        if (ouwVar != null && (ouwVar instanceof com.bytedance.sdk.openadsdk.core.bly.pno) && (view instanceof qbp)) {
            ((qbp) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.bly.pno) ouwVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.ryl) { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.3
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me2) {
                DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
                return super.dispatchTouchEvent(me2);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.yu.ouw(this, ouw.this.ouw);
            }

            @Override // android.view.View
            public final void onWindowFocusChanged(boolean z10) {
                int i11;
                super.onWindowFocusChanged(z10);
                if (!(view instanceof qbp)) {
                    Integer num = this.ouw;
                    if (num != null) {
                        com.bytedance.sdk.openadsdk.tc.vt.vt vtVarOuw = com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(num);
                        if (z10) {
                            i11 = 4;
                        } else {
                            i11 = 8;
                        }
                        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(vtVarOuw, i11);
                    }
                    vpp vppVar = ouw.this.ouw;
                    if (vppVar != null) {
                        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(vppVar, z10);
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public final void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                ouw.this.ouw(pAGVideoAdListener);
            }
        };
        int i11 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i10);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof qbp) {
            this.f13284ra = (qbp) view;
        }
        return pAGMediaView;
    }

    private lh vt(final PAGVideoAdListener pAGVideoAdListener) {
        return new lh() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.6
            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void lh() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void ouw() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void vt() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void yu() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }
        };
    }

    public final void ouw(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh lhVar;
        if (this.ouw.rn() == 2 && vpp.fkw(this.ouw) && (lhVar = this.fkw) != null && (lhVar instanceof com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt)) {
            th thVar = (th) lhVar.yu();
            if (thVar != null) {
                thVar.setVideoAdListener(vt(pAGVideoAdListener));
                return;
            }
            return;
        }
        vt vtVar = this.yu;
        if (vtVar != null) {
            vtVar.ouw = vt(pAGVideoAdListener);
        }
    }
}
