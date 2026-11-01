package io.appmetrica.analytics.billingv6.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nj.b0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements BillingInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f54537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f54539c;

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f54539c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final boolean isFirstInappCheckOccurred() {
        return this.f54538b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void markFirstInappCheckOccurred() {
        if (this.f54538b) {
            return;
        }
        this.f54538b = true;
        this.f54537a.saveInfo(b0.O0(this.f54539c.values()), this.f54538b);
    }

    public c(BillingInfoStorage billingInfoStorage) {
        this.f54537a = billingInfoStorage;
        this.f54538b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f54539c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f54539c.put(billingInfo.productId, billingInfo);
        }
        this.f54537a.saveInfo(b0.O0(this.f54539c.values()), this.f54538b);
    }
}
