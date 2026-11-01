package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Je implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U5[] fromModel(Map<String, String> map) {
        int size = map.size();
        U5[] u5Arr = new U5[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            u5Arr[i11] = new U5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            U5 u10 = u5Arr[i10];
            String key = entry.getKey();
            Charset charset = lk.c.f63591b;
            u10.f55965a = key.getBytes(charset);
            u5Arr[i10].f55966b = entry.getValue().getBytes(charset);
            i10++;
        }
        return u5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(U5[] u5Arr) {
        throw new UnsupportedOperationException();
    }
}
