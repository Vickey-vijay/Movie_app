package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.bly.vm;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.mwh;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.ryl;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vt extends com.bytedance.sdk.openadsdk.core.bly.ouw {
    public static vm[] ouw = {new vm(1, 6.4f, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50), new vm(4, 1.2f, d.f44769a, 250)};

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private qbp f13194jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private String f13195ko;
    private ouw mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private PAGBannerAdWrapperListener f13196rn;

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
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

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i10, ko koVar) {
        qbp qbpVar = this.f13194jg;
        if (qbpVar != null) {
            qbpVar.ouw(view, i10, koVar);
        }
    }

    public final void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f13196rn = pAGBannerAdWrapperListener;
    }

    public final void setClosedListenerKey(String str) {
        this.f13195ko = str;
    }

    public vt(@NonNull Context context) {
        super(context);
        this.vt = context;
    }

    public final void ouw(vpp vppVar, qbp qbpVar) {
        int i10;
        setBackgroundColor(-1);
        this.f12534lh = vppVar;
        this.f13194jg = qbpVar;
        this.f12533le = "banner_ad";
        qbpVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        vm vmVarOuw = ouw(this.f13194jg.getExpectExpressWidth(), this.f13194jg.getExpectExpressHeight());
        if (this.f13194jg.getExpectExpressWidth() > 0 && this.f13194jg.getExpectExpressHeight() > 0) {
            this.f12535ra = osn.ouw(this.vt, this.f13194jg.getExpectExpressWidth());
            this.pno = osn.ouw(this.vt, this.f13194jg.getExpectExpressHeight());
        } else {
            int iYu = osn.yu(this.vt);
            this.f12535ra = iYu;
            this.pno = Float.valueOf(iYu / vmVarOuw.vt).intValue();
        }
        int i11 = this.f12535ra;
        if (i11 > 0 && i11 > osn.yu(this.vt)) {
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
            int i12 = vppVar2.ucs;
            if (i12 != 1010 && i12 != 1011 && i12 != 1012) {
                if (vmVarOuw.ouw == 1) {
                    osn.ouw(this.vt, 50.0f);
                    int iOuw = osn.ouw(this.vt, 38.0f);
                    int iOuw2 = (int) (((double) osn.ouw(this.vt, 25.0f)) / 5.0d);
                    int iOuw3 = osn.ouw(this.vt, 10.0f);
                    int iOuw4 = osn.ouw(this.vt, 2.0f);
                    int iOuw5 = osn.ouw(this.vt, 6.0f);
                    int iOuw6 = osn.ouw(this.vt, 8.0f);
                    RelativeLayout relativeLayout = new RelativeLayout(this.vt);
                    addView(relativeLayout, -1, -1);
                    zih zihVar = new zih(this.vt);
                    zihVar.setId(520093738);
                    TextView textView = new TextView(this.vt);
                    textView.setId(520093730);
                    rn rnVar = new rn(this.vt);
                    rnVar.setId(520093735);
                    View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f12534lh);
                    viewCreatePAGLogoViewByMaterial.setId(520093739);
                    TextView textView2 = new TextView(this.vt);
                    textView2.setId(520093703);
                    ouw ouwVar = new ouw(zihVar, textView, rnVar, viewCreatePAGLogoViewByMaterial, textView2);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOuw, iOuw);
                    layoutParams2.addRule(15);
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(20);
                    layoutParams2.setMarginStart(iOuw5);
                    layoutParams2.setMargins(iOuw5, 0, 0, 0);
                    zihVar.setLayoutParams(layoutParams2);
                    zihVar.setBackgroundColor(-1);
                    zihVar.setScaleType(ImageView.ScaleType.FIT_XY);
                    relativeLayout.addView(zihVar);
                    LinearLayout linearLayout = new LinearLayout(this.vt);
                    linearLayout.setOrientation(1);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams3.addRule(15);
                    layoutParams3.addRule(16, textView2.getId());
                    layoutParams3.addRule(17, zihVar.getId());
                    layoutParams3.setMarginStart(iOuw6);
                    layoutParams3.setMarginEnd(iOuw6);
                    layoutParams3.addRule(0, textView2.getId());
                    layoutParams3.addRule(1, zihVar.getId());
                    layoutParams3.setMargins(iOuw6, 0, iOuw6, 0);
                    relativeLayout.addView(linearLayout, layoutParams3);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                    textView.setTextDirection(5);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity(80);
                    textView.setMaxLines(1);
                    textView.setTextColor(Color.parseColor("#FF333333"));
                    textView.setTextSize(12.0f);
                    textView.setLayoutParams(layoutParams4);
                    linearLayout.addView(textView);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams5.topMargin = iOuw4;
                    rnVar.setLayoutParams(layoutParams5);
                    linearLayout.addView(rnVar);
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams6.addRule(20);
                    layoutParams6.addRule(9);
                    layoutParams6.addRule(12);
                    viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams6);
                    relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
                    RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams7.addRule(11);
                    layoutParams7.addRule(15);
                    layoutParams7.setMarginEnd(iOuw5);
                    layoutParams7.addRule(21);
                    layoutParams7.rightMargin = iOuw5;
                    textView2.setBackground(cf.ouw(this.vt, 12));
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setGravity(17);
                    textView2.setMaxLines(1);
                    textView2.setPadding(iOuw3, iOuw2, iOuw3, iOuw2);
                    textView2.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.vt, "tt_video_download_apk"));
                    textView2.setTextColor(Color.parseColor("#f0f0f0"));
                    textView2.setTextSize(10.0f);
                    textView2.setLayoutParams(layoutParams7);
                    relativeLayout.addView(textView2);
                    this.mwh = ouwVar;
                    ImageView imageView = ouwVar.yu;
                    TextView textView3 = ouwVar.f13198lh;
                    rn rnVar2 = ouwVar.fkw;
                    TextView textView4 = ouwVar.pno;
                    View view = ouwVar.f13199ra;
                    if (view != null) {
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/vt$1;->onClick(Landroid/view/View;)V");
                                CreativeInfoManager.onViewClicked(g.f44975u, view2);
                                safedk_vt$1_onClick_20cc8cdebdcc34ebba66ef956a316947(view2);
                            }

                            public void safedk_vt$1_onClick_20cc8cdebdcc34ebba66ef956a316947(View p10) {
                                TTWebsiteActivity.ouw(vt.this.vt, vt.this.f12534lh, vt.this.f12533le);
                            }
                        });
                    }
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = this.f12534lh.fak;
                    if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
                        com.bytedance.sdk.openadsdk.th.vt.ouw();
                        vpp vppVar3 = this.f12534lh;
                        com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = vppVar3.fak;
                        com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar3.ouw, zihVar3.vt, zihVar3.f12895lh, imageView, vppVar3);
                    }
                    textView3.setText(this.f12534lh.fqk);
                    if (!TextUtils.isEmpty(this.f12534lh.vpp())) {
                        textView4.setText(this.f12534lh.vpp());
                    } else {
                        textView4.setVisibility(8);
                    }
                    osn.ouw((TextView) null, rnVar2, this.f12534lh);
                    ouw((View) imageView, true);
                    imageView.setTag(520093762, Boolean.TRUE);
                    ouw((View) this, true);
                    ouw((View) textView4, true);
                    return;
                }
                if (vppVar2 != null) {
                    if (vppVar2.f12874sd == null) {
                        int iOuw7 = osn.ouw(this.vt, 8.0f);
                        int iOuw8 = osn.ouw(this.vt, 21.0f);
                        RelativeLayout relativeLayout2 = new RelativeLayout(this.vt);
                        ViewGroup.LayoutParams layoutParams8 = new ViewGroup.LayoutParams(-1, -1);
                        relativeLayout2.setPadding(iOuw7, iOuw7, iOuw7, iOuw8);
                        relativeLayout2.setLayoutParams(layoutParams8);
                        addView(relativeLayout2);
                        LinearLayout linearLayout2 = new LinearLayout(this.vt);
                        linearLayout2.setId(520093737);
                        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams9.addRule(12);
                        linearLayout2.setGravity(16);
                        linearLayout2.setOrientation(0);
                        linearLayout2.setLayoutParams(layoutParams9);
                        relativeLayout2.addView(linearLayout2);
                        zih zihVar4 = new zih(this.vt);
                        zihVar4.setId(520093738);
                        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 52.0f), osn.ouw(this.vt, 52.0f));
                        zihVar4.setScaleType(ImageView.ScaleType.FIT_XY);
                        zihVar4.setLayoutParams(layoutParams10);
                        linearLayout2.addView(zihVar4);
                        LinearLayout linearLayout3 = new LinearLayout(this.vt);
                        linearLayout3.setOrientation(1);
                        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -2);
                        layoutParams11.weight = 1.0f;
                        layoutParams11.leftMargin = iOuw7;
                        layoutParams11.rightMargin = iOuw7;
                        layoutParams11.setMarginStart(iOuw7);
                        layoutParams11.setMarginEnd(iOuw7);
                        linearLayout2.addView(linearLayout3, layoutParams11);
                        TextView textView5 = new TextView(this.vt);
                        textView5.setId(520093730);
                        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                        textView5.setEllipsize(TextUtils.TruncateAt.END);
                        textView5.setMaxLines(1);
                        textView5.setTextColor(Color.parseColor("#FF3E3E3E"));
                        textView5.setTextSize(16.0f);
                        textView5.setLayoutParams(layoutParams12);
                        linearLayout3.addView(textView5);
                        rn rnVar3 = new rn(this.vt);
                        rnVar3.setId(520093735);
                        linearLayout3.addView(rnVar3, new LinearLayout.LayoutParams(-2, -2));
                        TextView textView6 = new TextView(this.vt);
                        textView6.setId(520093703);
                        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 76.0f), osn.ouw(this.vt, 36.0f));
                        textView6.setBackground(cf.ouw(this.vt, 18));
                        textView6.setEllipsize(TextUtils.TruncateAt.END);
                        textView6.setMaxLines(1);
                        textView6.setGravity(17);
                        textView6.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.vt, "tt_video_download_apk"));
                        textView6.setTextColor(-1);
                        textView6.setTextSize(14.0f);
                        textView6.setLayoutParams(layoutParams13);
                        linearLayout2.addView(textView6);
                        FrameLayout frameLayout = new FrameLayout(this.vt);
                        frameLayout.setLayoutDirection(3);
                        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams14.addRule(2, linearLayout2.getId());
                        layoutParams14.bottomMargin = iOuw8;
                        frameLayout.setLayoutParams(layoutParams14);
                        relativeLayout2.addView(frameLayout);
                        mwh mwhVar = new mwh(this.vt);
                        mwhVar.setId(520093736);
                        mwhVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-2, -1);
                        layoutParams15.gravity = 17;
                        frameLayout.addView(mwhVar, layoutParams15);
                        View viewCreatePAGLogoViewByMaterial2 = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f12534lh);
                        viewCreatePAGLogoViewByMaterial2.setId(520093739);
                        RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams16.addRule(10);
                        layoutParams16.addRule(9);
                        layoutParams16.setMargins(iOuw7, iOuw7, 0, 0);
                        viewCreatePAGLogoViewByMaterial2.setLayoutParams(layoutParams16);
                        relativeLayout2.addView(viewCreatePAGLogoViewByMaterial2);
                        ouw ouwVar2 = new ouw(zihVar4, viewCreatePAGLogoViewByMaterial2, textView6, textView5, mwhVar, rnVar3, frameLayout);
                        this.mwh = ouwVar2;
                        mwh mwhVar2 = ouwVar2.vt;
                        ImageView imageView2 = ouwVar2.yu;
                        TextView textView7 = ouwVar2.f13198lh;
                        TextView textView8 = ouwVar2.pno;
                        View view2 = ouwVar2.f13199ra;
                        if (view2 != null) {
                            view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/vt$3;->onClick(Landroid/view/View;)V");
                                    CreativeInfoManager.onViewClicked(g.f44975u, view3);
                                    safedk_vt$3_onClick_5885843289bfc67f88717d441ed85de0(view3);
                                }

                                public void safedk_vt$3_onClick_5885843289bfc67f88717d441ed85de0(View p10) {
                                    TTWebsiteActivity.ouw(vt.this.vt, vt.this.f12534lh, vt.this.f12533le);
                                }
                            });
                        }
                        ViewGroup.LayoutParams layoutParams17 = mwhVar2.getLayoutParams();
                        if (this.f12535ra - (osn.ouw(this.vt, 8.0f) * 2) >= ((this.pno - osn.ouw(this.vt, 8.0f)) - (osn.ouw(this.vt, 21.0f) * 2)) - osn.ouw(this.vt, 52.0f)) {
                            layoutParams17.width = -2;
                            layoutParams17.height = -1;
                        } else {
                            layoutParams17.width = -1;
                            layoutParams17.height = -2;
                        }
                        mwhVar2.setLayoutParams(layoutParams17);
                        if (i12 == 33) {
                            mwhVar2.setRatio(1.0f);
                        } else {
                            mwhVar2.setRatio(1.91f);
                        }
                        List<com.bytedance.sdk.openadsdk.core.model.zih> list = this.f12534lh.f12877tc;
                        if (list != null && !list.isEmpty()) {
                            com.bytedance.sdk.openadsdk.th.vt.ouw();
                            com.bytedance.sdk.openadsdk.th.vt.ouw(list.get(0), mwhVar2, this.f12534lh);
                            com.bytedance.sdk.openadsdk.th.vt.ouw().ouw(list.get(0).ouw, this.mwh.f13197le);
                        }
                        com.bytedance.sdk.openadsdk.core.model.zih zihVar5 = this.f12534lh.fak;
                        if (zihVar5 != null && !TextUtils.isEmpty(zihVar5.ouw)) {
                            com.bytedance.sdk.openadsdk.th.vt.ouw();
                            vpp vppVar4 = this.f12534lh;
                            com.bytedance.sdk.openadsdk.core.model.zih zihVar6 = vppVar4.fak;
                            com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar6.ouw, zihVar6.vt, zihVar6.f12895lh, imageView2, vppVar4);
                        }
                        textView7.setText(this.f12534lh.fqk);
                        if (!TextUtils.isEmpty(this.f12534lh.vpp())) {
                            textView8.setText(this.f12534lh.vpp());
                        } else {
                            textView8.setVisibility(8);
                        }
                        osn.ouw((TextView) null, this.mwh.fkw, this.f12534lh);
                        ouw((View) mwhVar2, true);
                        mwhVar2.setTag(520093762, Boolean.TRUE);
                        ouw((View) this, true);
                        ouw((View) textView8, true);
                        return;
                    }
                    int iOuw9 = osn.ouw(this.vt, 8.0f);
                    int iOuw10 = osn.ouw(this.vt, 21.0f);
                    RelativeLayout relativeLayout3 = new RelativeLayout(this.vt);
                    ViewGroup.LayoutParams layoutParams18 = new ViewGroup.LayoutParams(-1, -1);
                    relativeLayout3.setPadding(iOuw9, iOuw9, iOuw9, iOuw10);
                    relativeLayout3.setLayoutParams(layoutParams18);
                    addView(relativeLayout3);
                    LinearLayout linearLayout4 = new LinearLayout(this.vt);
                    linearLayout4.setId(520093737);
                    RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams19.addRule(12);
                    linearLayout4.setGravity(16);
                    linearLayout4.setOrientation(0);
                    linearLayout4.setLayoutParams(layoutParams19);
                    relativeLayout3.addView(linearLayout4);
                    zih zihVar7 = new zih(this.vt);
                    zihVar7.setId(520093738);
                    LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 52.0f), osn.ouw(this.vt, 52.0f));
                    zihVar7.setScaleType(ImageView.ScaleType.FIT_XY);
                    zihVar7.setLayoutParams(layoutParams20);
                    linearLayout4.addView(zihVar7);
                    LinearLayout linearLayout5 = new LinearLayout(this.vt);
                    linearLayout5.setOrientation(1);
                    LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(0, -2);
                    layoutParams21.weight = 1.0f;
                    layoutParams21.leftMargin = iOuw9;
                    layoutParams21.rightMargin = iOuw9;
                    layoutParams21.setMarginStart(iOuw9);
                    layoutParams21.setMarginEnd(iOuw9);
                    linearLayout4.addView(linearLayout5, layoutParams21);
                    TextView textView9 = new TextView(this.vt);
                    textView9.setId(520093730);
                    LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-1, -2);
                    textView9.setEllipsize(TextUtils.TruncateAt.END);
                    textView9.setMaxLines(1);
                    textView9.setTextColor(Color.parseColor("#FF3E3E3E"));
                    textView9.setTextSize(16.0f);
                    textView9.setLayoutParams(layoutParams22);
                    linearLayout5.addView(textView9);
                    rn rnVar4 = new rn(this.vt);
                    rnVar4.setId(520093735);
                    LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams23.topMargin = osn.ouw(this.vt, 4.0f);
                    linearLayout5.addView(rnVar4, layoutParams23);
                    TextView textView10 = new TextView(this.vt);
                    textView10.setId(520093703);
                    LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 76.0f), osn.ouw(this.vt, 36.0f));
                    textView10.setBackground(cf.ouw(this.vt, 18));
                    textView10.setEllipsize(TextUtils.TruncateAt.END);
                    textView10.setMaxLines(1);
                    textView10.setGravity(17);
                    textView10.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.vt, "tt_video_download_apk"));
                    textView10.setTextColor(-1);
                    textView10.setTextSize(14.0f);
                    textView10.setLayoutParams(layoutParams24);
                    linearLayout4.addView(textView10);
                    FrameLayout frameLayout2 = new FrameLayout(this.vt);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams25.addRule(2, linearLayout4.getId());
                    layoutParams25.bottomMargin = iOuw10;
                    frameLayout2.setLayoutParams(layoutParams25);
                    relativeLayout3.addView(frameLayout2);
                    ryl rylVar = new ryl(this.vt);
                    rylVar.setId(520093736);
                    FrameLayout.LayoutParams layoutParams26 = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams26.gravity = 17;
                    rylVar.setLayoutParams(layoutParams26);
                    frameLayout2.addView(rylVar);
                    View viewCreatePAGLogoViewByMaterial3 = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f12534lh);
                    viewCreatePAGLogoViewByMaterial3.setId(520093739);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams27.addRule(10);
                    layoutParams27.addRule(9);
                    layoutParams27.setMargins(iOuw9, iOuw9, 0, 0);
                    viewCreatePAGLogoViewByMaterial3.setLayoutParams(layoutParams27);
                    relativeLayout3.addView(viewCreatePAGLogoViewByMaterial3);
                    ouw ouwVar3 = new ouw(zihVar7, viewCreatePAGLogoViewByMaterial3, textView10, textView9, rylVar, rnVar4, frameLayout2);
                    this.mwh = ouwVar3;
                    TextView textView11 = ouwVar3.f13198lh;
                    TextView textView12 = ouwVar3.pno;
                    ryl rylVar2 = ouwVar3.ouw;
                    com.bytedance.sdk.openadsdk.th.vt.ouw().ouw(this.f12534lh.f12874sd.f10457le, this.mwh.f13197le);
                    View view3 = this.mwh.f13199ra;
                    if (view3 != null) {
                        view3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/vt$4;->onClick(Landroid/view/View;)V");
                                CreativeInfoManager.onViewClicked(g.f44975u, view4);
                                safedk_vt$4_onClick_9e646295613331d03bb844503eef4bd7(view4);
                            }

                            public void safedk_vt$4_onClick_9e646295613331d03bb844503eef4bd7(View p10) {
                                TTWebsiteActivity.ouw(vt.this.vt, vt.this.f12534lh, vt.this.f12533le);
                            }
                        });
                    }
                    ViewGroup.LayoutParams layoutParams28 = rylVar2.getLayoutParams();
                    if (i12 == 15) {
                        layoutParams28.width = -2;
                        layoutParams28.height = -1;
                        rylVar2.setLayoutParams(layoutParams28);
                        rylVar2.setRatio(0.5625f);
                        i10 = -1;
                    } else if (i12 == 5) {
                        layoutParams28.width = -1;
                        layoutParams28.height = -2;
                        rylVar2.setLayoutParams(layoutParams28);
                        rylVar2.setRatio(1.7777778f);
                        i10 = -1;
                    } else {
                        if (this.f12535ra - (osn.ouw(this.vt, 8.0f) * 2) >= ((this.pno - osn.ouw(this.vt, 8.0f)) - (osn.ouw(this.vt, 21.0f) * 2)) - osn.ouw(this.vt, 52.0f)) {
                            layoutParams28.width = -2;
                            i10 = -1;
                            layoutParams28.height = -1;
                        } else {
                            i10 = -1;
                            layoutParams28.width = -1;
                            layoutParams28.height = -2;
                        }
                        rylVar2.setLayoutParams(layoutParams28);
                        rylVar2.setRatio(1.0f);
                    }
                    rylVar2.removeAllViews();
                    FrameLayout.LayoutParams layoutParams29 = new FrameLayout.LayoutParams(i10, i10);
                    com.bytedance.sdk.openadsdk.core.mwh.vt.le videoView = getVideoView();
                    if (videoView != null) {
                        qbp qbpVar2 = this.f13194jg;
                        if (qbpVar2 instanceof th) {
                            videoView.setNeedSelfManagerVideo(!((th) qbpVar2).tlj);
                            ((th) this.f13194jg).setBackupVideoView(videoView);
                            videoView.setVideoAdInteractionListener((th) this.f13194jg);
                        }
                        rylVar2.addView(videoView, layoutParams29);
                        videoView.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.5
                            @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
                            public final void ouw(View view4, int i13) {
                                if (vt.this.f13196rn != null) {
                                    vt.this.f13196rn.onAdClicked();
                                }
                            }
                        });
                        com.bytedance.sdk.openadsdk.core.bly.pno clickCreativeListener = this.f13194jg.getClickCreativeListener();
                        if (clickCreativeListener != null) {
                            clickCreativeListener.ouw(videoView.getNativeVideoController());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar8 = this.f12534lh.fak;
                    if (zihVar8 != null && !TextUtils.isEmpty(zihVar8.ouw)) {
                        com.bytedance.sdk.openadsdk.th.vt.ouw();
                        vpp vppVar5 = this.f12534lh;
                        com.bytedance.sdk.openadsdk.core.model.zih zihVar9 = vppVar5.fak;
                        com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar9.ouw, zihVar9.vt, zihVar9.f12895lh, this.mwh.yu, vppVar5);
                    }
                    textView11.setText(this.f12534lh.fqk);
                    osn.ouw((TextView) null, this.mwh.fkw, this.f12534lh);
                    if (!TextUtils.isEmpty(this.f12534lh.vpp())) {
                        textView12.setText(this.f12534lh.vpp());
                    } else {
                        textView12.setVisibility(8);
                    }
                    ouw((View) videoView, true);
                    if (videoView != null) {
                        videoView.setTag(520093762, Boolean.TRUE);
                    }
                    ouw((View) this, true);
                    ouw((View) textView12, true);
                    ouw(rylVar2);
                    return;
                }
                return;
            }
            int iOuw11 = osn.ouw(this.vt, 8.0f);
            mwh mwhVar3 = new mwh(this.vt);
            mwhVar3.setId(520093736);
            mwhVar3.setScaleType(ImageView.ScaleType.FIT_CENTER);
            FrameLayout.LayoutParams layoutParams30 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams30.gravity = 17;
            addView(mwhVar3, layoutParams30);
            View viewCreatePAGLogoViewByMaterial4 = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f12534lh);
            viewCreatePAGLogoViewByMaterial4.setId(520093739);
            FrameLayout.LayoutParams layoutParams31 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams31.setMargins(iOuw11, iOuw11, 0, 0);
            layoutParams31.gravity = BadgeDrawable.TOP_START;
            viewCreatePAGLogoViewByMaterial4.setLayoutParams(layoutParams31);
            addView(viewCreatePAGLogoViewByMaterial4);
            ouw ouwVar4 = new ouw(viewCreatePAGLogoViewByMaterial4, mwhVar3);
            this.mwh = ouwVar4;
            View view4 = ouwVar4.f13199ra;
            if (view4 != null) {
                view4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/vt$2;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view5);
                        safedk_vt$2_onClick_e11edb3e6f3af2a45d70a19b8bddea3c(view5);
                    }

                    public void safedk_vt$2_onClick_e11edb3e6f3af2a45d70a19b8bddea3c(View p10) {
                        TTWebsiteActivity.ouw(vt.this.vt, vt.this.f12534lh, vt.this.f12533le);
                    }
                });
            }
            mwh mwhVar4 = this.mwh.vt;
            if (mwhVar4 != null) {
                List<com.bytedance.sdk.openadsdk.core.model.zih> list2 = this.f12534lh.f12877tc;
                if (list2 != null && !list2.isEmpty()) {
                    com.bytedance.sdk.openadsdk.th.vt.ouw();
                    com.bytedance.sdk.openadsdk.th.vt.ouw(list2.get(0), mwhVar4, this.f12534lh);
                }
                ouw((View) mwhVar4, true);
                mwhVar4.setTag(520093762, Boolean.TRUE);
            }
        }
    }

    public static class ouw {
        public rn fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public FrameLayout f13197le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public TextView f13198lh;
        public ryl ouw;
        public TextView pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public View f13199ra;
        public mwh vt;
        public ImageView yu;

        public ouw(ImageView imageView, TextView textView, rn rnVar, View view, TextView textView2) {
            this.yu = imageView;
            this.f13198lh = textView;
            this.fkw = rnVar;
            this.f13199ra = view;
            this.pno = textView2;
        }

        public ouw(ImageView imageView, View view, TextView textView, TextView textView2, mwh mwhVar, rn rnVar, FrameLayout frameLayout) {
            this.yu = imageView;
            this.f13199ra = view;
            this.pno = textView;
            this.f13198lh = textView2;
            this.vt = mwhVar;
            this.fkw = rnVar;
            this.f13197le = frameLayout;
        }

        public ouw(ImageView imageView, View view, TextView textView, TextView textView2, ryl rylVar, rn rnVar, FrameLayout frameLayout) {
            this.yu = imageView;
            this.f13199ra = view;
            this.pno = textView;
            this.f13198lh = textView2;
            this.ouw = rylVar;
            this.fkw = rnVar;
            this.f13197le = frameLayout;
        }

        public ouw(View view, mwh mwhVar) {
            this.f13199ra = view;
            this.vt = mwhVar;
        }
    }

    public static vm ouw(int i10, int i11) {
        try {
            return ((double) i11) >= Math.floor((((double) i10) * 450.0d) / 600.0d) ? ouw[1] : ouw[0];
        } catch (Throwable unused) {
            return ouw[0];
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
            TTDelegateActivity.ouw(this.f12534lh, this.f13195ko);
        }
    }
}
