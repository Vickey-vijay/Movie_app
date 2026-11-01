package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4546te implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4617wa f57730a;

    public C4546te() {
        this(new C4617wa(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull Map<String, String> map) {
        Nn nnA = this.f57730a.a(map);
        C4366m8 c4366m8 = new C4366m8();
        c4366m8.f57267b = ((C4412o4) nnA.f55659b).f57376b;
        Map map2 = (Map) nnA.f55658a;
        if (map2 != null) {
            c4366m8.f57266a = new C4341l8[map2.size()];
            int i10 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c4366m8.f57266a[i10] = new C4341l8();
                c4366m8.f57266a[i10].f57178a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c4366m8.f57266a[i10].f57179b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i10++;
            }
        }
        InterfaceC4104c3 interfaceC4104c3 = nnA.f55659b;
        int i11 = ((C4412o4) interfaceC4104c3).f56400a;
        return new Ei(c4366m8, interfaceC4104c3);
    }

    @VisibleForTesting
    public C4546te(@NonNull C4617wa c4617wa) {
        this.f57730a = c4617wa;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Map<String, String> a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }
}
