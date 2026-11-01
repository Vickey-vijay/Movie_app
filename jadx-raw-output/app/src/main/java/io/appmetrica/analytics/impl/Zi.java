package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Zi implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4546te f56291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4361m3 f56292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4542ta f56293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4542ta f56294d;

    public Zi() {
        this(new C4546te(), new C4361m3(), new C4542ta(100), new C4542ta(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull C4146dj c4146dj) {
        Ei eiA;
        C4490r8 c4490r8 = new C4490r8();
        Nn nnA = this.f56293c.a(c4146dj.f56600a);
        c4490r8.f57594a = StringUtils.getUTF8Bytes((String) nnA.f55658a);
        List<String> list = c4146dj.f56601b;
        Ei eiA2 = null;
        if (list != null) {
            eiA = this.f56292b.fromModel(list);
            c4490r8.f57595b = (C4212g8) eiA.f55185a;
        } else {
            eiA = null;
        }
        Nn nnA2 = this.f56294d.a(c4146dj.f56602c);
        c4490r8.f57596c = StringUtils.getUTF8Bytes((String) nnA2.f55658a);
        Map<String, String> map = c4146dj.f56603d;
        if (map != null) {
            eiA2 = this.f56291a.fromModel(map);
            c4490r8.f57597d = (C4366m8) eiA2.f55185a;
        }
        return new Ei(c4490r8, new C4078b3(C4078b3.b(nnA, eiA, nnA2, eiA2)));
    }

    public Zi(C4546te c4546te, C4361m3 c4361m3, C4542ta c4542ta, C4542ta c4542ta2) {
        this.f56291a = c4546te;
        this.f56292b = c4361m3;
        this.f56293c = c4542ta;
        this.f56294d = c4542ta2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4146dj a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
