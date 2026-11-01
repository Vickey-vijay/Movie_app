package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes.dex */
public final class Of implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    public final byte[] a(O8 o10, C4350lh c4350lh) {
        if (!TextUtils.isEmpty(o10.f55674b)) {
            try {
                byte[] bArrDecode = Base64.decode(o10.f55674b, 0);
                C4424og c4424og = (bArrDecode == null || bArrDecode.length == 0) ? null : new C4424og(bArrDecode);
                Wf wf2 = new Wf();
                String str = c4424og.f57445a;
                wf2.f56114a = str == null ? new byte[0] : str.getBytes();
                wf2.f56116c = c4424og.f57446b;
                wf2.f56115b = c4424og.f57447c;
                int iOrdinal = c4424og.f57448d.ordinal();
                int i10 = 2;
                if (iOrdinal == 1) {
                    i10 = 1;
                } else if (iOrdinal != 2) {
                    i10 = 0;
                }
                wf2.f56117d = i10;
                return MessageNano.toByteArray(wf2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
