package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import oc.c;
import oc.l;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewErrorHandler implements c<l> {
    private final IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    @Override // oc.c
    public void handleError(l lVar) {
        this._eventSender.sendEvent(WebViewEventCategory.valueOf(lVar.getDomain()), lVar.getErrorCategory(), lVar.getErrorArguments());
    }
}
