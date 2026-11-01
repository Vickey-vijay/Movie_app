package io.appmetrica.analytics.billingv8.impl;

import ck.p;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f54617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f54618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f54619c;

    public j(k kVar, BillingResult billingResult, List list) {
        this.f54617a = kVar;
        this.f54618b = billingResult;
        this.f54619c = list;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0196  */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ProductInfo productInfo;
        String originalJson;
        String priceCurrencyCode;
        String originalJson2;
        k kVar = this.f54617a;
        BillingResult billingResult = this.f54618b;
        List<Purchase> list = this.f54619c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f54625f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put((String) it.next(), purchase);
                }
            }
            List<Purchase> list2 = kVar.f54622c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase2 : list2) {
                Iterator it2 = purchase2.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((String) it2.next(), purchase2);
                }
            }
            List<ProductDetails> list3 = kVar.f54623d;
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list3) {
                Purchase purchase3 = (Purchase) linkedHashMap2.get(productDetails.getProductId());
                if (purchase3 != null) {
                    Purchase purchase4 = (Purchase) linkedHashMap.get(productDetails.getProductId());
                    String productType = productDetails.getProductType();
                    int iHashCode = productType.hashCode();
                    if (iHashCode != 3541555) {
                        if (iHashCode == 100343516 && productType.equals("inapp")) {
                            String productType2 = productDetails.getProductType();
                            ProductType productType3 = p.e(productType2, "inapp") ? ProductType.INAPP : p.e(productType2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String productId = productDetails.getProductId();
                            int quantity = purchase3.getQuantity();
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (priceCurrencyCode = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                priceCurrencyCode = "";
                            }
                            productInfo = new ProductInfo(productType3, productId, quantity, priceAmountMicros, priceCurrencyCode, 0L, null, 1, null, purchase3.getSignature(), purchase3.getPurchaseToken(), purchase3.getPurchaseTime(), purchase4 != null ? purchase4.isAutoRenewing() : false, (purchase4 == null || (originalJson2 = purchase4.getOriginalJson()) == null) ? JsonUtils.EMPTY_JSON : originalJson2);
                        } else {
                            productInfo = null;
                        }
                    } else if (productType.equals("subs")) {
                        String productType4 = productDetails.getProductType();
                        productInfo = new ProductInfo(p.e(productType4, "inapp") ? ProductType.INAPP : p.e(productType4, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, productDetails.getProductId(), purchase3.getQuantity(), 0L, "", 0L, null, 1, null, purchase3.getSignature(), purchase3.getPurchaseToken(), purchase3.getPurchaseTime(), purchase4 != null ? purchase4.isAutoRenewing() : false, (purchase4 == null || (originalJson = purchase4.getOriginalJson()) == null) ? JsonUtils.EMPTY_JSON : originalJson);
                    } else {
                        productInfo = null;
                    }
                } else {
                    productInfo = null;
                }
                if (productInfo != null) {
                    arrayList.add(productInfo);
                }
            }
            kVar.f54620a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f54621b.invoke();
            kVar.f54625f.onUpdateFinished();
        }
        k kVar2 = this.f54617a;
        kVar2.f54624e.a(kVar2);
    }
}
