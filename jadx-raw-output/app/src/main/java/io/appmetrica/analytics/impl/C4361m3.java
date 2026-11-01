package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4361m3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4517sa f57240a;

    public C4361m3() {
        this(new C4517sa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull List<String> list) {
        Nn nnA = this.f57240a.a((List<Object>) list);
        C4212g8 c4212g8 = new C4212g8();
        c4212g8.f56798a = StringUtils.getUTF8Bytes((List<String>) nnA.f55658a);
        InterfaceC4104c3 interfaceC4104c3 = nnA.f55659b;
        int i10 = ((C4412o4) interfaceC4104c3).f56400a;
        return new Ei(c4212g8, interfaceC4104c3);
    }

    @VisibleForTesting
    public C4361m3(@NonNull C4517sa c4517sa) {
        this.f57240a = c4517sa;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<String> a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
