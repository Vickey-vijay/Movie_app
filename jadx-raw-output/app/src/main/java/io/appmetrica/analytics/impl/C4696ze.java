package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4696ze implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4579um fromModel(@NonNull C4671ye c4671ye) {
        C4579um c4579um = new C4579um();
        c4579um.f57777a = c4671ye.f58021a;
        c4579um.f57778b = c4671ye.f58022b;
        return c4579um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C4579um c4579um = (C4579um) obj;
        return new C4671ye(c4579um.f57777a, c4579um.f57778b);
    }

    @NonNull
    public final C4671ye a(@NonNull C4579um c4579um) {
        return new C4671ye(c4579um.f57777a, c4579um.f57778b);
    }
}
