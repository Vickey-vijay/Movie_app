package com.unity3d.services.store.core;

import ck.p;
import com.unity3d.services.store.StoreEvent;

/* JADX INFO: compiled from: GatewayStoreExceptionHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(StoreEvent storeEvent, int i10, Exception exc) throws Exception {
        p.j(storeEvent, "storeEvent");
        p.j(exc, "exception");
        throw exc;
    }
}
