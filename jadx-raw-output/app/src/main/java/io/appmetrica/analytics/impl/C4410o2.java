package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4410o2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4430om fromModel(@NonNull C4385n2 c4385n2) {
        C4380mm c4380mm;
        C4430om c4430om = new C4430om();
        c4430om.f57457a = new C4405nm[c4385n2.f57304a.size()];
        for (int i10 = 0; i10 < c4385n2.f57304a.size(); i10++) {
            C4405nm c4405nm = new C4405nm();
            Pair pair = (Pair) c4385n2.f57304a.get(i10);
            c4405nm.f57367a = (String) pair.first;
            if (pair.second != null) {
                c4405nm.f57368b = new C4380mm();
                C4360m2 c4360m2 = (C4360m2) pair.second;
                if (c4360m2 == null) {
                    c4380mm = null;
                } else {
                    C4380mm c4380mm2 = new C4380mm();
                    c4380mm2.f57292a = c4360m2.f57239a;
                    c4380mm = c4380mm2;
                }
                c4405nm.f57368b = c4380mm;
            }
            c4430om.f57457a[i10] = c4405nm;
        }
        return c4430om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4385n2 toModel(@NonNull C4430om c4430om) {
        ArrayList arrayList = new ArrayList();
        for (C4405nm c4405nm : c4430om.f57457a) {
            String str = c4405nm.f57367a;
            C4380mm c4380mm = c4405nm.f57368b;
            arrayList.add(new Pair(str, c4380mm == null ? null : new C4360m2(c4380mm.f57292a)));
        }
        return new C4385n2(arrayList);
    }
}
