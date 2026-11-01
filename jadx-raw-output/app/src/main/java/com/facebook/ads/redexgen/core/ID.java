package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ID {
    public static String[] A02 = {"FbN3icTzKhcmmOzEdUfRhsUcZXOxDMx7", "gRO2jrgUj", "b8s", "WfQv3ylCa", "vfaK2gbRuWFTNhe4O3MK62WfTyU3BnZK", "pVe6dBWT2JPKzaWtvTS73YU0fEYT7kcM", "E55gBTZIZGS8er9hAJqyKM4XsX", "9GOGOeqncrOiIcn9"};
    public int A00;
    public final C4J A01 = new C4J(8);

    private long A00(InterfaceC2443lN interfaceC2443lN) throws IOException {
        interfaceC2443lN.AG9(this.A01.A0l(), 0, 1);
        int i10 = this.A01.A0l()[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int mask = 128;
        int length = 0;
        while (value == 0) {
            mask >>= 1;
            length++;
        }
        int value = ~mask;
        int i11 = i10 & value;
        interfaceC2443lN.AG9(this.A01.A0l(), 1, length);
        for (int i12 = 0; i12 < length; i12++) {
            int value2 = i12 + 1;
            i11 = (i11 << 8) + (this.A01.A0l()[value2] & 255);
        }
        int mask2 = this.A00;
        int value3 = length + 1;
        this.A00 = mask2 + value3;
        return i11;
    }

    public final boolean A01(InterfaceC2443lN interfaceC2443lN) throws IOException {
        long jA8G = interfaceC2443lN.A8G();
        long j10 = 1024;
        if (jA8G != -1 && jA8G <= 1024) {
            j10 = jA8G;
        }
        int i10 = (int) j10;
        boolean z10 = false;
        interfaceC2443lN.AG9(this.A01.A0l(), 0, 4);
        long jA0Q = this.A01.A0Q();
        this.A00 = 4;
        while (jA0Q != 440786851) {
            int i11 = this.A00 + 1;
            this.A00 = i11;
            if (i11 == i10) {
                return false;
            }
            interfaceC2443lN.AG9(this.A01.A0l(), 0, 1);
            long j11 = jA0Q << 8;
            if (A02[5].charAt(9) == 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "keWgERcis7TdroPm";
            strArr[2] = "OXY";
            jA0Q = (j11 & (-256)) | ((long) (this.A01.A0l()[0] & 255));
        }
        long jA00 = A00(interfaceC2443lN);
        int i12 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[7].length() == strArr2[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[0] = "8USntBNRnGq1k7YndUZ918x7mjNkxlAo";
        strArr3[4] = "NlU12704XsvvTftMDquGsme1zZ9M6Gib";
        long j12 = i12;
        if (jA00 == Long.MIN_VALUE) {
            return false;
        }
        if (jA8G != -1 && j12 + jA00 >= jA8G) {
            return false;
        }
        while (this.A00 < j12 + jA00) {
            if (A00(interfaceC2443lN) == Long.MIN_VALUE) {
                return z10;
            }
            long jA01 = A00(interfaceC2443lN);
            String[] strArr4 = A02;
            if (strArr4[0].charAt(12) != strArr4[4].charAt(12)) {
                String[] strArr5 = A02;
                strArr5[0] = "WOjoKoWSnEX2mR88EDllzX7MR8FXWjEu";
                strArr5[4] = "zFQ8S5RVgPrJFIVyTDDE2qr0iqJgcsXB";
                if (jA01 < 0) {
                    return false;
                }
            } else {
                A02[6] = "uJmDg5c2xISP09FpPwUdNktwoy";
                if (jA01 < 0) {
                    return false;
                }
            }
            if (jA01 > 2147483647L) {
                return false;
            }
            if (jA01 != 0) {
                int i13 = (int) jA01;
                interfaceC2443lN.A3z(i13);
                this.A00 += i13;
            }
            z10 = false;
        }
        return ((long) this.A00) == j12 + jA00;
    }
}
