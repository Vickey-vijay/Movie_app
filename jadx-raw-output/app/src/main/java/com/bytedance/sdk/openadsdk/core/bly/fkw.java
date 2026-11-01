package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class fkw extends com.bytedance.sdk.component.bly.le implements com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12513cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private jqy f12514jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private lh f12515ko;
    public AtomicBoolean mwh;
    private vt qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.vpp f12516rn;
    public AtomicBoolean ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private List<String> f12517th;
    public boolean tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private int f12518vm;
    private long vpp;
    private String zih;
    private int zin;

    public static class ouw extends com.bytedance.sdk.component.bly.le.ouw {
        public static final Set<String> ouw = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.ouw.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        public com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh vt;

        private void ouw(String str) {
            int iLastIndexOf;
            com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh interfaceC0109lh;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!ouw.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0109lh = this.vt) == null) {
                    return;
                }
                interfaceC0109lh.vt(str);
            }
        }

        @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
        }

        @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/fkw$ouw;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str);
            safedk_fkw$ouw_onPageFinished_45ecacc27746f8ed3b97a12b1bb6f99a(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(g.f44975u, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/fkw$ouw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_fkw$ouw_shouldOverrideUrlLoading_32bdf42fd2aa7e6cd72fd6b1ac4a894d = safedk_fkw$ouw_shouldOverrideUrlLoading_32bdf42fd2aa7e6cd72fd6b1ac4a894d(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44975u, webView, str, zSafedk_fkw$ouw_shouldOverrideUrlLoading_32bdf42fd2aa7e6cd72fd6b1ac4a894d);
            return zSafedk_fkw$ouw_shouldOverrideUrlLoading_32bdf42fd2aa7e6cd72fd6b1ac4a894d;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            ouw(webResourceRequest.getUrl().toString());
        }

        public boolean safedk_fkw$ouw_shouldOverrideUrlLoading_32bdf42fd2aa7e6cd72fd6b1ac4a894d(WebView p10, String p11) {
            this.vt.ouw(p11);
            return true;
        }

        public ouw(com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh interfaceC0109lh) {
            this.vt = interfaceC0109lh;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest != null && webResourceResponse != null && webResourceRequest.getUrl() != null) {
                if (webResourceRequest.isForMainFrame()) {
                    webResourceRequest.getUrl();
                    ouw(webResourceResponse.getStatusCode());
                }
                ouw(webResourceRequest.getUrl().toString());
            }
        }

        public void safedk_fkw$ouw_onPageFinished_45ecacc27746f8ed3b97a12b1bb6f99a(WebView p10, String p11) {
            super.onPageFinished(p10, p11);
            com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh interfaceC0109lh = this.vt;
            if (interfaceC0109lh != null) {
                interfaceC0109lh.ouw();
            }
        }

        private void ouw(int i10) {
            com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh interfaceC0109lh = this.vt;
            if (interfaceC0109lh != null) {
                interfaceC0109lh.ouw(106, i10);
            }
        }
    }

    public interface vt {
        void m_();

        void n_();

        View ouw();

        void ouw(int i10);
    }

    @Override // com.bytedance.sdk.component.bly.le, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.bly.le, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public fkw(Context context) {
        super(context, com.bytedance.sdk.component.bly.le.lh.DSP);
        this.tlj = false;
        this.f12513cf = false;
        this.ryl = new AtomicBoolean(false);
        this.mwh = new AtomicBoolean(false);
        this.f12518vm = 0;
    }

    @Override // com.bytedance.sdk.component.bly.le
    public final void bly() {
        this.f12515ko.ouw();
        super.bly();
    }

    public final void cf() {
        this.ryl.set(false);
        String str = this.f12516rn.swm;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strOuw = com.bytedance.sdk.openadsdk.core.ryl.fkw.ouw(str);
        String str2 = TextUtils.isEmpty(strOuw) ? str : strOuw;
        this.f12518vm = 0;
        ouw((String) null, str2, "text/html", "UTF-8", (String) null);
        this.vpp = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.component.bly.le, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f12515ko.ouw();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.zin / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.f12516rn, this.zih, "load_rate", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh
    public final void vt(String str) {
        if (this.f12517th == null) {
            this.f12517th = new ArrayList();
        }
        this.f12517th.add(str);
    }

    @Override // com.bytedance.sdk.component.bly.le, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.tlj) {
            this.f12515ko.ouw(getWebView());
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12513cf = z10;
        this.f12515ko.ouw(z10);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, vt vtVar, String str) {
        this.qbp = vtVar;
        this.f12516rn = vppVar;
        this.zih = str;
        this.f12515ko = new lh();
        this.f12514jg = new jqy(getContext());
        setWebViewClient(new ouw(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.1
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i10) {
                fkw.this.zin = i10;
                super.onProgressChanged(webView, i10);
                if (i10 >= 100) {
                    fkw.this.ouw();
                }
            }
        });
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public final void run() {
                WebView webView = fkw.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.2.1
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/fkw$2$1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
                            return safedk_fkw$2$1_onTouch_f2148133bfd7bd2d11d89df7f39092c7(view, motionEvent);
                        }

                        public boolean safedk_fkw$2$1_onTouch_f2148133bfd7bd2d11d89df7f39092c7(View p10, MotionEvent p11) {
                            fkw.this.f12514jg.onTouchEvent(p11);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public final void ouw(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.f12515ko.ouw(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh
    public final void ouw(String str) {
        String str2;
        boolean zOuw;
        com.bytedance.sdk.openadsdk.core.model.cf cfVarOuw;
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar;
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar2;
        if (TextUtils.isEmpty(str) || this.f12516rn == null || !this.f12514jg.ouw.ouw) {
            return;
        }
        int iOuw = uoy.ouw(this.zih);
        View viewOuw = null;
        if (!com.bytedance.sdk.component.utils.vm.ouw(str) && ((rylVar2 = this.f12516rn.f12857kn) == null || TextUtils.isEmpty(rylVar2.ouw))) {
            com.bytedance.sdk.openadsdk.core.model.ryl rylVar3 = new com.bytedance.sdk.openadsdk.core.model.ryl();
            rylVar3.ouw = str;
            this.f12516rn.f12857kn = rylVar3;
            str = null;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12516rn;
        vppVar.mq = true;
        if (vppVar == null || (rylVar = vppVar.f12857kn) == null || TextUtils.isEmpty(rylVar.ouw)) {
            str2 = str;
            zOuw = false;
        } else {
            zOuw = com.bytedance.sdk.openadsdk.core.uoy.ouw(getContext(), this.f12516rn, this.zih, null);
            if (zOuw || TextUtils.isEmpty(this.f12516rn.f12857kn.vt)) {
                str2 = str;
            } else {
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f12516rn;
                String str3 = vppVar2.f12857kn.vt;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar2, this.zih, "open_fallback_url", (Map<String, Object>) null);
                str2 = str3;
            }
        }
        if (!zOuw) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.core.uoy.ouw(getContext(), this.f12516rn, iOuw, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.yu.ouw) null, this.zih, true, str2);
            }
        }
        if (this.f12514jg != null) {
            vt vtVar = this.qbp;
            if (vtVar != null) {
                viewOuw = vtVar.ouw();
                this.qbp.m_();
            }
            jqy jqyVar = this.f12514jg;
            Context context = getContext();
            if (jqyVar.vt == null) {
                cfVarOuw = new com.bytedance.sdk.openadsdk.core.model.cf.ouw().ouw();
            } else {
                com.bytedance.sdk.openadsdk.core.model.cf.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.model.cf.ouw();
                com.bytedance.sdk.openadsdk.core.lh.le leVar = jqyVar.vt;
                ouwVar.f12738le = leVar.ouw;
                ouwVar.fkw = leVar.vt;
                ouwVar.yu = leVar.f12707lh;
                ouwVar.f12739lh = leVar.yu;
                ouwVar.vt = leVar.fkw;
                ouwVar.ouw = leVar.f12706le;
                ouwVar.f12740ra = osn.ouw(viewOuw);
                ouwVar.pno = osn.lh(viewOuw);
                com.bytedance.sdk.openadsdk.core.lh.le leVar2 = jqyVar.vt;
                ouwVar.bly = leVar2.f12708ra;
                ouwVar.tlj = leVar2.pno;
                ouwVar.f12735cf = leVar2.bly;
                ouwVar.ryl = leVar2.ryl;
                ouwVar.mwh = com.bytedance.sdk.openadsdk.core.bly.ouw().tlj ? 1 : 2;
                ouwVar.zih = "vessel";
                ouwVar.f12736jg = osn.bly(context);
                ouwVar.f12737ko = osn.cf(context);
                ouwVar.f12741rn = osn.tlj(context);
                cfVarOuw = ouwVar.ouw();
            }
            com.bytedance.sdk.openadsdk.core.model.cf cfVar = cfVarOuw;
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", this.f12516rn, cfVar, this.zih, true, (Map<String, Object>) map, this.f12514jg.ouw.ouw ? 1 : 2);
        }
        jqy jqyVar2 = this.f12514jg;
        if (jqyVar2 != null) {
            jqyVar2.ouw.ouw = false;
        }
    }

    public static class lh {
        public int ouw = 0;
        private com.bytedance.sdk.openadsdk.core.ryl.le vt = new com.bytedance.sdk.openadsdk.core.ryl.le();

        public final void ouw(final WebView webView) {
            if (webView != null && this.ouw == 0) {
                if (this.vt == null) {
                    this.vt = new com.bytedance.sdk.openadsdk.core.ryl.le();
                }
                final com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.vt;
                if (leVar.vt == null) {
                    if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
                        leVar.ouw(webView);
                    } else {
                        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                le.this.ouw(webView);
                            }
                        });
                    }
                }
                final com.bytedance.sdk.openadsdk.core.ryl.le leVar2 = this.vt;
                if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
                    leVar2.ouw();
                } else {
                    com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            le.this.ouw();
                        }
                    });
                }
                this.ouw = 1;
            }
        }

        public final void ouw(boolean z10) {
            com.bytedance.sdk.openadsdk.core.ryl.le leVar;
            if (this.ouw == 1 && z10 && (leVar = this.vt) != null) {
                leVar.vt();
                this.ouw = 3;
            }
        }

        public final void ouw(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.vt;
            if (leVar != null) {
                leVar.ouw(view, friendlyObstructionPurpose);
            }
        }

        public final void ouw() {
            com.bytedance.sdk.openadsdk.core.ryl.le leVar;
            int i10 = this.ouw;
            if (i10 != 0 && i10 != 4 && (leVar = this.vt) != null) {
                leVar.yu();
            }
            this.ouw = 4;
            this.vt = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh
    public final void ouw(int i10, int i11) {
        vt vtVar = this.qbp;
        if (vtVar != null) {
            vtVar.ouw(i10);
        }
        this.f12518vm = i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i11);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.vpp);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.f12516rn, this.zih, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0109lh
    public final void ouw() {
        if (this.ryl.compareAndSet(false, true)) {
            this.tlj = true;
            this.f12515ko.ouw(getWebView());
            this.f12515ko.ouw(this.f12513cf);
            vt vtVar = this.qbp;
            if (vtVar != null) {
                vtVar.n_();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.vpp);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.yu.lh.vt(this.f12516rn, this.zih, "render_html_success", jSONObject);
            if (this.f12517th == null) {
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.f12516rn, this.zih, "dsp_html_success_url", (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (fkw.this.f12517th != null && fkw.this.mwh.compareAndSet(false, true)) {
                                JSONObject jSONObject2 = new JSONObject();
                                JSONArray jSONArray = new JSONArray();
                                Iterator it = fkw.this.f12517th.iterator();
                                while (it.hasNext()) {
                                    jSONArray.put((String) it.next());
                                }
                                jSONObject2.put("url", jSONArray);
                                com.bytedance.sdk.openadsdk.yu.lh.vt(fkw.this.f12516rn, fkw.this.zih, "dsp_html_error_url", jSONObject2);
                                fkw.this.f12517th = null;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                });
            }
        }
    }
}
