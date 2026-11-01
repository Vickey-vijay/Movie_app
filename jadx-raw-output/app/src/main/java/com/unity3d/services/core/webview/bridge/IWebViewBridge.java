package com.unity3d.services.core.webview.bridge;

/* JADX INFO: compiled from: IWebViewBridge.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface IWebViewBridge {
    void handleCallback(String str, String str2, Object[] objArr) throws Exception;

    void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception;
}
