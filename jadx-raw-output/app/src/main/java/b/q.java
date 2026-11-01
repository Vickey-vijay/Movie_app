package b;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.yk.e.activity.WebActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebActivity f4734a;

    public q(WebActivity webActivity) {
        this.f4734a = webActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        this.f4734a.I1I.setProgress(i10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (!str.startsWith("http") && !str.startsWith("https")) {
            this.f4734a.ILil.setText(str);
        } else {
            this.f4734a.ILil.setText("加载中");
        }
    }
}
