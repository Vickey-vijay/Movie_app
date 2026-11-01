package com.safedk.android.analytics.brandsafety;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.C3426d4;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.net.URI;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public class i implements com.safedk.android.internal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44423a = "ClickUrlsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f44424b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44425c = "https://play.google.com/store/apps/details?id=%s";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f44426d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f44427l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static AtomicBoolean f44428m = new AtomicBoolean();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ScheduledExecutorService f44429n = Executors.newScheduledThreadPool(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f44430e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f44431f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f44432g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f44433h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicBoolean f44435j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AtomicInteger f44436k = new AtomicInteger(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f44434i = new HashSet();

    private i() {
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
    }

    public static i a() {
        i iVar;
        synchronized (f44427l) {
            if (f44426d == null) {
                f44426d = new i();
            }
            iVar = f44426d;
        }
        return iVar;
    }

    public static void a(boolean z10) {
        synchronized (f44427l) {
            Logger.d(f44423a, "setActiveMode to " + z10);
            f44426d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, String str2, String str3, String str4) {
        if (this.f44430e == null && !this.f44434i.contains(str)) {
            Logger.d(f44423a, "logging url: " + str + ", fingerprint: " + str2 + ", sdkUuid: " + str3 + ", impressionId: " + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            this.f44430e = str;
            this.f44431f = str2;
            this.f44432g = str3;
            this.f44433h = str4;
            if (TextUtils.isEmpty(this.f44431f)) {
                this.f44431f = str;
            }
        }
    }

    public static String a(String str) {
        return com.safedk.android.utils.k.w(str) ? com.safedk.android.utils.k.y(str) : b(str);
    }

    public static String b(String str) {
        try {
            URI uri = new URI(URLEncoder.encode(str, "UTF-8"));
            String query = uri.getQuery();
            if (!TextUtils.isEmpty(query)) {
                String str2 = "";
                String[] strArrSplit = query.split(C3426d4.j.f28584c);
                for (String str3 : strArrSplit) {
                    if (!com.safedk.android.utils.f.M().matcher(str3).find()) {
                        if (str2.length() > 0) {
                            str2 = str2 + C3426d4.j.f28584c;
                        }
                        str2 = str2 + str3;
                    }
                }
                return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
            }
            return str;
        } catch (Throwable th2) {
            Logger.w(f44423a, "Unable to clean url: " + th2.getMessage());
            return str;
        }
    }

    public static String c(String str) {
        return String.format(Locale.ENGLISH, f44425c, str);
    }

    public synchronized String b() {
        return this.f44431f;
    }

    @Override // com.safedk.android.internal.a
    public synchronized void g() {
        f44428m.set(true);
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        String str;
        String str2;
        String str3;
        String str4;
        Logger.d(f44423a, "onForeground started");
        f44428m.set(false);
        if (this.f44435j.get()) {
            if (this.f44436k.getAndIncrement() <= 2) {
                synchronized (f44426d) {
                    if (this.f44430e != null) {
                        str4 = this.f44430e;
                        str3 = this.f44431f;
                        String str5 = this.f44432g;
                        str = this.f44433h;
                        str2 = str5;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                        str4 = null;
                    }
                }
                c(str4, str3, str2, str);
            } else {
                Logger.d(f44423a, "Exhausted2 attempts to resolve URL. Clearing the slot.");
                d();
            }
        }
    }

    private void d() {
        synchronized (f44426d) {
            if (this.f44430e != null) {
                String str = this.f44430e;
                this.f44430e = null;
                this.f44431f = null;
                this.f44434i.add(str);
                this.f44435j.set(false);
                this.f44436k.set(0);
            }
        }
    }

    public void a(String str, final String str2, final String str3, final String str4) {
        Logger.d(f44423a, "resolve Url started, url = " + str + ", fingerprint = " + str2 + ", sdkUuid: " + str3 + ", impressionId: " + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str3);
        boolean zA = CreativeInfoManager.a(sdkPackageByPackageUUID, AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, true);
        Logger.d(f44423a, "resolve Url setting shouldDecode is " + zA + " for sdkPackageName " + sdkPackageByPackageUUID);
        String strE = zA ? com.safedk.android.utils.k.E(str) : str;
        if (com.safedk.android.utils.k.w(strE)) {
            a(strE, com.safedk.android.utils.k.x(strE), str2, str3, str4, false);
        } else {
            final String str5 = strE;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.1
                @Override // java.lang.Runnable
                public void run() {
                    if (i.f44428m.get()) {
                        i.this.b(str5, str2, str3, str4);
                        i.this.f44435j.set(true);
                        Logger.d(i.f44423a, "server asked to resolve but currently in background.");
                    } else {
                        Logger.d(i.f44423a, "not currently in background, try to resolve.");
                        i.this.c(str5, str2, str3, str4);
                    }
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3, String str4) {
        Logger.d(f44423a, "resolveUrlInternal starting Url resolution. url = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final WebView webView = new WebView(SafeDK.getInstance().l());
        Runnable runnable = new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2
            @Override // java.lang.Runnable
            public void run() {
                if (atomicBoolean.get()) {
                    Logger.d(i.f44423a, "Url resolved. no timeout.");
                } else {
                    webView.post(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(i.f44423a, "Timeout resolving url");
                            webView.stopLoading();
                        }
                    });
                }
            }
        };
        AtomicLong atomicLong = new AtomicLong(0L);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new AnonymousClass3(str, atomicBoolean, str2, str3, str4));
        atomicLong.set(System.currentTimeMillis());
        webView.loadUrl(str);
        Logger.d(f44423a, "Starting resolution, timeout = " + SafeDK.getInstance().M());
        f44429n.schedule(runnable, SafeDK.getInstance().M(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: com.safedk.android.analytics.brandsafety.i$3, reason: invalid class name */
    class AnonymousClass3 extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AtomicInteger f44446a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f44448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f44449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f44450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f44451f;

        AnonymousClass3(String str, AtomicBoolean atomicBoolean, String str2, String str3, String str4) {
            this.f44447b = str;
            this.f44448c = atomicBoolean;
            this.f44449d = str2;
            this.f44450e = str3;
            this.f44451f = str4;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, final String url, Bitmap favicon) {
            final int iIncrementAndGet = this.f44446a.incrementAndGet();
            Logger.d(i.f44423a, "onPageStarted started. callbackCounter=" + iIncrementAndGet + ", url= " + url);
            if (!url.equals(this.f44447b)) {
                new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass3.this.f44446a.get() == iIncrementAndGet) {
                            Logger.d(i.f44423a, "onPageFinished never called, assuming last onPageStarted is the landing page.");
                            Logger.d(i.f44423a, "Landing page detected: " + url);
                            AnonymousClass3.this.f44448c.set(true);
                            i.this.a(AnonymousClass3.this.f44447b, url, AnonymousClass3.this.f44449d, AnonymousClass3.this.f44450e, AnonymousClass3.this.f44451f, true);
                            return;
                        }
                        Logger.d(i.f44423a, "onPageStarted resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=" + AnonymousClass3.this.f44446a.get() + ", callbackCounter=" + iIncrementAndGet);
                    }
                }, 60000L);
            }
            super.onPageStarted(view, url, favicon);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, final String url) {
            final int iIncrementAndGet = this.f44446a.incrementAndGet();
            Logger.d(i.f44423a, "onPageFinished started. callbackCounter=" + iIncrementAndGet + ", url= " + url);
            new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AnonymousClass3.this.f44446a.get() == iIncrementAndGet) {
                        Logger.d(i.f44423a, "Landing page detected. is original url same as resolved ? " + AnonymousClass3.this.f44447b.equals(url) + " , url " + url);
                        AnonymousClass3.this.f44448c.set(true);
                        i.this.a(AnonymousClass3.this.f44447b, url, AnonymousClass3.this.f44449d, AnonymousClass3.this.f44450e, AnonymousClass3.this.f44451f, true);
                        return;
                    }
                    Logger.d(i.f44423a, "onPageFinished resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=" + AnonymousClass3.this.f44446a.get() + ", callbackCounter=" + iIncrementAndGet);
                }
            }, 5000L);
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
            Logger.d(i.f44423a, "onRenderProcessGone for view = " + view.toString());
            this.f44448c.set(true);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            Logger.d(f44423a, "reportResolvedUrlToServer started. originalUrl=" + str + ", resolvedUrl=" + str2 + ", fingerprint=" + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            d();
            if (z10 && com.safedk.android.utils.k.w(str2)) {
                str2 = com.safedk.android.utils.k.x(a(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putString(k.f44466a, str);
            bundle.putString(k.f44467b, str2);
            bundle.putString(k.f44468c, str3);
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("sdk_uuid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("impression_id", str5);
            }
            bundle.putString("package", SafeDK.getInstance().l().getPackageName());
            g.b(bundle);
        } catch (Throwable th2) {
            Logger.d(f44423a, "Failed to report url resolve to server");
            new CrashReporter().caughtException(th2);
        }
    }
}
