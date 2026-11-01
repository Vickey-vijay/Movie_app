package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4148dl implements InterfaceC4109c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zi f56611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hf f56612b;

    public C4148dl() {
        this(new Zi(), new Hf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4122cl c4122cl) {
        C4590v8 c4590v8 = new C4590v8();
        c4590v8.f57807a = 2;
        c4590v8.f57809c = new C4515s8();
        Ei eiFromModel = this.f56611a.fromModel(c4122cl.f56530b);
        c4590v8.f57809c.f57656b = (C4490r8) eiFromModel.f55185a;
        Ei eiFromModel2 = this.f56612b.fromModel(c4122cl.f56529a);
        c4590v8.f57809c.f57655a = (C4416o8) eiFromModel2.f55185a;
        return Collections.singletonList(new Ei(c4590v8, new C4078b3(C4078b3.b(eiFromModel, eiFromModel2))));
    }

    public C4148dl(Zi zi2, Hf hf2) {
        this.f56611a = zi2;
        this.f56612b = hf2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4122cl a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
