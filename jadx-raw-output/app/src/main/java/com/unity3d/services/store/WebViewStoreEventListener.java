package com.unity3d.services.store;

import ck.i;
import ck.p;
import com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: WebViewStoreEventListener.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class WebViewStoreEventListener implements StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    private final StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int i10, StoreWebViewEventSender storeWebViewEventSender, boolean z10) {
        p.j(storeWebViewEventSender, "storeWebViewEventSender");
        this.operationId = i10;
        this.storeWebViewEventSender = storeWebViewEventSender;
        this.isLifecycleListener = z10;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.StoreEventListener
    public int getOperationId() {
        return this.operationId;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(StoreEvent.DISCONNECTED_RESULT, new Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingSetupFinished(BillingResultBridge billingResultBridge) {
        p.j(billingResultBridge, "billingResult");
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.INITIALIZATION_REQUEST_RESULT;
            BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
            p.i(responseCode, "billingResult.responseCode");
            storeWebViewEventSender.send(storeEvent, responseCode);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.INITIALIZATION_REQUEST_FAILED;
        BillingResultResponseCode responseCode2 = billingResultBridge.getResponseCode();
        p.i(responseCode2, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode2);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener
    public void onFeatureSupported(int i10) {
        this.storeWebViewEventSender.send(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(getOperationId()), Integer.valueOf(i10));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
    public void onIsAlreadyInitialized() {
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(BillingResultResponseCode.OK.getResponseCode()));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener
    public void onPurchaseHistoryUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseHistoryRecordBridge> list) {
        JSONArray jSONArray;
        p.j(billingResultBridge, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(getOperationId());
        BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
        p.i(responseCode, "billingResult.responseCode");
        objArr[1] = responseCode;
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        objArr[2] = jSONArray;
        storeWebViewEventSender.send(storeEvent, objArr);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    public void onPurchaseResponse(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        JSONArray jSONArray;
        p.j(billingResultBridge, "billingResult");
        ArrayList arrayList = new ArrayList();
        if (getOperationId() != -1) {
            arrayList.add(Integer.valueOf(getOperationId()));
        }
        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
            arrayList.add(billingResultBridge.getResponseCode());
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_ERROR : StoreEvent.PURCHASES_REQUEST_ERROR;
            Object[] array = arrayList.toArray(new Object[0]);
            storeWebViewEventSender.send(storeEvent, Arrays.copyOf(array, array.length));
            return;
        }
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        arrayList.add(jSONArray);
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_RESULT : StoreEvent.PURCHASES_REQUEST_RESULT;
        Object[] array2 = arrayList.toArray(new Object[0]);
        storeWebViewEventSender2.send(storeEvent2, Arrays.copyOf(array2, array2.length));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
    public void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        JSONArray jSONArray;
        p.j(billingResultBridge, "billingResult");
        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.PURCHASES_UPDATED_ERROR;
            BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
            p.i(responseCode, "billingResult.responseCode");
            storeWebViewEventSender.send(storeEvent, responseCode);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.PURCHASES_UPDATED_RESULT;
        Object[] objArr = new Object[1];
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        objArr[0] = jSONArray;
        storeWebViewEventSender2.send(storeEvent2, objArr);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    public void onSkuDetailsUpdated(BillingResultBridge billingResultBridge, List<? extends SkuDetailsBridge> list) {
        JSONArray jSONArray;
        p.j(billingResultBridge, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(getOperationId());
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        objArr[1] = jSONArray;
        storeWebViewEventSender.send(storeEvent, objArr);
    }

    public /* synthetic */ WebViewStoreEventListener(int i10, StoreWebViewEventSender storeWebViewEventSender, boolean z10, int i11, i iVar) {
        this(i10, storeWebViewEventSender, (i11 & 4) != 0 ? false : z10);
    }
}
