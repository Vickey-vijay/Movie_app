package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class Y implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4614w7 f56191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4542ta f56192b;

    public Y() {
        this(new C4614w7(), new C4542ta(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull Z z10) {
        C4135d8 c4135d8 = new C4135d8();
        c4135d8.f56576b = this.f56191a.fromModel(z10.f56260a);
        Nn nnA = this.f56192b.a(z10.f56261b);
        c4135d8.f56575a = StringUtils.getUTF8Bytes((String) nnA.f55658a);
        return new Ei(c4135d8, new C4078b3(C4078b3.b(nnA)));
    }

    public Y(C4614w7 c4614w7, C4542ta c4542ta) {
        this.f56191a = c4614w7;
        this.f56192b = c4542ta;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Z a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
