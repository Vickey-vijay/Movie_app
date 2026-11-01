package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f8537a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f8541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f8542f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f8538b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f8539c = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f8543g = new AtomicBoolean();

    public static void a(final com.applovin.impl.sdk.k kVar) {
        if (f8539c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sc
            @Override // java.lang.Runnable
            public final void run() {
                n8.d(kVar);
            }
        });
    }

    public static String b() {
        return f8542f;
    }

    public static String c() {
        return f8541e;
    }

    public static int d() {
        return f8540d;
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f8538b) {
            zIsValidString = StringUtils.isValidString((String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o()));
        }
        return zIsValidString;
    }

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null && ((Boolean) kVar.a(x4.f9905d4)).booleanValue() && e()) {
            f8537a = (String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o());
        } else {
            f8537a = "";
            a5.b(z4.M, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f8543g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            f8540d = packageInfoC.versionCode;
            f8541e = packageInfoC.versionName;
            f8542f = packageInfoC.packageName;
        } else {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.o().getPackageManager();
        if (o0.g()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = kVar.c(x4.f10002o4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (f8538b) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                if (!TextUtils.isEmpty(defaultUserAgent)) {
                    f8537a = defaultUserAgent;
                    a5.b(z4.M, f8537a, com.applovin.impl.sdk.k.o());
                } else {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                    }
                    kVar.D().a(d2.f7196b1, "collectedInvalidUserAgent");
                }
            }
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            kVar.D().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    public static String a() {
        String str;
        synchronized (f8538b) {
            str = f8537a;
        }
        return str;
    }
}
