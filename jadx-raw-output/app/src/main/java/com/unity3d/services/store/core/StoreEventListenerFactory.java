package com.unity3d.services.store.core;

import ck.p;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.WebViewStoreEventListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;

/* JADX INFO: compiled from: StoreEventListenerFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class StoreEventListenerFactory {
    private final StoreWebViewEventSender storeWebViewEventSender;

    public final StoreEventListener invoke() {
        return invoke$default(this, 0, false, 3, null);
    }

    public final StoreEventListener invoke(int i10) {
        return invoke$default(this, i10, false, 2, null);
    }

    public StoreEventListenerFactory(StoreWebViewEventSender storeWebViewEventSender) {
        p.j(storeWebViewEventSender, "storeWebViewEventSender");
        this.storeWebViewEventSender = storeWebViewEventSender;
    }

    public static /* synthetic */ StoreEventListener invoke$default(StoreEventListenerFactory storeEventListenerFactory, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return storeEventListenerFactory.invoke(i10, z10);
    }

    public final StoreEventListener invoke(int i10, boolean z10) {
        return new WebViewStoreEventListener(i10, this.storeWebViewEventSender, z10);
    }
}
