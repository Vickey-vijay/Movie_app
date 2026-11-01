package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4246hg implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zi f56903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4542ta f56904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4542ta f56905c;

    public C4246hg() {
        this(new Zi(), new C4542ta(100), new C4542ta(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull C4673yg c4673yg) {
        Ei eiFromModel;
        C4466q8 c4466q8 = new C4466q8();
        Nn nnA = this.f56904b.a(c4673yg.f58025a);
        c4466q8.f57554a = StringUtils.getUTF8Bytes((String) nnA.f55658a);
        Nn nnA2 = this.f56905c.a(c4673yg.f58026b);
        c4466q8.f57555b = StringUtils.getUTF8Bytes((String) nnA2.f55658a);
        C4146dj c4146dj = c4673yg.f58027c;
        if (c4146dj != null) {
            eiFromModel = this.f56903a.fromModel(c4146dj);
            c4466q8.f57556c = (C4490r8) eiFromModel.f55185a;
        } else {
            eiFromModel = null;
        }
        return new Ei(c4466q8, new C4078b3(C4078b3.b(nnA, nnA2, eiFromModel)));
    }

    public C4246hg(Zi zi2, C4542ta c4542ta, C4542ta c4542ta2) {
        this.f56903a = zi2;
        this.f56904b = c4542ta;
        this.f56905c = c4542ta2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4673yg a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
