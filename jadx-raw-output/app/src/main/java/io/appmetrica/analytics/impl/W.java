package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class W implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4680yn f56045a;

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 fromModel(@NonNull V v10) {
        S5 s10 = new S5();
        C4655xn c4655xn = v10.f56001a;
        if (c4655xn != null) {
            s10.f55851a = this.f56045a.fromModel(c4655xn);
        }
        s10.f55852b = new C4081b6[v10.f56002b.size()];
        int i10 = 0;
        Iterator it = v10.f56002b.iterator();
        while (it.hasNext()) {
            s10.f55852b[i10] = this.f56045a.fromModel((C4655xn) it.next());
            i10++;
        }
        String str = v10.f56003c;
        if (str != null) {
            s10.f55853c = str;
        }
        return s10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public W(@NonNull C4680yn c4680yn) {
        this.f56045a = c4680yn;
    }

    @NonNull
    public final V a(@NonNull S5 s10) {
        throw new UnsupportedOperationException();
    }
}
