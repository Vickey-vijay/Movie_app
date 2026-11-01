package b;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GameActivity f4742a;

    public y(GameActivity gameActivity) {
        this.f4742a = gameActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        this.f4742a.f3289IL.setProgress(i10);
    }
}
