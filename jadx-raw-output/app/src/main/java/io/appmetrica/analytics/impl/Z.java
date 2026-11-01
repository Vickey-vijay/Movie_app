package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes9.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f56260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56261b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f56260a = bigDecimal;
        this.f56261b = str;
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f56260a + ", unit='" + this.f56261b + "'}";
    }
}
