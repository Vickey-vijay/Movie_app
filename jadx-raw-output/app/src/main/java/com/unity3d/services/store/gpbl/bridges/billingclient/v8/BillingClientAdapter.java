package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import nj.r;
import org.json.JSONObject;

/* JADX INFO: compiled from: BillingClientAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public String getAdapterVersion() {
        return "8";
    }

    public BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge) {
        p.j(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(BillingInitializationListener billingInitializationListener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        p.j(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        BillingClientBridgeCommon billingClientBridgeCommonBuild = this.billingClientBuilderBridge.build();
        p.h(billingClientBridgeCommonBuild, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge");
        this.billingClient = (BillingClientBridge) billingClientBridgeCommonBuild;
        startConnection(billingInitializationListener);
        get_isInitialized$unity_ads_defaultRelease().setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public BillingResultResponseCode isFeatureSupported(String str) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            p.B("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isFeatureSupported(str);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            p.B("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isReady();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(String str, String str2, final ProductDetailsListener productDetailsListener) {
        p.j(str, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        p.j(str2, C3426d4.i.f28552m);
        p.j(productDetailsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        QueryProductDetailsParamsBridge queryProductDetailsParamsBridgeBuild = QueryProductDetailsParamsBridge.Companion.newBuilder().setProductList(r.e(ProductBridge.Companion.newBuilder().setProductId(str).setProductType(str2).build())).build();
        ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy = new ProductDetailsResponseListenerProxy(new ProductDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener
            public void onProductDetailsResponse(BillingResultBridge billingResultBridge, QueryProductDetailsResultsBridge queryProductDetailsResultsBridge) {
                p.j(billingResultBridge, "billingResult");
                p.j(queryProductDetailsResultsBridge, "queryProductDetailsResults");
                List<ProductDetailsBridge> productDetailsList = queryProductDetailsResultsBridge.getProductDetailsList();
                if (productDetailsList.isEmpty()) {
                    productDetailsListener.onProductDetailsResponse(billingResultBridge, null);
                } else {
                    JSONObject originalJson = productDetailsList.get(0).getOriginalJson();
                    productDetailsListener.onProductDetailsResponse(billingResultBridge, originalJson != null ? originalJson.toString() : null);
                }
            }
        });
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            p.B("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryProductDetailsAsync(queryProductDetailsParamsBridgeBuild, productDetailsResponseListenerProxy);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) throws ClassNotFoundException {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            p.B("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryPurchasesAsync(str, new PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(BillingClientStateListener billingClientStateListener) throws ClassNotFoundException {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            p.B("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
    }
}
