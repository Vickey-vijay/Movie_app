package com.ironsource.sdk.controller;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C3426d4;
import com.ironsource.C3474fg;
import com.ironsource.C3486ga;
import com.ironsource.C3676r4;
import com.ironsource.InterfaceC3493h;
import com.ironsource.Je;
import com.ironsource.P3;
import com.ironsource.S9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes6.dex */
public class OpenUrlActivity extends Activity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30766j = "OpenUrlActivity";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f30767k = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f30768l = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f30770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressBar f30771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RelativeLayout f30773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30774f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f30769a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f30775g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30776h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f30777i = new b();

    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.f30775g.removeCallbacks(openUrlActivity.f30777i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.f30775g.postDelayed(openUrlActivity2.f30777i, 500L);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f30776h));
        }
    }

    public class c extends WebViewClient {
        private c() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44960f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44960f, webView, str);
            safedk_OpenUrlActivity$c_onPageFinished_9fad83dd06a646b10fca49eceda7481c(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44960f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44960f, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df = safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44960f, webView, str, zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df);
            return zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            com.ironsource.sdk.utils.Logger.e(OpenUrlActivity.f30766j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public boolean safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df(WebView p10, String p11) {
            if (!new Je(p11, C3486ga.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(p10, p11);
            }
            try {
                C3474fg.a(OpenUrlActivity.this, p11);
                OpenUrlActivity.this.f30770b.z();
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                StringBuilder sb2 = new StringBuilder();
                if (e10 instanceof ActivityNotFoundException) {
                    sb2.append("no activity to handle url");
                } else {
                    sb2.append("activity failed to open with unspecified reason");
                }
                v vVar = OpenUrlActivity.this.f30770b;
                if (vVar != null) {
                    vVar.d(sb2.toString(), p11);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f30771c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            v vVar;
            super.onReceivedError(webView, i10, str, str2);
            try {
                P3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = OpenUrlActivity.this.f30770b) != null) {
                        vVar.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
            }
        }

        public void safedk_OpenUrlActivity$c_onPageFinished_9fad83dd06a646b10fca49eceda7481c(WebView p10, String p11) {
            super.onPageFinished(p10, p11);
            OpenUrlActivity.this.f30771c.setVisibility(4);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3493h f30787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f30788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f30789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f30790d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f30791e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f30792f = false;

        public e a(int i10) {
            this.f30788b = i10;
            return this;
        }

        public e a(String str) {
            this.f30789c = str;
            return this;
        }

        public e b(boolean z10) {
            this.f30790d = z10;
            return this;
        }

        public e c(boolean z10) {
            this.f30791e = z10;
            return this;
        }

        public e(InterfaceC3493h interfaceC3493h) {
            this.f30787a = interfaceC3493h;
        }

        public e a(boolean z10) {
            this.f30792f = z10;
            return this;
        }

        public Intent a(Context context) {
            Intent intentA = this.f30787a.a(context);
            intentA.putExtra(d.f30782b, this.f30789c);
            intentA.putExtra(d.f30783c, this.f30790d);
            intentA.putExtra(d.f30781a, this.f30791e);
            intentA.putExtra("immersive", this.f30792f);
            if (!(context instanceof Activity)) {
                intentA.setFlags(this.f30788b);
            }
            return intentA;
        }
    }

    private void a() {
        if (this.f30771c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f30771c = progressBar;
            progressBar.setId(f30768l);
        }
        if (findViewById(f30768l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f30771c.setLayoutParams(layoutParams);
            this.f30771c.setVisibility(4);
            this.f30773e.addView(this.f30771c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        if (this.f30769a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f30769a = webView;
            webView.setId(f30767k);
            this.f30769a.getSettings().setJavaScriptEnabled(true);
            this.f30769a.setWebViewClient(new c());
            loadUrl(this.f30774f);
        }
        if (findViewById(f30767k) == null) {
            this.f30773e.addView(this.f30769a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.f30770b;
        if (vVar != null) {
            vVar.b(true, C3426d4.i.Y);
        }
    }

    private void c() {
        WebView webView = this.f30769a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44960f, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(f30766j, "onCreate()");
        try {
            this.f30770b = (v) S9.b((Context) this).a().k();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f30774f = extras.getString(d.f30782b);
            this.f30772d = extras.getBoolean(d.f30783c);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f30776h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f30777i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f30773e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f30781a = "is_store";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f30782b = "external_url";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f30783c = "secondary_web_view";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f30784d = "immersive";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f30785e = "no activity to handle url";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f30786f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.f30770b;
        if (vVar != null) {
            vVar.b(false, C3426d4.i.Y);
            if (this.f30773e == null || (viewGroup = (ViewGroup) this.f30769a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f30767k) != null) {
                viewGroup.removeView(this.f30769a);
            }
            if (viewGroup.findViewById(f30768l) != null) {
                viewGroup.removeView(this.f30771c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.f30772d && (vVar = this.f30770b) != null) {
            vVar.c(C3426d4.i.f28546j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f30769a.stopLoading();
        this.f30769a.clearHistory();
        try {
            IronSourceNetworkBridge.webviewLoadUrl(this.f30769a, str);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            com.ironsource.sdk.utils.Logger.e(f30766j, "OpenUrlActivity:: loadUrl: " + th2.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f30769a.canGoBack()) {
            this.f30769a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f30776h && (i10 == 25 || i10 == 24)) {
            this.f30775g.postDelayed(this.f30777i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f30776h && z10) {
            runOnUiThread(this.f30777i);
        }
    }
}
