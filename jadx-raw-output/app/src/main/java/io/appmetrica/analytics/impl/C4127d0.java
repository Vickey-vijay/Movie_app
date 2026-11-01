package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4127d0 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f56547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4262i6 f56548b;

    public C4127d0() {
        this(new W(new C4680yn()), new C4262i6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 fromModel(@NonNull C4101c0 c4101c0) {
        T5 t10 = new T5();
        t10.f55907a = this.f56547a.fromModel(c4101c0.f56429a);
        String str = c4101c0.f56430b;
        if (str != null) {
            t10.f55908b = str;
        }
        t10.f55909c = this.f56548b.a(c4101c0.f56431c);
        return t10;
    }

    public C4127d0(W w10, C4262i6 c4262i6) {
        this.f56547a = w10;
        this.f56548b = c4262i6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4101c0 a(@NonNull T5 t10) {
        throw new UnsupportedOperationException();
    }
}
