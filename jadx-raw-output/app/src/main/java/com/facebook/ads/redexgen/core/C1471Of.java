package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1471Of implements ZN {
    public static byte[] A01;
    public final /* synthetic */ OD A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, ExifInterface.MARKER_EOI, -36, -17, -32, -32, -33, -20, -33, -34, ExifInterface.MARKER_EOI, -35, -26, -29, -35, -27, ExifInterface.MARKER_EOI, -29, -37, -36, ExifInterface.MARKER_EOI, -33, -14, -18, -33, -20, -24, -37, -26, ExifInterface.MARKER_EOI, -24, -37, -16, -29, ExifInterface.MARKER_APP1, -37, -18, -29, -23, -24};
    }

    public C1471Of(OD od2) {
        this.A00 = od2;
    }

    @Override // com.facebook.ads.redexgen.core.ZN
    public final void ACl() {
        this.A00.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.ZN
    public final void AEL() {
        this.A00.A0H(A00(0, 43, 56));
    }
}
