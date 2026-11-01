package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.74, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass74 extends AbstractC2252hy {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{52, 59, 46, 51, 44, 63};
    }

    public AnonymousClass74(List<C1431Mp> list) {
        super(list);
    }

    public static AnonymousClass74 A00(JSONObject jSONObject, C1977dL c1977dL) {
        AnonymousClass74 anonymousClass74 = new AnonymousClass74(AbstractC2252hy.A08(jSONObject, c1977dL, new C2243hm()));
        anonymousClass74.A29(jSONObject);
        anonymousClass74.A1I(A01(0, 6, 107));
        return anonymousClass74;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1430Mo
    public final int A0l() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1430Mo
    public final int A0m() {
        return 0;
    }
}
