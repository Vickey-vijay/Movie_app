package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4284j3 implements InterfaceC4109c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4310k3 f56993a;

    public C4284j3() {
        this(new C4310k3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4259i3 c4259i3) {
        C4590v8 c4590v8 = new C4590v8();
        c4590v8.f57811e = new C4160e8();
        Ei eiFromModel = this.f56993a.fromModel(c4259i3.f56941b);
        c4590v8.f57811e.f56658a = (C4186f8) eiFromModel.f55185a;
        c4590v8.f57807a = c4259i3.f56940a;
        return Collections.singletonList(new Ei(c4590v8, new C4078b3(C4078b3.b(eiFromModel))));
    }

    public C4284j3(C4310k3 c4310k3) {
        this.f56993a = c4310k3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4259i3 a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
