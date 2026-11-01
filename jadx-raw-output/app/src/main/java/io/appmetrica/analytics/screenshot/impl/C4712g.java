package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4712g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(C4710e c4710e) {
        N n10 = new N();
        n10.f58382a = c4710e.f58421a;
        return n10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C4710e(((N) obj).f58382a);
    }

    public final C4710e a(N n10) {
        return new C4710e(n10.f58382a);
    }
}
