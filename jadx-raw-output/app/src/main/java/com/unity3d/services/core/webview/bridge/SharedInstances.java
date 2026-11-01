package com.unity3d.services.core.webview.bridge;

import ck.p;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;

/* JADX INFO: compiled from: SharedInstances.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SharedInstances {
    public static final SharedInstances INSTANCE = new SharedInstances();
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new IInvocationCallbackInvoker() { // from class: com.unity3d.services.core.webview.bridge.a
        @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
        public final void invokeCallback(Invocation invocation) {
            SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
        }
    };
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new INativeCallbackSubject() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppNativeCallbackSubject$1
        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public NativeCallback getCallback(String str) {
            p.j(str, "callbackId");
            NativeCallback callback = WebViewApp.getCurrentApp().getCallback(str);
            p.i(callback, "getCurrentApp().getCallback(callbackId)");
            return callback;
        }

        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public void remove(NativeCallback nativeCallback) {
            p.j(nativeCallback, "callback");
            WebViewApp.getCurrentApp().removeCallback(nativeCallback);
        }
    };
    private static final IEventSender webViewEventSender = new IEventSender() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewEventSender$1
        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean sendEvent(Enum<?> r10, Enum<?> r11, Object... objArr) {
            p.j(r10, "eventCategory");
            p.j(r11, "eventId");
            p.j(objArr, "params");
            WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                return currentApp.sendEvent(r10, r11, Arrays.copyOf(objArr, objArr.length));
            }
            return false;
        }

        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean canSend() {
            if (WebViewApp.getCurrentApp() != null) {
                return true;
            }
            return false;
        }
    };
    private static final IWebViewBridge webViewBridge = new IWebViewBridge() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewBridge$1
        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleCallback(String str, String str2, Object[] objArr) throws Exception {
            WebViewBridge.getInstance().handleCallback(str, str2, objArr);
        }

        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception {
            WebViewBridge.getInstance().handleInvocation(str, str2, objArr, webViewCallback);
        }
    };

    private SharedInstances() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation invocation) {
        p.j(invocation, "it");
        WebViewApp.getCurrentApp().invokeCallback(invocation);
    }

    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    public final IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }

    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}
