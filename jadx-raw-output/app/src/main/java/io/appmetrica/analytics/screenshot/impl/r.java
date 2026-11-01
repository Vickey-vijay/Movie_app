package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(C4721p c4721p) {
        O o10 = new O();
        o10.f58384a = c4721p.f58454a;
        Object[] array = c4721p.f58455b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o10.f58386c = (String[]) array;
        o10.f58385b = c4721p.f58456c;
        return o10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4721p toModel(O o10) {
        return new C4721p(o10.f58384a, nj.n.q0(o10.f58386c), o10.f58385b);
    }
}
