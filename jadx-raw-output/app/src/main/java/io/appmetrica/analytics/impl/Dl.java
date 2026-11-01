package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class Dl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4055a6 fromModel(@NonNull El el2) {
        C4055a6 c4055a6 = new C4055a6();
        c4055a6.f56322a = (String) WrapUtils.getOrDefault(el2.f55201a, c4055a6.f56322a);
        c4055a6.f56323b = (String) WrapUtils.getOrDefault(el2.f55202b, c4055a6.f56323b);
        c4055a6.f56324c = ((Integer) WrapUtils.getOrDefault(el2.f55203c, Integer.valueOf(c4055a6.f56324c))).intValue();
        c4055a6.f56327f = ((Integer) WrapUtils.getOrDefault(el2.f55204d, Integer.valueOf(c4055a6.f56327f))).intValue();
        c4055a6.f56325d = (String) WrapUtils.getOrDefault(el2.f55205e, c4055a6.f56325d);
        c4055a6.f56326e = ((Boolean) WrapUtils.getOrDefault(el2.f55206f, Boolean.valueOf(c4055a6.f56326e))).booleanValue();
        return c4055a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final El a(@NonNull C4055a6 c4055a6) {
        throw new UnsupportedOperationException();
    }
}
