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

/* JADX INFO: compiled from: MintegralSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class MintegralNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            String string = targetInstance.getURL().toString();
            Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : " + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME =  " + g.f44969o);
            Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
            InputStream inputStream = null;
            try {
                inputStream = targetInstance.getInputStream();
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : " + th2.getMessage());
            }
            InputStream inputStreamA = CreativeInfoManager.a(g.f44969o, string, inputStream, headerFields);
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
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return targetInstance.getOutputStream();
        }
        OutputStream outputStream = targetInstance.getOutputStream();
        String string = targetInstance.getURL().toString();
        Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=" + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f44969o);
        return CreativeInfoManager.a(g.f44969o, string, outputStream);
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o() && responseCode >= 200 && responseCode < 300) {
            String string = targetInstance.getURL().toString();
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode url=" + string + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f44969o);
            CreativeInfoManager.a(g.f44969o, string, targetInstance.getInputStream(), targetInstance.getHeaderFields());
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
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

    public static void webviewLoadUrl(WebView targetInstance, String url, Map<String, String> additionalHttpHeaders) {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl. url: " + url + ", WebView address : " + targetInstance.toString() + "  SDK_PACKAGE_NAME = " + g.f44969o);
            NetworkBridge.logWebviewLoadURLRequest(g.f44969o, targetInstance, url);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f44969o);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(url, (String) null, targetInstance, g.f44969o);
            }
            SafeDKWebAppInterface.a(g.f44969o, targetInstance, url);
        }
        targetInstance.loadUrl(url, additionalHttpHeaders);
    }

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + url + ", WebView address : " + targetInstance.toString() + "  SDK_PACKAGE_NAME = " + g.f44969o);
            NetworkBridge.logWebviewLoadURLRequest(g.f44969o, targetInstance, url);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f44969o);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(url, (String) null, targetInstance, g.f44969o);
            }
            SafeDKWebAppInterface.a(g.f44969o, targetInstance, url);
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        Logger.d("MintegralNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MintegralNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: " + baseUrl + ", WebView address : " + targetInstance.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f44969o);
            CreativeInfoManager.a(baseUrl, data, targetInstance, g.f44969o);
            SafeDKWebAppInterface.a(g.f44969o, targetInstance, data);
        }
        targetInstance.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
    }
}
