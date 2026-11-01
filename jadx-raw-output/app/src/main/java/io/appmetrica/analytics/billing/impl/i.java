package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(BillingInfo billingInfo) {
        c cVar = new c();
        int i10 = h.f54446a[billingInfo.type.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            i11 = i10 != 2 ? 1 : 3;
        }
        cVar.f54435a = i11;
        cVar.f54436b = billingInfo.productId;
        cVar.f54437c = billingInfo.purchaseToken;
        cVar.f54438d = billingInfo.purchaseTime;
        cVar.f54439e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(c cVar) {
        ProductType productType;
        int i10 = cVar.f54435a;
        if (i10 == 2) {
            productType = ProductType.INAPP;
        } else if (i10 != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f54436b, cVar.f54437c, cVar.f54438d, cVar.f54439e);
    }
}
