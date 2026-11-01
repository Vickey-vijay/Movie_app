package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;

/* JADX INFO: compiled from: StoreExceptionHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface StoreExceptionHandler {
    void handleStoreException(StoreEvent storeEvent, int i10, Exception exc);
}
