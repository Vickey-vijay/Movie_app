package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4291ja implements O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8 f57013a = new K8();

    public final C4136d9[] a(byte[] bArr) {
        int i10 = 0;
        if (bArr == null) {
            return new C4136d9[0];
        }
        Map<String, byte[]> model = this.f57013a.toModel(bArr);
        C4136d9[] c4136d9Arr = new C4136d9[model.size()];
        for (Object obj : model.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nj.s.u();
            }
            Map.Entry entry = (Map.Entry) obj;
            C4136d9 c4136d9 = new C4136d9();
            c4136d9.f56578a = ((String) entry.getKey()).getBytes(lk.c.f63591b);
            c4136d9.f56579b = (byte[]) entry.getValue();
            c4136d9Arr[i10] = c4136d9;
            i10 = i11;
        }
        return c4136d9Arr;
    }
}
