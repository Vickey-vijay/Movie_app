package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes6.dex */
public final class Im implements ProtobufConverter {
    @NonNull
    public final C4629wm a(@NonNull Hm hm2) {
        C4629wm c4629wm = new C4629wm();
        c4629wm.f57898a = hm2.f55324a;
        return c4629wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C4629wm c4629wm = new C4629wm();
        c4629wm.f57898a = ((Hm) obj).f55324a;
        return c4629wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Hm(((C4629wm) obj).f57898a);
    }

    @NonNull
    public final Hm a(@NonNull C4629wm c4629wm) {
        return new Hm(c4629wm.f57898a);
    }
}
