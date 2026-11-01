package com.unity3d.services.store;

import ck.p;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Arrays;

/* JADX INFO: compiled from: StoreWebViewEventSender.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class StoreWebViewEventSender {
    private final IEventSender eventSender;

    public StoreWebViewEventSender(IEventSender iEventSender) {
        p.j(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public final void send(StoreEvent storeEvent, Object... objArr) {
        p.j(storeEvent, "event");
        p.j(objArr, "params");
        this.eventSender.sendEvent(WebViewEventCategory.STORE, storeEvent, Arrays.copyOf(objArr, objArr.length));
    }
}
