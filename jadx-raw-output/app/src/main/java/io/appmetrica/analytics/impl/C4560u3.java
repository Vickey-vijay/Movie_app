package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4560u3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4660y3 fromModel(C4535t3 c4535t3) {
        C4660y3 c4660y3 = new C4660y3();
        c4660y3.f57994a = a(c4535t3.f57700a);
        int size = c4535t3.f57701b.size();
        C4585v3[] c4585v3Arr = new C4585v3[size];
        for (int i10 = 0; i10 < size; i10++) {
            c4585v3Arr[i10] = a((C4510s3) c4535t3.f57701b.get(i10));
        }
        c4660y3.f57995b = c4585v3Arr;
        return c4660y3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4535t3 toModel(C4660y3 c4660y3) {
        C4585v3 c4585v3 = c4660y3.f57994a;
        if (c4585v3 == null) {
            c4585v3 = new C4585v3();
        }
        C4510s3 c4510s3A = a(c4585v3);
        C4585v3[] c4585v3Arr = c4660y3.f57995b;
        ArrayList arrayList = new ArrayList(c4585v3Arr.length);
        for (C4585v3 c4585v4 : c4585v3Arr) {
            arrayList.add(a(c4585v4));
        }
        return new C4535t3(c4510s3A, arrayList);
    }

    public static C4585v3 a(C4510s3 c4510s3) {
        C4635x3 c4635x3;
        C4585v3 c4585v3 = new C4585v3();
        Map map = c4510s3.f57645a;
        int i10 = 0;
        if (map != null) {
            c4635x3 = new C4635x3();
            int size = map.size();
            C4610w3[] c4610w3Arr = new C4610w3[size];
            for (int i11 = 0; i11 < size; i11++) {
                c4610w3Arr[i11] = new C4610w3();
            }
            c4635x3.f57911a = c4610w3Arr;
            int i12 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C4610w3 c4610w3 = c4635x3.f57911a[i12];
                c4610w3.f57859a = str;
                c4610w3.f57860b = str2;
                i12++;
            }
        } else {
            c4635x3 = null;
        }
        c4585v3.f57787a = c4635x3;
        int iOrdinal = c4510s3.f57646b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i10 = 1;
            } else if (iOrdinal == 2) {
                i10 = 2;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 3;
            }
        }
        c4585v3.f57788b = i10;
        return c4585v3;
    }

    public static C4510s3 a(C4585v3 c4585v3) {
        LinkedHashMap linkedHashMap;
        T7 t10;
        C4635x3 c4635x3 = c4585v3.f57787a;
        if (c4635x3 != null) {
            C4610w3[] c4610w3Arr = c4635x3.f57911a;
            linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(c4610w3Arr.length), 16));
            for (C4610w3 c4610w3 : c4610w3Arr) {
                Pair pairA = mj.h.a(c4610w3.f57859a, c4610w3.f57860b);
                linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        int i10 = c4585v3.f57788b;
        if (i10 == 0) {
            t10 = T7.f55910b;
        } else if (i10 == 1) {
            t10 = T7.f55911c;
        } else if (i10 == 2) {
            t10 = T7.f55912d;
        } else if (i10 != 3) {
            t10 = T7.f55910b;
        } else {
            t10 = T7.f55913e;
        }
        return new C4510s3(linkedHashMap, t10);
    }
}
