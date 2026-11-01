package yads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class rv3 extends ka {
    public rv3(WebView webView, String str) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
