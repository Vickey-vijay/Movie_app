package gl;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yk.e.util.OktWebView;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OktWebView f53598a;

    public u0(OktWebView oktWebView) {
        this.f53598a = oktWebView;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        OktWebView oktWebView = this.f53598a;
        int i10 = OktWebView.IL1Iii;
        oktWebView.getClass();
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (!webView.getSettings().getLoadsImagesAutomatically()) {
            webView.getSettings().setLoadsImagesAutomatically(true);
        }
        OktWebView oktWebView = this.f53598a;
        int i10 = OktWebView.IL1Iii;
        oktWebView.getClass();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        OktWebView oktWebView = this.f53598a;
        int i10 = OktWebView.IL1Iii;
        oktWebView.getClass();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        OktWebView oktWebView = this.f53598a;
        int i11 = OktWebView.IL1Iii;
        oktWebView.getClass();
    }
}
