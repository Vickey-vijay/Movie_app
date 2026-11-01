package b;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yk.e.activity.RewardWebActivity;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RewardWebActivity f4727a;

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }

    public k0(RewardWebActivity rewardWebActivity) {
        this.f4727a = rewardWebActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f4727a.f3317llL1ii.setVisibility(8);
        this.f4727a.f3310IL.setVisibility(0);
    }
}
