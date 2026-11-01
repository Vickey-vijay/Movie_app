package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P fromModel(a0 a0Var) {
        P p10 = new P();
        p10.f58388a = a0Var.f58412a;
        p10.f58389b = a0Var.f58413b;
        return p10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P p10 = (P) obj;
        return new a0(p10.f58388a, p10.f58389b);
    }

    public final a0 a(P p10) {
        return new a0(p10.f58388a, p10.f58389b);
    }
}
