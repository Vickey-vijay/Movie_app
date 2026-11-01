package com.bytedance.sdk.openadsdk.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleVideoBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class TTWebsiteActivity extends TTBaseActivity {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.bly.le f12082lh;
    private String ouw = null;
    private qbp vt;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        String stringExtra;
        String str2;
        vpp vppVar;
        String stringExtra2;
        com.bytedance.sdk.component.bly.le leVar;
        super.onCreate(bundle);
        zih.vt(getApplicationContext());
        if (!jg.fkw()) {
            finish();
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            stringExtra2 = getIntent().getStringExtra("_extra_meta");
            String stringExtra3 = getIntent().getStringExtra("_extra_glo_d");
            String stringExtra4 = getIntent().getStringExtra("_privacy_url");
            stringExtra = getIntent().getStringExtra("_privacy_title");
            str = stringExtra4;
            str2 = stringExtra3;
            vppVar = null;
        } else {
            vpp vppVarOuw = od.ouw().ouw(od.ouw(getIntent()));
            if (vppVarOuw == null) {
                finish();
                return;
            }
            String str3 = vppVarOuw.f12869qg;
            com.bytedance.sdk.openadsdk.core.model.vt vtVar = vppVarOuw.f12852hk;
            str = vtVar.f12893lh;
            stringExtra = vtVar.yu;
            str2 = str3;
            vppVar = vppVarOuw;
            stringExtra2 = null;
        }
        if (TextUtils.isEmpty(str)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            fkwVar.setFitsSystemWindows(true);
        }
        fkwVar.setBackgroundColor(-1);
        fkwVar.setId(520093726);
        fkwVar.setOrientation(1);
        fkwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(fkwVar);
            int iOuw = osn.ouw(this, 5.0f);
            int iOuw2 = osn.ouw(this, 8.0f);
            int iOuw3 = osn.ouw(this, 10.0f);
            int iOuw4 = osn.ouw(this, 12.0f);
            int iOuw5 = osn.ouw(this, 14.0f);
            int iOuw6 = osn.ouw(this, 20.0f);
            int iOuw7 = osn.ouw(this, 24.0f);
            int iOuw8 = osn.ouw(this, 40.0f);
            int iOuw9 = osn.ouw(this, 44.0f);
            String str4 = str2;
            int iOuw10 = osn.ouw(this, 191.0f);
            String str5 = str;
            com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(this);
            final String str6 = stringExtra2;
            raVar.setGravity(15);
            final vpp vppVar2 = vppVar;
            raVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iOuw9));
            com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            yuVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOuw8, iOuw9);
            layoutParams.setMarginStart(iOuw2);
            yuVar.setLayoutParams(layoutParams);
            yuVar.setClickable(true);
            yuVar.setFocusable(true);
            yuVar.setPadding(iOuw5, iOuw4, iOuw5, iOuw4);
            yuVar.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            String str7 = stringExtra;
            yuVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOuw8, iOuw9);
            layoutParams2.addRule(17, 520093720);
            yuVar2.setLayoutParams(layoutParams2);
            yuVar2.setClickable(true);
            yuVar2.setFocusable(true);
            yuVar2.setPadding(iOuw4, iOuw5, iOuw4, iOuw5);
            yuVar2.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(this);
            pnoVar.setId(rn.odc);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOuw10, iOuw7);
            layoutParams3.setMarginStart(iOuw);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            pnoVar.setLayoutParams(layoutParams3);
            pnoVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            pnoVar.setGravity(17);
            pnoVar.setSingleLine(true);
            pnoVar.setTextColor(Color.parseColor("#222222"));
            pnoVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.le.yu yuVar3 = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            yuVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iOuw8, iOuw9);
            layoutParams4.addRule(16, 520093742);
            yuVar3.setLayoutParams(layoutParams4);
            yuVar3.setPadding(iOuw3, iOuw4, iOuw3, iOuw4);
            yuVar3.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.le.yu yuVar4 = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            yuVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iOuw8, iOuw9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iOuw2);
            yuVar4.setLayoutParams(layoutParams5);
            yuVar4.setPadding(iOuw4, iOuw6, iOuw4, iOuw6);
            yuVar4.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.le.le leVar2 = new com.bytedance.sdk.openadsdk.core.le.le(this, null);
            leVar2.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, osn.ouw(this, 2.0f));
            layoutParams6.addRule(12);
            leVar2.setLayoutParams(layoutParams6);
            leVar2.setProgress(1);
            leVar2.setProgressDrawable(cf.ouw(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, osn.ouw(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            raVar.addView(yuVar);
            raVar.addView(yuVar2);
            raVar.addView(pnoVar);
            raVar.addView(yuVar3);
            raVar.addView(yuVar4);
            raVar.addView(leVar2);
            raVar.addView(view);
            fkwVar.addView(raVar);
            try {
                com.bytedance.sdk.component.bly.le leVar3 = new com.bytedance.sdk.component.bly.le(this, com.bytedance.sdk.component.bly.le.lh.PRIVACY);
                this.f12082lh = leVar3;
                leVar3.setBackgroundColor(-1);
                fkwVar.addView(this.f12082lh, new ViewGroup.LayoutParams(-1, -1));
                yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTWebsiteActivity$1;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view2);
                        safedk_TTWebsiteActivity$1_onClick_d8cd77bea57b26aad36834f5e0ba44d8(view2);
                    }

                    public void safedk_TTWebsiteActivity$1_onClick_d8cd77bea57b26aad36834f5e0ba44d8(View p10) {
                        if (TTWebsiteActivity.this.f12082lh.lh()) {
                            TTWebsiteActivity.this.f12082lh.yu();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                yuVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTWebsiteActivity$2;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view2);
                        safedk_TTWebsiteActivity$2_onClick_f5f79c59603abad0c3d6c7c1a7e7d495(view2);
                    }

                    public void safedk_TTWebsiteActivity$2_onClick_f5f79c59603abad0c3d6c7c1a7e7d495(View p10) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                yuVar2.setVisibility(4);
                yuVar2.setClickable(false);
                if (!TextUtils.isEmpty(str7)) {
                    pnoVar.setText(str7);
                }
                yuVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTWebsiteActivity$3;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view2);
                        safedk_TTWebsiteActivity$3_onClick_3f967ff73fae907dadffa55f4069e51e(view2);
                    }

                    public void safedk_TTWebsiteActivity$3_onClick_3f967ff73fae907dadffa55f4069e51e(View p10) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.f12082lh.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.vt.ouw(TTWebsiteActivity.this, intent, null);
                    }
                });
                yuVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTWebsiteActivity$4;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view2);
                        safedk_TTWebsiteActivity$4_onClick_d1bd09a9df9df7b640401a2216204c5c(view2);
                    }

                    public void safedk_TTWebsiteActivity$4_onClick_d1bd09a9df9df7b640401a2216204c5c(View p10) {
                        if (TTWebsiteActivity.this.vt == null) {
                            TTWebsiteActivity.this.vt = new qbp(TTWebsiteActivity.this);
                            qbp qbpVar = TTWebsiteActivity.this.vt;
                            String str8 = str6;
                            try {
                                qbpVar.ouw = com.bytedance.sdk.component.utils.ouw.ouw(!TextUtils.isEmpty(str8) ? PangleVideoBridge.jsonObjectInit(str8) : vppVar2.jae()).toString();
                            } catch (JSONException e10) {
                                com.bytedance.sdk.component.utils.qbp.lh("TTPrivacyAdReportDialog", e10.getMessage());
                            }
                            TTWebsiteActivity.this.vt.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.vt.show();
                    }
                });
                this.ouw = str5;
                if (!TextUtils.isEmpty(str4)) {
                    String strEncode = URLEncoder.encode(str4);
                    if (this.ouw.contains("?")) {
                        this.ouw += "&gdid_encrypted=" + strEncode;
                    } else {
                        this.ouw += "?gdid_encrypted=" + strEncode;
                    }
                }
                if (this.ouw == null || (leVar = this.f12082lh) == null) {
                    finish();
                    return;
                }
                WebView webView = leVar.getWebView();
                if (webView != null) {
                    WebSettings settings = webView.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                HashMap map = new HashMap();
                map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                try {
                    this.f12082lh.ouw(this.ouw, map);
                } catch (Throwable unused2) {
                    this.f12082lh.a_(this.ouw);
                }
                this.f12082lh.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                    @Override // android.webkit.WebChromeClient
                    public final void onProgressChanged(WebView webView2, int i10) {
                        super.onProgressChanged(webView2, i10);
                        if (leVar2 != null && !TTWebsiteActivity.this.isFinishing()) {
                            if (i10 == 100) {
                                leVar2.setVisibility(8);
                                if (webView2.canGoBack()) {
                                    yuVar2.setVisibility(0);
                                    yuVar2.setClickable(true);
                                    return;
                                } else {
                                    yuVar2.setVisibility(4);
                                    yuVar2.setClickable(false);
                                    return;
                                }
                            }
                            leVar2.setVisibility(0);
                            leVar2.setProgress(i10);
                        }
                    }
                });
                this.f12082lh.setWebViewClient(new com.bytedance.sdk.component.bly.le.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public void onLoadResource(WebView view2, String url) {
                        super.onLoadResource(view2, url);
                        CreativeInfoManager.onResourceLoaded(g.f44975u, view2, url);
                    }

                    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView2, String str8) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTWebsiteActivity$6;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                        CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView2, str8);
                        safedk_TTWebsiteActivity$6_onPageFinished_1bf132ccf02adb00b374ab5fb4ce6ab3(webView2, str8);
                    }

                    @Override // android.webkit.WebViewClient
                    @RequiresApi(api = 23)
                    public final void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView2, webResourceRequest, webResourceError);
                        ko.fkw("TTAD.TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                    }

                    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view2, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view2, webResourceRequest, super.shouldInterceptRequest(view2, webResourceRequest));
                    }

                    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view2, String url) {
                        return CreativeInfoManager.onWebViewResponse(g.f44975u, view2, url, super.shouldInterceptRequest(view2, url));
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView2, String str8) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTWebsiteActivity$6;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                        boolean zSafedk_TTWebsiteActivity$6_shouldOverrideUrlLoading_e7cd308ba5f0964178c563e426555708 = safedk_TTWebsiteActivity$6_shouldOverrideUrlLoading_e7cd308ba5f0964178c563e426555708(webView2, str8);
                        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44975u, webView2, str8, zSafedk_TTWebsiteActivity$6_shouldOverrideUrlLoading_e7cd308ba5f0964178c563e426555708);
                        return zSafedk_TTWebsiteActivity$6_shouldOverrideUrlLoading_e7cd308ba5f0964178c563e426555708;
                    }

                    @Override // android.webkit.WebViewClient
                    public final void onReceivedError(WebView webView2, int i10, String str8, String str9) {
                        super.onReceivedError(webView2, i10, str8, str9);
                    }

                    @Override // android.webkit.WebViewClient
                    public final void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                        ko.fkw("TTAD.TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=".concat(String.valueOf(webResourceResponse)));
                    }

                    public void safedk_TTWebsiteActivity$6_onPageFinished_1bf132ccf02adb00b374ab5fb4ce6ab3(WebView p10, String p11) {
                        super.onPageFinished(p10, p11);
                    }

                    public boolean safedk_TTWebsiteActivity$6_shouldOverrideUrlLoading_e7cd308ba5f0964178c563e426555708(WebView p10, String p11) {
                        try {
                            Uri uri = Uri.parse(p11);
                            if (!vm.ouw(p11)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.vt.ouw(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable th2) {
                            ko.vt("TTAD.TTWebsiteActivity", "shouldOverrideUrlLoading", th2);
                        }
                        return super.shouldOverrideUrlLoading(p10, p11);
                    }
                });
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh.vt(this.f12082lh.getWebView());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TTWebsiteActivity", "onCreate: ", e10);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.bly.le leVar = this.f12082lh;
        if (leVar != null) {
            com.bytedance.sdk.component.utils.od.ouw(leVar);
        }
        super.onDestroy();
    }

    public static void ouw(Context context, vpp vppVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, str, "open_policy");
        if (TextUtils.isEmpty(vppVar.f12852hk.f12893lh)) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            intent.putExtra("_extra_meta", vppVar.jae().toString());
            intent.putExtra("_extra_glo_d", vppVar.f12869qg);
            intent.putExtra("_privacy_url", vppVar.f12852hk.f12893lh);
            intent.putExtra("_privacy_title", vppVar.f12852hk.yu);
        } else {
            intent.putExtra("meta_index", od.ouw().ouw(vppVar));
        }
        com.bytedance.sdk.component.utils.vt.ouw(context, intent, null);
    }
}
