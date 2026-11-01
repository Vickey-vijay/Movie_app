package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4146dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f56603d;

    public C4146dj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f56600a + "', categoriesPath=" + this.f56601b + ", searchQuery='" + this.f56602c + "', payload=" + this.f56603d + '}';
    }

    public C4146dj(String str, String str2, List list, Map map) {
        this.f56600a = str;
        this.f56601b = list;
        this.f56602c = str2;
        this.f56603d = map;
    }
}
