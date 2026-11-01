package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4471qd implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4677yk f57564a = C4418oa.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4554tm[] fromModel(Map<String, ? extends Object> map) {
        C4554tm c4554tm;
        Map<String, Zc> mapC = this.f57564a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Zc zc2 = mapC.get(key);
            if (zc2 == null || value == null) {
                c4554tm = null;
            } else {
                c4554tm = new C4554tm();
                c4554tm.f57736a = key;
                c4554tm.f57737b = (byte[]) zc2.f56284c.fromModel(value);
            }
            if (c4554tm != null) {
                arrayList.add(c4554tm);
            }
        }
        Object[] array = arrayList.toArray(new C4554tm[0]);
        if (array != null) {
            return (C4554tm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C4554tm[] c4554tmArr) {
        Map<String, Zc> mapC = this.f57564a.c();
        ArrayList arrayList = new ArrayList();
        for (C4554tm c4554tm : c4554tmArr) {
            Zc zc2 = mapC.get(c4554tm.f57736a);
            Pair pairA = zc2 != null ? mj.h.a(c4554tm.f57736a, zc2.f56284c.toModel(c4554tm.f57737b)) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return kotlin.collections.a.v(arrayList);
    }
}
