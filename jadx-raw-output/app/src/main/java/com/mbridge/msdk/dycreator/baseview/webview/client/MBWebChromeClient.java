package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ironsource.Z7;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class MBWebChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34288a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebViewEventListener f34289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebCommunicator f34290c;

    private boolean a(String str) {
        WebCommunicator webCommunicator;
        try {
            if (str.startsWith("mv:") || str.startsWith("mraid:")) {
                if (str.contains("wv_hybrid:")) {
                    str = str.substring(0, str.lastIndexOf(Z7.f27998r) + 1);
                }
                q0.a("MBWebChromeClient", "onConsoleMessage: message.length() = " + str.length() + Z7.f27998r + str);
                if (!TextUtils.isEmpty(str) && (webCommunicator = this.f34290c) != null) {
                    webCommunicator.onCommunication(str);
                }
                return true;
            }
        } catch (Throwable th2) {
            q0.b("MBWebChromeClient", th2.getMessage());
        }
        return false;
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        this.f34290c = webCommunicator;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.f34289b = webViewEventListener;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (!TextUtils.isEmpty(consoleMessage.message()) && a(consoleMessage.message())) {
            return true;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!TextUtils.isEmpty(str2) && a(str2)) {
            jsPromptResult.confirm("");
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        WebViewEventListener webViewEventListener = this.f34289b;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i10);
        }
    }
}
