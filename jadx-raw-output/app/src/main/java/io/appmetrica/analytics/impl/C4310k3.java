package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4310k3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hf f57067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4614w7 f57068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4672yf f57069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4246hg f57070d;

    public C4310k3() {
        this(new Hf(), new C4614w7(), new C4672yf(), new C4246hg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull C4336l3 c4336l3) {
        Ei eiA;
        C4186f8 c4186f8 = new C4186f8();
        Ei eiA2 = this.f57067a.fromModel(c4336l3.f57162a);
        c4186f8.f56723a = (C4416o8) eiA2.f55185a;
        c4186f8.f56725c = this.f57068b.fromModel(c4336l3.f57163b);
        Ei eiA3 = this.f57069c.fromModel(c4336l3.f57164c);
        c4186f8.f56726d = (C4391n8) eiA3.f55185a;
        C4673yg c4673yg = c4336l3.f57165d;
        if (c4673yg != null) {
            eiA = this.f57070d.fromModel(c4673yg);
            c4186f8.f56724b = (C4466q8) eiA.f55185a;
        } else {
            eiA = null;
        }
        return new Ei(c4186f8, new C4078b3(C4078b3.b(eiA2, eiA3, eiA)));
    }

    public C4310k3(Hf hf2, C4614w7 c4614w7, C4672yf c4672yf, C4246hg c4246hg) {
        this.f57067a = hf2;
        this.f57068b = c4614w7;
        this.f57069c = c4672yf;
        this.f57070d = c4246hg;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4336l3 a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
