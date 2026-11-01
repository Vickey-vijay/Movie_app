package sg.bigo.ads.controller.landing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.ironsource.Z7;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.core.b f70938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.core.b.InterfaceC0698b f70939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f70941d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f70942e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.core.h.e f70943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f70944g;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.landing.a$a, reason: collision with other inner class name */
    public interface InterfaceC0729a {
        void a(String str);

        void a(String str, long j10, boolean z10, int i10);
    }

    public a(@NonNull sg.bigo.ads.api.core.b bVar) {
        this.f70938a = bVar;
        sg.bigo.ads.api.core.b.InterfaceC0698b interfaceC0698bN = bVar.N();
        this.f70939b = interfaceC0698bN;
        this.f70940c = interfaceC0698bN.f();
    }

    public static /* synthetic */ void a(a aVar, Context context, final String str, int i10, final InterfaceC0729a interfaceC0729a) {
        if (i10 == 0) {
            aVar.a(context, str, interfaceC0729a);
            return;
        }
        if (i10 != 2) {
            sg.bigo.ads.common.t.a.a(0, "Preload", "PreloadLand: error open type.");
            return;
        }
        aVar.f70944g = SystemClock.elapsedRealtime();
        sg.bigo.ads.a.a.C0646a c0646a = new sg.bigo.ads.a.a.C0646a();
        c0646a.f67268a = str;
        sg.bigo.ads.a.a aVarA = c0646a.a();
        sg.bigo.ads.a.c.a(context, aVarA.f67261a, new sg.bigo.ads.a.a.b() { // from class: sg.bigo.ads.controller.landing.a.1
            @Override // sg.bigo.ads.a.a.b
            public final void a(Context context2, String str2, final int i11, String str3) {
                sg.bigo.ads.common.t.a.a(0, 3, "Preload", "Preload by chrome tabs failed, using webView.");
                a.this.a(context2, str2, new InterfaceC0729a() { // from class: sg.bigo.ads.controller.landing.a.1.1
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC0729a
                    public final void a(String str4) {
                        InterfaceC0729a interfaceC0729a2 = interfaceC0729a;
                        if (interfaceC0729a2 != null) {
                            interfaceC0729a2.a(str4);
                        }
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC0729a
                    public final void a(String str4, long j10, boolean z10, int i12) {
                        InterfaceC0729a interfaceC0729a2 = interfaceC0729a;
                        if (interfaceC0729a2 != null) {
                            interfaceC0729a2.a(str4, j10, z10, e.a(i11));
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.a.a.b
            public final void a(String str2, String str3, String str4) {
                InterfaceC0729a interfaceC0729a2 = interfaceC0729a;
                if (interfaceC0729a2 != null) {
                    interfaceC0729a2.a(str, SystemClock.elapsedRealtime() - a.this.f70944g, true, 2);
                }
            }
        });
    }

    public final void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "recycleLandWebView isPreloadWebViewReady=" + this.f70941d);
        sg.bigo.ads.core.h.e eVar = this.f70943f;
        if (eVar != null) {
            eVar.destroy();
            this.f70943f = null;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(Context context, final String str, @NonNull final InterfaceC0729a interfaceC0729a) {
        this.f70944g = SystemClock.elapsedRealtime();
        interfaceC0729a.a(str);
        sg.bigo.ads.core.h.e eVarA = sg.bigo.ads.core.h.e.a(context);
        this.f70943f = eVarA;
        if (eVarA == null) {
            return;
        }
        eVarA.setWebChromeClient(new sg.bigo.ads.core.h.c());
        this.f70943f.setWebViewClient(new sg.bigo.ads.core.h.d() { // from class: sg.bigo.ads.controller.landing.a.2
            @Override // sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                a.this.f70943f = null;
                interfaceC0729a.a(str, SystemClock.elapsedRealtime() - a.this.f70944g, false, 0);
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                sg.bigo.ads.common.t.a.a(0, 3, "Preload", "onPageFinished: url=" + webView.getUrl());
                interfaceC0729a.a(str2, SystemClock.elapsedRealtime() - a.this.f70944g, true, 0);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i10, String str2, String str3) {
                super.onReceivedError(webView, i10, str2, str3);
                sg.bigo.ads.common.t.a.b("Preload", "onReceivedError: " + i10 + Z7.f27998r + str2);
                interfaceC0729a.a(str, SystemClock.elapsedRealtime() - a.this.f70944g, false, 0);
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            @TargetApi(23)
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            @TargetApi(23)
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
                }
            }
        });
        this.f70943f.setLeft(0);
        this.f70943f.setTop(0);
        this.f70943f.setRight(sg.bigo.ads.common.utils.e.b(context));
        this.f70943f.setBottom(sg.bigo.ads.common.utils.e.c(context) - sg.bigo.ads.common.utils.e.a(context, 55));
        this.f70943f.loadUrl(str);
    }

    public final boolean b() {
        int i10 = this.f70940c;
        return i10 == 3 || i10 == 4;
    }
}
