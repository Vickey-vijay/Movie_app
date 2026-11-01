package com.facebook.ads.redexgen.core;

import android.text.Layout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1356Jr {
    public static byte[] A0J;
    public static String[] A0K = {"Usxox1Jpg4zI1D26A46628IJoKVIfDOb", "DJj4Y7Lf5wmbgFbmipnyENDrbENW0zBu", "xAirbBVx6sN", "JUHzrsF6PskbrsOcxUQeRZ6EJgAR84BH", "g21uR390", "sct5cBRRGNi", "fSzYgZjiZ3zjw2rk03FKz0970uetzuqd", "YzsQQs1"};
    public float A00;
    public int A02;
    public int A04;
    public Layout.Alignment A0C;
    public Layout.Alignment A0D;
    public C1345Jg A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public int A07 = -1;
    public int A0B = -1;
    public int A03 = -1;
    public int A06 = -1;
    public int A05 = -1;
    public int A09 = -1;
    public int A08 = -1;
    public int A0A = -1;
    public float A01 = Float.MAX_VALUE;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0J = new byte[]{-24, 7, 9, 17, 13, 24, 21, 27, 20, 10, -58, 9, 21, 18, 21, 24, -58, 14, 7, 25, -58, 20, 21, 26, -58, 8, 11, 11, 20, -58, 10, 11, 12, 15, 20, 11, 10, -44, -27, 14, 13, 19, -65, 2, 14, 11, 14, 17, -65, 7, 0, 18, -65, 13, 14, 19, -65, 1, 4, 4, 13, -65, 3, 4, 5, 8, 13, 4, 3, -51};
    }

    static {
        A02();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    private C1356Jr A00(C1356Jr c1356Jr, boolean z10) {
        if (c1356Jr != null) {
            if (!this.A0I && c1356Jr.A0I) {
                A0H(c1356Jr.A04);
            }
            if (this.A03 == -1) {
                this.A03 = c1356Jr.A03;
            }
            if (this.A06 == -1) {
                this.A06 = c1356Jr.A06;
            }
            if (this.A0F == null) {
                String str = c1356Jr.A0F;
                String[] strArr = A0K;
                if (strArr[3].charAt(11) != strArr[1].charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0K;
                strArr2[2] = "cxifAUO6W4n";
                strArr2[5] = "Va8L5s638mc";
                if (str != null) {
                    this.A0F = c1356Jr.A0F;
                }
            }
            if (this.A07 == -1) {
                this.A07 = c1356Jr.A07;
            }
            if (this.A0B == -1) {
                this.A0B = c1356Jr.A0B;
            }
            int i10 = this.A08;
            String[] strArr3 = A0K;
            if (strArr3[2].length() != strArr3[5].length()) {
                throw new RuntimeException();
            }
            A0K[6] = "rpCcf5jyKzMEHl3XckJI6ROuZzizfKVN";
            if (i10 == -1) {
                this.A08 = c1356Jr.A08;
            }
            Layout.Alignment alignment = this.A0D;
            if (A0K[6].charAt(6) != 'j') {
                A0K[0] = "iHkaK3PGLb6DAQNakyilLZ3b8fweVD8f";
                if (alignment == null) {
                    if (c1356Jr.A0D != null) {
                        this.A0D = c1356Jr.A0D;
                    }
                }
            } else {
                A0K[0] = "IvRWfCdmbtpyZ5Utg7SC4PH3AC5nND0h";
                if (alignment == null) {
                    if (c1356Jr.A0D != null) {
                        this.A0D = c1356Jr.A0D;
                    }
                }
            }
            if (this.A0C == null && c1356Jr.A0C != null) {
                this.A0C = c1356Jr.A0C;
            }
            if (this.A0A == -1) {
                this.A0A = c1356Jr.A0A;
            }
            if (this.A05 == -1) {
                this.A05 = c1356Jr.A05;
                this.A00 = c1356Jr.A00;
            }
            if (this.A0E == null) {
                this.A0E = c1356Jr.A0E;
            }
            if (this.A01 == Float.MAX_VALUE) {
                this.A01 = c1356Jr.A01;
            }
            if (z10 && !this.A0H && c1356Jr.A0H) {
                A0G(c1356Jr.A02);
            }
            if (z10 && this.A09 == -1 && c1356Jr.A09 != -1) {
                this.A09 = c1356Jr.A09;
            }
        }
        return this;
    }

    public final float A03() {
        return this.A00;
    }

    public final float A04() {
        return this.A01;
    }

    public final int A05() {
        if (this.A0H) {
            return this.A02;
        }
        throw new IllegalStateException(A01(0, 38, 55));
    }

    public final int A06() {
        if (this.A0I) {
            return this.A04;
        }
        throw new IllegalStateException(A01(38, 32, 48));
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A08;
    }

    public final int A09() {
        return this.A09;
    }

    public final int A0A() {
        if (this.A03 == -1 && this.A06 == -1) {
            return -1;
        }
        int i10 = (this.A03 == 1 ? 1 : 0) | (this.A06 == 1 ? 2 : 0);
        String[] strArr = A0K;
        if (strArr[2].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[2] = "pc7acbLDMjB";
        strArr2[5] = "xuQHQFUerHu";
        return i10;
    }

    public final Layout.Alignment A0B() {
        return this.A0C;
    }

    public final Layout.Alignment A0C() {
        return this.A0D;
    }

    public final C1345Jg A0D() {
        return this.A0E;
    }

    public final C1356Jr A0E(float f10) {
        this.A00 = f10;
        return this;
    }

    public final C1356Jr A0F(float f10) {
        this.A01 = f10;
        return this;
    }

    public final C1356Jr A0G(int i10) {
        this.A02 = i10;
        this.A0H = true;
        return this;
    }

    public final C1356Jr A0H(int i10) {
        this.A04 = i10;
        this.A0I = true;
        return this;
    }

    public final C1356Jr A0I(int i10) {
        this.A05 = i10;
        return this;
    }

    public final C1356Jr A0J(int i10) {
        this.A08 = i10;
        return this;
    }

    public final C1356Jr A0K(int i10) {
        this.A09 = i10;
        return this;
    }

    public final C1356Jr A0L(Layout.Alignment alignment) {
        this.A0C = alignment;
        return this;
    }

    public final C1356Jr A0M(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C1356Jr A0N(C1345Jg c1345Jg) {
        this.A0E = c1345Jg;
        return this;
    }

    public final C1356Jr A0O(C1356Jr c1356Jr) {
        return A00(c1356Jr, true);
    }

    public final C1356Jr A0P(String str) {
        this.A0F = str;
        return this;
    }

    public final C1356Jr A0Q(String str) {
        this.A0G = str;
        return this;
    }

    public final C1356Jr A0R(boolean z10) {
        this.A03 = z10 ? 1 : 0;
        return this;
    }

    public final C1356Jr A0S(boolean z10) {
        this.A06 = z10 ? 1 : 0;
        return this;
    }

    public final C1356Jr A0T(boolean z10) {
        this.A07 = z10 ? 1 : 0;
        return this;
    }

    public final C1356Jr A0U(boolean z10) {
        this.A0A = z10 ? 1 : 0;
        return this;
    }

    public final C1356Jr A0V(boolean z10) {
        this.A0B = z10 ? 1 : 0;
        return this;
    }

    public final String A0W() {
        return this.A0F;
    }

    public final String A0X() {
        return this.A0G;
    }

    public final boolean A0Y() {
        return this.A0A == 1;
    }

    public final boolean A0Z() {
        return this.A0H;
    }

    public final boolean A0a() {
        return this.A0I;
    }

    public final boolean A0b() {
        return this.A07 == 1;
    }

    public final boolean A0c() {
        return this.A0B == 1;
    }
}
