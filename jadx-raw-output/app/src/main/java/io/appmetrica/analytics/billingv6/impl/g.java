package io.appmetrica.analytics.billingv6.impl;

import ck.p;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
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

/* JADX INFO: loaded from: classes11.dex */
public final class g extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f54552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f54553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f54554c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f54552a = iVar;
        this.f54553b = billingResult;
        this.f54554c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f54552a;
        BillingResult billingResult = this.f54553b;
        List<PurchaseHistoryRecord> list = this.f54554c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f54563f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = iVar.f54561d;
                    BillingInfo billingInfo = new BillingInfo(p.e(str2, "inapp") ? ProductType.INAPP : p.e(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f54560c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f54558a, linkedHashMap, iVar.f54560c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f54561d, iVar.f54560c.getBillingInfoManager());
                iVar.f54563f.onUpdateFinished();
            } else {
                List listO0 = b0.O0(billingInfoToUpdate.keySet());
                n nVar = iVar.f54563f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f54561d;
                BillingClient billingClient = iVar.f54559b;
                UtilsProvider utilsProvider = iVar.f54560c;
                d dVar = iVar.f54562e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f54541b.add(fVar);
                if (iVar.f54559b.isReady()) {
                    BillingClient billingClient2 = iVar.f54559b;
                    QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(t.v(listO0, 10));
                    Iterator it = listO0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f54561d).build());
                    }
                    billingClient2.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f54562e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f54552a;
        iVar2.f54562e.a(iVar2);
    }
}
