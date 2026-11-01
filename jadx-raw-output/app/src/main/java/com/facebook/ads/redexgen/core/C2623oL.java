package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2623oL implements C1S {
    public static byte[] A0H;
    public static String[] A0I = {"AtN4gZlBq", "c6vG0ZoB350sNCwGTcbmyQxG", "GzjisXMF7MeBETThzgY0McLZmUxvZEHG", "X6Q", "OR9IAwpAbXPQPDykEqLOHO0nD", "OJOMvHQBuYweGyqOlvOJ7Ft7l3L2", "Cgb", "Ei80eZ3oJ"};
    public static final C1R<C2623oL> A0J;
    public static final Object A0K;
    public static final C2645oi A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C2647ok A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;

    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public C2645oi A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2623oL A00(Bundle bundle) {
        C2647ok c2647ok;
        Bundle bundle2 = bundle.getBundle(A0W);
        C2645oi c2645oi = bundle2 != null ? (C2645oi) C2645oi.A08.A6X(bundle2) : C2645oi.A09;
        long j10 = bundle.getLong(A0Y, -9223372036854775807L);
        long j11 = bundle.getLong(A0Z, -9223372036854775807L);
        long j12 = bundle.getLong(A0P, -9223372036854775807L);
        boolean z10 = bundle.getBoolean(A0T, false);
        boolean z11 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        if (bundle3 != null) {
            c2647ok = (C2647ok) C2647ok.A06.A6X(bundle3);
        } else {
            c2647ok = null;
            if (A0I[2].charAt(1) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[6] = "auZ";
            strArr[3] = "aKQ";
        }
        boolean z12 = bundle.getBoolean(A0S, false);
        long j13 = bundle.getLong(A0N, 0L);
        long j14 = bundle.getLong(A0O, -9223372036854775807L);
        int i10 = bundle.getInt(A0Q, 0);
        int i11 = bundle.getInt(A0U, 0);
        long j15 = bundle.getLong(A0X, 0L);
        C2623oL c2623oL = new C2623oL();
        c2623oL.A07(A0M, c2645oi, null, j10, j11, j12, z10, z11, c2647ok, j13, j14, i10, i11, j15);
        c2623oL.A0F = z12;
        return c2623oL;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{6, 10, 8, 75, 3, 4, 6, 0, 7, 10, 10, 14, 75, 4, 1, 22, 75, 4, 11, 1, 23, 10, 12, 1, 29, 75, 8, 0, 1, 12, 4, 86, 75, 6, 10, 8, 8, 10, 11, 75, 49, 12, 8, 0, 9, 12, 11, 0};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new C2I().A03(A02(0, 48, 107)).A00(Uri.EMPTY).A05();
        A0W = AbstractC09664a.A0h(1);
        A0Y = AbstractC09664a.A0h(2);
        A0Z = AbstractC09664a.A0h(3);
        A0P = AbstractC09664a.A0h(4);
        A0T = AbstractC09664a.A0h(5);
        A0R = AbstractC09664a.A0h(6);
        A0V = AbstractC09664a.A0h(7);
        A0S = AbstractC09664a.A0h(8);
        A0N = AbstractC09664a.A0h(9);
        A0O = AbstractC09664a.A0h(10);
        A0Q = AbstractC09664a.A0h(11);
        A0U = AbstractC09664a.A0h(12);
        A0X = AbstractC09664a.A0h(13);
        A0J = new C1R() { // from class: com.facebook.ads.redexgen.X.oM
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2623oL.A00(bundle);
            }
        };
    }

    public final long A04() {
        return AbstractC09664a.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return AbstractC09664a.A0P(this.A03);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    public final C2623oL A07(Object obj, C2645oi c2645oi, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, C2647ok c2647ok, long j13, long j14, int i10, int i11, long j15) {
        Object obj3;
        this.A0C = obj;
        this.A09 = c2645oi != null ? c2645oi : A0L;
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        A0I[5] = "sHLAwqiYlmMVa087WjDP7yFYW";
        if (c2645oi != null) {
            C2Q c2q = c2645oi.A03;
            if (A0I[2].charAt(1) != 'z') {
                A0I[2] = "JzGzHC0FwGnnWhMzWBrJaCXM29VIx9g1";
                if (c2q != null) {
                    obj3 = c2645oi.A03.A03;
                } else {
                    obj3 = null;
                }
            } else {
                A0I[5] = "IGwZtC";
                if (c2q != null) {
                    obj3 = c2645oi.A03.A03;
                } else {
                    obj3 = null;
                }
            }
        } else {
            obj3 = null;
        }
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j10;
        this.A07 = j11;
        this.A04 = j12;
        this.A0G = z10;
        this.A0D = z11;
        this.A0E = c2647ok != null;
        this.A08 = c2647ok;
        this.A02 = j13;
        this.A03 = j14;
        this.A00 = i10;
        this.A01 = i11;
        this.A05 = j15;
        this.A0F = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C2623oL c2623oL = (C2623oL) obj;
        if (AbstractC09664a.A1E(this.A0C, c2623oL.A0C) && AbstractC09664a.A1E(this.A09, c2623oL.A09) && AbstractC09664a.A1E(this.A0A, c2623oL.A0A) && AbstractC09664a.A1E(this.A08, c2623oL.A08) && this.A06 == c2623oL.A06 && this.A07 == c2623oL.A07 && this.A04 == c2623oL.A04 && this.A0G == c2623oL.A0G && this.A0D == c2623oL.A0D && this.A0F == c2623oL.A0F && this.A02 == c2623oL.A02 && this.A03 == c2623oL.A03 && this.A00 == c2623oL.A00 && this.A01 == c2623oL.A01) {
            long j10 = this.A05;
            long j11 = c2623oL.A05;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[6] = "Zdu";
            strArr2[3] = "ITW";
            if (j10 == j11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((7 * 31) + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31) + (this.A0A == null ? 0 : this.A0A.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0)) * 31) + ((int) (this.A06 ^ (this.A06 >>> 32)))) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + ((int) (this.A04 ^ (this.A04 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[6] = "6VN";
        strArr[3] = "iNJ";
        return (((((((((((((iHashCode * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (this.A05 ^ (this.A05 >>> 32)));
    }
}
