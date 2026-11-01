package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4369mb implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nc f57271a;

    public C4369mb() {
        this(new Nc(new Sn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull Rn rn2) {
        return MessageNano.toByteArray((MessageNano) this.f57271a.f55624a.fromModel(rn2));
    }

    public C4369mb(Nc nc2) {
        this.f57271a = nc2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Rn a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
