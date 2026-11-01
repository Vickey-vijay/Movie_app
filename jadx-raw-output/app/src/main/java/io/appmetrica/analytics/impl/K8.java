package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class K8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        M8 m10 = new M8();
        L8[] l8Arr = new L8[map.size()];
        int i10 = 0;
        for (Object obj : map.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nj.s.u();
            }
            Map.Entry entry = (Map.Entry) obj;
            L8 l10 = new L8();
            l10.f55511a = (String) entry.getKey();
            l10.f55512b = (byte[]) entry.getValue();
            l8Arr[i10] = l10;
            i10 = i11;
        }
        m10.f55566a = l8Arr;
        return MessageNano.toByteArray(m10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        L8[] l8Arr = ((M8) MessageNano.mergeFrom(new M8(), bArr)).f55566a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(l8Arr.length), 16));
        for (L8 l10 : l8Arr) {
            Pair pairA = mj.h.a(l10.f55511a, l10.f55512b);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }
}
