package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.mo;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes9.dex */
public class ECommerceCartItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f54791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigDecimal f54792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ECommercePrice f54793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f54794d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j10) {
        this(eCommerceProduct, eCommercePrice, mo.a(j10));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d10) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(mo.a(d10)));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f54791a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f54792b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.f54794d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f54793c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.f54794d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f54791a + ", quantity=" + this.f54792b + ", revenue=" + this.f54793c + ", referrer=" + this.f54794d + '}';
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f54791a = eCommerceProduct;
        this.f54792b = bigDecimal;
        this.f54793c = eCommercePrice;
    }
}
