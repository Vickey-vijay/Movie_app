package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import java.util.Map;
import mj.h;
import nj.l0;

/* JADX INFO: compiled from: AndroidSendWebViewClientErrorDiagnostics.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics
    public void invoke(List<WebViewClientError> list) {
        p.j(list, "errors");
        for (WebViewClientError webViewClientError : list) {
            String url = webViewClientError.getUrl();
            Map mapG = !(url == null || url.length() == 0) ? l0.g(h.a("webview_url", webViewClientError.getUrl())) : null;
            Map mapO = kotlin.collections.a.o(h.a("reason", Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                mapO.put("webview_error_code", webViewClientError.getStatusCode());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", null, mapG, mapO, null, null, 50, null);
        }
    }
}
