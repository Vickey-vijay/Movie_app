package b;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yk.e.activity.BaseVideoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4722a;

    public i(BaseVideoActivity baseVideoActivity) {
        this.f4722a = baseVideoActivity;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f4722a.f3276l1IIi1.setVisibility(0);
        this.f4722a.f3272L1l.setVisibility(8);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (!webView.getSettings().getLoadsImagesAutomatically()) {
            webView.getSettings().setLoadsImagesAutomatically(true);
        }
        this.f4722a.f3276l1IIi1.setVisibility(8);
        this.f4722a.f3272L1l.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f4722a.f3276l1IIi1.setVisibility(0);
        this.f4722a.f3272L1l.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f4722a.f3266IIi = true;
    }
}
