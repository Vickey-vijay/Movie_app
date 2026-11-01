package io.appmetrica.analytics.billingv8.impl;

import ck.p;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nj.b0;
import nj.t;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f54605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f54606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f54607c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f54605a = iVar;
        this.f54606b = billingResult;
        this.f54607c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f54605a;
        BillingResult billingResult = this.f54606b;
        List<Purchase> list = this.f54607c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            iVar.f54616f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                for (String str : purchase.getProducts()) {
                    String str2 = iVar.f54614d;
                    BillingInfo billingInfo = new BillingInfo(p.e(str2, "inapp") ? ProductType.INAPP : p.e(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.getPurchaseToken(), purchase.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f54613c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f54611a, linkedHashMap, iVar.f54613c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f54614d, iVar.f54613c.getBillingInfoManager());
                iVar.f54616f.onUpdateFinished();
            } else {
                List listO0 = b0.O0(billingInfoToUpdate.keySet());
                n nVar = iVar.f54616f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f54614d;
                BillingClient billingClient = iVar.f54612b;
                UtilsProvider utilsProvider = iVar.f54613c;
                d dVar = iVar.f54615e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f54594b.add(fVar);
                if (iVar.f54612b.isReady()) {
                    BillingClient billingClient2 = iVar.f54612b;
                    QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(t.v(listO0, 10));
                    Iterator it = listO0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f54614d).build());
                    }
                    billingClient2.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f54615e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f54605a;
        iVar2.f54615e.a(iVar2);
    }
}
