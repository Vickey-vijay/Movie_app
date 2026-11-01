package io.appmetrica.analytics.billingv8.impl;

import androidx.annotation.WorkerThread;
import ck.p;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements UpdatePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f54626a;

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public o(SystemTimeProvider systemTimeProvider) {
        this.f54626a = systemTimeProvider;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy
    @WorkerThread
    public final Map<String, BillingInfo> getBillingInfoToUpdate(BillingConfig billingConfig, Map<String, ? extends BillingInfo> map, BillingInfoManager billingInfoManager) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends BillingInfo> entry : map.entrySet()) {
            BillingInfo value = entry.getValue();
            if (value.type != ProductType.INAPP || billingInfoManager.isFirstInappCheckOccurred()) {
                BillingInfo billingInfo = billingInfoManager.get(value.productId);
                if (((billingInfo == null || !p.e(billingInfo.purchaseToken, value.purchaseToken)) && (this.f54626a.currentTimeMillis() - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds) || value.type == ProductType.SUBS)) || (billingInfo != null && value.type == ProductType.SUBS && this.f54626a.currentTimeMillis() - billingInfo.sendTime >= TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (this.f54626a.currentTimeMillis() - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public /* synthetic */ o(SystemTimeProvider systemTimeProvider, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new SystemTimeProvider() : systemTimeProvider);
    }
}
