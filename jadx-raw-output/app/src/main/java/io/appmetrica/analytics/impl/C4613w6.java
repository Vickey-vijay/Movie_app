package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4613w6 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fg f57862a;

    public C4613w6() {
        this(new Fg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(@NonNull C4588v6 c4588v6) {
        Y5 y5FromModel = this.f57862a.fromModel(c4588v6.f57795a);
        y5FromModel.f56232g = 1;
        X5 x10 = new X5();
        y5FromModel.f56233h = x10;
        x10.f56134a = StringUtils.correctIllFormedString(c4588v6.f57796b);
        return y5FromModel;
    }

    public C4613w6(Fg fg2) {
        this.f57862a = fg2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4588v6 a(@NonNull Y5 y10) {
        throw new UnsupportedOperationException();
    }
}
