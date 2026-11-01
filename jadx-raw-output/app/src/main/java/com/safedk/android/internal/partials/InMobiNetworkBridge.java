package com.safedk.android.internal.partials;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: compiled from: InMobiSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class InMobiNetworkBridge {
    public static void webviewLoadUrl(WebView targetInstance, String url, Map<String, String> additionalHttpHeaders) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl. url: " + url + ", WebView address : " + targetInstance.toString() + "  SDK_PACKAGE_NAME = " + g.f44963i);
            NetworkBridge.logWebviewLoadURLRequest(g.f44963i, targetInstance, url);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f44963i);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(url, (String) null, targetInstance, g.f44963i);
            }
            SafeDKWebAppInterface.a(g.f44963i, targetInstance, url);
        }
        targetInstance.loadUrl(url, additionalHttpHeaders);
    }

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + url + ", WebView address : " + targetInstance.toString() + "  SDK_PACKAGE_NAME = " + g.f44963i);
            NetworkBridge.logWebviewLoadURLRequest(g.f44963i, targetInstance, url);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f44963i);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(url, (String) null, targetInstance, g.f44963i);
            }
            SafeDKWebAppInterface.a(g.f44963i, targetInstance, url);
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: " + baseUrl + ", WebView address : " + targetInstance.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f44963i);
            CreativeInfoManager.a(baseUrl, data, targetInstance, g.f44963i);
            SafeDKWebAppInterface.a(g.f44963i, targetInstance, data);
        }
        targetInstance.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
    }

    public static void webviewLoadData(WebView targetInstance, String data, String mimeType, String encoding) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->webviewLoadData(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z10 = SafeDK.getInstance() != null && SafeDK.getInstance().o();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : " + targetInstance + ", isSafeDKInitialized = " + z10 + ", SDK_PACKAGE_NAME = " + g.f44963i);
        if (z10) {
            CreativeInfoManager.a((String) null, data, targetInstance, g.f44963i);
            SafeDKWebAppInterface.a(g.f44963i, targetInstance, data);
        }
        targetInstance.loadData(data, mimeType, encoding);
    }

    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public static void onAddedJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->onAddedJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: " + targetInstance + ", SDK_PACKAGE_NAME: " + g.f44963i + " object is: " + object + " and name: " + name);
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f44963i);
        if (adNetworkDiscoveryH != null) {
            adNetworkDiscoveryH.a(targetInstance, object);
        }
        targetInstance.addJavascriptInterface(object, name);
    }

    public static void okhttp3CallEnqueue(Call targetInstance, Callback responseCallback) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->okhttp3CallEnqueue(Lokhttp3/Call;Lokhttp3/Callback;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                Request request = targetInstance.request();
                int iIdentityHashCode = System.identityHashCode(request);
                String string = request.url().toString();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f44871b.get(Integer.valueOf(iIdentityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(g.f44963i, string);
                } else {
                    requestInfo.a(string);
                }
                NetworkBridge.f44871b.put(Integer.valueOf(iIdentityHashCode), requestInfo);
                Logger.d("SafeDKNetwork", "retrofitokhttp3Call_enqueue request id:" + iIdentityHashCode + ", RequestInfo:" + requestInfo + ", isOnUiThread = " + k.c());
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3.Call enqueue error " + th2.getMessage());
            }
        }
        targetInstance.enqueue(responseCallback);
    }

    public static ResponseBody okhttp3Response_body(Response targetInstance) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
        ResponseBody responseBodyBody = targetInstance.body();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                int iIdentityHashCode = System.identityHashCode(targetInstance);
                NetworkBridge.RequestInfo requestInfoRemove = NetworkBridge.f44871b.remove(Integer.valueOf(iIdentityHashCode));
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body response id " + iIdentityHashCode + ", info " + requestInfoRemove + ", isOnUiThread = " + k.c());
                if (requestInfoRemove != null) {
                    int iIdentityHashCode2 = System.identityHashCode(responseBodyBody);
                    NetworkBridge.f44871b.put(Integer.valueOf(iIdentityHashCode2), requestInfoRemove);
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, removing response Id:" + iIdentityHashCode + ", adding  responseBodyId:" + iIdentityHashCode2 + ", RequestInfo:" + requestInfoRemove);
                } else {
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, skipping response Id:" + iIdentityHashCode);
                }
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body error " + th2.getMessage());
            }
        }
        return responseBodyBody;
    }

    public static BufferedSource retrofitExceptionCatchingRequestBody_source(ResponseBody targetInstance) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/InMobiNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
        BufferedSource bufferedSourceSource = targetInstance.source();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                int iIdentityHashCode = System.identityHashCode(targetInstance);
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source bodyId " + iIdentityHashCode + " retroReq " + NetworkBridge.f44871b + ", isOnUiThread = " + k.c());
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f44871b.get(Integer.valueOf(iIdentityHashCode));
                if (requestInfo != null) {
                    bufferedSourceSource = CreativeInfoManager.a(requestInfo.a(), requestInfo.b(), bufferedSourceSource, iIdentityHashCode);
                    Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source found responseBodyId:" + iIdentityHashCode + ", RequestInfo:" + requestInfo + ", returning Source: " + bufferedSourceSource);
                }
                return bufferedSourceSource;
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source error " + th2.getMessage());
                return bufferedSourceSource;
            }
        }
        return bufferedSourceSource;
    }
}
