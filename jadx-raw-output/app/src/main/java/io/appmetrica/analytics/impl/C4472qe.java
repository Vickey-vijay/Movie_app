package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4472qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f57568d;

    public C4472qe(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4336l3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f57565a + "', identifier='" + this.f57566b + "', cartItems=" + this.f57567c + ", payload=" + this.f57568d + '}';
    }

    public C4472qe(String str, String str2, ArrayList arrayList, Map map) {
        this.f57565a = str;
        this.f57566b = str2;
        this.f57567c = arrayList;
        this.f57568d = map;
    }
}
