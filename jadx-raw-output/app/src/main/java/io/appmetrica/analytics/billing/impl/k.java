package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements BillingInfoStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f54450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4044a f54451b;

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f54451b.f54431a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f54451b.f54432b;
    }

    public k(ProtobufStateStorage<C4044a> protobufStateStorage) {
        this.f54450a = protobufStateStorage;
        this.f54451b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<? extends BillingInfo> list, boolean z10) {
        for (BillingInfo billingInfo : list) {
        }
        C4044a c4044a = new C4044a(list, z10);
        this.f54451b = c4044a;
        this.f54450a.save(c4044a);
    }
}
