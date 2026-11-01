package com.safedk.android.internal.partials;

import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AppLovinSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            String string = targetInstance.getURL().toString();
            Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : " + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME =  " + g.f44955a);
            Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
            InputStream inputStream = null;
            try {
                inputStream = targetInstance.getInputStream();
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : " + th2.getMessage());
            }
            InputStream inputStreamA = CreativeInfoManager.a(g.f44955a, string, inputStream, headerFields);
            if ((targetInstance instanceof HttpURLConnection) && (inputStreamA instanceof f)) {
                Logger.d("SafeDKNetwork", "following HttpURLConnection:" + targetInstance + " and stream: " + inputStreamA);
                f fVar = (f) inputStreamA;
                HttpURLConnection httpURLConnection = (HttpURLConnection) targetInstance;
                NetworkBridge.f44870a.put(httpURLConnection, fVar);
                fVar.a(httpURLConnection);
                return inputStreamA;
            }
            return inputStreamA;
        }
        return targetInstance.getInputStream();
    }

    public static OutputStream urlConnectionGetOutputStream(URLConnection targetInstance) throws IOException {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return targetInstance.getOutputStream();
        }
        OutputStream outputStream = targetInstance.getOutputStream();
        String string = targetInstance.getURL().toString();
        Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=" + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f44955a);
        return CreativeInfoManager.a(g.f44955a, string, outputStream);
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o() && responseCode >= 200 && responseCode < 300) {
            String string = targetInstance.getURL().toString();
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode url=" + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f44955a);
            CreativeInfoManager.a(g.f44955a, string, targetInstance.getInputStream(), targetInstance.getHeaderFields());
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                Logger.d("SafeDKNetwork", "httpUrlConnectionDisconnect, isOnUiThread = " + k.c());
                f fVarRemove = NetworkBridge.f44870a.remove(targetInstance);
                if (fVarRemove != null) {
                    fVarRemove.a();
                }
            } catch (Throwable th2) {
            }
        }
        targetInstance.disconnect();
    }

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + url + ", WebView address : " + targetInstance.toString() + "  SDK_PACKAGE_NAME = " + g.f44955a);
            NetworkBridge.logWebviewLoadURLRequest(g.f44955a, targetInstance, url);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f44955a);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(url, (String) null, targetInstance, g.f44955a);
            }
            SafeDKWebAppInterface.a(g.f44955a, targetInstance, url);
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: " + baseUrl + ", WebView address : " + targetInstance.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f44955a);
            CreativeInfoManager.a(baseUrl, data, targetInstance, g.f44955a);
            SafeDKWebAppInterface.a(g.f44955a, targetInstance, data);
        }
        targetInstance.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
    }

    public static void webviewLoadData(WebView targetInstance, String data, String mimeType, String encoding) {
        Logger.d("AppLovinNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AppLovinNetworkBridge;->webviewLoadData(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z10 = SafeDK.getInstance() != null && SafeDK.getInstance().o();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : " + targetInstance + ", isSafeDKInitialized = " + z10 + ", SDK_PACKAGE_NAME = " + g.f44955a);
        if (z10) {
            CreativeInfoManager.a((String) null, data, targetInstance, g.f44955a);
            SafeDKWebAppInterface.a(g.f44955a, targetInstance, data);
        }
        targetInstance.loadData(data, mimeType, encoding);
    }
}
