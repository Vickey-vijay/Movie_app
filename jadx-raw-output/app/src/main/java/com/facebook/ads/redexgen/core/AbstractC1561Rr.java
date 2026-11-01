package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1561Rr {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<C1559Rp> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
            i13++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, 27, 22, 17, 33, 40, 23, 36, 36, 27, 22, 23, 17, 15, 24, 15, 28, 19, 13, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static C1559Rp A00() {
        C1559Rp advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return C1559Rp.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C1559Rp A01(com.facebook.ads.redexgen.core.SQ r5, com.facebook.ads.redexgen.core.C1559Rp r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L29
        Lc:
            com.facebook.ads.redexgen.X.Rp r0 = com.facebook.ads.redexgen.core.AbstractC1566Rx.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.Su r5 = r5.A08()
            int r4 = com.facebook.ads.redexgen.core.AbstractC1590Sv.A1Q
            com.facebook.ads.redexgen.X.Sw r3 = new com.facebook.ads.redexgen.X.Sw
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 84
            java.lang.String r0 = A04(r2, r1, r0)
            r5.AAy(r0, r4, r3)
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1561Rr.A01(com.facebook.ads.redexgen.X.SQ, com.facebook.ads.redexgen.X.Rp):com.facebook.ads.redexgen.X.Rp");
    }

    public static C1559Rp A02(SQ sq, C1559Rp c1559Rp, C1560Rq c1560Rq) {
        C1562Rs c1562RsA00 = null;
        try {
            if (U6.A06(sq) && (c1559Rp == null || TextUtils.isEmpty(c1559Rp.A03()))) {
                c1562RsA00 = AbstractC1563Rt.A00(sq.getContentResolver());
            }
        } catch (Throwable th2) {
            sq.A08().AAy(A04(12, 7, 84), AbstractC1590Sv.A1S, new C1591Sw(th2));
        }
        if (c1562RsA00 != null && c1562RsA00.A01 != null) {
            A03.set(c1562RsA00.A01);
            c1560Rq.A05(c1562RsA00.A01);
        }
        if (c1559Rp == null && c1562RsA00 != null && !TextUtils.isEmpty(c1562RsA00.A00)) {
            return new C1559Rp(c1562RsA00.A00, c1562RsA00.A02, EnumC1558Ro.A04);
        }
        return c1559Rp;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(C1560Rq c1560Rq) {
        A02.set(c1560Rq.A02());
        A03.set(c1560Rq.A03());
    }

    public static void A07(SQ sq) {
        long jA01;
        C1559Rp advertisingIdInfo;
        try {
            C1560Rq c1560Rq = new C1560Rq(sq);
            A06(c1560Rq);
            if (A08()) {
                return;
            }
            C1559Rp advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                jA01 = advertisingIdInfo2.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < U6.A00(sq)) {
                return;
            }
            if (U6.A07(sq)) {
                advertisingIdInfo = A01(sq, A02(sq, null, c1560Rq));
            } else {
                advertisingIdInfo = A02(sq, A01(sq, null), c1560Rq);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c1560Rq.A04(advertisingIdInfo);
            }
        } catch (Throwable t10) {
            sq.A08().AAy(A04(12, 7, 84), AbstractC1590Sv.A1R, new C1591Sw(t10));
        }
    }

    public static boolean A08() {
        boolean z10 = false;
        boolean updated = WS.A04();
        if (updated) {
            String strA04 = A04(0, 12, 92);
            boolean updated2 = WS.A05(strA04);
            if (updated2) {
                A03.set(WS.A01(strA04));
                z10 = true;
            }
        }
        boolean zA04 = WS.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!zA04) {
            return z10;
        }
        String strA05 = A04(19, 13, 108);
        boolean updated3 = WS.A05(strA05);
        if (updated3) {
            String strA01 = WS.A01(strA05);
            AtomicReference<C1559Rp> atomicReference = A02;
            if (strA01 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    strA01 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    strA01 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new C1559Rp(strA01, false, EnumC1558Ro.A03));
            return true;
        }
        return z10;
    }
}
