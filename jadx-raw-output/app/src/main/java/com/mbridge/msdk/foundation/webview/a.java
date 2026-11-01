package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.h;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;

/* JADX INFO: compiled from: BackPointBrowserViewListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements BrowserView.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f35443o = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35444a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BaseTrackingListener f35448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BrowserView f35449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f35450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.a f35451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f35452i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JumpLoaderResult f35454k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f35457n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35445b = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35455l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f35456m = new RunnableC0336a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f35453j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    public class RunnableC0336a implements Runnable {
        public RunnableC0336a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b(a.f35443o, "webview js！超时上限：" + a.this.f35444a + "ms");
            if (a.this.f35451h != null && a.this.f35454k != null) {
                a.this.f35454k.setSuccess(false);
                a.this.f35454k.setUrl(a.this.f35446c);
                a.this.f35454k.setType(2);
                a.this.f35454k.setExceptionMsg("linktype 8 time out");
                a.this.f35451h.a(a.this.f35454k, a.this.f35450g, 1, false);
            }
            a aVar = a.this;
            if (aVar.b(null, aVar.f35446c) && !a.this.f35455l) {
                a.this.f35455l = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f35452i, a.this.f35446c, a.this.f35450g);
            }
            if (a.this.f35448e != null) {
                a.this.f35448e.onFinishRedirection(a.this.f35450g, a.this.f35446c);
            }
        }
    }

    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35459a;

        public b(String str) {
            this.f35459a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f35451h != null && a.this.f35454k != null) {
                a.this.f35454k.setSuccess(true);
                a.this.f35454k.setUrl(this.f35459a);
                a.this.f35454k.setType(2);
                a.this.f35451h.a(a.this.f35454k, a.this.f35450g, 1, true);
            }
            if (a.this.f35448e != null) {
                a.this.f35448e.onFinishRedirection(a.this.f35450g, this.f35459a);
            }
        }
    }

    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35461a;

        public c(String str) {
            this.f35461a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f35448e != null) {
                a.this.f35448e.onFinishRedirection(a.this.f35450g, this.f35461a);
            }
            if (a.this.f35451h == null || a.this.f35454k == null) {
                return;
            }
            a.this.f35454k.setSuccess(true);
            a.this.f35454k.setUrl(this.f35461a);
            a.this.f35454k.setType(2);
            a.this.f35451h.a(a.this.f35454k, a.this.f35450g, 1, true);
        }
    }

    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35464b;

        public d(String str, String str2) {
            this.f35463a = str;
            this.f35464b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f35448e != null) {
                a.this.f35448e.onFinishRedirection(a.this.f35450g, this.f35463a);
            }
            if (a.this.f35451h == null || a.this.f35454k == null) {
                return;
            }
            a.this.f35454k.setSuccess(false);
            a.this.f35454k.setUrl(this.f35463a);
            a.this.f35454k.setType(2);
            a.this.f35454k.setExceptionMsg(this.f35464b);
            a.this.f35451h.a(a.this.f35454k, a.this.f35450g, 1, true);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44969o);
        p10.startActivity(p11);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a() {
    }

    private boolean c(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (uri.getScheme().equals("http") || uri.getScheme().equals("https")) {
                return false;
            }
            if (uri.getScheme().equals("intent")) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    String str2 = uri2.getPackage();
                    if (!TextUtils.isEmpty(str2) && this.f35452i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                        uri2.setFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f35452i, uri2);
                        this.f35455l = true;
                        return true;
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (uri3.getScheme().equals("http") || uri3.getScheme().equals("https")) {
                                MintegralNetworkBridge.webviewLoadUrl(webView, stringExtra);
                                return false;
                            }
                            str = stringExtra;
                        }
                    } catch (Throwable th2) {
                        q0.b(f35443o, th2.getMessage());
                    }
                } catch (Throwable th3) {
                    q0.b(f35443o, th3.getMessage());
                }
                q0.b(f35443o, th.getMessage());
                return false;
            }
            if (!com.mbridge.msdk.click.c.d(this.f35452i, str)) {
                return false;
            }
            q0.b(f35443o, "openDeepLink");
            this.f35455l = true;
            return true;
        } catch (Throwable th4) {
            q0.b(f35443o, th4.getMessage());
            return false;
        }
    }

    private void d() {
        this.f35453j.postDelayed(this.f35456m, this.f35444a);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageFinished(WebView webView, String str) {
        q0.b(f35443o, "onPageFinished1  " + str);
        if (this.f35445b) {
            this.f35457n = 0L;
            this.f35445b = false;
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if (!(uri.getScheme().equals("http") || uri.getScheme().equals("https")) || this.f35455l) {
                return;
            }
            this.f35455l = true;
            a(this.f35452i, str, this.f35450g);
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f35457n == 0) {
            this.f35457n = System.currentTimeMillis();
            if (!this.f35447d) {
                this.f35447d = true;
                d();
            }
            this.f35455l = false;
        }
        this.f35446c = str;
        this.f35445b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        q0.d(f35443o, str);
        c();
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(str2, str));
        if (!b(webView, str2) || this.f35455l) {
            return;
        }
        this.f35455l = true;
        a(this.f35452i, str2, this.f35450g);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        q0.b(f35443o, "shouldOverrideUrlLoading1  " + str);
        this.f35445b = false;
        if (u0.a.b(str) && u0.a.a(this.f35452i, str, null)) {
            this.f35455l = true;
        }
        boolean zC = c(webView, str);
        if (zC) {
            this.f35457n = 0L;
            this.f35445b = false;
            c();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new b(str));
        }
        return zC;
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f35444a = 10000;
        this.f35454k = null;
        this.f35452i = context;
        this.f35450g = campaignEx;
        this.f35449f = browserView;
        this.f35448e = baseTrackingListener;
        com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        gVarD = gVarD == null ? h.b().a() : gVarD;
        this.f35451h = aVar;
        this.f35454k = new JumpLoaderResult();
        this.f35444a = (int) gVarD.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            if (uri.getScheme().equals("http") || uri.getScheme().equals("https")) {
                return true;
            }
            if (uri.getScheme().equals("intent")) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    String str2 = uri2.getPackage();
                    if (!TextUtils.isEmpty(str2) && this.f35452i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                        return false;
                    }
                } catch (Throwable th2) {
                    q0.b(f35443o, th2.getMessage());
                }
                try {
                    String stringExtra = uri2.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (uri3.getScheme().equals("http") || uri3.getScheme().equals("https")) {
                            return true;
                        }
                        str = stringExtra;
                    }
                } catch (Throwable th3) {
                    q0.b(f35443o, th3.getMessage());
                }
            }
            if (!com.mbridge.msdk.click.c.d(this.f35452i, str)) {
                return true;
            }
            q0.b(f35443o, "openDeepLink");
            return false;
        } catch (Throwable th4) {
            q0.b(f35443o, th4.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str) {
        if (this.f35457n == 0) {
            this.f35457n = System.currentTimeMillis();
            if (!this.f35447d) {
                this.f35447d = true;
                d();
            }
        }
        this.f35446c = str;
        this.f35445b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i10 = MBCommonActivity.f32534e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.webview.b.f35466a.put(str, this.f35449f);
            if (u0.a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            q0.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Exception unused) {
            u0.a(context, str, this.f35448e, campaignEx, new ArrayList());
        }
    }

    private void c() {
        this.f35453j.removeCallbacks(this.f35456m);
    }
}
