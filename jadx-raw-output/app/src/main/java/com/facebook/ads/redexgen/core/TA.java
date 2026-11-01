package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TA extends MQ {
    public static byte[] A01;
    public final /* synthetic */ C1520Qc A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, 127, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, 127, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, 127, 98, 63};
    }

    public TA(C1520Qc c1520Qc) {
        this.A00 = c1520Qc;
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0B(C2273iN c2273iN) {
        this.A00.A1W(c2273iN);
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0C() {
        if (this.A00.A0G != null) {
            this.A00.A0G.ACD();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0F(MP mp) {
        if (this.A00.A0A != null) {
            this.A00.A0A.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0G(V1 v10) {
        this.A00.A12().A0F().A3F(XG.A01(this.A00.A00), v10.A03().getErrorCode(), v10.A04());
        if (this.A00.A0G != null) {
            this.A00.A0G.ADB(v10);
        }
    }
}
