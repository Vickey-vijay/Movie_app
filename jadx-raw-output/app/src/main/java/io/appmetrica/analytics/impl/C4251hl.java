package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4251hl implements InterfaceC4109c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zi f56914a;

    public C4251hl() {
        this(new Zi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4225gl c4225gl) {
        C4590v8 c4590v8 = new C4590v8();
        c4590v8.f57807a = 1;
        c4590v8.f57808b = new C4565u8();
        Ei eiFromModel = this.f56914a.fromModel(c4225gl.f56829a);
        c4590v8.f57808b.f57760a = (C4490r8) eiFromModel.f55185a;
        C4078b3 c4078b3 = new C4078b3(C4078b3.b(eiFromModel));
        eiFromModel.f55186b.getBytesTruncated();
        return Collections.singletonList(new Ei(c4590v8, c4078b3));
    }

    public C4251hl(Zi zi2) {
        this.f56914a = zi2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4225gl a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
