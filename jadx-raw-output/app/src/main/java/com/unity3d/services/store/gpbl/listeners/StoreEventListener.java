package com.unity3d.services.store.gpbl.listeners;

/* JADX INFO: compiled from: StoreEventListener.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface StoreEventListener extends PurchaseHistoryResponseListener, SkuDetailsResponseListener, PurchasesResponseListener, PurchaseUpdatedResponseListener, FeatureSupportedListener, BillingInitializationListener {
    int getOperationId();
}
