package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes2.dex */
public final class D9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4504rm fromModel(C9 c10) {
        C4504rm c4504rm = new C4504rm();
        if (c10 != null) {
            c4504rm.f57615a = c10.f55085a;
        }
        return c4504rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C9(((C4504rm) obj).f57615a);
    }

    public final C9 a(C4504rm c4504rm) {
        return new C9(c4504rm.f57615a);
    }
}
