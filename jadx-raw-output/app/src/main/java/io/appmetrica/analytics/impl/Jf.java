package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Jf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4517sa f55427a;

    public Jf() {
        this(new C4517sa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull List<String> list) {
        Nn nnA = this.f55427a.a((List<Object>) list);
        List list2 = (List) nnA.f55658a;
        C4441p8[] c4441p8Arr = new C4441p8[0];
        if (list2 != null) {
            c4441p8Arr = new C4441p8[list2.size()];
            for (int i10 = 0; i10 < list2.size(); i10++) {
                C4441p8 c4441p8 = new C4441p8();
                c4441p8Arr[i10] = c4441p8;
                c4441p8.f57498a = StringUtils.getUTF8Bytes((String) list2.get(i10));
            }
        }
        nnA.f55659b.getBytesTruncated();
        return new Ei(c4441p8Arr, nnA.f55659b);
    }

    @VisibleForTesting
    public Jf(@NonNull C4517sa c4517sa) {
        this.f55427a = c4517sa;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<String> a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
