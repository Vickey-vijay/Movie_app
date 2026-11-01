package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.ey;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ouw {
    public boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public qbp f13177cf;
    public final Context fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f13178jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public AdSlot f13180le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public yu f13181lh;
    public final boolean pno;
    public ra ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private long f13184th;
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f13185vm;
    public vpp vt;
    public PAGBannerAdWrapperListener yu;
    public String ouw = "banner_ad";

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f13182ra = 0;
    public final AtomicBoolean mwh = new AtomicBoolean(false);

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final int f13183rn = 1;
    private final int zih = 0;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f13179ko = -1;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.yu.ouw$ouw, reason: collision with other inner class name */
    public static class C0140ouw extends com.bytedance.sdk.component.pno.pno {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public WeakReference<ouw> f13189lh;
        public boolean ouw;
        public vpp vt;

        public C0140ouw(boolean z10, vpp vppVar, ouw ouwVar) {
            super("ReportWindowFocusChangedAdShow");
            this.ouw = z10;
            this.vt = vppVar;
            this.f13189lh = new WeakReference<>(ouwVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<ouw> weakReference = this.f13189lh;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ouw ouwVar = this.f13189lh.get();
            boolean z10 = this.ouw;
            vpp vppVar = this.vt;
            try {
                if (z10) {
                    ouwVar.f13182ra = System.currentTimeMillis();
                } else {
                    if (ouwVar.f13182ra <= 0 || ouwVar.f13177cf == null) {
                        return;
                    }
                    String strValueOf = String.valueOf(System.currentTimeMillis() - ouwVar.f13182ra);
                    ouwVar.f13182ra = 0L;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(strValueOf, vppVar, ouwVar.ouw, ouwVar.f13177cf.getAdShowTime());
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.qbp.lh("PAGBannerAdImpl", e10.getMessage());
            }
        }
    }

    public final void ouw(int i10) {
        yu yuVar = this.f13181lh;
        if (yuVar != null) {
            yuVar.setCurrentIndex(i10);
        }
    }

    public final void yu() {
        this.f13179ko = 1;
        this.f13181lh.yu();
    }

    public final void fkw() {
        if (this.f13181lh != null) {
            ko.vt("PAGBannerAdImpl", "PAGBanner destroy");
            try {
                yu();
                this.f13181lh.removeOnAttachStateChangeListener(this.f13185vm);
            } catch (Throwable unused) {
            }
        }
    }

    public final void le() {
        yu yuVar = this.f13181lh;
        if (yuVar instanceof lh) {
            ((lh) yuVar).vt();
        }
    }

    public final com.bytedance.sdk.openadsdk.multipro.vt.ouw lh() {
        yu yuVar = this.f13181lh;
        if (yuVar instanceof lh) {
            return ((lh) yuVar).getVideoModel();
        }
        return null;
    }

    public final void ra() {
        yu yuVar = this.f13181lh;
        if (yuVar instanceof lh) {
            ((lh) yuVar).ouw();
        }
    }

    public final boolean vt() {
        return this.f13181lh instanceof lh;
    }

    public ouw(Context context, vpp vppVar, AdSlot adSlot, ra raVar, boolean z10) {
        this.f13178jg = false;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                final ouw ouwVar = ouw.this;
                if (ouwVar.f13179ko == 0 || ouwVar.bly) {
                    return;
                }
                final qbp curView = ouwVar.f13181lh.getCurView();
                final vpp vppVar2 = ouw.this.vt;
                if (curView == null || vppVar2 == null) {
                    return;
                }
                ouwVar.vt = vppVar2;
                com.bytedance.sdk.openadsdk.core.ra raVar2 = null;
                ouwVar.tlj = vppVar2.f12868pd == 4 ? com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(ouwVar.fkw, ouwVar.ouw) : null;
                ouwVar.f13177cf = curView;
                final String strOuw = ex.ouw();
                final ra.ouw ouwVar2 = new ra.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.7
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.openadsdk.core.yu.ra.ouw
                    public final void ouw() {
                        int width = ouw.this.f13177cf.getWidth();
                        int height = ouw.this.f13177cf.getHeight();
                        boolean z11 = ((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d);
                        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(ouw.this.fkw);
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        lhVar.setBackgroundColor(-1);
                        lhVar.setLayoutParams(layoutParams);
                        View view2 = new View(ouw.this.fkw);
                        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                        view2.setAlpha(0.3f);
                        view2.setBackgroundColor(Color.parseColor("#F3F7F8"));
                        lhVar.addView(view2, layoutParams2);
                        com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(ouw.this.fkw);
                        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                        if (z11) {
                            lhVar2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(ouw.this.fkw, "tt_ad_closed_background_300_250"));
                        } else {
                            lhVar2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(ouw.this.fkw, "tt_ad_closed_background_320_50"));
                        }
                        lhVar.addView(lhVar2, layoutParams3);
                        ouw ouwVar3 = ouw.this;
                        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(ouwVar3.fkw, ouwVar3.vt);
                        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                        if (z11) {
                            int iOuw = osn.ouw(ouw.this.fkw, 16.0f);
                            layoutParams4.width = osn.ouw(ouw.this.fkw, 77.0f);
                            layoutParams4.height = osn.ouw(ouw.this.fkw, 14.0f);
                            layoutParams4.leftMargin = iOuw;
                            layoutParams4.topMargin = iOuw;
                        } else {
                            int iOuw2 = osn.ouw(ouw.this.fkw, 8.0f);
                            layoutParams4.width = osn.ouw(ouw.this.fkw, 45.0f);
                            layoutParams4.height = osn.ouw(ouw.this.fkw, 8.18f);
                            layoutParams4.leftMargin = iOuw2;
                            layoutParams4.topMargin = iOuw2;
                        }
                        lhVar2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(ouw.this.fkw);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams5.gravity = 17;
                        pnoVar.setAlpha(0.5f);
                        pnoVar.setLines(1);
                        pnoVar.setText(com.bytedance.sdk.component.utils.vpp.ouw(ouw.this.fkw, "tt_ad_is_closed"));
                        if (z11) {
                            pnoVar.setTextSize(18.0f);
                        } else {
                            pnoVar.setTextSize(12.0f);
                        }
                        lhVar2.addView(pnoVar, layoutParams5);
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.7.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/ouw$7$1;->onClick(Landroid/view/View;)V");
                                CreativeInfoManager.onViewClicked(g.f44975u, view3);
                                safedk_ouw$7$1_onClick_0edb6c2d868ee0018cce7973c27d3a1b(view3);
                            }

                            public void safedk_ouw$7$1_onClick_0edb6c2d868ee0018cce7973c27d3a1b(View p10) {
                                ouw ouwVar4 = ouw.this;
                                TTWebsiteActivity.ouw(ouwVar4.fkw, ouwVar4.vt, ouwVar4.ouw);
                            }
                        };
                        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                        pnoVar.setOnClickListener(onClickListener);
                        ouw.this.f13177cf.vm();
                        ouw.this.f13177cf.removeAllViews();
                        ouw.this.f13177cf.addView(lhVar, new ViewGroup.LayoutParams(width, height));
                        ouw.this.f13177cf.setClickCreativeListener(null);
                        ouw.this.f13177cf.setClickListener(null);
                        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = ouw.this.yu;
                        if (pAGBannerAdWrapperListener != null) {
                            pAGBannerAdWrapperListener.onAdDismissed();
                        }
                        ouw.this.bly = true;
                    }
                };
                curView.setClosedListenerKey(strOuw);
                curView.setBannerClickClosedListener(ouwVar2);
                curView.setBackupListener(new com.bytedance.sdk.component.adexpress.vt.lh() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.2
                    @Override // com.bytedance.sdk.component.adexpress.vt.lh
                    public final boolean ouw(ViewGroup viewGroup) {
                        try {
                            curView.rn();
                            if (!ouw.this.vt.cd()) {
                                vt vtVar = new vt(curView.getContext());
                                vtVar.setClosedListenerKey(strOuw);
                                vtVar.ouw(ouw.this.vt, curView);
                                vtVar.setAdInteractionListener(ouw.this.yu);
                                return true;
                            }
                            bly blyVar = new bly(curView.getContext());
                            blyVar.setClosedListenerKey(strOuw);
                            ouw ouwVar3 = ouw.this;
                            blyVar.ouw(ouwVar3.vt, curView, ouwVar3.tlj);
                            blyVar.setAdInteractionListener(ouw.this.yu);
                            curView.setVastVideoHelper(blyVar);
                            return true;
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                });
                if (ouwVar.pno) {
                    ey.ouw(curView, true, 1, ouwVar.ryl.yu, new ey.vt() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.4
                        @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                        public final void ouw(boolean z11) {
                            ouw.ouw(ouw.this, z11, vppVar2);
                        }

                        @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                        public final void ouw() {
                            ouw ouwVar3 = ouw.this;
                            if (ouwVar3.f13179ko != 0) {
                                ouw.ouw(ouwVar3);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                        public final void vt() {
                            ouw ouwVar3 = ouw.this;
                            ouwVar3.ouw(ouwVar3.vt);
                        }

                        @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                        public final void ouw(View view2, boolean z11) {
                            if (!z11) {
                                com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(ouw.this.vt, 8);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(ouw.this.vt, 4);
                            if (ouw.this.mwh.compareAndSet(false, true)) {
                                ouw.ouw(ouw.this, view2, curView, vppVar2, strOuw, ouwVar2);
                            }
                            yu yuVar = ouw.this.f13181lh;
                            if (yuVar == null || yuVar.getCurView() == null) {
                                return;
                            }
                            ouw.this.f13181lh.getCurView().cf();
                            ouw.this.f13181lh.getCurView().jg();
                            ouw.this.f13181lh.setIsShow(true);
                        }
                    }, null);
                } else {
                    com.bytedance.sdk.openadsdk.core.ra raVarOuw = ouw.ouw(curView);
                    if (raVarOuw == null) {
                        raVarOuw = new com.bytedance.sdk.openadsdk.core.ra(curView, ouwVar.ryl.yu);
                        curView.addView(raVarOuw);
                    }
                    raVar2 = raVarOuw;
                    raVar2.setAdType(1);
                    raVar2.setCallback(new com.bytedance.sdk.openadsdk.core.ra.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.3
                        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
                        public final void ouw(boolean z11) {
                            ouw.ouw(ouw.this, z11, vppVar2);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
                        public final void ouw() {
                            ouw ouwVar3 = ouw.this;
                            if (ouwVar3.f13179ko != 0) {
                                ouw.ouw(ouwVar3);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
                        public final void vt() {
                            ouw ouwVar3 = ouw.this;
                            ouwVar3.ouw(ouwVar3.vt);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
                        public final void ouw(View view2) {
                            if (ouw.this.mwh.compareAndSet(false, true)) {
                                ouw.ouw(ouw.this, view2, curView, vppVar2, strOuw, ouwVar2);
                            }
                            yu yuVar = ouw.this.f13181lh;
                            if (yuVar == null || yuVar.getCurView() == null) {
                                return;
                            }
                            ouw.this.f13181lh.getCurView().cf();
                            ouw.this.f13181lh.getCurView().jg();
                            ouw.this.f13181lh.setIsShow(true);
                        }
                    });
                }
                Context contextOuw = com.bytedance.sdk.component.utils.vt.ouw(curView);
                if (contextOuw == null) {
                    contextOuw = ouwVar.fkw;
                }
                com.bytedance.sdk.openadsdk.core.bly.bly blyVar = new com.bytedance.sdk.openadsdk.core.bly.bly(contextOuw, vppVar2, ouwVar.ouw, 2);
                blyVar.ouw(curView);
                blyVar.ouw(ouwVar);
                blyVar.ouw(ouwVar.tlj);
                blyVar.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.5
                    @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
                    public final void ouw(View view2, int i10) {
                        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = ouw.this.yu;
                        if (pAGBannerAdWrapperListener != null) {
                            pAGBannerAdWrapperListener.onAdClicked();
                        }
                    }
                });
                curView.setClickListener(blyVar);
                com.bytedance.sdk.openadsdk.core.bly.pno pnoVar = new com.bytedance.sdk.openadsdk.core.bly.pno(ouwVar.fkw, vppVar2, ouwVar.ouw, 2);
                pnoVar.ouw((View) curView);
                pnoVar.ouw(ouwVar);
                pnoVar.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.6
                    @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
                    public final void ouw(View view2, int i10) {
                        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = ouw.this.yu;
                        if (pAGBannerAdWrapperListener != null) {
                            pAGBannerAdWrapperListener.onAdClicked();
                        }
                    }
                });
                qbp qbpVar = ouwVar.f13177cf;
                if (qbpVar instanceof th) {
                    pnoVar.ouw(((th) qbpVar).getVideoController());
                }
                pnoVar.ouw(ouwVar.tlj);
                curView.setClickCreativeListener(pnoVar);
                if (ouwVar.pno) {
                    return;
                }
                raVar2.setNeedCheckingShow(true);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                ouw ouwVar = ouw.this;
                if (ouwVar.f13178jg) {
                    ouwVar.f13179ko = 0;
                } else {
                    ouwVar.yu();
                }
            }
        };
        this.f13185vm = onAttachStateChangeListener;
        this.fkw = context;
        this.vt = vppVar;
        this.f13180le = adSlot;
        this.ryl = raVar;
        this.f13178jg = z10;
        if (vppVar.f12874sd != null) {
            lh lhVar = new lh(context, vppVar, adSlot, this.f13178jg);
            this.f13181lh = lhVar;
            lhVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        } else {
            yu yuVar = new yu(context, vppVar, adSlot, this.f13178jg);
            this.f13181lh = yuVar;
            yuVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.pno = false;
        this.bly = false;
    }

    public final void ouw(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        pno pnoVar = new pno(pAGBannerAdInteractionCallback);
        this.yu = pnoVar;
        this.f13181lh.setExpressInteractionListener(pnoVar);
    }

    public final void ouw(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        pno pnoVar = new pno(pAGBannerAdInteractionListener);
        this.yu = pnoVar;
        this.f13181lh.setExpressInteractionListener(pnoVar);
    }

    public final View ouw() {
        com.bytedance.sdk.openadsdk.utils.vt.ouw(this.vt);
        IPBroadcastReceiver.vt(this.fkw, this.vt);
        return this.f13181lh;
    }

    public final void ouw(vpp vppVar) {
        if (this.f13182ra <= 0 || vppVar == null) {
            return;
        }
        try {
            if (this.f13177cf != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.f13182ra);
                this.f13182ra = 0L;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(strValueOf, vppVar, this.ouw, this.f13177cf.getAdShowTime());
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public static com.bytedance.sdk.openadsdk.core.ra ouw(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.ra) {
                    return (com.bytedance.sdk.openadsdk.core.ra) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final void ouw(final com.bytedance.sdk.openadsdk.ouw.ouw.vt vtVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f13184th > 500) {
            this.f13184th = jCurrentTimeMillis;
            yu yuVar = this.f13181lh;
            if (yuVar instanceof lh) {
                yuVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((lh) ouw.this.f13181lh).ouw(vtVar);
                    }
                }, 500L);
            }
        }
    }

    public static /* synthetic */ void ouw(ouw ouwVar, boolean z10, vpp vppVar) {
        if (z10) {
            if (ouwVar.vt.cj()) {
                vpp vppVar2 = ouwVar.vt;
                if (!vppVar2.vr) {
                    vppVar2.vr = true;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar2, ouwVar.ouw, vppVar2.f12867od);
                }
            }
            ko.ouw("PAGBannerAdImpl", "banner_ad", "Get focus, start timing");
        } else {
            ko.ouw("PAGBannerAdImpl", "banner_ad", "Lose focus, stop timing");
        }
        bs.vt(new C0140ouw(z10, vppVar, ouwVar), 10);
    }

    public static /* synthetic */ void ouw(ouw ouwVar) {
        ouwVar.vt.ouw = SystemClock.elapsedRealtime();
        ouwVar.f13181lh.fkw();
    }

    public static /* synthetic */ void ouw(ouw ouwVar, View view, qbp qbpVar, vpp vppVar, String str, ra.ouw ouwVar2) {
        com.bytedance.sdk.openadsdk.core.bly.ouw().ouw(str, ouwVar2);
        ouwVar.f13182ra = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (qbpVar != null) {
                jSONObject.put("dynamic_show_type", qbpVar.getDynamicShowType());
                qbpVar.ouw(jSONObject, vppVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, ouwVar.ouw, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(vppVar);
        } catch (JSONException unused2) {
            com.bytedance.sdk.component.utils.qbp.lh("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = ouwVar.yu;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, vppVar.f12868pd);
        }
        if (vppVar.odc) {
            uoy.vt();
        }
    }
}
