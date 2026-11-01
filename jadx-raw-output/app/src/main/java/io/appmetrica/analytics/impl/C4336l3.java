package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4336l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final If f57162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f57163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Af f57164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4673yg f57165d;

    public C4336l3(ECommerceCartItem eCommerceCartItem) {
        this(new If(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Af(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C4673yg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f57162a + ", quantity=" + this.f57163b + ", revenue=" + this.f57164c + ", referrer=" + this.f57165d + '}';
    }

    public C4336l3(If r10, BigDecimal bigDecimal, Af af2, C4673yg c4673yg) {
        this.f57162a = r10;
        this.f57163b = bigDecimal;
        this.f57164c = af2;
        this.f57165d = c4673yg;
    }
}
