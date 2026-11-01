package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10406w extends AbstractC2223hQ {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{ExifInterface.START_CODE, 47, 107, 34, 56, 107, 37, 36, 63, 107, 57, 46, ExifInterface.START_CODE, 47, 50, 107, 36, 57, 107, ExifInterface.START_CODE, 39, 57, 46, ExifInterface.START_CODE, 47, 50, 107, 47, 34, 56, 59, 39, ExifInterface.START_CODE, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    static {
        A03();
    }

    public C10406w(C1977dL c1977dL, NT nt) {
        super(c1977dL, nt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j10) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j10));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean zIsEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (zIsEmpty) {
                return;
            }
            Iterator<String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new AsyncTaskC2076ex(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2223hQ
    public final void A0P() {
        C2273iN c2273iN = (C2273iN) this.A01;
        if (c2273iN.A0R()) {
            MQ mq = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (mq != null) {
                this.A07.A0B(c2273iN);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2223hQ
    public final void A0R(MP mp, TE te2, TC tc2, NU nu) {
        C2273iN c2273iN = (C2273iN) mp;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2220hN c2220hN = new C2220hN(this, nu, c2273iN, jCurrentTimeMillis, tc2);
        A0H().postDelayed(c2220hN, te2.A05().A05());
        c2273iN.A0L(this.A0B, new C2219hM(this, c2220hN, jCurrentTimeMillis, tc2), this.A09, nu, C1520Qc.A0K());
    }
}
