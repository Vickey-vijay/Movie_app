package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2937ii extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3028m9 f24561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3037mi f24562b;

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Gh gh2;
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3028m9 interfaceC3028m9 = this.f24561a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + webView + com.ironsource.Z7.f27998r + webViewRenderProcess);
        }
        C3037mi c3037mi = this.f24562b;
        if (c3037mi != null) {
            Map mapA = c3037mi.a();
            mapA.put("creativeId", c3037mi.f24835a.f24440g);
            int i10 = c3037mi.f24839e + 1;
            c3037mi.f24839e = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = c3037mi.a("RenderProcessResponsive");
            Wj wj2 = Wj.f23753a;
            Wj.b(strA, mapA, EnumC2735ak.SDK);
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24561a;
        if (interfaceC3028m10 == null || (gh2 = ((C3053n9) interfaceC3028m10).f24879a) == null) {
            return;
        }
        gh2.a();
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Gh gh2;
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3028m9 interfaceC3028m9 = this.f24561a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + webView + com.ironsource.Z7.f27998r + webViewRenderProcess);
        }
        C3037mi c3037mi = this.f24562b;
        if (c3037mi != null) {
            Map mapA = c3037mi.a();
            mapA.put("creativeId", c3037mi.f24835a.f24440g);
            int i10 = c3037mi.f24838d + 1;
            c3037mi.f24838d = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = c3037mi.a("RenderProcessUnResponsive");
            Wj wj2 = Wj.f23753a;
            Wj.b(strA, mapA, EnumC2735ak.SDK);
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24561a;
        if (interfaceC3028m10 == null || (gh2 = ((C3053n9) interfaceC3028m10).f24879a) == null) {
            return;
        }
        gh2.a();
    }

    public C2937ii(InterfaceC3028m9 interfaceC3028m9, C3037mi c3037mi) {
        this.f24561a = interfaceC3028m9;
        this.f24562b = c3037mi;
    }
}
