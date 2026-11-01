package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4467q9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4417o9 fromModel(@NonNull C4442p9 c4442p9) {
        C4417o9 c4417o9 = new C4417o9();
        String str = c4442p9.f57499a;
        if (str != null) {
            c4417o9.f57402a = str.getBytes();
        }
        return c4417o9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4442p9 toModel(@NonNull C4417o9 c4417o9) {
        return new C4442p9(new String(c4417o9.f57402a));
    }
}
