package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4207g3 implements ProtobufConverter {
    @NonNull
    public final C4455pm a(@NonNull C4155e3 c4155e3) {
        C4455pm c4455pm = new C4455pm();
        c4455pm.f57526a = c4155e3.f56634a;
        return c4455pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C4455pm c4455pm = new C4455pm();
        c4455pm.f57526a = ((C4155e3) obj).f56634a;
        return c4455pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C4155e3(((C4455pm) obj).f57526a);
    }

    @NonNull
    public final C4155e3 a(@NonNull C4455pm c4455pm) {
        return new C4155e3(c4455pm.f57526a);
    }
}
