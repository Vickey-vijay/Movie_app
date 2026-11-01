package com.safedk.android.internal.partials;

import android.webkit.WebView;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class NetworkBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConcurrentHashMap<HttpURLConnection, f> f44870a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, RequestInfo> f44871b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44872c = "SafeDKNetwork";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44873d = "";

    public static class RequestInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f44877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f44878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f44879c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ByteArrayOutputStream f44880d = new ByteArrayOutputStream();

        public RequestInfo(String sdkPackageName, String url) {
            this.f44877a = null;
            this.f44878b = null;
            this.f44877a = sdkPackageName;
            this.f44878b = url;
        }

        public String a() {
            return this.f44877a;
        }

        public String b() {
            return this.f44878b;
        }

        public String c() {
            if (this.f44879c == null) {
                this.f44879c = this.f44880d.toString();
            }
            return this.f44879c;
        }

        public void a(byte[] bArr, long j10) {
            this.f44880d.write(bArr, 0, (int) j10);
        }

        public String toString() {
            return "Info{" + this.f44877a + Z7.f27998r + this.f44878b + h.f44172e;
        }

        public void a(String str) {
            this.f44878b = str;
        }
    }

    public static void disposeOfConnectionToStreamMapping(HttpURLConnection connection) {
        try {
            f44870a.remove(connection);
        } catch (Throwable th2) {
            Logger.e(f44872c, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public static void logWebviewLoadURLRequest(final String sdk, final WebView webview, final String url) {
        Logger.d("logWebviewLoadURLRequest webview", "loadUrl " + webview.getId() + ", webview class name=" + webview.getClass().getCanonicalName() + ", WebView address : " + webview.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = ");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            if (k.c()) {
                Executors.newScheduledThreadPool(1).execute(new Runnable() { // from class: com.safedk.android.internal.partials.NetworkBridge.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkBridge.b(sdk, webview, url);
                    }
                });
            } else {
                b(sdk, webview, url);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebView webView, String str2) {
        try {
            Logger.d("logWebviewLoadURLRequestImpl webview", "loadUrl " + webView.getId() + ", webview class name=" + webView.getClass().getCanonicalName() + ", WebView address : " + webView.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = ");
            Logger.d(f44872c, "logWebviewLoadURLRequest: " + str2);
            if (str2 != null) {
                BrandSafetyUtils.a(str, str2, webView);
            }
        } catch (Throwable th2) {
            Logger.e(f44872c, "caught exception", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public static Object invokeMethod(String className, String methodName, Object targetInstance, Class[] parametersTypes, Object[] paramaterValues) throws IOException {
        try {
            Method declaredMethod = Class.forName(className).getDeclaredMethod(methodName, parametersTypes);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(targetInstance, paramaterValues);
        } catch (ClassNotFoundException e10) {
            throw new IOException("Network access denied", e10.getCause());
        } catch (IllegalAccessException e11) {
            throw new IOException("Network access denied", e11.getCause());
        } catch (NoSuchMethodException e12) {
            throw new IOException("Network access denied", e12.getCause());
        } catch (InvocationTargetException e13) {
            throw new IOException("Network access denied", e13.getCause());
        } catch (Throwable th2) {
            new CrashReporter().caughtException(th2);
            throw new IOException("error occurred while trying to access network");
        }
    }
}
