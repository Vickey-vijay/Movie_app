package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;

/* JADX INFO: compiled from: ProductDetailsResponseListener.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface ProductDetailsResponseListener {
    void onProductDetailsResponse(BillingResultBridge billingResultBridge, QueryProductDetailsResultsBridge queryProductDetailsResultsBridge);
}
