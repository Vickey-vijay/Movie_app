package com.mgs.carparking.ui.web;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck.p;
import com.fvvcl.flickverse.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.ui.web.WebActivity;
import em.n;
import em.r;
import java.util.HashMap;
import java.util.Locale;
import me.goldze.mvvmhabit.base.BaseApplication;
import sa.e;
import sa.o0;

/* JADX INFO: compiled from: WebActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class WebActivity extends BarActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f42206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f42207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WebView f42208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ProgressBar f42209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f42210n;

    /* JADX INFO: compiled from: WebActivity.kt */
    public final class a {
        public a() {
        }

        @JavascriptInterface
        public final void close() {
            WebActivity.this.finish();
        }

        @JavascriptInterface
        public final void payResult(int i10, int i11) {
            Log.e("payResult:", i10 + "price" + i11);
        }
    }

    /* JADX INFO: compiled from: WebActivity.kt */
    public static final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (i10 == 100) {
                ProgressBar progressBar = WebActivity.this.f42209m;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            } else {
                ProgressBar progressBar2 = WebActivity.this.f42209m;
                if (progressBar2 != null) {
                    progressBar2.setProgress(i10);
                }
            }
            super.onProgressChanged(webView, i10);
        }
    }

    public final void initData(Intent intent) {
        p.j(intent, "intent");
        if (intent.getExtras() != null) {
            this.f42206j = intent.getStringExtra("web_url");
            this.f42207k = intent.getStringExtra("web_title");
        }
        TextView textView = this.f42210n;
        if (textView != null) {
            textView.setText(this.f42207k);
        }
        initWebView();
    }

    public final void initWebView() {
        WebView webView;
        WebView webView2 = this.f42208l;
        p.g(webView2);
        WebSettings settings = webView2.getSettings();
        p.i(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("GBK");
        WebView webView3 = this.f42208l;
        if (webView3 != null) {
            webView3.setVerticalScrollbarOverlay(true);
        }
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        WebView webView4 = this.f42208l;
        if (webView4 != null) {
            webView4.addJavascriptInterface(new a(), "Netandroid");
        }
        WebView webView5 = this.f42208l;
        if (webView5 != null) {
            webView5.setWebViewClient(new WebViewClient());
        }
        settings.setMixedContentMode(0);
        t9.b.f("链接为：" + this.f42206j);
        String str = System.currentTimeMillis() + "";
        HashMap map = new HashMap();
        map.put("app_id", "moviein");
        map.put("version", "40000");
        map.put("sys_platform", "2");
        String str2 = Build.MANUFACTURER;
        p.i(str2, "MANUFACTURER");
        Locale locale = Locale.getDefault();
        p.i(locale, "getDefault(...)");
        String lowerCase = str2.toLowerCase(locale);
        p.i(lowerCase, "toLowerCase(...)");
        map.put("mob_mfr", lowerCase);
        map.put("mobmodel", Build.MODEL);
        map.put("sysrelease", Build.VERSION.RELEASE);
        map.put("device_id", t9.a.a(r.a()));
        map.put("channel_code", e.f(BaseApplication.getInstance()));
        map.put("cur_time", str + "");
        String strR = o0.R();
        p.g(strR);
        map.put("token", strR);
        String strX = e.x(e.y(str + ""));
        p.i(strX, "md5(...)");
        Locale locale2 = Locale.getDefault();
        p.i(locale2, "getDefault(...)");
        String upperCase = strX.toUpperCase(locale2);
        p.i(upperCase, "toUpperCase(...)");
        map.put("sign", upperCase);
        String str3 = this.f42206j;
        if (str3 != null && (webView = this.f42208l) != null) {
            webView.loadUrl(str3, map);
        }
        WebView webView6 = this.f42208l;
        if (webView6 != null) {
            webView6.setWebChromeClient(new b());
        }
    }

    public static final void n(WebActivity webActivity, View view) {
        webActivity.finish();
    }

    public final void m() {
        this.f42208l = (WebView) findViewById(R.id.webView);
        this.f42209m = (ProgressBar) findViewById(R.id.progressBar1);
        ((ImageView) findViewById(R.id.web_left)).setOnClickListener(new View.OnClickListener() { // from class: ra.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebActivity.n(this.f66720b, view);
            }
        });
        this.f42210n = (TextView) findViewById(R.id.web_title);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
        setContentView(R.layout.activity_web, false);
        m();
        Intent intent = getIntent();
        p.i(intent, "getIntent(...)");
        initData(intent);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        WebSettings settings;
        super.onDestroy();
        WebView webView = this.f42208l;
        if (webView != null) {
            if (webView != null) {
                webView.setWebChromeClient(null);
            }
            WebView webView2 = this.f42208l;
            if (webView2 != null && (settings = webView2.getSettings()) != null) {
                settings.setJavaScriptEnabled(false);
            }
            WebView webView3 = this.f42208l;
            if (webView3 != null) {
                webView3.clearCache(true);
            }
            this.f42208l = null;
        }
    }
}
