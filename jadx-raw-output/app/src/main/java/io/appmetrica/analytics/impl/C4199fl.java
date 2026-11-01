package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4199fl implements InterfaceC4109c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hf f56780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4246hg f56781b;

    public C4199fl() {
        this(new Hf(), new C4246hg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4173el c4173el) {
        Ei eiFromModel;
        C4590v8 c4590v8 = new C4590v8();
        c4590v8.f57807a = 3;
        c4590v8.f57810d = new C4540t8();
        Ei eiFromModel2 = this.f56780a.fromModel(c4173el.f56672a);
        c4590v8.f57810d.f57708a = (C4416o8) eiFromModel2.f55185a;
        C4673yg c4673yg = c4173el.f56673b;
        if (c4673yg != null) {
            eiFromModel = this.f56781b.fromModel(c4673yg);
            c4590v8.f57810d.f57709b = (C4466q8) eiFromModel.f55185a;
        } else {
            eiFromModel = null;
        }
        return Collections.singletonList(new Ei(c4590v8, new C4078b3(C4078b3.b(eiFromModel2, eiFromModel))));
    }

    public C4199fl(Hf hf2, C4246hg c4246hg) {
        this.f56780a = hf2;
        this.f56781b = c4246hg;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4173el a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
