package com.unity3d.services.core.webview.bridge;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import ck.i;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import lk.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: WebViewBridgeInterface.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class WebViewBridgeInterface {
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final IWebViewBridge webViewBridge;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewBridgeInterface() {
        this(null);
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>()V");
        CreativeInfoManager.onWebviewInterfaceConstruction(g.f44967m, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private WebViewBridgeInterface(StatsEvent statsEvent) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>()V");
        if ("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>()V" == 0) {
        } else {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker) {
        this(iWebViewBridge, iInvocationCallbackInvoker, null);
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;)V");
        CreativeInfoManager.onWebviewInterfaceConstruction(g.f44967m, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i10, i iVar) {
        this(iWebViewBridge, iInvocationCallbackInvoker, i10, iVar, null);
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;ILck/i;)V");
        CreativeInfoManager.onWebviewInterfaceConstruction(g.f44967m, this);
    }

    private WebViewBridgeInterface(IWebViewBridge p10, IInvocationCallbackInvoker p11, StatsEvent p12) {
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;)V");
        if ("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;)V" == 0) {
            p.j(p10, "webViewBridge");
            p.j(p11, "webViewAppInvocationCallbackInvoker");
        } else {
            p.j(p10, "webViewBridge");
            p.j(p11, "webViewAppInvocationCallbackInvoker");
            this.webViewBridge = p10;
            this.webViewAppInvocationCallbackInvoker = p11;
        }
    }

    @JavascriptInterface
    public final void handleInvocation(String str) throws JSONException {
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;->handleInvocation(Ljava/lang/String;)V");
        CreativeInfoManager.onHandleInvocation(g.f44967m, this, str);
        safedk_WebViewBridgeInterface_handleInvocation_b28daaa65b43c0e84aea26fd798d0398(str);
    }

    @JavascriptInterface
    public final void handleCallback(String str, String str2, String str3) throws Exception {
        p.j(str, "callbackId");
        p.j(str2, "callbackStatus");
        p.j(str3, "rawParameters");
        DeviceLog.debug("handleCallback " + str + ' ' + str2 + ' ' + str3);
        this.webViewBridge.handleCallback(str, str2, JSONArrayExtensionsKt.toTypedArray(new JSONArray(str3)));
    }

    @JavascriptInterface
    public void safedk_WebViewBridgeInterface_handleInvocation_b28daaa65b43c0e84aea26fd798d0398(String p10) throws JSONException {
        p.j(p10, "data");
        DeviceLog.debug("handleInvocation " + p10);
        JSONArray jSONArray = new JSONArray(p10);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            p.h(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            p.h(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            p.h(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            p.h(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            p.h(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    public final void onHandleCallback(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z10, JavaScriptReplyProxy javaScriptReplyProxy) throws Exception {
        boolean z11;
        p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(webMessageCompat, "message");
        p.j(uri, "sourceOrigin");
        p.j(javaScriptReplyProxy, "replyProxy");
        String data = webMessageCompat.getData();
        if (z10) {
            if (data != null && !a0.n0(data)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                JSONObject jSONObject = new JSONObject(data);
                String string = jSONObject.getString("id");
                String string2 = jSONObject.getString("status");
                String string3 = jSONObject.getString("parameters");
                p.i(string, "callbackId");
                p.i(string2, "callbackStatus");
                p.i(string3, "rawParameters");
                handleCallback(string, string2, string3);
            }
        }
    }

    public final void onHandleInvocation(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z10, JavaScriptReplyProxy javaScriptReplyProxy) throws JSONException {
        boolean z11;
        p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(webMessageCompat, "message");
        p.j(uri, "sourceOrigin");
        p.j(javaScriptReplyProxy, "replyProxy");
        String data = webMessageCompat.getData();
        if (z10) {
            if (data != null && !a0.n0(data)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                handleInvocation(data);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private WebViewBridgeInterface(IWebViewBridge p10, IInvocationCallbackInvoker p11, int p12, i p13, StatsEvent p14) {
        Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;ILck/i;)V");
        if ("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;-><init>(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;ILck/i;)V" != 0) {
            this((p12 & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : p10, (p12 & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : p11);
            return;
        }
        int i10 = p12 & 1;
        IWebViewBridge p15 = SharedInstances.INSTANCE.getWebViewBridge();
        int i11 = p12 & 2;
        IInvocationCallbackInvoker p16 = SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker();
        this(p15, p16);
    }
}
