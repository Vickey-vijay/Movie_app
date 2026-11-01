package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes5.dex */
public class DomainMBCommonActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32523a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BrowserView.e f32524b = new a();
    public BrowserView browserView;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f32525c;

    public class a implements BrowserView.e {
        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
        }

        public a() {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageFinished(WebView webView, String str) {
            q0.b("MBCommonActivity", "onPageFinished  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.b("MBCommonActivity", "onPageStarted  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q0.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (u0.a.b(str) && u0.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44969o);
        p10.startActivityForResult(p11, p12);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44969o, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th2) {
            q0.b("MBCommonActivity", th2.getMessage());
        }
        if (c.n().d() == null) {
            c.n().b(getApplicationContext());
        }
        c.n().a(this);
        a();
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.f32523a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.f32525c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
        if (b.f35466a.containsKey(this.f32523a)) {
            BrowserView browserView = b.f35466a.get(this.f32523a);
            this.browserView = browserView;
            if (browserView != null) {
                browserView.setListener(this.f32524b);
            }
        } else {
            BrowserView browserView2 = new BrowserView(this, this.f32525c);
            this.browserView = browserView2;
            browserView2.setListener(this.f32524b);
            this.browserView.loadUrl(this.f32523a);
        }
        BrowserView browserView3 = this.browserView;
        if (browserView3 != null) {
            f1.a(browserView3);
            setContentView(this.browserView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        Intent uri;
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri2 = Uri.parse(str);
            if (uri2.getScheme().equals("http") || uri2.getScheme().equals("https")) {
                return false;
            }
            if (uri2.getScheme().equals("intent") || uri2.getScheme().equals("android-app")) {
                String stringExtra = null;
                if (uri2.getScheme().equals("intent")) {
                    uri = Intent.parseUri(str, 1);
                } else {
                    uri = uri2.getScheme().equals("android-app") ? Intent.parseUri(str, 2) : null;
                }
                if (uri != null) {
                    uri.setComponent(null);
                    uri.setSelector(null);
                }
                if (uri == null) {
                    str2 = "";
                } else {
                    try {
                        str2 = uri.getPackage();
                    } catch (Throwable th2) {
                        q0.b("MBCommonActivity", th2.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    if (uri != null) {
                        uri.setFlags(268435456);
                    }
                    safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, uri, 0);
                    finish();
                    return true;
                }
                if (uri != null) {
                    try {
                        stringExtra = uri.getStringExtra("browser_fallback_url");
                    } catch (Throwable th3) {
                        q0.b("MBCommonActivity", th3.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    Uri uri3 = Uri.parse(str);
                    if (uri3.getScheme().equals("http") || uri3.getScheme().equals("https")) {
                        MintegralNetworkBridge.webviewLoadUrl(webView, stringExtra);
                        return false;
                    }
                    str = stringExtra;
                }
                q0.b("MBCommonActivity", th.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(this, str)) {
                q0.b("MBCommonActivity", "openDeepLink");
                finish();
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return !(str.startsWith("http") || str.startsWith("https"));
        } catch (Throwable th4) {
            q0.b("MBCommonActivity", th4.getMessage());
            return false;
        }
    }
}
