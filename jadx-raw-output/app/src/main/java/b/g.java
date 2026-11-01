package b;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yk.e.activity.GameActivity;
import com.yk.e.util.DownloadManager;
import com.yk.e.util.StringUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GameActivity f4718a;

    public g(GameActivity gameActivity) {
        this.f4718a = gameActivity;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.contains(".apk")) {
            DownloadManager downloadManager = new DownloadManager();
            GameActivity gameActivity = this.f4718a;
            downloadManager.get(gameActivity, gameActivity.Ilil.getMainParams(), this.f4718a.Ilil.adPlcID, str);
            return true;
        }
        if (str.contains("tel:")) {
            GameActivity gameActivity2 = this.f4718a;
            gameActivity2.f3293iILLL1 = str;
            gameActivity2.IL1Iii(str);
            return true;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            this.f4718a.ILil.scrollTo(0, 0);
            return false;
        }
        StringUtil.gotoProtocol(this.f4718a, str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f4718a.f3289IL.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f4718a.f3289IL.setVisibility(0);
    }
}
