package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.mo;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes8.dex */
public class ECommerceAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f54789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54790b;

    public ECommerceAmount(long j10, @NonNull String str) {
        this(mo.a(j10), str);
    }

    public ECommerceAmount(double d10, @NonNull String str) {
        this(new BigDecimal(mo.a(d10)), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f54789a;
    }

    @NonNull
    public String getUnit() {
        return this.f54790b;
    }

    @NonNull
    public String toString() {
        return "ECommerceAmount{amount=" + this.f54789a + ", unit='" + this.f54790b + "'}";
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f54789a = bigDecimal;
        this.f54790b = str;
    }
}
