package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Fd implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ed f55232a = new Ed();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f55233b = kotlin.collections.a.m(mj.h.a(NativeCrashSource.UNKNOWN, 0), mj.h.a(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(Ld ld2) {
        W5 w10 = new W5();
        w10.f56074f = 1;
        V5 v10 = new V5();
        v10.f56008a = ld2.f55514a;
        Z5 z10 = new Z5();
        Integer num = (Integer) f55233b.get(ld2.f55515b.f55343a);
        if (num != null) {
            z10.f56269a = num.intValue();
        }
        String str = ld2.f55515b.f55344b;
        if (str == null) {
            str = "";
        }
        z10.f56270b = str;
        v10.f56009b = z10;
        w10.f56075g = v10;
        return w10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Ld a(W5 w10) {
        throw new UnsupportedOperationException();
    }
}
