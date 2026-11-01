package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f18727e;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44970p, webView, str);
        safedk_k0_onLoadResource_5e4c7aec67db305f1f538b12d57d1270(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44970p, webView, str);
        safedk_k0_onPageFinished_dffa11ebe1b6f0bcc0595b54c77d4cfa(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        j jVar = this.f18727e;
        if (jVar != null) {
            jVar.a();
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44970p, webView, webResourceRequest, safedk_k0_shouldInterceptRequest_d2b0cda7f0212217cff9d9ea52019c55(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44970p, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2 = safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44970p, webView, str, zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2);
        return zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2;
    }

    public WebResourceResponse safedk_k0_shouldInterceptRequest_d2b0cda7f0212217cff9d9ea52019c55(WebView p10, WebResourceRequest p11) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f18723a && p11 != null) {
            IAlog.e("shouldInterceptRequest, method = %s", p11.getMethod());
            b1 b1Var = b1.f18642c;
            int i10 = this.f18724b;
            int i11 = this.f18725c;
            int i12 = this.f18726d;
            b1Var.getClass();
            WebResourceResponse webResourceResponse = null;
            if (p11.getUrl() != null && p11.getUrl().getScheme() != null && p11.getUrl().getScheme().startsWith("http") && TextUtils.equals(p11.getMethod(), "GET")) {
                c1 c1Var = (c1) b1Var.f18643a.get(new d1(p11));
                if (c1Var != null) {
                    webResourceResponse = new WebResourceResponse(c1Var.f18649c, c1Var.f18650d, c1Var.f18651e, c1Var.f18652f, c1Var.f18648b, new ByteArrayInputStream(c1Var.f18647a));
                } else {
                    try {
                        url = new URL(p11.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer byteBufferAllocateDirect = (ByteBuffer) com.fyber.inneractive.sdk.util.f.f18577b.f18578a.poll();
                        if (byteBufferAllocateDirect == null) {
                            byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                        }
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(p11.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                b1.a(p11, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i10);
                            httpURLConnection.setReadTimeout(i11);
                            c1 c1VarA = null;
                            while (i12 > 0) {
                                try {
                                    c1VarA = b1.a(httpURLConnection, byteBufferAllocateDirect);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i12 = 0;
                                }
                                if (c1VarA != null) {
                                    break;
                                }
                                i12--;
                            }
                            if (c1VarA != null) {
                                try {
                                    if (c1VarA.a()) {
                                        b1Var.f18643a.put(new d1(p11), c1VarA);
                                    }
                                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(c1VarA.f18649c, c1VarA.f18650d, c1VarA.f18651e, c1VarA.f18652f, c1VarA.f18648b, new ByteArrayInputStream(c1VarA.f18647a));
                                    DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                    com.fyber.inneractive.sdk.util.f.f18577b.f18578a.offer(byteBufferAllocateDirect);
                                    webResourceResponse = webResourceResponse2;
                                } catch (Throwable unused6) {
                                    DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                    com.fyber.inneractive.sdk.util.f.f18577b.f18578a.offer(byteBufferAllocateDirect);
                                }
                            } else {
                                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            com.fyber.inneractive.sdk.util.f.f18577b.f18578a.offer(byteBufferAllocateDirect);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.e("shouldInterceptRequest did not intercept %s", p11.getUrl());
        }
        return super.shouldInterceptRequest(p10, p11);
    }

    public k0(j jVar, boolean z10, int i10, int i11, int i12) {
        this.f18727e = jVar;
        this.f18723a = z10;
        this.f18724b = i10;
        this.f18725c = i11;
        this.f18726d = i12;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.e("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.e("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(i10), str, webView);
        super.onReceivedError(webView, i10, str, str2);
        j jVar = this.f18727e;
        if (jVar != null) {
            jVar.d();
        }
    }

    public void safedk_k0_onLoadResource_5e4c7aec67db305f1f538b12d57d1270(WebView p10, String p11) {
        super.onLoadResource(p10, p11);
        IAlog.e("Resources to load: %s", p11);
        IAlog.d("%s %s", "RESOURCES", p11);
        j jVar = this.f18727e;
        if (jVar != null) {
            i iVar = (i) jVar;
            if (!TextUtils.isEmpty(p11) && p11.startsWith("http://") && !com.fyber.inneractive.sdk.util.s.a()) {
                IAlog.a("%s Found a portential unsecure resource url: %s", IAlog.a(iVar), p11);
            }
        }
    }

    public void safedk_k0_onPageFinished_dffa11ebe1b6f0bcc0595b54c77d4cfa(WebView p10, String p11) {
        super.onPageFinished(p10, p11);
        IAlog.e("onPageFinished - url: %s", p11);
        j jVar = this.f18727e;
        if (jVar != null) {
            jVar.a(p10);
        }
    }

    public boolean safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2(WebView p10, String p11) {
        super.shouldOverrideUrlLoading(p10, p11);
        j jVar = this.f18727e;
        if (jVar != null && jVar.a(p10, p11)) {
            return true;
        }
        return false;
    }
}
