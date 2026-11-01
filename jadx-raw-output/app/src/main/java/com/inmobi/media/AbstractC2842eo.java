package com.inmobi.media;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.inmobi.media.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC2842eo {
    public static WebResourceResponse a(WebResourceRequest webResourceRequest, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(webResourceRequest, "<this>");
        if (!lk.x.E("GET", webResourceRequest.getMethod(), true)) {
            return null;
        }
        String string = webResourceRequest.getUrl().toString();
        ck.p.i(string, "toString(...)");
        return a(string, interfaceC3028m9);
    }

    public static WebResourceResponse a(String str, InterfaceC3028m9 interfaceC3028m9) {
        String strDecode;
        ck.p.j(str, "urlRaw");
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("IMResourceCacheManager", "shouldInterceptRequest " + str);
        }
        try {
            strDecode = URLDecoder.decode(lk.a0.k1(str).toString(), "UTF-8");
        } catch (Exception unused) {
            strDecode = null;
        }
        if (strDecode == null) {
            return null;
        }
        ck.p.j(strDecode, "url");
        if (lk.a0.X(strDecode, "inmobicache=true", false, 2, null)) {
            return (WebResourceResponse) nk.i.b(null, new C2791co(strDecode, interfaceC3028m9, null), 1, null);
        }
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("IMResourceCacheManager", "Cache is not enabled for URL: " + strDecode);
        }
        return null;
    }
}
