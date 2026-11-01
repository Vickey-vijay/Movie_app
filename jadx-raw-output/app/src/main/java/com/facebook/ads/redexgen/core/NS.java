package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class NS {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    public static void A02(C1977dL c1977dL, SF sf2, AnonymousClass73 anonymousClass73) {
        sf2.A0d(new SD(anonymousClass73.A23().A01(), C1943cm.A04, C1943cm.A04, anonymousClass73.A17(), A00(17, 14, 113)));
        boolean zA1Y = anonymousClass73.A1Y();
        if (zA1Y) {
            SB sb2 = new SB(anonymousClass73.A0s(), anonymousClass73.A17(), A00(17, 14, 113));
            sb2.A04 = true;
            sb2.A03 = A00(0, 5, 66);
            sf2.A0Y(sb2);
        }
        boolean isDSL = C2032eF.A03();
        boolean zA2s = U7.A2s(c1977dL, isDSL);
        SB sb3 = new SB(anonymousClass73.A20().A0H().A09(), anonymousClass73.A17(), A00(17, 14, 113), anonymousClass73.A20().A0H().A06());
        if (zA1Y && !zA2s) {
            sf2.A0Y(sb3);
        } else {
            sf2.A0b(sb3);
        }
        sf2.A0d(new SD(anonymousClass73.A20().A0H().A08(), NN.A00(anonymousClass73.A20().A0H()), NN.A01(anonymousClass73.A20().A0H()), anonymousClass73.A17(), A00(17, 14, 113)));
        Iterator<String> it = anonymousClass73.A20().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            sf2.A0d(new SD(url, -1, -1, anonymousClass73.A17(), A00(17, 14, 113)));
        }
    }

    public static void A03(C1977dL c1977dL, SF sf2, AnonymousClass73 anonymousClass73) {
        int i10 = 0;
        for (C1431Mp c1431Mp : anonymousClass73.A27()) {
            SD sd2 = new SD(c1431Mp.A0H().A08(), NN.A00(c1431Mp.A0H()), NN.A01(c1431Mp.A0H()), anonymousClass73.A17(), A00(5, 12, 118));
            if (i10 == 0) {
                sf2.A0c(sd2);
            } else {
                sf2.A0d(sd2);
            }
            Iterator<String> it = c1431Mp.A0K().A02().iterator();
            while (it.hasNext()) {
                sf2.A0d(new SD(it.next(), -1, -1, anonymousClass73.A17(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(c1431Mp.A0H().A09())) {
                new SB(c1431Mp.A0H().A09(), anonymousClass73.A17(), A00(5, 12, 118), c1431Mp.A0H().A06()).A04 = false;
            }
            i10++;
        }
    }
}
