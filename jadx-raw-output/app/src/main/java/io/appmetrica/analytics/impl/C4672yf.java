package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4672yf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f58023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4697zf f58024b;

    public C4672yf() {
        this(new Y(), new C4697zf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull Af af2) {
        int bytesTruncated;
        C4391n8 c4391n8 = new C4391n8();
        Ei eiFromModel = this.f58023a.fromModel(af2.f54960a);
        c4391n8.f57334a = (C4135d8) eiFromModel.f55185a;
        Nn nnA = this.f58024b.a(af2.f54961b);
        if (mo.a((Collection) nnA.f55658a)) {
            bytesTruncated = 0;
        } else {
            c4391n8.f57335b = new C4135d8[((List) nnA.f55658a).size()];
            bytesTruncated = 0;
            for (int i10 = 0; i10 < ((List) nnA.f55658a).size(); i10++) {
                Ei eiFromModel2 = this.f58023a.fromModel((Z) ((List) nnA.f55658a).get(i10));
                c4391n8.f57335b[i10] = (C4135d8) eiFromModel2.f55185a;
                bytesTruncated += eiFromModel2.f55186b.getBytesTruncated();
            }
        }
        return new Ei(c4391n8, new C4078b3(C4078b3.b(eiFromModel, nnA, new C4078b3(bytesTruncated))));
    }

    public C4672yf(Y y10, C4697zf c4697zf) {
        this.f58023a = y10;
        this.f58024b = c4697zf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Af a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
