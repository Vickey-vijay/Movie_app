package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q8 implements ProtobufConverter {
    public static C4591v9 a(P8 p10) {
        C4591v9 c4591v9 = new C4591v9();
        c4591v9.f57817d = new int[p10.f55727b.size()];
        Iterator it = p10.f55727b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c4591v9.f57817d[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        c4591v9.f57816c = p10.f55729d;
        c4591v9.f57815b = p10.f55728c;
        c4591v9.f57814a = p10.f55726a;
        return c4591v9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((P8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C4591v9 c4591v9 = (C4591v9) obj;
        return new P8(c4591v9.f57814a, c4591v9.f57815b, c4591v9.f57816c, CollectionUtils.hashSetFromIntArray(c4591v9.f57817d));
    }
}
