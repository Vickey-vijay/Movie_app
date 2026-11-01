package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1334Iv {
    public static byte[] A0B;
    public static String[] A0C = {"k49nAlN8KevTPYFSOASLph6sBsYk4fa7", "ZHcqIGWhgUaBv559uPYodmfdla4z6YNf", "jyudHMVcZvePNcLp", "lBa1kLRes0ajIcq6EZkhg1VE2ZO4hxQe", "m2AqQobddrkuylEWDBAfxEjZEg6GjKoy", "b8nnr3L8PmBoSjec6BWbo41G2gNha3bi", "", ""};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C4J A0A = new C4J(255);

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{55, 44, 49, 55, 50, 50, 45, 48, 54, 39, 38, 98, 32, 43, 54, 98, 49, 54, 48, 39, 35, 47, 98, 48, 39, 52, 43, 49, 43, 45, 44};
    }

    static {
        A01();
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(InterfaceC2443lN interfaceC2443lN) throws IOException {
        return A04(interfaceC2443lN, -1L);
    }

    public final boolean A04(InterfaceC2443lN interfaceC2443lN, long j10) throws IOException {
        int iAJG;
        C3M.A07(interfaceC2443lN.A8f() == interfaceC2443lN.A8a());
        this.A0A.A0d(4);
        while (true) {
            if (j10 != -1 && interfaceC2443lN.A8f() + 4 >= j10) {
                break;
            }
            boolean zA04 = GZ.A04(interfaceC2443lN, this.A0A.A0l(), 0, 4, true);
            if (A0C[4].charAt(30) == '5') {
                throw new RuntimeException();
            }
            A0C[0] = "pwarRjQHbZVi4rcQZ7lOEWakVYY08Z6g";
            if (!zA04) {
                break;
            }
            this.A0A.A0f(0);
            if (this.A0A.A0Q() == 1332176723) {
                interfaceC2443lN.AI1();
                return true;
            }
            interfaceC2443lN.AJJ(1);
        }
        do {
            if (j10 != -1 && interfaceC2443lN.A8f() >= j10) {
                break;
            }
            iAJG = interfaceC2443lN.AJG(1);
            if (A0C[0].charAt(26) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "68cxMfwSaXaldqHF3br6ENxggzqDHiHt";
            strArr[1] = "gDTREffoH4ayxQFZG5Xi34FUHKUeipYB";
        } while (iAJG != -1);
        return false;
    }

    public final boolean A05(InterfaceC2443lN interfaceC2443lN, boolean z10) throws IOException {
        A02();
        this.A0A.A0d(27);
        if (!GZ.A04(interfaceC2443lN, this.A0A.A0l(), 0, 27, z10) || this.A0A.A0Q() != 1332176723) {
            return false;
        }
        C4J c4j = this.A0A;
        if (A0C[0].charAt(26) != 'Y') {
            throw new RuntimeException();
        }
        A0C[2] = "M9XA72oAU7";
        this.A03 = c4j.A0I();
        if (this.A03 != 0) {
            if (z10) {
                return false;
            }
            throw C09222i.A00(A00(0, 31, 87));
        }
        this.A04 = this.A0A.A0I();
        this.A05 = this.A0A.A0N();
        this.A08 = this.A0A.A0O();
        this.A07 = this.A0A.A0O();
        this.A06 = this.A0A.A0O();
        this.A02 = this.A0A.A0I();
        this.A01 = this.A02 + 27;
        this.A0A.A0d(this.A02);
        if (!GZ.A04(interfaceC2443lN, this.A0A.A0l(), 0, this.A02, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < i; i10++) {
            int[] iArr = this.A09;
            int i11 = this.A0A.A0I();
            iArr[i10] = i11;
            int i12 = this.A00;
            int i13 = this.A09[i10];
            this.A00 = i12 + i13;
        }
        return true;
    }
}
