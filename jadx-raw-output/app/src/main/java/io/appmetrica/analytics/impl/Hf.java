package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Hf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4546te f55304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4672yf f55305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4361m3 f55306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jf f55307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4542ta f55308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4542ta f55309f;

    public Hf() {
        this(new C4546te(), new C4672yf(), new C4361m3(), new Jf(), new C4542ta(100), new C4542ta(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull If r10) {
        Ei eiFromModel;
        Ei eiFromModel2;
        Ei eiA;
        Ei eiA2;
        C4416o8 c4416o8 = new C4416o8();
        Nn nnA = this.f55308e.a(r10.f55345a);
        c4416o8.f57394a = StringUtils.getUTF8Bytes((String) nnA.f55658a);
        Nn nnA2 = this.f55309f.a(r10.f55346b);
        c4416o8.f57395b = StringUtils.getUTF8Bytes((String) nnA2.f55658a);
        List<String> list = r10.f55347c;
        Ei eiFromModel3 = null;
        if (list != null) {
            eiFromModel = this.f55306c.fromModel(list);
            c4416o8.f57396c = (C4212g8) eiFromModel.f55185a;
        } else {
            eiFromModel = null;
        }
        Map<String, String> map = r10.f55348d;
        if (map != null) {
            eiFromModel2 = this.f55304a.fromModel(map);
            c4416o8.f57397d = (C4366m8) eiFromModel2.f55185a;
        } else {
            eiFromModel2 = null;
        }
        Af af2 = r10.f55349e;
        if (af2 != null) {
            eiA = this.f55305b.fromModel(af2);
            c4416o8.f57398e = (C4391n8) eiA.f55185a;
        } else {
            eiA = null;
        }
        Af af3 = r10.f55350f;
        if (af3 != null) {
            eiA2 = this.f55305b.fromModel(af3);
            c4416o8.f57399f = (C4391n8) eiA2.f55185a;
        } else {
            eiA2 = null;
        }
        List<String> list2 = r10.f55351g;
        if (list2 != null) {
            eiFromModel3 = this.f55307d.fromModel(list2);
            c4416o8.f57400g = (C4441p8[]) eiFromModel3.f55185a;
        }
        return new Ei(c4416o8, new C4078b3(C4078b3.b(nnA, nnA2, eiFromModel, eiFromModel2, eiA, eiA2, eiFromModel3)));
    }

    public Hf(C4546te c4546te, C4672yf c4672yf, C4361m3 c4361m3, Jf jf2, C4542ta c4542ta, C4542ta c4542ta2) {
        this.f55304a = c4546te;
        this.f55305b = c4672yf;
        this.f55306c = c4361m3;
        this.f55307d = jf2;
        this.f55308e = c4542ta;
        this.f55309f = c4542ta2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final If a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
