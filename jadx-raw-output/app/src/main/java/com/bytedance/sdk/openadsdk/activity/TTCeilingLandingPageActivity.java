package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes5.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {
    private com.bytedance.sdk.openadsdk.common.fkw bly;
    private String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12017le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private bs f12018lh;
    public ouw ouw;
    private mwh pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private String f12019ra;
    private com.bytedance.sdk.component.bly.le tlj;
    private vpp vt;
    private String yu;

    public interface ouw {
        void ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!jg.fkw()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.f12017le = intent.getIntExtra("source", -1);
        vpp vppVarOuw = od.ouw().ouw(od.ouw(intent));
        this.vt = vppVarOuw;
        if (vppVarOuw == null) {
            finish();
            return;
        }
        this.f12019ra = vppVarOuw.f12878th;
        this.yu = vppVarOuw.pv;
        this.fkw = vppVarOuw.yhj;
        this.f12017le = vppVarOuw.yiz.getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this);
        this.tlj = new com.bytedance.sdk.component.bly.le(this, com.bytedance.sdk.component.bly.le.lh.LANDING_PAGE);
        lhVar.addView(this.tlj, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.yu yuVarVt = com.bytedance.sdk.openadsdk.core.widget.le.vt(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        layoutParams.topMargin = osn.ouw(this, 18.0f);
        layoutParams.rightMargin = osn.ouw(this, 18.0f);
        lhVar.addView(yuVarVt, layoutParams);
        final int i10 = this.vt.f12863mb.f12837le;
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = null;
        if (i10 != 3) {
            yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(osn.ouw(this, 28.0f), osn.ouw(this, 28.0f));
            layoutParams2.gravity = BadgeDrawable.TOP_START;
            layoutParams2.topMargin = osn.ouw(this, 18.0f);
            layoutParams2.leftMargin = osn.ouw(this, 18.0f);
            int iOuw = osn.ouw(this, 5.0f);
            yuVar.setPadding(iOuw, iOuw, iOuw, iOuw);
            yuVar.setScaleType(ImageView.ScaleType.FIT_XY);
            yuVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
            yuVar.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this, "tt_white_lefterbackicon_titlebar"));
            lhVar.addView(yuVar, layoutParams2);
        }
        zin.ouw(this.tlj, this.f12019ra);
        final WebView webView = this.tlj.getWebView();
        yuVarVt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTCeilingLandingPageActivity$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_TTCeilingLandingPageActivity$1_onClick_6bdc0644827fbe565c5d910605de88d3(view);
            }

            public void safedk_TTCeilingLandingPageActivity$1_onClick_6bdc0644827fbe565c5d910605de88d3(View p10) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        mwh mwhVar = new mwh(this.vt, webView, true);
        this.pno = mwhVar;
        mwhVar.ouw("landingpage_split_ceiling");
        final com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw ouwVar = this.pno.ryl;
        if (yuVar != null) {
            yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTCeilingLandingPageActivity$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_TTCeilingLandingPageActivity$2_onClick_1a8fa94fcfa3a4d4a8ddb1293e2ccf48(view);
                }

                public void safedk_TTCeilingLandingPageActivity$2_onClick_1a8fa94fcfa3a4d4a8ddb1293e2ccf48(View p10) {
                    int i11 = i10;
                    if (i11 == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i11 != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw ouwVar2 = ouwVar;
                    if (ouwVar2 != null) {
                        ouwVar2.ouw();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(this.vt, this.tlj, this);
        this.bly = fkwVarOuw;
        if (fkwVarOuw != null) {
            fkwVarOuw.ouw("landingpage_split_ceiling");
            this.bly.ouw();
        }
        uoy.ouw(this.vt, this.tlj, true);
        this.ouw = new ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.ouw
            public final void ouw() {
                if (TTCeilingLandingPageActivity.this.vt.f12863mb.f12839ra == vm.vt) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(this, this.f12018lh, this.yu, this.bly, this.pno, this.ouw) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTCeilingLandingPageActivity$4;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView2, str);
                safedk_TTCeilingLandingPageActivity$4_onPageFinished_ffa419bda84785b83fafff6cae8a4795(webView2, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                return CreativeInfoManager.onWebViewResponse(g.f44975u, view, url, super.shouldInterceptRequest(view, url));
            }

            public void safedk_TTCeilingLandingPageActivity$4_onPageFinished_ffa419bda84785b83fafff6cae8a4795(WebView p10, String p11) {
                super.onPageFinished(p10, p11);
            }
        };
        fkwVar.f13107ko = this.vt;
        com.bytedance.sdk.openadsdk.core.widget.ouw.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.f12018lh, this.pno, this.bly) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i11) {
                super.onProgressChanged(webView2, i11);
            }
        };
        com.bytedance.sdk.component.bly.le leVar = this.tlj;
        if (leVar != null) {
            leVar.setWebViewClient(fkwVar);
            this.tlj.setWebChromeClient(yuVar2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTCeilingLandingPageActivity$6;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
                    return safedk_TTCeilingLandingPageActivity$6_onTouch_cf571c44cfb2e3ba3a2bb1ec5b82702b(view, motionEvent);
                }

                public boolean safedk_TTCeilingLandingPageActivity$6_onTouch_cf571c44cfb2e3ba3a2bb1ec5b82702b(View p10, MotionEvent p11) {
                    if (TTCeilingLandingPageActivity.this.pno == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.pno.ouw(p11);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                    if (TTCeilingLandingPageActivity.this.pno != null) {
                        TTCeilingLandingPageActivity.this.pno.ouw(i12);
                    }
                }
            });
        }
        setContentView(lhVar);
        bs bsVar = new bs(this);
        this.f12018lh = bsVar;
        bs bsVarVt = bsVar.vt(this.tlj);
        bsVarVt.f12584lh = this.yu;
        bsVarVt.fkw = this.fkw;
        bs bsVarOuw = bsVarVt.ouw(this.vt);
        bsVarOuw.f12583le = this.f12017le;
        vpp vppVar = this.vt;
        bsVarOuw.pno = vppVar.f12884vi;
        bsVarOuw.f12587ra = vppVar.hun();
        bsVarOuw.ouw(this.tlj).ouw = "landingpage_split_ceiling";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.component.bly.le leVar = this.tlj;
        if (leVar != null) {
            com.bytedance.sdk.component.utils.od.ouw(leVar);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        mwh mwhVar = this.pno;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }
}
