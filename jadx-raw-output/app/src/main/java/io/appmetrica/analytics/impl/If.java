package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class If {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f55347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f55348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Af f55349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Af f55350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f55351g;

    public If(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Af(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Af(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f55345a + "', name='" + this.f55346b + "', categoriesPath=" + this.f55347c + ", payload=" + this.f55348d + ", actualPrice=" + this.f55349e + ", originalPrice=" + this.f55350f + ", promocodes=" + this.f55351g + '}';
    }

    public If(String str, String str2, List list, Map map, Af af2, Af af3, List list2) {
        this.f55345a = str;
        this.f55346b = str2;
        this.f55347c = list;
        this.f55348d = map;
        this.f55349e = af2;
        this.f55350f = af3;
        this.f55351g = list2;
    }
}
