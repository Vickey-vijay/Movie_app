package com.unity3d.ads.core.domain.billing;

import ck.p;
import com.ironsource.C3426d4;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import nk.l;
import rj.c;
import sj.a;
import tj.f;

/* JADX INFO: compiled from: CommonProductDetailsFetcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {
    private final BillingClientAdapter billingClientAdapter;
    private final String productType;

    public CommonProductDetailsFetcher(BillingClientAdapter billingClientAdapter, String str) {
        p.j(str, C3426d4.i.f28552m);
        this.billingClientAdapter = billingClientAdapter;
        this.productType = str;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public Object fetchProductDetails(String str, c<? super ProductDetailsResult> cVar) {
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(BillingResultBridge billingResultBridge, String str2) {
                p.j(billingResultBridge, "billingResult");
                if (str2 != null && billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
                    l<ProductDetailsResult> lVar = cVar2;
                    Result.a aVar = Result.Companion;
                    lVar.resumeWith(Result.m3458constructorimpl(new ProductDetailsResult.Success(str2)));
                } else if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
                    l<ProductDetailsResult> lVar2 = cVar2;
                    Result.a aVar2 = Result.Companion;
                    lVar2.resumeWith(Result.m3458constructorimpl(ProductDetailsResult.NotFound.INSTANCE));
                } else {
                    l<ProductDetailsResult> lVar3 = cVar2;
                    Result.a aVar3 = Result.Companion;
                    lVar3.resumeWith(Result.m3458constructorimpl(new ProductDetailsResult.Failure(billingResultBridge)));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        Object objB = cVar2.B();
        if (objB == a.f()) {
            f.c(cVar);
        }
        return objB;
    }
}
