package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f54960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54961b;

    public Af(ECommercePrice eCommercePrice) {
        this(new Z(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new Z(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f54960a + ", internalComponents=" + this.f54961b + '}';
    }

    public Af(Z z10, LinkedList linkedList) {
        this.f54960a = z10;
        this.f54961b = linkedList;
    }
}
