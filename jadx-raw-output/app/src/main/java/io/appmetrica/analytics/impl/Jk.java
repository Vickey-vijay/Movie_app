package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class Jk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk fromModel(Map<String, byte[]> map) {
        Lk lk2 = new Lk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Mk mk2 = new Mk();
            mk2.f55593a = entry.getKey().getBytes(lk.c.f63591b);
            mk2.f55594b = entry.getValue();
            arrayList.add(mk2);
        }
        Object[] array = arrayList.toArray(new Mk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        lk2.f55529a = (Mk[]) array;
        return lk2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(Lk lk2) {
        Mk[] mkArr = lk2.f55529a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(mkArr.length), 16));
        for (Mk mk2 : mkArr) {
            Pair pairA = mj.h.a(new String(mk2.f55593a, lk.c.f63591b), mk2.f55594b);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }
}
