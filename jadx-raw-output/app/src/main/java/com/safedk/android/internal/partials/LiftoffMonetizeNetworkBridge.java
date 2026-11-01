package com.safedk.android.internal.partials;

import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: compiled from: LiftoffMonetizeSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class LiftoffMonetizeNetworkBridge {
    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + url + ", WebView address : " + targetInstance.toString() + "  SDK_PACKAGE_NAME = " + g.f44958d);
            NetworkBridge.logWebviewLoadURLRequest(g.f44958d, targetInstance, url);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(g.f44958d);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                CreativeInfoManager.a(url, (String) null, targetInstance, g.f44958d);
            }
            SafeDKWebAppInterface.a(g.f44958d, targetInstance, url);
        }
        targetInstance.loadUrl(url);
    }

    public static Response okhttp3CallExecute(Call targetInstance) throws IOException {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3CallExecute(Lokhttp3/Call;)Lokhttp3/Response;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                Request request = targetInstance.request();
                int iIdentityHashCode = System.identityHashCode(request);
                String string = request.url().toString();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f44871b.get(Integer.valueOf(iIdentityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(g.f44958d, string);
                } else {
                    requestInfo.a(string);
                }
                NetworkBridge.f44871b.put(Integer.valueOf(iIdentityHashCode), requestInfo);
                Logger.d("SafeDKNetwork", "retrofitCall_execute request id:" + iIdentityHashCode + ", RequestInfo:" + requestInfo + ", isOnUiThread = " + k.c());
            } catch (Throwable th2) {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3 okhttp3.Call execute error " + th2.getMessage());
            }
        }
        return targetInstance.execute();
    }

    public static void okhttp3CallEnqueue(Call targetInstance, Callback responseCallback) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3CallEnqueue(Lokhttp3/Call;Lokhttp3/Callback;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                Request request = targetInstance.request();
                int iIdentityHashCode = System.identityHashCode(request);
                String string = request.url().toString();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f44871b.get(Integer.valueOf(iIdentityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(g.f44958d, string);
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
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
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
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
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
