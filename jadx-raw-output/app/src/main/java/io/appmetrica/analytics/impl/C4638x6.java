package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4638x6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4480qm[] fromModel(Map<String, ? extends List<String>> map) {
        C4480qm[] c4480qmArr = new C4480qm[map.size()];
        int i10 = 0;
        for (Object obj : map.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nj.s.u();
            }
            Map.Entry entry = (Map.Entry) obj;
            C4480qm c4480qm = new C4480qm();
            c4480qm.f57579a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c4480qm.f57580b = (String[]) array;
            c4480qmArr[i10] = c4480qm;
            i10 = i11;
        }
        return c4480qmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C4480qm[] c4480qmArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(c4480qmArr.length), 16));
        for (C4480qm c4480qm : c4480qmArr) {
            Pair pairA = mj.h.a(c4480qm.f57579a, nj.n.q0(c4480qm.f57580b));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }
}
