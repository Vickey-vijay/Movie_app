package com.unity3d.services.core.webview;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.UnityCoreNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridge;
import com.vungle.ads.internal.model.AdPayload;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewApp implements IWebViewBridgeInvoker {
    private static final int INVOKE_JS_CHARS_LENGTH = 22;
    private static ConditionVariable _conditionVariable;
    private static WebViewApp _currentApp;
    private Configuration _configuration;
    private final HashMap<String, NativeCallback> _nativeCallbacks;
    private boolean _webAppLoaded;
    private WebView _webView;
    public final IWebViewBridge _webViewBridge;
    private static final AtomicReference<Boolean> _initialized = new AtomicReference<>(Boolean.FALSE);
    private static final AtomicReference<String> _webAppFailureMessage = new AtomicReference<>();
    private static final AtomicReference<Integer> _webAppFailureCode = new AtomicReference<>();

    public static class WebAppClient extends WebViewClient {
        private WebAppClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(android.webkit.WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(g.f44967m, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) {
            Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/WebViewApp$WebAppClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(g.f44967m, webView, str);
            safedk_WebViewApp$WebAppClient_onPageFinished_04e34a27a27fb7594f0b675e3426abd6(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44967m, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(g.f44967m, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
            Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/WebViewApp$WebAppClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001 = safedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44967m, webView, str, zSafedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001);
            return zSafedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.1
                @Override // java.lang.Runnable
                public void run() {
                    if (AdUnit.getAdUnitActivity() != null) {
                        AdUnit.getAdUnitActivity().finish();
                    }
                    if (WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
                        ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
                    }
                    InitializeThread.reset();
                }
            });
            DeviceLog.error("UnityAds SDK WebView render process gone with following reason : " + renderProcessGoneDetail.toString());
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_render_process_gone", null, new HashMap<String, String>(renderProcessGoneDetail) { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.2
                public final /* synthetic */ RenderProcessGoneDetail val$detail;

                {
                    this.val$detail = renderProcessGoneDetail;
                    if (Build.VERSION.SDK_INT >= 26) {
                        put("dc", "" + renderProcessGoneDetail.didCrash());
                        put("pae", "" + renderProcessGoneDetail.rendererPriorityAtExit());
                    }
                }
            });
            return true;
        }

        public boolean safedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001(android.webkit.WebView p10, String p11) {
            DeviceLog.debug("Unity Ads SDK attempts to load URL inside WebView: " + p11);
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest != null && webResourceError != null) {
                DeviceLog.error("Unity Ads SDK encountered an error (code: " + webResourceError.getErrorCode() + ")  in WebView while loading a resource " + webResourceRequest.getUrl());
                return;
            }
            if (webResourceRequest != null) {
                DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource " + webResourceRequest.getUrl());
                return;
            }
            DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource");
        }

        public void safedk_WebViewApp$WebAppClient_onPageFinished_04e34a27a27fb7594f0b675e3426abd6(android.webkit.WebView p10, String p11) {
            super.onPageFinished(p10, p11);
            DeviceLog.debug("Unity Ads SDK finished loading URL inside WebView: " + p11);
        }
    }

    public static ErrorState create(Configuration configuration) throws IllegalThreadStateException {
        return create(configuration, false);
    }

    public void resetWebViewAppInitialization() {
        this._webAppLoaded = false;
        _webAppFailureCode.set(-1);
        _webAppFailureMessage.set("");
        _initialized.set(Boolean.FALSE);
    }

    private WebViewApp(Configuration configuration, boolean z10, boolean z11) {
        this(configuration, z10, z11, SharedInstances.INSTANCE.getWebViewBridge());
    }

    public static ErrorState create(final Configuration configuration, boolean z10) throws IllegalThreadStateException {
        DeviceLog.entered();
        if (z10) {
            return createWithRemoteUrl(configuration);
        }
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Configuration configuration2 = configuration;
                    WebViewApp webViewApp = new WebViewApp(configuration2, configuration2.getExperiments().isWebAssetAdCaching(), configuration.getExperiments().isWebGestureNotRequired());
                    UnityCoreNetworkBridge.webviewLoadDataWithBaseURL(webViewApp.getWebView(), new WebViewUrlBuilder(AdPayload.FILE_SCHEME + SdkProperties.getLocalWebViewFile(), configuration).getUrlWithQueryString(), configuration.getWebViewData(), "text/html", "UTF-8", null);
                    WebViewApp.setCurrentApp(webViewApp);
                } catch (Exception e10) {
                    DeviceLog.error("Unity Ads SDK unable to create WebViewApp " + e10.getMessage());
                    WebViewApp._conditionVariable.open();
                }
            }
        });
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z11 = getCurrentApp() != null;
        if (zBlock && z11 && (z11 && getCurrentApp().isWebAppInitialized())) {
            return null;
        }
        if (zBlock) {
            return getCurrentApp() == null ? ErrorState.CreateWebview : getCurrentApp().getErrorStateFromWebAppCode();
        }
        return ErrorState.CreateWebviewTimeout;
    }

    public static WebViewApp getCurrentApp() {
        return _currentApp;
    }

    public static void setCurrentApp(WebViewApp webViewApp) {
        _currentApp = webViewApp;
    }

    public void addCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.put(nativeCallback.getId(), nativeCallback);
        }
    }

    public NativeCallback getCallback(String str) {
        NativeCallback nativeCallback;
        synchronized (this._nativeCallbacks) {
            nativeCallback = this._nativeCallbacks.get(str);
        }
        return nativeCallback;
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public int getWebAppFailureCode() {
        return _webAppFailureCode.get().intValue();
    }

    public String getWebAppFailureMessage() {
        return _webAppFailureMessage.get();
    }

    public WebView getWebView() {
        return this._webView;
    }

    public boolean isWebAppInitialized() {
        return _initialized.get().booleanValue();
    }

    public boolean isWebAppLoaded() {
        return this._webAppLoaded;
    }

    public void removeCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.remove(nativeCallback.getId());
        }
    }

    public void setConfiguration(Configuration configuration) {
        this._configuration = configuration;
    }

    public void setWebAppFailureCode(int i10) {
        _webAppFailureCode.set(Integer.valueOf(i10));
    }

    public void setWebAppFailureMessage(String str) {
        _webAppFailureMessage.set(str);
    }

    public void setWebAppInitialized(boolean z10) {
        _initialized.set(Boolean.valueOf(z10));
        _conditionVariable.open();
    }

    public void setWebAppLoaded(boolean z10) {
        this._webAppLoaded = z10;
    }

    public void setWebView(WebView webView) {
        this._webView = webView;
    }

    private WebViewApp(Configuration configuration, boolean z10, boolean z11, IWebViewBridge iWebViewBridge) {
        WebView webView;
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap<>();
        setConfiguration(configuration);
        WebViewBridge.setClassTable(getConfiguration().getWebAppApiClassList());
        IExperiments experiments = configuration.getExperiments();
        this._webViewBridge = iWebViewBridge;
        if (z10) {
            webView = new WebViewWithCache(ClientProperties.getApplicationContext(), z11, experiments);
        } else {
            Context applicationContext = ClientProperties.getApplicationContext();
            SharedInstances sharedInstances = SharedInstances.INSTANCE;
            webView = new WebView(applicationContext, z11, sharedInstances.getWebViewBridge(), sharedInstances.getWebViewAppInvocationCallbackInvoker(), experiments);
        }
        this._webView = webView;
        webView.setWebViewClient(new WebAppClient());
    }

    private String buildInvokeJavascript(String str, String str2, JSONArray jSONArray) {
        String string = jSONArray.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 22 + str2.length() + string.length());
        sb2.append("javascript:window.");
        sb2.append(str);
        sb2.append(".");
        sb2.append(str2);
        sb2.append("(");
        sb2.append(string);
        sb2.append(");");
        return sb2.toString();
    }

    private static ErrorState createWithRemoteUrl(final Configuration configuration) {
        boolean z10;
        boolean z11;
        if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Configuration configuration2 = configuration;
                        WebViewApp webViewApp = new WebViewApp(configuration2, true, configuration2.getExperiments().isWebGestureNotRequired());
                        webViewApp.getWebView().loadUrl(new WebViewUrlBuilder(configuration.getWebViewUrl(), configuration).getUrlWithQueryString());
                        WebViewApp.setCurrentApp(webViewApp);
                    } catch (Exception unused) {
                        DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                        WebViewApp._conditionVariable.open();
                    }
                }
            });
            ConditionVariable conditionVariable = new ConditionVariable();
            _conditionVariable = conditionVariable;
            boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
            boolean z12 = true;
            if (getCurrentApp() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && getCurrentApp().isWebAppInitialized()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!zBlock || !z10 || !z11) {
                z12 = false;
            }
            if (!z12) {
                if (!zBlock) {
                    return ErrorState.CreateWebviewTimeout;
                }
                if (getCurrentApp() == null) {
                    return ErrorState.CreateWebview;
                }
                return getCurrentApp().getErrorStateFromWebAppCode();
            }
            return null;
        }
        throw new IllegalThreadStateException("Cannot call create() from main thread!");
    }

    private void invokeJavascriptMethod(String str, String str2, JSONArray jSONArray) {
        String strBuildInvokeJavascript = buildInvokeJavascript(str, str2, jSONArray);
        DeviceLog.debug("Invoking javascript: %s", strBuildInvokeJavascript);
        getWebView().evaluateJavascript(strBuildInvokeJavascript, null);
    }

    public ErrorState getErrorStateFromWebAppCode() {
        int webAppFailureCode = getWebAppFailureCode();
        if (webAppFailureCode == 1) {
            return ErrorState.CreateWebviewGameIdDisabled;
        }
        if (webAppFailureCode == 2) {
            return ErrorState.CreateWebviewConfigError;
        }
        if (webAppFailureCode == 3) {
            return ErrorState.CreateWebviewInvalidArgument;
        }
        return ErrorState.CreateWebview;
    }

    public boolean invokeCallback(Invocation invocation) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<ArrayList<Object>> responses = invocation.getResponses();
        if (responses != null && !responses.isEmpty()) {
            for (ArrayList<Object> arrayList : responses) {
                CallbackStatus callbackStatus = (CallbackStatus) arrayList.get(0);
                Enum r10 = (Enum) arrayList.get(1);
                Object[] objArr = (Object[]) arrayList.get(2);
                String str = (String) objArr[0];
                Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str);
                arrayList2.add(callbackStatus.toString());
                JSONArray jSONArray2 = new JSONArray();
                if (r10 != null) {
                    jSONArray2.put(r10.name());
                }
                for (Object obj : objArrCopyOfRange) {
                    jSONArray2.put(obj);
                }
                arrayList2.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray3.put(it.next());
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleCallback", jSONArray);
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while invoking callback to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(invocation) { // from class: com.unity3d.services.core.webview.WebViewApp.3
                public final /* synthetic */ Invocation val$invocation;

                {
                    this.val$invocation = invocation;
                    put("src", "handleCallback");
                    put("invocation", invocation.toString());
                }
            });
            return false;
        } catch (Exception e10) {
            DeviceLog.exception("Error while invoking batch response for WebView", e10);
        }
        return true;
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            NativeCallback nativeCallback = new NativeCallback(method);
            addCallback(nativeCallback);
            jSONArray.put(nativeCallback.getId());
        } else {
            jSONArray.put((Object) null);
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                jSONArray.put(obj);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while handling invocation to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(str, str2) { // from class: com.unity3d.services.core.webview.WebViewApp.2
                public final /* synthetic */ String val$className;
                public final /* synthetic */ String val$methodName;

                {
                    this.val$className = str;
                    this.val$methodName = str2;
                    put("src", "handleInvocation");
                    put("className", str);
                    put("methodName", str2);
                }
            });
            return false;
        } catch (Exception e10) {
            DeviceLog.exception("Error invoking javascript method", e10);
            return false;
        }
    }

    public boolean sendEvent(Enum r10, Enum r11, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r10.name());
        jSONArray.put(r11.name());
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while sending event to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(r10, r11) { // from class: com.unity3d.services.core.webview.WebViewApp.1
                public final /* synthetic */ Enum val$eventCategory;
                public final /* synthetic */ Enum val$eventId;

                {
                    this.val$eventCategory = r10;
                    this.val$eventId = r11;
                    put("src", "handleEvent");
                    put("eventCategory", r10.name());
                    put("eventId", r11.name());
                }
            });
            return false;
        } catch (Exception e10) {
            DeviceLog.exception("Error while sending event to WebView", e10);
            return false;
        }
    }

    public WebViewApp() {
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap<>();
        WebViewBridge.setClassTable(new Class[0]);
        this._webViewBridge = SharedInstances.INSTANCE.getWebViewBridge();
        _conditionVariable = new ConditionVariable();
    }
}
