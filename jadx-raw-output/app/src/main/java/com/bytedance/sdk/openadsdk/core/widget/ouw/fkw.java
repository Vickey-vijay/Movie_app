package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.jg;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.core.model.jae;
import com.bytedance.sdk.openadsdk.core.model.pno;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.bly;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.yu.ryl;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class fkw extends com.bytedance.sdk.component.bly.le.ouw {
    private static final HashSet<String> zin;
    public boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public cf f13105cf;
    public final String fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public JSONObject f13106jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public vpp f13107ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public mwh f13108le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final bs f13109lh;
    public com.bytedance.sdk.openadsdk.core.mwh.yu.vt mwh;
    private final boolean ouw;
    public boolean pno;
    private TTCeilingLandingPageActivity.ouw qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f13110ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.fkw f13111rn;
    public Map<String, Object> ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f13112th;
    public String tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final Stack<String> f13113vm;
    private boolean vt;
    public final Context yu;
    private String zih;

    public fkw(Context context, bs bsVar, String str, com.bytedance.sdk.openadsdk.common.fkw fkwVar, mwh mwhVar, TTCeilingLandingPageActivity.ouw ouwVar) {
        this(context, bsVar, str, fkwVar, mwhVar, true);
        this.f13112th = true;
        this.qbp = ouwVar;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44975u);
        p10.startActivity(p11);
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(g.f44975u, webView, str);
        safedk_fkw_onLoadResource_26feb395e244b5b8074d3068270bd5b1(webView, str);
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str);
        safedk_fkw_onPageFinished_20b45c83738685c8d4eb19fef28f2559(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    @RequiresApi(api = 21)
    public WebResourceResponse safedk_fkw_shouldInterceptRequest_b5d95277377121da55de290eb050f486(WebView p10, WebResourceRequest p11) {
        return super.shouldInterceptRequest(p10, p11);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, webView, webResourceRequest, safedk_fkw_shouldInterceptRequest_b5d95277377121da55de290eb050f486(webView, webResourceRequest));
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f44975u, webView, str, safedk_fkw_shouldInterceptRequest_ec30d0504d4705e0366df115b99edc2f(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a = safedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44975u, webView, str, zSafedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a);
        return zSafedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a;
    }

    public final mwh vt() {
        return this.f13108le;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        zin = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public static String ouw(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !zin.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    private boolean vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (th.tlj(this.f13107ko) && this.f13106jg == null && this.f13105cf == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.yu instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.yu, intent);
                lh();
                this.f13106jg = null;
                this.f13105cf = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void lh() {
        if (TextUtils.isEmpty(this.tlj) || !th.bly(this.f13107ko) || this.vt) {
            return;
        }
        cf cfVar = this.f13105cf;
        if (cfVar != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", this.f13107ko, cfVar, this.tlj, true, this.ryl, 1);
            this.vt = true;
            return;
        }
        JSONObject jSONObject = this.f13106jg;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.f13107ko, this.tlj, "click", jSONObject);
            this.vt = true;
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f13108le == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.f13108le.ouw(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f13108le != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.f13108le.ouw(primaryError, strConcat, str, ouw(str), true);
        }
    }

    public void safedk_fkw_onPageFinished_20b45c83738685c8d4eb19fef28f2559(WebView p10, String p11) {
        if (ko.ouw()) {
            ko.ouw("WebChromeClient", "onPageFinished ".concat(String.valueOf(p11)));
        }
        mwh mwhVar = this.f13108le;
        if (mwhVar != null) {
            boolean z10 = this.ouw;
            mwhVar.ouw(false, SystemClock.elapsedRealtime());
            le leVar = mwhVar.f13530cf;
            if (leVar != null && z10) {
                int i10 = leVar.tlj;
                if (!leVar.lh() && !leVar.jqy.contains(Integer.valueOf(i10))) {
                    leVar.jqy.add(Integer.valueOf(i10));
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Long l10 = leVar.vpp.get(Integer.valueOf(i10));
                    long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
                    com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.rn.ouw.ouw.C0149ouw().ouw(leVar.bly).ouw(leVar.tlj).ouw;
                    ouwVar.f13314rn = jElapsedRealtime - jLongValue;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(leVar.vt, ouwVar, leVar.f13122lh);
                }
            }
            com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = mwhVar.f13537od;
            if (fkwVar != null) {
                fkwVar.le();
            }
            bly blyVar = mwhVar.f13534ko;
            if (blyVar != null && z10 && blyVar.ouw(false)) {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, blyVar.yu, p11, SystemClock.elapsedRealtime() - blyVar.f13468le);
            }
            if (p10 != null && !mwhVar.f13541tc && mwhVar.jae) {
                mwhVar.f13541tc = true;
                jg.ouw(p10, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
            }
            if (mwhVar.f13535le.compareAndSet(false, true)) {
                if (mwhVar.yu != 3) {
                    mwhVar.yu = 2;
                }
                mwhVar.zin = System.currentTimeMillis();
                boolean z11 = mwhVar.yu == 2;
                int iRa = mwhVar.ra();
                if (z11) {
                    long j10 = mwhVar.ex - mwhVar.jqy;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", mwhVar.f13539ra);
                        jSONObject.put("error_msg", mwhVar.bly);
                        jSONObject.put("error_url", mwhVar.tlj);
                        int i11 = mwhVar.fak;
                        if (i11 >= 0) {
                            jSONObject.put("preload_status", i11);
                        }
                        jSONObject.put("first_page", iRa);
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                        jSONObject.put("url", mwhVar.f13542th.osn);
                        jSONObject.put("preload_h5_type", mwhVar.f13542th.gls);
                    } catch (Exception unused) {
                    }
                    mwhVar.ouw(z10, "0");
                    long jMin = Math.min(j10, 600000L);
                    mwhVar.ouw("load_finish", jSONObject, jMin);
                    if (mwhVar.yu()) {
                        mwhVar.osn = SystemClock.elapsedRealtime();
                        mwhVar.lh();
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f13542th, mwhVar.ey, mwhVar.osn - mwhVar.uoy);
                    }
                    mwhVar.ouw(p11, "load_finish", jMin);
                    ryl rylVar = mwhVar.uq;
                    if (rylVar != null) {
                        rylVar.ouw(iRa);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", mwhVar.f13539ra);
                        jSONObject2.put("error_msg", mwhVar.bly);
                        jSONObject2.put("error_url", mwhVar.tlj);
                        jSONObject2.put("first_page", iRa);
                        int i12 = mwhVar.fak;
                        if (i12 >= 0) {
                            jSONObject2.put("preload_status", i12);
                        }
                        jSONObject2.putOpt("render_type", "h5");
                        jSONObject2.putOpt("render_type_2", 0);
                        jSONObject2.put("url", mwhVar.f13542th.osn);
                        jSONObject2.put("preload_h5_type", mwhVar.f13542th.gls);
                    } catch (Exception unused2) {
                    }
                    mwhVar.ouw(z10, "2");
                    mwhVar.ouw("load_fail", jSONObject2);
                    if (mwhVar.yu()) {
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f13542th, mwhVar.ey, SystemClock.elapsedRealtime() - mwhVar.uoy, mwhVar.f13539ra, mwhVar.bly, mwhVar.tlj);
                    }
                    if (mwhVar.pno) {
                        jSONObject2.remove("render_type");
                        jSONObject2.remove("render_type_2");
                        mwhVar.ouw("load_fail_main", jSONObject2);
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar2 = this.f13111rn;
        if (fkwVar2 != null && this.ouw && fkwVar2.vt != null) {
            ko.vt("arbitrage_style", "trigger onPageFinished");
            fkwVar2.ouw(1);
        }
        super.onPageFinished(p10, p11);
    }

    public WebResourceResponse safedk_fkw_shouldInterceptRequest_ec30d0504d4705e0366df115b99edc2f(WebView p10, String p11) {
        vpp vppVar;
        vpp vppVar2;
        mwh mwhVar = this.f13108le;
        if (mwhVar != null) {
            boolean z10 = this.ouw;
            bly blyVar = mwhVar.f13534ko;
            if (blyVar != null && z10 && (vppVar2 = blyVar.ouw) != null && com.bytedance.sdk.component.bly.vt.ouw(vppVar2.our.fkw, p11)) {
                String str = blyVar.vt.get(Integer.valueOf(blyVar.yu));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, blyVar.yu, str, p11, 2);
            }
        }
        final com.bytedance.sdk.openadsdk.common.fkw fkwVar = this.f13111rn;
        if (fkwVar != null && (vppVar = fkwVar.ouw) != null && com.bytedance.sdk.component.bly.vt.ouw(vppVar.our.fkw, p11)) {
            fkwVar.f12200le++;
            ko.lh("arbitrage_style", "trigger shouldInterceptRequest->1");
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fkw.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (fkw.this.lh()) {
                        com.bytedance.sdk.component.utils.ko.lh("arbitrage_style", "trigger shouldInterceptRequest->2");
                        fkw.this.ouw();
                    }
                }
            });
        }
        return super.shouldInterceptRequest(p10, p11);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        int iOuw;
        vpp vppVar;
        super.onPageStarted(webView, str, bitmap);
        vpp vppVar2 = this.f13107ko;
        if (vppVar2 != null && vppVar2.zin() && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("opt_web_index", false)) {
            iOuw = uoy.ouw(webView);
        } else {
            iOuw = -1;
        }
        ko.ouw("TTWebViewClient", "currentUrlIndex is:", Integer.valueOf(iOuw));
        mwh mwhVar = this.f13108le;
        if (mwhVar != null) {
            boolean z10 = this.ouw;
            mwhVar.mwh = z10;
            mwhVar.f13545vm++;
            le leVar = mwhVar.f13530cf;
            if (leVar != null && z10) {
                leVar.bly = str;
                leVar.yu();
                leVar.qbp.put(Integer.valueOf(leVar.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                leVar.vpp.put(Integer.valueOf(leVar.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                leVar.jae = leVar.ouw();
                final le leVar2 = mwhVar.f13530cf;
                leVar2.yu.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.le.3
                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z11) {
                        ko.ouw("_arbitrage_", "trigger onWindowFocusChanged: ", Boolean.valueOf(z11));
                        if (!z11) {
                            le leVar3 = le.this;
                            if (!leVar3.pno) {
                                leVar3.vt();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                le leVar4 = le.this;
                                if (jElapsedRealtime - leVar4.ksc >= 50) {
                                    leVar4.ouw(3, leVar4.bly, leVar4.tlj);
                                    le.this.ksc = jElapsedRealtime;
                                    return;
                                }
                                return;
                            }
                            leVar3.pno = false;
                        }
                        if (z11) {
                            le.this.yu();
                            le leVar5 = le.this;
                            leVar5.qbp.put(Integer.valueOf(leVar5.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                        }
                    }

                    public AnonymousClass3() {
                    }
                });
            }
            bly blyVar = mwhVar.f13534ko;
            if (blyVar != null && z10) {
                if (blyVar.f13469lh) {
                    iOuw++;
                }
                if (blyVar.ouw(true)) {
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, blyVar.yu, str, iOuw);
                    blyVar.vt.put(Integer.valueOf(blyVar.yu), str);
                    blyVar.f13468le = SystemClock.elapsedRealtime();
                }
            }
            WebView webView2 = null;
            WeakReference<WebView> weakReference = mwhVar.ksc;
            if (weakReference != null) {
                webView2 = weakReference.get();
            }
            if (webView2 != null) {
                try {
                    WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                    if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > mwhVar.bs) {
                        mwhVar.fvf.incrementAndGet();
                    }
                    mwhVar.bs = webBackForwardListCopyBackForwardList.getCurrentIndex();
                } catch (Exception e10) {
                    qbp.ouw("LandingPageLog", "copyBackForwardList exception", e10);
                }
            }
            if (mwhVar.f13538pd == 0) {
                mwhVar.f13538pd = SystemClock.elapsedRealtime();
            }
            com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = mwhVar.f13537od;
            if (fkwVar != null) {
                fkwVar.fkw();
            }
            if (mwhVar.fkw.compareAndSet(false, true)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    int i10 = mwhVar.fak;
                    if (i10 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                    }
                } catch (Exception unused) {
                }
                mwhVar.ouw("load_start", jSONObject);
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar2 = this.f13111rn;
        if (fkwVar2 != null) {
            boolean z11 = this.ouw;
            fkwVar2.tlj.clear();
            fkwVar2.bly = z11;
            if (z11) {
                fkwVar2.f12202ra = true;
            }
            fkwVar2.f12197cf = fkwVar2.yu();
        }
        if (this.ouw && (vppVar = this.f13107ko) != null && vppVar.zin() && this.f13107ko.our.ouw() >= 2) {
            if (!TextUtils.isEmpty(str) && !str.equals(this.zih)) {
                if (this.f13113vm.contains(str)) {
                    while (!str.equals(this.f13113vm.peek())) {
                        this.f13113vm.pop();
                    }
                } else {
                    this.f13113vm.push(str);
                }
            }
            this.zih = str;
        }
        ko.ouw("TTWebViewClient-onPageStarted", "mNeedHardwareAcceleration:", Boolean.valueOf(this.pno), "hasSetHardwareAccelerate", Boolean.valueOf(this.bly));
        if (this.pno && !this.bly) {
            ko.vt("TTWebViewClient-onPageStarted", "use hardware acceleration");
            this.bly = true;
            lh lhVarOuw = lh.ouw(this.yu);
            lhVarOuw.vt = true;
            lhVarOuw.ouw = webView.getSettings().getBuiltInZoomControls();
            lhVarOuw.ouw(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String string;
        boolean z10;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f13108le != null && webResourceResponse != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            if (url == null) {
                string = "";
            } else {
                string = url.toString();
            }
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            String str2 = str;
            if (webResourceRequest.isForMainFrame()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f13108le.ouw(webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str2, z10);
        }
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().vt();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void safedk_fkw_onLoadResource_26feb395e244b5b8074d3068270bd5b1(WebView p10, String p11) {
        super.onLoadResource(p10, p11);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0146  */
    public boolean safedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a(WebView p10, final String p11) {
        boolean z10;
        boolean z11;
        Intent uri;
        boolean zEquals;
        boolean z12;
        String str;
        com.bytedance.sdk.openadsdk.core.model.le leVar;
        boolean zMatches;
        jae jaeVar;
        pno pnoVar;
        String str2;
        ko.vt("WebChromeClient", "shouldOverrideUrlLoading ".concat(String.valueOf(p11)));
        mwh mwhVar = this.f13108le;
        String str3 = "";
        if (mwhVar != null) {
            boolean z13 = this.ouw;
            le leVar2 = mwhVar.f13530cf;
            if (leVar2 != null && z13) {
                if (leVar2.f13125ra) {
                    leVar2.f13129vm = true;
                }
                if (leVar2.tlj == 1 && !TextUtils.isEmpty(p11) && p11.contains("query=")) {
                    int iIndexOf = p11.indexOf("query=") + 6;
                    int iIndexOf2 = p11.indexOf(C3426d4.j.f28584c, iIndexOf);
                    if (iIndexOf >= 0 && iIndexOf2 < p11.length() && iIndexOf2 > iIndexOf) {
                        String strSubstring = p11.substring(iIndexOf, iIndexOf2);
                        if (!leVar2.lh()) {
                            String strDecode = Uri.decode(strSubstring);
                            com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.rn.ouw.ouw.C0149ouw().ouw(leVar2.bly).ouw;
                            ouwVar.f13310ko = strDecode;
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(leVar2.vt, ouwVar, leVar2.f13122lh);
                        }
                    }
                }
            }
            bly blyVar = mwhVar.f13534ko;
            if (blyVar != null && z13) {
                String str4 = blyVar.vt.get(Integer.valueOf(blyVar.yu));
                if (TextUtils.isEmpty(str4)) {
                    str2 = "";
                } else {
                    str2 = str4;
                }
                int i10 = blyVar.yu;
                if (i10 > 0) {
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, i10, str2, p11, 1);
                }
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar = this.f13111rn;
        if (fkwVar != null && this.ouw && fkwVar.lh()) {
            ko.lh("arbitrage_style", "trigger shouldOverrideUrlLoading");
            fkwVar.ouw();
        }
        boolean z14 = false;
        if (uoy.yu(this.f13107ko) && (pnoVar = this.f13107ko.our) != null && p10 != null) {
            int iOuw = pnoVar.ouw();
            int size = this.f13113vm.size();
            if (this.f13112th) {
                size++;
            }
            ko.ouw("sa_open_browser", "boc_index is:", Integer.valueOf(iOuw), "currentIndex is:", Integer.valueOf(size));
            if (size + 1 == iOuw) {
                com.bytedance.sdk.openadsdk.utils.vpp.ouw(this.yu, p11, this.f13107ko, com.bytedance.sdk.openadsdk.yu.vt.ouw.yu);
                TTCeilingLandingPageActivity.ouw ouwVar2 = this.qbp;
                if (ouwVar2 != null) {
                    ouwVar2.ouw();
                }
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        vpp vppVar = this.f13107ko;
        if (vppVar != null && vppVar.fkw() == 1) {
            if (!com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.ouw(p11, this.f13107ko)) {
                vpp vppVar2 = this.f13107ko;
                if (vppVar2 != null && (jaeVar = vppVar2.oiz) != null) {
                    String str5 = jaeVar.f12759lh;
                    if (!TextUtils.isEmpty(str5)) {
                        zMatches = Pattern.compile(str5).matcher(p11).matches();
                    } else {
                        zMatches = false;
                    }
                } else {
                    zMatches = false;
                }
                if (zMatches) {
                    if (com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.ouw(this.f13107ko, this.yu, true)) {
                        ko.lh("WebChromeClient", "ip link open,true");
                        return true;
                    }
                }
            } else if (com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.ouw(this.f13107ko, this.yu, true)) {
                ko.lh("WebChromeClient", "ip link open,true");
                return true;
            }
        }
        try {
            Uri uri2 = Uri.parse(p11);
            final String lowerCase = uri2.getScheme().toLowerCase();
            if ("bytedance".equals(lowerCase)) {
                com.bytedance.sdk.openadsdk.utils.th.ouw(uri2, this.f13109lh);
                return true;
            }
            if (vt(p11)) {
                return true;
            }
            if (!vm.ouw(p11)) {
                if (th.tlj(this.f13107ko)) {
                    if (!th.tlj(this.f13107ko)) {
                        zEquals = false;
                    } else {
                        zEquals = TextUtils.equals(this.f13107ko.lso, lowerCase);
                    }
                    if ((zEquals || "market".equals(lowerCase)) && (this.f13105cf != null || this.f13106jg != null)) {
                        Context context = this.yu;
                        if (context != null) {
                            vpp vppVar3 = this.f13107ko;
                            if (vppVar3 == null || (leVar = vppVar3.wp) == null) {
                                str = "";
                            } else {
                                str3 = leVar.f12779lh;
                                str = leVar.ouw;
                            }
                            uoy.vt(vppVar3);
                            if (com.bytedance.sdk.openadsdk.qbp.ouw.ouw.ouw.ouw(context, p11, vppVar3, null) || com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.ouw(this.f13107ko, str3, this.yu, this.tlj, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.ouw(this.yu, str, str3, this.tlj, this.f13107ko)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            lh();
                        }
                    }
                    this.f13105cf = null;
                    this.f13106jg = null;
                    return true;
                }
                try {
                    if (p11.startsWith("intent:")) {
                        uri = Intent.parseUri(p11, 1);
                    } else if (p11.startsWith("android-app:")) {
                        uri = Intent.parseUri(p11, 2);
                    } else {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uri2);
                        uri = intent;
                    }
                    uri.addFlags(268435456);
                    com.bytedance.sdk.component.utils.vt.ouw(this.yu, uri, new com.bytedance.sdk.component.utils.vt.InterfaceC0099vt() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.1
                        @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0099vt
                        public final void ouw() {
                            fkw.this.ouw(lowerCase, true, 0, "", p11);
                        }

                        @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0099vt
                        public final void ouw(Throwable th2) {
                            fkw.this.ouw(lowerCase, false, 2, th2.getMessage(), p11);
                        }
                    });
                } catch (Throwable th2) {
                    qbp.ouw("WebChromeClient", "parseUri", th2);
                    ouw(lowerCase, false, 1, th2.getMessage(), p11);
                }
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.mwh;
                if (vtVar != null) {
                    vtVar.zih();
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(p10, p11);
        } catch (Throwable th3) {
            ko.vt("WebChromeClient", "shouldOverrideUrlLoading", th3);
            bs bsVar = this.f13109lh;
            if (bsVar != null) {
                vpp vppVar4 = bsVar.bly;
                if (vppVar4 != null) {
                    if (vppVar4.eay == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z14 = true;
                    }
                }
                if (z14) {
                    return true;
                }
            }
        }
    }

    public fkw(Context context, bs bsVar, String str, com.bytedance.sdk.openadsdk.common.fkw fkwVar, mwh mwhVar, boolean z10) {
        this(context, bsVar, str, mwhVar, z10);
        this.f13111rn = fkwVar;
    }

    public fkw(Context context, bs bsVar, String str, mwh mwhVar, boolean z10) {
        this.f13110ra = true;
        this.pno = true;
        this.bly = false;
        this.yu = context;
        this.f13109lh = bsVar;
        this.fkw = str;
        this.f13108le = mwhVar;
        this.ouw = z10;
        this.f13113vm = new Stack<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final String str, final boolean z10, final int i10, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), this.f13107ko, this.tlj, "lp_not_http_open", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.2
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z10);
                    jSONObject.put("error_type", i10);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
