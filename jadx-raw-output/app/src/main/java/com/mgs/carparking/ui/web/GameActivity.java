package com.mgs.carparking.ui.web;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import ck.p;
import com.fvvcl.flickverse.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mgs.carparking.basecommon.ui.BarActivity;
import em.n;
import em.o;
import sa.o0;

/* JADX INFO: compiled from: GameActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GameActivity extends BarActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WebView f42202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProgressBar f42203k;

    /* JADX INFO: compiled from: GameActivity.kt */
    public final class a {
        public a() {
        }

        @JavascriptInterface
        public final void gotoBrowser(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    sa.a.a(GameActivity.this, str);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: GameActivity.kt */
    public static final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (i10 == 100) {
                ProgressBar progressBar = GameActivity.this.f42203k;
                p.g(progressBar);
                progressBar.setVisibility(8);
            } else {
                ProgressBar progressBar2 = GameActivity.this.f42203k;
                p.g(progressBar2);
                progressBar2.setProgress(i10);
            }
            super.onProgressChanged(webView, i10);
        }
    }

    public final void initWebView() {
        WebView webView = this.f42202j;
        p.g(webView);
        WebSettings settings = webView.getSettings();
        p.i(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("GBK");
        WebView webView2 = this.f42202j;
        p.g(webView2);
        webView2.setVerticalScrollbarOverlay(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        WebView webView3 = this.f42202j;
        p.g(webView3);
        webView3.addJavascriptInterface(new a(), "Netandroid");
        WebView webView4 = this.f42202j;
        p.g(webView4);
        webView4.setWebViewClient(new WebViewClient());
        settings.setMixedContentMode(0);
        if (!o.c(o0.F())) {
            WebView webView5 = this.f42202j;
            p.g(webView5);
            String strF = o0.F();
            p.g(strF);
            webView5.loadUrl(strF);
        }
        WebView webView6 = this.f42202j;
        p.g(webView6);
        webView6.setWebChromeClient(new b());
    }

    public final void initData(Intent intent) {
        initWebView();
    }

    public final void l() {
        this.f42202j = (WebView) findViewById(R.id.webView);
        this.f42203k = (ProgressBar) findViewById(R.id.progressBar1);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
        setContentView(R.layout.activity_web_game, false);
        l();
        initData(getIntent());
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f42202j;
        if (webView != null) {
            p.g(webView);
            webView.setWebChromeClient(null);
            WebView webView2 = this.f42202j;
            p.g(webView2);
            webView2.getSettings().setJavaScriptEnabled(false);
            WebView webView3 = this.f42202j;
            p.g(webView3);
            webView3.clearCache(true);
            this.f42202j = null;
        }
    }
}
