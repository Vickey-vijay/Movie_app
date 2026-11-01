package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4617wa extends D2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4542ta f57878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4542ta f57879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4592va f57880d;

    public C4617wa(int i10, int i11, int i12) {
        this(i10, new C4542ta(i11), new C4542ta(i12));
    }

    public C4617wa(int i10, @NonNull C4542ta c4542ta, @NonNull C4542ta c4542ta2) {
        super(i10);
        this.f57880d = new C4592va();
        this.f57878b = c4542ta;
        this.f57879c = c4542ta2;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC4567ua
    @NonNull
    public final Nn a(@Nullable Map<String, String> map) {
        HashMap map2;
        int bytesTruncated;
        int i10 = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f57880d);
            int length = entryArr.length;
            bytesTruncated = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = 0;
            while (i10 < length) {
                Map.Entry entry = entryArr[i10];
                Nn nnA = this.f57878b.a((String) entry.getKey());
                Nn nnA2 = this.f57879c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) nnA2.f55658a) + StringUtils.getUtf8BytesLength((String) nnA.f55658a);
                if (z10 || utf8BytesLength2 + i12 > this.f55129a) {
                    i11++;
                    bytesTruncated += utf8BytesLength;
                    z10 = true;
                } else {
                    bytesTruncated = nnA2.f55659b.getBytesTruncated() + nnA.f55659b.getBytesTruncated() + bytesTruncated;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) nnA2.f55658a) + StringUtils.getUtf8BytesLength((String) nnA.f55658a) + i12;
                    map2.put((String) nnA.f55658a, (String) nnA2.f55658a);
                    i12 = utf8BytesLength3;
                }
                i10++;
            }
            i10 = i11;
        } else {
            map2 = null;
            bytesTruncated = 0;
        }
        return new Nn(map2, new C4412o4(i10, bytesTruncated));
    }
}
