package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4673yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4146dj f58027c;

    public C4673yg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C4146dj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f58025a + "', identifier='" + this.f58026b + "', screen=" + this.f58027c + '}';
    }

    public C4673yg(String str, String str2, C4146dj c4146dj) {
        this.f58025a = str;
        this.f58026b = str2;
        this.f58027c = c4146dj;
    }
}
