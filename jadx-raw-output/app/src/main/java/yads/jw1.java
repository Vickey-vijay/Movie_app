package yads;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class jw1 extends l11 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f79216c;

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String str = this.f79216c;
        if (str == null || str.length() <= 0 || (url = webResourceRequest.getUrl()) == null || !ck.p.e("mraid.js", url.getLastPathSegment())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        byte[] bytes = str.getBytes(lk.c.f63591b);
        ck.p.i(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    public jw1(vv1 vv1Var) {
        super(vv1Var);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }
}
