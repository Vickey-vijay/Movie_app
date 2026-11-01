package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes5.dex */
public final class Em implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4604vm fromModel(Dm dm2) {
        C4604vm c4604vm = new C4604vm();
        c4604vm.f57849a = dm2.f55151a;
        return c4604vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Dm(((C4604vm) obj).f57849a);
    }

    public final Dm a(C4604vm c4604vm) {
        return new Dm(c4604vm.f57849a);
    }
}
