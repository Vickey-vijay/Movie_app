package com.facebook.ads.androidx.media3.extractor.mkv;

import android.net.Uri;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.ads.redexgen.core.AbstractC09121w;
import com.facebook.ads.redexgen.core.AbstractC09664a;
import com.facebook.ads.redexgen.core.AbstractC1278Gq;
import com.facebook.ads.redexgen.core.AnonymousClass44;
import com.facebook.ads.redexgen.core.AnonymousClass45;
import com.facebook.ads.redexgen.core.C09222i;
import com.facebook.ads.redexgen.core.C1281Gt;
import com.facebook.ads.redexgen.core.C1287Gz;
import com.facebook.ads.redexgen.core.C2420kp;
import com.facebook.ads.redexgen.core.C2422kr;
import com.facebook.ads.redexgen.core.C2438lI;
import com.facebook.ads.redexgen.core.C2448lT;
import com.facebook.ads.redexgen.core.C3M;
import com.facebook.ads.redexgen.core.C4J;
import com.facebook.ads.redexgen.core.GX;
import com.facebook.ads.redexgen.core.GY;
import com.facebook.ads.redexgen.core.H1;
import com.facebook.ads.redexgen.core.I9;
import com.facebook.ads.redexgen.core.IC;
import com.facebook.ads.redexgen.core.ID;
import com.facebook.ads.redexgen.core.IE;
import com.facebook.ads.redexgen.core.InterfaceC1263Gb;
import com.facebook.ads.redexgen.core.InterfaceC1284Gw;
import com.facebook.ads.redexgen.core.InterfaceC2443lN;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MatroskaExtractor implements GX {
    public static byte[] A0t;
    public static String[] A0u = {"tBqjpPNwSsfRjGbhoSofYeEQJAfxpzeJ", "SQ32k5yHiSqu0tF5bV2mYZI8q27OK2Wk", "Ew8EcvFtYPYsbuW", "MeCkyRYcfoGShRSoQHq7qyLBTkTGcoSQ", "UyV8GtaWyEclMV8OhG", "yLkQb0Xo1O", "PFhexnCJ0GZtqtRWjlJ7uY4w9", "UodjFtXG6f6h7NmMQ857"};
    public static final InterfaceC1263Gb A0v;
    public static final Map<String, Integer> A0w;
    public static final UUID A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;

    @MetaExoPlayerCustomization("Removed the final from the member variable")
    public SparseArray<IC> A0P;
    public AnonymousClass45 A0Q;
    public AnonymousClass45 A0R;
    public GY A0S;
    public IC A0T;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "AR/VC customizations")
    public String A0U;
    public ByteBuffer A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public int[] A0f;
    public final C4J A0g;
    public final C4J A0h;
    public final C4J A0i;
    public final C4J A0j;
    public final C4J A0k;
    public final C4J A0l;
    public final C4J A0m;
    public final C4J A0n;
    public final C4J A0o;
    public final C4J A0p;
    public final I9 A0q;
    public final IE A0r;
    public final boolean A0s;

    /* JADX WARN: Code duplicated, block: B:102:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:104:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:110:0x03be A[LOOP:1: B:108:0x03ba->B:110:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0415  */
    /* JADX WARN: Code duplicated, block: B:131:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x020d A[PHI: r0
  0x020d: PHI (r0v193 byte[]) = (r0v192 byte[]), (r0v208 byte[]) binds: [B:63:0x0209, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0309  */
    /* JADX WARN: Code duplicated, block: B:92:0x0320  */
    /* JADX WARN: Code duplicated, block: B:95:0x0338  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @RequiresNonNull({"#2.output"})
    private int A02(InterfaceC2443lN interfaceC2443lN, IC ic2, int i10, boolean z10) throws IOException {
        int iA0A;
        byte[] bArrA0l;
        int i11;
        int i12;
        String[] strArr;
        String strA06;
        String str;
        String[] strArr2;
        String[] strArr3;
        boolean z11;
        byte[] bArrA0l2;
        if (A06(1012, 11, 56).equals(ic2.A0d)) {
            A0F(interfaceC2443lN, A10, i10);
            return A00();
        }
        String[] strArr4 = A0u;
        if (strArr4[5].length() != strArr4[6].length()) {
            A0u[3] = "Q42iXR6evmRi7JQ7PxfR7toxYIITwFkY";
            if (A06(1002, 10, 101).equals(ic2.A0d)) {
                A0F(interfaceC2443lN, A0z, i10);
                return A00();
            }
            if (A06(1023, 13, 32).equals(ic2.A0d)) {
                A0F(interfaceC2443lN, A11, i10);
                return A00();
            }
            H1 h10 = ic2.A0b;
            if (this.A0Y) {
                iA0A = i10 + this.A0k.A0A();
                if (A06(1207, 15, 14).equals(ic2.A0d)) {
                    bArrA0l = this.A0i.A0l();
                    bArrA0l[0] = 0;
                    bArrA0l[1] = 0;
                    bArrA0l[2] = 0;
                    i11 = ic2.A0Q;
                    i12 = 4 - ic2.A0Q;
                    while (this.A08 < iA0A) {
                        if (this.A0A == 0) {
                            A0G(interfaceC2443lN, bArrA0l, i12, i11);
                            this.A08 += i11;
                            this.A0i.A0f(0);
                            this.A0A = this.A0i.A0L();
                            this.A0j.A0f(0);
                            h10.AI7(this.A0j, 4);
                            strArr = A0u;
                            if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                String[] strArr5 = A0u;
                                strArr5[5] = "fro1mi6zSK";
                                strArr5[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                this.A09 += 4;
                            } else {
                                A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                this.A09 += 4;
                            }
                        } else {
                            int iA01 = A01(interfaceC2443lN, h10, this.A0A);
                            this.A08 += iA01;
                            this.A09 += iA01;
                            this.A0A -= iA01;
                        }
                    }
                } else {
                    strArr3 = A0u;
                    if (strArr3[2].length() != strArr3[4].length()) {
                        A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                        if (A06(1236, 16, 47).equals(ic2.A0d)) {
                            bArrA0l = this.A0i.A0l();
                            bArrA0l[0] = 0;
                            bArrA0l[1] = 0;
                            bArrA0l[2] = 0;
                            i11 = ic2.A0Q;
                            i12 = 4 - ic2.A0Q;
                            while (this.A08 < iA0A) {
                                if (this.A0A == 0) {
                                    A0G(interfaceC2443lN, bArrA0l, i12, i11);
                                    this.A08 += i11;
                                    this.A0i.A0f(0);
                                    this.A0A = this.A0i.A0L();
                                    this.A0j.A0f(0);
                                    h10.AI7(this.A0j, 4);
                                    strArr = A0u;
                                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                        String[] strArr6 = A0u;
                                        strArr6[5] = "fro1mi6zSK";
                                        strArr6[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                        this.A09 += 4;
                                    } else {
                                        A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                        this.A09 += 4;
                                    }
                                } else {
                                    int iA02 = A01(interfaceC2443lN, h10, this.A0A);
                                    this.A08 += iA02;
                                    this.A09 += iA02;
                                    this.A0A -= iA02;
                                }
                            }
                        } else {
                            if (ic2.A0c != null) {
                                if (this.A0k.A0A() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                C3M.A08(z11);
                                ic2.A0c.A03(interfaceC2443lN);
                            }
                            while (this.A08 < iA0A) {
                                int iA03 = A01(interfaceC2443lN, h10, iA0A - this.A08);
                                this.A08 += iA03;
                                this.A09 += iA03;
                            }
                        }
                    }
                }
                strA06 = A06(271, 8, 117);
                str = ic2.A0d;
                strArr2 = A0u;
                if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                    A0u[3] = "L5Y1ZRMfFWOxp58RZlemSr0Ie3cKRoNn";
                    if (strA06.equals(str)) {
                        this.A0p.A0f(0);
                        h10.AI7(this.A0p, 4);
                        this.A09 += 4;
                    }
                } else {
                    String[] strArr7 = A0u;
                    strArr7[2] = "6h0vzYYIjFmBqGs";
                    strArr7[4] = "2CBNjdNTCI84kXMqqr";
                    if (strA06.equals(str)) {
                        this.A0p.A0f(0);
                        h10.AI7(this.A0p, 4);
                        this.A09 += 4;
                    }
                }
                return A00();
            }
            if (ic2.A0i) {
                this.A02 &= -1073741825;
                int i13 = 128;
                if (!this.A0b) {
                    interfaceC2443lN.readFully(this.A0l.A0l(), 0, 1);
                    this.A08++;
                    if ((this.A0l.A0l()[0] & 128) == 128) {
                        throw C09222i.A01(A06(694, 35, 14), null);
                    }
                    this.A00 = this.A0l.A0l()[0];
                    this.A0b = true;
                }
                if ((this.A00 & 1) == 1) {
                    boolean z12 = (this.A00 & 2) == 2;
                    this.A02 |= 1073741824;
                    if (!this.A0Z) {
                        byte[] bArrA0l3 = this.A0g.A0l();
                        String[] strArr8 = A0u;
                        if (strArr8[1].charAt(1) != strArr8[0].charAt(1)) {
                            String[] strArr9 = A0u;
                            strArr9[5] = "0YZVfaON5K";
                            strArr9[6] = "Vpm73VVBoM5AMHA6BL8GPMDLM";
                            interfaceC2443lN.readFully(bArrA0l3, 0, 8);
                            this.A08 += 8;
                            this.A0Z = true;
                            bArrA0l2 = this.A0l.A0l();
                            if (!z12) {
                                i13 = 0;
                            }
                        } else {
                            interfaceC2443lN.readFully(bArrA0l3, 0, 8);
                            this.A08 += 8;
                            this.A0Z = true;
                            bArrA0l2 = this.A0l.A0l();
                            if (!z12) {
                                i13 = 0;
                            }
                        }
                        bArrA0l2[0] = (byte) (i13 | 8);
                        this.A0l.A0f(0);
                        h10.AI8(this.A0l, 1, 1);
                        this.A09++;
                        this.A0g.A0f(0);
                        h10.AI8(this.A0g, 8, 1);
                        this.A09 += 8;
                    }
                    if (z12) {
                        boolean z13 = this.A0a;
                        String[] strArr10 = A0u;
                        if (strArr10[5].length() == strArr10[6].length()) {
                            throw new RuntimeException();
                        }
                        A0u[3] = "IbloDRbaqkSTIb2EEG1BJ7I1x09YBoFC";
                        if (!z13) {
                            interfaceC2443lN.readFully(this.A0l.A0l(), 0, 1);
                            this.A08++;
                            this.A0l.A0f(0);
                            this.A0B = this.A0l.A0I();
                            this.A0a = true;
                        }
                        int i14 = this.A0B * 4;
                        this.A0l.A0d(i14);
                        interfaceC2443lN.readFully(this.A0l.A0l(), 0, i14);
                        this.A08 += i14;
                        short s10 = (short) ((this.A0B / 2) + 1);
                        int i15 = (s10 * 6) + 2;
                        if (this.A0V == null || this.A0V.capacity() < i15) {
                            this.A0V = ByteBuffer.allocate(i15);
                        }
                        this.A0V.position(0);
                        this.A0V.putShort(s10);
                        int iA0L = 0;
                        for (int i16 = 0; i16 < this.A0B; i16++) {
                            int i17 = iA0L;
                            iA0L = this.A0l.A0L();
                            if (i16 % 2 == 0) {
                                ByteBuffer byteBuffer = this.A0V;
                                short s11 = (short) (iA0L - i17);
                                String[] strArr11 = A0u;
                                if (strArr11[5].length() == strArr11[6].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr12 = A0u;
                                strArr12[5] = "ft008TAv7G";
                                strArr12[6] = "haHnc3qulCtaE6iMk670OeuEn";
                                byteBuffer.putShort(s11);
                            } else {
                                ByteBuffer byteBuffer2 = this.A0V;
                                String[] strArr13 = A0u;
                                if (strArr13[2].length() != strArr13[4].length()) {
                                    String[] strArr14 = A0u;
                                    strArr14[2] = "aiG4mSAFtmR28a0";
                                    strArr14[4] = "af0fkPAZLGHpLmON09";
                                    byteBuffer2.putInt(iA0L - i17);
                                }
                            }
                        }
                        int i18 = (i10 - this.A08) - iA0L;
                        if (this.A0B % 2 == 1) {
                            this.A0V.putInt(i18);
                        } else {
                            this.A0V.putShort((short) i18);
                            this.A0V.putInt(0);
                        }
                        this.A0h.A0j(this.A0V.array(), i15);
                        h10.AI8(this.A0h, i15, 1);
                        this.A09 += i15;
                    }
                }
            } else if (ic2.A0m != null) {
                this.A0k.A0j(ic2.A0m, ic2.A0m.length);
            }
            if (ic2.A0B(z10)) {
                this.A02 |= 268435456;
                this.A0o.A0d(0);
                int iA0A2 = (this.A0k.A0A() + i10) - this.A08;
                this.A0l.A0d(4);
                this.A0l.A0l()[0] = (byte) ((iA0A2 >> 24) & 255);
                this.A0l.A0l()[1] = (byte) ((iA0A2 >> 16) & 255);
                this.A0l.A0l()[2] = (byte) ((iA0A2 >> 8) & 255);
                this.A0l.A0l()[3] = (byte) (iA0A2 & 255);
                h10.AI8(this.A0l, 4, 2);
                this.A09 += 4;
            }
            this.A0Y = true;
            iA0A = i10 + this.A0k.A0A();
            if (A06(1207, 15, 14).equals(ic2.A0d)) {
                strArr3 = A0u;
                if (strArr3[2].length() != strArr3[4].length()) {
                    A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                    if (A06(1236, 16, 47).equals(ic2.A0d)) {
                        bArrA0l = this.A0i.A0l();
                        bArrA0l[0] = 0;
                        bArrA0l[1] = 0;
                        bArrA0l[2] = 0;
                        i11 = ic2.A0Q;
                        i12 = 4 - ic2.A0Q;
                        while (this.A08 < iA0A) {
                            if (this.A0A == 0) {
                                A0G(interfaceC2443lN, bArrA0l, i12, i11);
                                this.A08 += i11;
                                this.A0i.A0f(0);
                                this.A0A = this.A0i.A0L();
                                this.A0j.A0f(0);
                                h10.AI7(this.A0j, 4);
                                strArr = A0u;
                                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                    String[] strArr15 = A0u;
                                    strArr15[5] = "fro1mi6zSK";
                                    strArr15[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                    this.A09 += 4;
                                } else {
                                    A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                    this.A09 += 4;
                                }
                            } else {
                                int iA04 = A01(interfaceC2443lN, h10, this.A0A);
                                this.A08 += iA04;
                                this.A09 += iA04;
                                this.A0A -= iA04;
                            }
                        }
                    } else {
                        if (ic2.A0c != null) {
                            if (this.A0k.A0A() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            C3M.A08(z11);
                            ic2.A0c.A03(interfaceC2443lN);
                        }
                        while (this.A08 < iA0A) {
                            int iA05 = A01(interfaceC2443lN, h10, iA0A - this.A08);
                            this.A08 += iA05;
                            this.A09 += iA05;
                        }
                    }
                }
            } else {
                bArrA0l = this.A0i.A0l();
                bArrA0l[0] = 0;
                bArrA0l[1] = 0;
                bArrA0l[2] = 0;
                i11 = ic2.A0Q;
                i12 = 4 - ic2.A0Q;
                while (this.A08 < iA0A) {
                    if (this.A0A == 0) {
                        A0G(interfaceC2443lN, bArrA0l, i12, i11);
                        this.A08 += i11;
                        this.A0i.A0f(0);
                        this.A0A = this.A0i.A0L();
                        this.A0j.A0f(0);
                        h10.AI7(this.A0j, 4);
                        strArr = A0u;
                        if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                            String[] strArr16 = A0u;
                            strArr16[5] = "fro1mi6zSK";
                            strArr16[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                            this.A09 += 4;
                        } else {
                            A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                            this.A09 += 4;
                        }
                    } else {
                        int iA06 = A01(interfaceC2443lN, h10, this.A0A);
                        this.A08 += iA06;
                        this.A09 += iA06;
                        this.A0A -= iA06;
                    }
                }
            }
            strA06 = A06(271, 8, 117);
            str = ic2.A0d;
            strArr2 = A0u;
            if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                A0u[3] = "L5Y1ZRMfFWOxp58RZlemSr0Ie3cKRoNn";
                if (strA06.equals(str)) {
                    this.A0p.A0f(0);
                    h10.AI7(this.A0p, 4);
                    this.A09 += 4;
                }
            } else {
                String[] strArr17 = A0u;
                strArr17[2] = "6h0vzYYIjFmBqGs";
                strArr17[4] = "2CBNjdNTCI84kXMqqr";
                if (strA06.equals(str)) {
                    this.A0p.A0f(0);
                    h10.AI7(this.A0p, 4);
                    this.A09 += 4;
                }
            }
            return A00();
        }
        throw new RuntimeException();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0t, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0t = new byte[]{90, 23, 15, 9, 14, 90, 24, 31, 90, 19, 20, 90, 27, 90, 57, 15, 31, 9, 96, 45, 53, 51, 52, 96, 34, 37, 96, 41, 46, 96, 33, 96, 20, 50, 33, 35, 43, 5, 46, 52, 50, 57, 19, 93, 92, 71, 19, 64, 70, 67, 67, 92, 65, 71, 86, 87, 111, 122, 123, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, 22, 3, 1, 87, 9, 22, 3, 1, 87, 9, 22, 3, 1, 87, 31, 22, 3, 0, 87, 19, 6, 4, 82, 12, 19, 6, 4, 82, 12, 19, 6, 4, 82, 24, 19, 6, 5, 82, 0, 4, 18, 18, 36, 53, 53, 40, 47, 38, 50, 2, 40, 49, 41, 36, 51, 12, 46, 37, 36, 97, 94, 64, 94, 94, 92, 23, 9, 23, 21, 101, 58, 36, 63, 47, 40, 58, 36, 63, 47, 40, 84, 62, 35, 43, 41, 62, 40, 40, 80, 78, 85, 69, 66, 62, 93, 94, 66, 66, 93, 84, 66, 66, 120, 102, 124, 120, 122, 10, 110, 112, 105, 99, 110, 108, 33, 63, 45, 48, 37, 39, 79, 44, 82, 2, 28, 14, 19, 6, 4, 108, 15, 112, 33, 63, 45, 51, 79, 33, 35, 45, 31, 1, 17, 14, 11, 13, 82, 76, 67, 80, 94, 60, 85, 95, 92, 82, 71, 60, 90, 86, 86, 86, 82, 76, 67, 80, 94, 60, 90, 93, 71, 60, 81, 90, 84, 12, 18, 29, 14, 0, 98, 4, 3, 25, 98, 1, 4, 25, 116, 106, 97, 103, 96, 112, 125, 113, 56, 38, 47, 54, 43, 59, 48, ExifInterface.START_CODE, 105, 75, 68, 13, 94, 10, 89, 73, 75, 70, 79, 10, 94, 67, 71, 79, 73, 69, 78, 79, 10, 90, 88, 67, 69, 88, 10, 94, 69, 10, 94, 67, 71, 79, 73, 69, 78, 79, 121, 73, 75, 70, 79, 10, 72, 79, 67, 68, 77, 10, 89, 79, 94, 4, 5, 41, 34, 35, 37, 15, 34, 102, 47, 53, 102, 43, 47, 53, 53, 47, 40, 33, 102, 47, 40, 102, 18, 52, 39, 37, 45, 3, 40, 50, 52, 63, 102, 35, ExifInterface.START_CODE, 35, 43, 35, 40, 50, 117, 89, 91, 84, 95, 88, 95, 88, 81, 22, 83, 88, 85, 68, 79, 70, 66, 95, 89, 88, 22, 87, 88, 82, 22, 85, 89, 91, 70, 68, 83, 69, 69, 95, 89, 88, 22, 95, 69, 22, 88, 89, 66, 22, 69, 67, 70, 70, 89, 68, 66, 83, 82, 86, 122, 123, 97, 112, 123, 97, 86, 122, 120, 101, 84, 121, 114, 122, 53, 107, 71, 70, 92, 77, 70, 92, 109, 70, 75, 105, 68, 79, 71, 8, 82, 126, 127, 101, 116, 127, 101, 84, 127, 114, 126, 117, 120, 127, 118, 94, 99, 117, 116, 99, 49, 95, 115, 114, 104, 121, 114, 104, 89, 114, 127, 115, 120, 117, 114, 123, 79, 127, 115, 108, 121, 60, 110, 67, 89, 73, 75, 88, 78, 67, 68, 77, 10, 70, 75, 89, 94, 10, 73, 95, 79, 10, 90, 69, 67, 68, 94, 10, 93, 67, 94, 66, 10, 95, 68, 79, 82, 90, 79, 73, 94, 79, 78, 10, 78, 95, 88, 75, 94, 67, 69, 68, 16, 10, 13, 38, ExifInterface.START_CODE, 29, 48, 57, 44, 105, 83, 120, 116, 67, 110, 103, 114, 69, 114, 118, 115, 65, 114, 101, 100, 126, 120, 121, 55, 71, 64, 79, 78, 34, 110, 99, 97, 107, 108, 101, 34, 113, 99, 111, 114, 110, 103, 34, 113, 107, 120, 103, 34, 109, 119, 118, 34, 109, 100, 34, 112, 99, 108, 101, 103, 44, 51, 52, 59, 58, 36, 19, 23, 18, 32, 19, 4, 5, 31, 25, 24, 86, 1, 40, 33, 41, 33, ExifInterface.START_CODE, 48, 100, 119, 92, 81, 64, 75, 66, 70, 87, 86, 18, 102, 64, 83, 81, 89, 18, 84, 93, 71, 92, 86, 18, 80, 71, 70, 18, 113, 93, 92, 70, 87, 92, 70, 119, 92, 81, 121, 87, 75, 123, 118, 18, 69, 83, 65, 18, 92, 93, 70, 18, 84, 93, 71, 92, 86, 71, 122, 118, 103, 108, 113, 107, 109, 108, 34, 96, 107, 118, 34, 107, 113, 34, 113, 103, 118, 34, 107, 108, 34, 113, 107, 101, 108, 99, 110, 34, 96, 123, 118, 103, 108, 69, 88, 71, 75, 94, 16, 10, 121, 94, 75, 88, 94, 6, 10, 111, 68, 78, 6, 10, 120, 79, 75, 78, 101, 88, 78, 79, 88, 6, 10, 102, 75, 83, 79, 88, 6, 10, 121, 94, 83, 70, 79, 6, 10, 100, 75, 71, 79, 6, 10, 103, 75, 88, 77, 67, 68, 102, 6, 10, 103, 75, 88, 77, 67, 68, 120, 6, 10, 103, 75, 88, 77, 67, 68, 124, 6, 10, 111, 76, 76, 79, 73, 94, 6, 10, 126, 79, 82, 94, 56, 20, 27, 17, 20, 1, 26, 7, 12, 85, 16, 25, 16, 24, 16, 27, 1, 85, 38, 16, 16, 30, 60, 49, 85, 26, 7, 85, 38, 16, 16, 30, 37, 26, 6, 28, 1, 28, 26, 27, 85, 27, 26, 1, 85, 19, 26, 0, 27, 17, 14, 34, 55, 49, 44, 48, 40, 34, 6, 59, 55, 49, 34, 32, 55, 44, 49, 54, 14, 23, 15, 18, 11, 23, 30, 91, 40, 30, 28, 22, 30, 21, 15, 91, 30, 23, 30, 22, 30, 21, 15, 8, 91, 21, 20, 15, 91, 8, 14, 11, 11, 20, 9, 15, 30, 31, 32, 1, 78, 24, 15, 2, 7, 10, 78, 26, 28, 15, 13, 5, 29, 78, 25, 11, 28, 11, 78, 8, 1, 27, 0, 10, 91, 122, 53, 99, 116, 121, 124, 113, 53, 99, 116, 103, 124, 123, 97, 53, 121, 112, 123, 114, 97, 125, 53, 120, 116, 102, 126, 53, 115, 122, 96, 123, 113, 61, 49, ExifInterface.START_CODE, 56, 44, 61, 59, 44, 105, 101, 114, 126, 119, 108, 21, 106, 
        125, 105, 58, 54, 61, 44, 49, 61, 70, 40, 58, 58, 103, 107, 96, 113, 108, 96, 27, 97, 96, 114, 12, 127, 115, 120, 105, 116, 120, 3, 123, 105, 110, 122, 120, 120, 65, 77, 68, 93, 80, 65, 71, 80, 35, 27, 25, 0, 0, 25, 30, 23, 80, 3, 5, 18, 4, 25, 4, 28, 21, 80, 3, 17, 29, 0, 28, 21, 80, 25, 30, 80, 28, 17, 19, 21, 20, 80, 18, 28, 31, 19, 27, 94, 64, 120, 122, 99, 99, 122, 125, 116, 51, 96, 102, 113, 103, 122, 103, 127, 118, 51, 96, 114, 126, 99, 127, 118, 51, 100, 122, 103, 123, 51, 125, 124, 51, 119, 102, 97, 114, 103, 122, 124, 125, 61, 81, 106, 97, 124, 116, 97, 103, 112, 97, 96, 36, 109, 96, 62, 36, 9, 50, 57, 36, 44, 57, 63, 40, 57, 56, 124, 48, 61, 63, 53, 50, 59, 124, ExifInterface.START_CODE, 61, 48, 41, 57, 102, 124, 45, 36, 58, 45, 74, 62, 55, 37, 56, 45, 47, 90, 122, 115, 97, 124, 105, 107, 24, 3, 101, 127, 99, 3, 109, 124, 102, 111, 125, 96, 117, 119, 4, 31, 121, 99, 127, 31, 113, 99, 96, 84, 93, 79, 82, 71, 69, 54, 45, 75, 81, 77, 45, 67, 84, 65, 60, 53, 39, 58, 47, 45, 94, 69, 35, 57, 37, 69, 57, 58, 117, 124, 110, 115, 102, 100, 107, 12, 106, 112, 108, 12, 107, 102, 117, 96, 76, 69, 87, 73, 53, 76, 92, 77, 53, 92, 85, 79, 72, 89, 89, 69, 76, 71, 91, 86, 92, 65, 82, 18, 27, 18, 20, 124, 2, 11, 2, 4, 109, 79, 83, 68, 120, 81, 78, 67, 66, 72, 120, 85, 72, 83, 102, 10, 23, 23, 23, 52, 40, 63, 3, ExifInterface.START_CODE, 53, 56, 57, 51, 3, 46, 51, 40, 29, 113, 108, 101, 108, 56, 36, 51, 15, 38, 57, 52, 53, 63, 15, 34, 63, 36, 17, 125, 97, 104, 96, 93, 65, 86, 106, 67, 92, 81, 80, 90, 106, 71, 90, 65, 116, 24, 7, 2, 5, 34, 46, 59, 61, 32, 60, 36, 46, 56, 39, ExifInterface.START_CODE, 43, 33, 97, 57, 43, 44, 35, 21, 7, 0, 15};
    }

    static {
        A0B();
        A0v = new InterfaceC1263Gb() { // from class: com.facebook.ads.redexgen.X.kq
            @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
            public final GX[] A5F() {
                return MatroskaExtractor.A0Q();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1262Ga.A01(this, uri, map);
            }
        };
        A10 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0y = AbstractC09664a.A1G(A06(729, 90, 38));
        A0z = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A11 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        A0x = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put(A06(1285, 18, 43), 0);
        map.put(A06(1303, 18, 80), 90);
        map.put(A06(1321, 18, 92), Integer.valueOf(BaseTransientBottomBar.ANIMATION_FADE_DURATION));
        map.put(A06(1339, 18, 57), 270);
        Map<String, Integer> trackNameToRotationDegrees = Collections.unmodifiableMap(map);
        A0w = trackNameToRotationDegrees;
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i10) {
        this(new C2422kr(), i10);
    }

    public MatroskaExtractor(I9 i10, int i11) {
        this.A0M = -1L;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = -9223372036854775807L;
        this.A0q = i10;
        this.A0q.AA5(new C2420kp(this));
        this.A0s = (i11 & 1) == 0;
        this.A0r = new IE();
        this.A0P = new SparseArray<>();
        this.A0l = new C4J(4);
        this.A0p = new C4J(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0m = new C4J(4);
        this.A0j = new C4J(AbstractC1278Gq.A03);
        this.A0i = new C4J(4);
        this.A0k = new C4J();
        this.A0n = new C4J();
        this.A0g = new C4J(8);
        this.A0h = new C4J();
        this.A0o = new C4J();
        this.A0f = new int[1];
    }

    private int A00() {
        int sampleSize = this.A09;
        A0A();
        return sampleSize;
    }

    private int A01(InterfaceC2443lN interfaceC2443lN, H1 h10, int i10) throws IOException {
        int strippedBytesLeft = this.A0k.A07();
        if (strippedBytesLeft > 0) {
            int bytesWritten = Math.min(i10, strippedBytesLeft);
            h10.AI7(this.A0k, bytesWritten);
            return bytesWritten;
        }
        return h10.AI5(interfaceC2443lN, i10, false);
    }

    private long A03(long j10) throws C09222i {
        if (this.A0O != -9223372036854775807L) {
            return AbstractC09664a.A0U(j10, this.A0O, 1000L);
        }
        throw C09222i.A01(A06(279, 54, 38), null);
    }

    @MetaExoPlayerCustomization("Adding support AR/VR eventListener")
    private InterfaceC1284Gw A04(AnonymousClass45 anonymousClass45, AnonymousClass45 anonymousClass46) {
        if (this.A0M == -1 || this.A0J == -9223372036854775807L || anonymousClass45 == null || anonymousClass45.A02() == 0 || anonymousClass46 == null || anonymousClass46.A02() != anonymousClass45.A02()) {
            return new C2438lI(this.A0J);
        }
        int iA02 = anonymousClass45.A02();
        int[] iArrCopyOf = new int[iA02];
        long[] timesUs = new long[iA02];
        long[] durationsUs = new long[iA02];
        long[] offsets = new long[iA02];
        for (int i10 = 0; i10 < iA02; i10++) {
            offsets[i10] = anonymousClass45.A03(i10);
            timesUs[i10] = this.A0M + anonymousClass46.A03(i10);
        }
        for (int i11 = 0; i11 < cuePointsSize; i11++) {
            int cuePointsSize = i11 + 1;
            iArrCopyOf[i11] = (int) (timesUs[cuePointsSize] - timesUs[i11]);
            int i12 = i11 + 1;
            if (A0u[7].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0u;
            strArr[1] = "EcqUdVdOszDxTX1GLg4Sg6FEnSFxXYEO";
            strArr[0] = "f3IXvdxpqPdXnJQYi44axyFnZVKpD9LT";
            durationsUs[i11] = offsets[i12] - offsets[i11];
        }
        iArrCopyOf[iA02 - 1] = (int) ((this.A0M + this.A0N) - timesUs[iA02 - 1]);
        durationsUs[iA02 - 1] = this.A0J - offsets[iA02 - 1];
        int cuePointsSize2 = iA02 - 1;
        long j10 = durationsUs[cuePointsSize2];
        if (j10 <= 0) {
            AnonymousClass44.A07(A06(869, 17, 79), A06(499, 52, 38) + j10);
            int cuePointsSize3 = iArrCopyOf.length;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, cuePointsSize3 - 1);
            int cuePointsSize4 = timesUs.length;
            timesUs = Arrays.copyOf(timesUs, cuePointsSize4 - 1);
            int cuePointsSize5 = durationsUs.length;
            durationsUs = Arrays.copyOf(durationsUs, cuePointsSize5 - 1);
            int cuePointsSize6 = offsets.length;
            offsets = Arrays.copyOf(offsets, cuePointsSize6 - 1);
        }
        return new C2448lT(iArrCopyOf, timesUs, durationsUs, offsets);
    }

    private final IC A05(int i10) throws C09222i {
        A0D(i10);
        return this.A0T;
    }

    @EnsuresNonNull({"extractorOutput"})
    private void A09() {
        C3M.A02(this.A0S);
    }

    private void A0A() {
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0Y = false;
        this.A0b = false;
        this.A0a = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0Z = false;
        this.A0k.A0d(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void A0C(int i10) throws C09222i {
        if (this.A0R != null && this.A0Q != null) {
        } else {
            throw C09222i.A01(A06(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 8, 72) + i10 + A06(0, 18, 118), null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void A0D(int i10) throws C09222i {
        if (this.A0T != null) {
        } else {
            throw C09222i.A01(A06(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 8, 72) + i10 + A06(18, 24, 76), null);
        }
    }

    private void A0E(InterfaceC2443lN interfaceC2443lN, int i10) throws IOException {
        if (this.A0l.A0A() >= i10) {
            return;
        }
        if (this.A0l.A08() < i10) {
            this.A0l.A0c(Math.max(this.A0l.A08() * 2, i10));
        }
        interfaceC2443lN.readFully(this.A0l.A0l(), this.A0l.A0A(), i10 - this.A0l.A0A());
        this.A0l.A0e(i10);
    }

    private void A0F(InterfaceC2443lN interfaceC2443lN, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        int sizeWithPrefix = this.A0n.A08();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i10;
            this.A0n.A0i(Arrays.copyOf(bArr, sizeWithPrefix2));
        } else {
            byte[] bArrA0l = this.A0n.A0l();
            int sizeWithPrefix3 = bArr.length;
            System.arraycopy(bArr, 0, bArrA0l, 0, sizeWithPrefix3);
        }
        byte[] bArrA0l2 = this.A0n.A0l();
        int sizeWithPrefix4 = bArr.length;
        interfaceC2443lN.readFully(bArrA0l2, sizeWithPrefix4, i10);
        this.A0n.A0f(0);
        this.A0n.A0e(length);
    }

    private void A0G(InterfaceC2443lN interfaceC2443lN, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.A0k.A07());
        int pendingStrippedBytes = i10 + iMin;
        interfaceC2443lN.readFully(bArr, pendingStrippedBytes, i11 - iMin);
        if (iMin > 0) {
            this.A0k.A0k(bArr, i10, iMin);
        }
    }

    private final void A0H(IC ic2, int i10, InterfaceC2443lN interfaceC2443lN, int i11) throws IOException {
        if (i10 == 4) {
            if (A06(1280, 5, 88).equals(ic2.A0d)) {
                this.A0o.A0d(i11);
                interfaceC2443lN.readFully(this.A0o.A0l(), 0, i11);
                return;
            }
        }
        interfaceC2443lN.AJJ(i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:40:0x014e A[LOOP:0: B:34:0x0121->B:40:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0133 A[SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    private void A0I(IC ic2, long j10, int i10, int i11, int i12) {
        int i13;
        String strA06;
        int iA09;
        int iA0A = i11;
        if (ic2.A0c != null) {
            ic2.A0c.A04(ic2.A0b, j10, i10, iA0A, i12, ic2.A0a);
        } else {
            if (!A06(1012, 11, 56).equals(ic2.A0d)) {
                boolean zEquals = A06(1002, 10, 101).equals(ic2.A0d);
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0u;
                strArr[2] = "WUIRLQPYspP06jV";
                strArr[4] = "IKED97K2catgdGs9C7";
                if (!zEquals) {
                    if (A06(1023, 13, 32).equals(ic2.A0d)) {
                        i13 = this.A03;
                        strA06 = A06(869, 17, 79);
                        if (i13 > 1) {
                            AnonymousClass44.A07(strA06, A06(IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, 40, 124));
                        } else if (this.A0D == -9223372036854775807L) {
                            AnonymousClass44.A07(strA06, A06(1084, 42, 31));
                        } else {
                            A0K(ic2.A0d, this.A0D, this.A0n.A0l());
                            for (iA09 = this.A0n.A09(); iA09 < this.A0n.A0A(); iA09++) {
                                if (this.A0n.A0l()[iA09] == 0) {
                                    this.A0n.A0e(iA09);
                                    break;
                                }
                            }
                            ic2.A0b.AI7(this.A0n, this.A0n.A0A());
                            iA0A += this.A0n.A0A();
                        }
                    }
                } else {
                    i13 = this.A03;
                    strA06 = A06(869, 17, 79);
                    if (i13 > 1) {
                        AnonymousClass44.A07(strA06, A06(IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, 40, 124));
                    } else if (this.A0D == -9223372036854775807L) {
                        AnonymousClass44.A07(strA06, A06(1084, 42, 31));
                    } else {
                        A0K(ic2.A0d, this.A0D, this.A0n.A0l());
                        while (iA09 < this.A0n.A0A()) {
                            if (this.A0n.A0l()[iA09] == 0) {
                                this.A0n.A0e(iA09);
                                break;
                            }
                        }
                        ic2.A0b.AI7(this.A0n, this.A0n.A0A());
                        iA0A += this.A0n.A0A();
                    }
                }
            } else {
                i13 = this.A03;
                strA06 = A06(869, 17, 79);
                if (i13 > 1) {
                    AnonymousClass44.A07(strA06, A06(IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, 40, 124));
                } else if (this.A0D == -9223372036854775807L) {
                    AnonymousClass44.A07(strA06, A06(1084, 42, 31));
                } else {
                    A0K(ic2.A0d, this.A0D, this.A0n.A0l());
                    while (iA09 < this.A0n.A0A()) {
                        if (this.A0n.A0l()[iA09] == 0) {
                            this.A0n.A0e(iA09);
                            break;
                        }
                    }
                    ic2.A0b.AI7(this.A0n, this.A0n.A0A());
                    iA0A += this.A0n.A0A();
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.A03 > 1) {
                    C4J c4j = this.A0o;
                    String[] strArr2 = A0u;
                    if (strArr2[5].length() != strArr2[6].length()) {
                        String[] strArr3 = A0u;
                        strArr3[1] = "YYsRZc3YFjjR6whUDZFnD2lR7qwR3xQu";
                        strArr3[0] = "iPCTe70V3RVZDGWrxpNWfBz9u5oW1N1r";
                        c4j.A0d(0);
                    } else {
                        A0u[3] = "dzMIMRhm8kdQoNm85GuPxt1OFbbjzRAM";
                        c4j.A0d(0);
                    }
                } else {
                    int iA0A2 = this.A0o.A0A();
                    ic2.A0b.AI8(this.A0o, iA0A2, 2);
                    iA0A += iA0A2;
                }
            }
            H1 h10 = ic2.A0b;
            C1287Gz c1287Gz = ic2.A0a;
            String[] strArr4 = A0u;
            if (strArr4[5].length() != strArr4[6].length()) {
                String[] strArr5 = A0u;
                strArr5[1] = "aEC8Q2NERZhQKbY6SRlQy9B7oXJI5nDv";
                strArr5[0] = "M5BYDTb0V4PW6b5ziiSZklpOYuXfea8a";
                h10.AIA(j10, i10, iA0A, i12, c1287Gz);
            } else {
                h10.AIA(j10, i10, iA0A, i12, c1287Gz);
            }
        }
        this.A0X = true;
    }

    private final void A0J(IC ic2, InterfaceC2443lN interfaceC2443lN, int i10) throws IOException {
        if (ic2.A0n != 1685485123) {
            int i11 = ic2.A0n;
            String[] strArr = A0u;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[2] = "z7J25JPdzWy80Kd";
            strArr2[4] = "xEqpvZ1X3IvVWW9v69";
            if (i11 != 1685480259) {
                interfaceC2443lN.AJJ(i10);
                return;
            }
        }
        ic2.A0k = new byte[i10];
        interfaceC2443lN.readFully(ic2.A0k, 0, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public static void A0K(String str, long j10, byte[] bArr) {
        byte b10;
        String[] strArr;
        byte[] bArrA0O;
        int i10;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr2[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b10) {
                        case 0:
                            bArrA0O = A0O(j10, A06(75, 19, 63), 1000L);
                            i10 = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j10, A06(56, 19, 70), 10000L);
                            i10 = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j10, A06(94, 19, 58), 1000L);
                            i10 = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i10, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
            case 1045209816:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                    String[] strArr4 = A0u;
                    strArr4[5] = "hOu1CB2frr";
                    strArr4[6] = "vZrPTqET3LPV3435yPIFppSrF";
                    if (str.equals(A06(1023, 13, 32))) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        String[] strArr5 = A0u;
                        strArr5[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                        strArr5[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                        switch (b10) {
                            case 0:
                                bArrA0O = A0O(j10, A06(75, 19, 63), 1000L);
                                i10 = 19;
                                break;
                            case 1:
                                bArrA0O = A0O(j10, A06(56, 19, 70), 10000L);
                                i10 = 21;
                                break;
                            case 2:
                                bArrA0O = A0O(j10, A06(94, 19, 58), 1000L);
                                i10 = 25;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrA0O, 0, bArr, i10, bArrA0O.length);
                        return;
                    }
                }
                throw new RuntimeException();
            case 1422270023:
                if (str.equals(A06(1012, 11, 56))) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr6 = A0u;
                    strArr6[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr6[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b10) {
                        case 0:
                            bArrA0O = A0O(j10, A06(75, 19, 63), 1000L);
                            i10 = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j10, A06(56, 19, 70), 10000L);
                            i10 = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j10, A06(94, 19, 58), 1000L);
                            i10 = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i10, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
            default:
                b10 = -1;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr7 = A0u;
                    strArr7[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr7[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b10) {
                        case 0:
                            bArrA0O = A0O(j10, A06(75, 19, 63), 1000L);
                            i10 = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j10, A06(56, 19, 70), 10000L);
                            i10 = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j10, A06(94, 19, 58), 1000L);
                            i10 = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i10, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
        }
    }

    private boolean A0L(C1281Gt c1281Gt, long j10) {
        if (this.A0c) {
            this.A0L = j10;
            c1281Gt.A00 = this.A0H;
            this.A0c = false;
            return true;
        }
        if (!this.A0e || this.A0L == -1) {
            return false;
        }
        c1281Gt.A00 = this.A0L;
        this.A0L = -1L;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0300  */
    /* JADX WARN: Code duplicated, block: B:124:0x032d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[RETURN] */
    public static boolean A0M(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A06(1178, 14, 32))) {
                    b10 = 6;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -2095575984:
                if (str.equals(A06(1222, 14, 102))) {
                    b10 = 4;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1985379776:
                boolean zEquals = str.equals(A06(207, 8, 108));
                if (A0u[7].length() != 16) {
                    A0u[3] = "TzGfoRLFuVo7UwCT9UC1nsicdZWWDAlG";
                    if (zEquals) {
                        b10 = 23;
                    }
                } else if (zEquals) {
                    b10 = 23;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1784763192:
                if (str.equals(A06(263, 8, 57))) {
                    b10 = 18;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1730367663:
                if (str.equals(A06(271, 8, 117))) {
                    b10 = 12;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1482641358:
                if (str.equals(A06(189, 9, 108))) {
                    b10 = 14;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1482641357:
                if (str.equals(A06(198, 9, 79))) {
                    b10 = 15;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1373388978:
                if (str.equals(A06(1252, 15, 22))) {
                    b10 = 9;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -933872740:
                if (str.equals(A06(984, 8, 98))) {
                    b10 = 32;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -538363189:
                if (str.equals(A06(1192, 15, 60))) {
                    b10 = 5;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -538363109:
                if (str.equals(A06(1207, 15, 14))) {
                    b10 = 7;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -425012669:
                if (str.equals(A06(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 8, 30))) {
                    b10 = 30;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -356037306:
                if (str.equals(A06(163, 14, 29))) {
                    b10 = 21;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62923557:
                if (str.equals(A06(135, 5, 19))) {
                    b10 = 13;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62923603:
                if (str.equals(A06(140, 5, 90))) {
                    b10 = 16;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62927045:
                if (str.equals(A06(145, 5, 119))) {
                    b10 = 19;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82318131:
                if (str.equals(A06(1166, 5, 119))) {
                    b10 = 2;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82338133:
                boolean zEquals2 = str.equals(A06(1275, 5, 72));
                if (A0u[7].length() != 16) {
                    String[] strArr = A0u;
                    strArr[5] = "F8wfBLRr4t";
                    strArr[6] = "m6KkyOOVg8X0ndZUQG2mgE6hH";
                    if (zEquals2) {
                        b10 = 0;
                    }
                } else {
                    String[] strArr2 = A0u;
                    strArr2[1] = "SKDMUFdFJPMXubKSzq5KjaXHZATq3OUF";
                    strArr2[0] = "Ghj8mYRv51e2wMnC9FEKaN4eHBhVqIAQ";
                    if (zEquals2) {
                        b10 = 0;
                    }
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82338134:
                if (str.equals(A06(1280, 5, 88))) {
                    b10 = 1;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 99146302:
                if (str.equals(A06(992, 10, 54))) {
                    b10 = 31;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 444813526:
                if (str.equals(A06(1267, 8, 31))) {
                    b10 = 10;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 542569478:
                if (str.equals(A06(150, 13, 119))) {
                    b10 = 20;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 635596514:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                    A0u[3] = "7MRDpRiWazQnh7KPJAJl4vRwzLx1BKGb";
                    if (str.equals(A06(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 16, 31))) {
                        b10 = 26;
                    }
                } else {
                    String[] strArr4 = A0u;
                    strArr4[5] = "W6YXr1xbPB";
                    strArr4[6] = "Gbq52SJwNi9qAu2AjciLJePWO";
                    if (str.equals(A06(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 16, 31))) {
                        b10 = 26;
                    }
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 725948237:
                boolean zEquals3 = str.equals(A06(237, 13, 31));
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                A0u[7] = "zUYiT8JvqtzTusXd0wwrN";
                if (zEquals3) {
                    b10 = 25;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 725957860:
                if (str.equals(A06(250, 13, 65))) {
                    b10 = 24;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    b10 = 28;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 855502857:
                if (str.equals(A06(1236, 16, 47))) {
                    b10 = 8;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1045209816:
                String[] strArr5 = A0u;
                if (strArr5[2].length() == strArr5[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A0u;
                strArr6[1] = "l6rfMqL6uO4vJf2wQ9BlcS80aS9RAxdU";
                strArr6[0] = "kDo3bZmmggKJDtMwpBeZtATIDXYPDXog";
                if (str.equals(A06(1023, 13, 32))) {
                    b10 = 29;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1422270023:
                if (str.equals(A06(1012, 11, 56))) {
                    b10 = 27;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1809237540:
                if (str.equals(A06(1171, 7, 100))) {
                    b10 = 3;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1950749482:
                if (str.equals(A06(177, 6, 53))) {
                    b10 = 17;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1950789798:
                if (str.equals(A06(183, 6, 35))) {
                    b10 = 22;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1951062397:
                if (str.equals(A06(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 6, 82))) {
                    b10 = 11;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
        }
        b10 = -1;
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    public static byte[] A0O(long j10, String str, long j11) {
        C3M.A07(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((((long) i10) * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((((long) i11) * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        int minutes = (int) ((j13 - (((long) i12) * 1000000)) / j11);
        return AbstractC09664a.A1G(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(minutes)));
    }

    public static int[] A0P(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    public static /* synthetic */ GX[] A0Q() {
        return new GX[]{new MatroskaExtractor()};
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "Adding support for AR/VR TAGs")
    public final int A0R(int i10) {
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 26568:
            case 28032:
            case 29555:
            case 30113:
            case 30320:
            case 290298740:
            case 307544935:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                String[] strArr = A0u;
                if (strArr[2].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0u;
                strArr2[1] = "HyhNlEIHHjvGo8KvAMWihGCcOuKz7U7o";
                strArr2[0] = "rV4cPIzb4RrvL4U1RF1zVSCUyrwoic3K";
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            case 17543:
            case 17827:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public final void A0S(int i10) throws C09222i {
        A09();
        switch (i10) {
            case 160:
                if (this.A05 == 2) {
                    IC ic2 = this.A0P.get(this.A06);
                    ic2.A06();
                    if (this.A0E > 0 && A06(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 6, 82).equals(ic2.A0d)) {
                        this.A0o.A0i(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0E).array());
                    }
                    int sampleFlags = 0;
                    if (A0u[7].length() != 16) {
                        String[] strArr = A0u;
                        strArr[5] = "BDPY36VwNm";
                        strArr[6] = "7hC1KMOm7DpnqonjeX0jtoaYt";
                        for (int sampleOffset = 0; sampleOffset < i; sampleOffset++) {
                            int i11 = this.A0f[sampleOffset];
                            sampleFlags += i11;
                            break;
                        }
                        for (int i12 = 0; i12 < sampleOffset; i12++) {
                            long j10 = this.A0F;
                            int sampleOffset2 = ic2.A0I;
                            long j11 = j10 + ((long) ((sampleOffset2 * i12) / 1000));
                            int i13 = this.A02;
                            if (i12 == 0 && !this.A0W) {
                                i13 |= 1;
                            }
                            int i14 = this.A0f[i12];
                            sampleFlags -= i14;
                            A0I(ic2, j11, i13, i14, sampleFlags);
                            break;
                        }
                        this.A05 = 0;
                        return;
                    }
                    throw new RuntimeException();
                }
                return;
            case 174:
                IC ic3 = (IC) C3M.A02(this.A0T);
                if (ic3.A0d != null) {
                    if (A0M(ic3.A0d)) {
                        ic3.A0G(this.A0S, ic3.A0R);
                        this.A0P.put(ic3.A0R, ic3);
                    }
                    this.A0T = null;
                    return;
                }
                throw C09222i.A01(A06(333, 40, 74), null);
            case 19899:
                int i15 = this.A0C;
                String[] strArr2 = A0u;
                if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                    A0u[7] = "tg6sq0stTi0cIlF7Upi0qsQ5QklGxJF";
                    if (i15 != -1) {
                        if (this.A0K != -1) {
                            if (this.A0C == 475249515) {
                                this.A0H = this.A0K;
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[2] = "yLIpCO5kJmqKflO";
                    strArr3[4] = "mFIbnXIm9TTTynra4E";
                    if (i15 != -1) {
                        if (this.A0K != -1) {
                            if (this.A0C == 475249515) {
                                this.A0H = this.A0K;
                                return;
                            }
                            return;
                        }
                    }
                }
                throw C09222i.A01(A06(819, 50, 121), null);
            case 25152:
                A0D(i10);
                if (!this.A0T.A0i) {
                    return;
                }
                if (this.A0T.A0a != null) {
                    this.A0T.A0Z = new DrmInitData(new DrmInitData.SchemeData(AbstractC09121w.A03, A06(1365, 10, 66), this.A0T.A0a.A03));
                    return;
                }
                throw C09222i.A01(A06(639, 55, 62), null);
            case 28032:
                A0D(i10);
                if (!this.A0T.A0i || this.A0T.A0m == null) {
                    return;
                } else {
                    throw C09222i.A01(A06(373, 53, 58), null);
                }
            case 357149030:
                long j12 = this.A0O;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "WZACEI803UG8FVl";
                if (j12 == -9223372036854775807L) {
                    this.A0O = 1000000L;
                }
                if (this.A0I != -9223372036854775807L) {
                    this.A0J = A03(this.A0I);
                    return;
                }
                return;
            case 374648427:
                if (this.A0P.size() != 0) {
                    this.A0S.A6G();
                    return;
                }
                throw C09222i.A01(A06(925, 26, 98), null);
            case 475249515:
                if (!this.A0e) {
                    this.A0S.AIN(A04(this.A0R, this.A0Q));
                    this.A0e = true;
                }
                this.A0R = null;
                this.A0Q = null;
                return;
            default:
                return;
        }
    }

    public final void A0T(int i10, double d10) throws C09222i {
        switch (i10) {
            case 181:
                IC icA05 = A05(i10);
                int i11 = (int) d10;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "mnSBpt4UIloiGRhCy1GZQUK3TYQANP";
                icA05.A0T = i11;
                return;
            case 17545:
                this.A0I = (long) d10;
                return;
            case 21969:
                A05(i10).A06 = (float) d10;
                return;
            case 21970:
                IC icA06 = A05(i10);
                if (A0u[7].length() != 16) {
                    A0u[7] = "bgRhYiIqKVlSmtLlUnVbMuj";
                    icA06.A07 = (float) d10;
                    return;
                } else {
                    icA06.A07 = (float) d10;
                    return;
                }
            case 21971:
                A05(i10).A04 = (float) d10;
                return;
            case 21972:
                A05(i10).A05 = (float) d10;
                return;
            case 21973:
                A05(i10).A02 = (float) d10;
                return;
            case 21974:
                A05(i10).A03 = (float) d10;
                return;
            case 21975:
                A05(i10).A0B = (float) d10;
                return;
            case 21976:
                IC icA07 = A05(i10);
                float f10 = (float) d10;
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    A0u[7] = "0K";
                    icA07.A0C = f10;
                    return;
                }
                throw new RuntimeException();
            case 21977:
                A05(i10).A00 = (float) d10;
                return;
            case 21978:
                A05(i10).A01 = (float) d10;
                return;
            case 30323:
                A05(i10).A0A = (float) d10;
                return;
            case 30324:
                A05(i10).A08 = (float) d10;
                return;
            case 30325:
                A05(i10).A09 = (float) d10;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x027f A[EDGE_INSN: B:123:0x027f->B:66:0x027f BREAK  A[LOOP:1: B:62:0x0248->B:127:0x0248], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x027f A[EDGE_INSN: B:124:0x027f->B:66:0x027f BREAK  A[LOOP:1: B:62:0x0248->B:127:0x0248], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x033a A[LOOP:4: B:89:0x0338->B:90:0x033a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x035c  */
    public final void A0U(int i10, int i11, InterfaceC2443lN interfaceC2443lN) throws IOException {
        int i12;
        byte[] bArrA0l;
        int iCharAt;
        int totalSamplesSize;
        int i13;
        int i14;
        int timecode;
        int totalSamplesSize2 = 0;
        int i15 = 1;
        switch (i10) {
            case 161:
            case 163:
                if (this.A05 == 0) {
                    this.A06 = (int) this.A0r.A05(interfaceC2443lN, false, true, 8);
                    this.A07 = this.A0r.A04();
                    String[] strArr = A0u;
                    if (strArr[5].length() == strArr[6].length()) {
                        this.A0D = -9223372036854775807L;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    } else {
                        String[] strArr2 = A0u;
                        strArr2[1] = "LCHoyUIFh4JbWXc3a57uog3rKRFOb5wV";
                        strArr2[0] = "47gJribS0awN4nsHBZkjm7XOEmPrRfLr";
                        this.A0D = -9223372036854775807L;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    }
                }
                IC ic2 = this.A0P.get(this.A06);
                if (ic2 != null) {
                    ic2.A06();
                    if (this.A05 == 1) {
                        A0E(interfaceC2443lN, 3);
                        int byteValue = (this.A0l.A0l()[2] & 6) >> 1;
                        int i16 = 255;
                        if (byteValue != 0) {
                            A0E(interfaceC2443lN, 4);
                            int timecode2 = this.A0l.A0l()[3];
                            this.A03 = (timecode2 & 255) + 1;
                            int[] iArr = this.A0f;
                            int timecode3 = this.A03;
                            this.A0f = A0P(iArr, timecode3);
                            if (byteValue == 2) {
                                int timecode4 = this.A07;
                                int i17 = (i11 - timecode4) - 4;
                                int timecode5 = this.A03;
                                int i18 = i17 / timecode5;
                                int[] iArr2 = this.A0f;
                                int blockLacingSampleSize = this.A03;
                                Arrays.fill(iArr2, 0, blockLacingSampleSize, i18);
                            } else if (byteValue != 1) {
                                if (byteValue == 3) {
                                    int i19 = 0;
                                    int sampleIndex = 4;
                                    int i20 = 0;
                                    while (i20 < this.A03 - i15) {
                                        this.A0f[i20] = totalSamplesSize2;
                                        sampleIndex++;
                                        A0E(interfaceC2443lN, sampleIndex);
                                        C4J c4j = this.A0l;
                                        if (A0u[7].length() == 16) {
                                            break;
                                        } else {
                                            A0u[7] = "lQQ4f1MYxOwR1g4uON0whOI";
                                            if (c4j.A0l()[sampleIndex - 1] != 0) {
                                                long j10 = 0;
                                                int i21 = 0;
                                                while (true) {
                                                    if (i21 < 8) {
                                                        int i22 = i15 << (7 - i21);
                                                        C4J c4j2 = this.A0l;
                                                        String[] strArr3 = A0u;
                                                        String str = strArr3[1];
                                                        String str2 = strArr3[0];
                                                        int iCharAt2 = str.charAt(1);
                                                        int lengthMask = str2.charAt(1);
                                                        if (iCharAt2 != lengthMask) {
                                                            A0u[3] = "6gmtIRdzQjg9uolj5CgbNQmEFE2eXosQ";
                                                            if ((c4j2.A0l()[sampleIndex - 1] & i22) != 0) {
                                                                int totalSamplesSize3 = sampleIndex - 1;
                                                                sampleIndex += i21;
                                                                A0E(interfaceC2443lN, sampleIndex);
                                                                i12 = totalSamplesSize3 + 1;
                                                                int totalSamplesSize4 = this.A0l.A0l()[totalSamplesSize3] & i16;
                                                                int lengthMask2 = ~i22;
                                                                j10 = totalSamplesSize4 & lengthMask2;
                                                                while (i12 < sampleIndex) {
                                                                    int readPosition = i12 + 1;
                                                                    j10 = (j10 << 8) | ((long) (this.A0l.A0l()[i12] & i16));
                                                                    i12 = readPosition;
                                                                }
                                                                if (i20 > 0) {
                                                                    j10 -= (1 << ((i21 * 7) + 6)) - 1;
                                                                }
                                                            } else {
                                                                i21++;
                                                                i15 = 1;
                                                            }
                                                        } else if ((c4j2.A0l()[sampleIndex - 1] & i22) != 0) {
                                                            int totalSamplesSize5 = sampleIndex - 1;
                                                            sampleIndex += i21;
                                                            A0E(interfaceC2443lN, sampleIndex);
                                                            i12 = totalSamplesSize5 + 1;
                                                            int totalSamplesSize6 = this.A0l.A0l()[totalSamplesSize5] & i16;
                                                            int lengthMask3 = ~i22;
                                                            j10 = totalSamplesSize6 & lengthMask3;
                                                            while (i12 < sampleIndex) {
                                                                int readPosition2 = i12 + 1;
                                                                j10 = (j10 << 8) | ((long) (this.A0l.A0l()[i12] & i16));
                                                                i12 = readPosition2;
                                                            }
                                                            if (i20 > 0) {
                                                                j10 -= (1 << ((i21 * 7) + 6)) - 1;
                                                            }
                                                        } else {
                                                            i21++;
                                                            i15 = 1;
                                                        }
                                                    }
                                                    if (j10 >= -2147483648L && j10 <= 2147483647L) {
                                                        int i23 = (int) j10;
                                                        int[] iArr3 = this.A0f;
                                                        if (i20 != 0) {
                                                            i23 += this.A0f[i20 - 1];
                                                        }
                                                        iArr3[i20] = i23;
                                                        i19 += this.A0f[i20];
                                                        i20++;
                                                        i16 = 255;
                                                        totalSamplesSize2 = 0;
                                                        i15 = 1;
                                                    } else {
                                                        throw C09222i.A01(A06(578, 37, 14), null);
                                                    }
                                                }
                                            } else {
                                                throw C09222i.A01(A06(951, 33, 25), null);
                                            }
                                        }
                                    }
                                    this.A0f[this.A03 - 1] = ((i11 - this.A07) - sampleIndex) - i19;
                                } else {
                                    throw C09222i.A01(A06(1141, 25, 80) + byteValue, null);
                                }
                            } else {
                                int i24 = 0;
                                int i25 = 4;
                                int i26 = 0;
                                while (true) {
                                    int i27 = this.A03;
                                    if (A0u[3].charAt(5) != 'R') {
                                        if (i26 >= i27 - 1) {
                                        }
                                        this.A0f[i26] = 0;
                                        while (true) {
                                            i25++;
                                            A0E(interfaceC2443lN, i25);
                                            bArrA0l = this.A0l.A0l();
                                            String[] strArr4 = A0u;
                                            String str3 = strArr4[1];
                                            String str4 = strArr4[0];
                                            iCharAt = str3.charAt(1);
                                            totalSamplesSize = str4.charAt(1);
                                            if (iCharAt != totalSamplesSize) {
                                                String[] strArr5 = A0u;
                                                strArr5[1] = "QqySTVYSyUdR3w6zpaSbgPrcegDpRTeR";
                                                strArr5[0] = "gT3bwZtYi7wT97ycLVgitbKLuY9aoVNS";
                                                int totalSamplesSize7 = i25 - 1;
                                                i13 = bArrA0l[totalSamplesSize7] & 255;
                                                int[] iArr4 = this.A0f;
                                                int totalSamplesSize8 = iArr4[i26];
                                                iArr4[i26] = totalSamplesSize8 + i13;
                                                if (i13 != 255) {
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize9 = i25 - 1;
                                                i14 = bArrA0l[totalSamplesSize9] & 255;
                                                int[] iArr5 = this.A0f;
                                                int totalSamplesSize10 = iArr5[i26];
                                                iArr5[i26] = totalSamplesSize10 + i14;
                                                if (i14 != 255) {
                                                }
                                            }
                                            break;
                                        }
                                        int totalSamplesSize11 = this.A0f[i26];
                                        i24 += totalSamplesSize11;
                                        i26++;
                                    } else {
                                        String[] strArr6 = A0u;
                                        strArr6[1] = "uG7prxZBXLM0QG5e8GSw94nYMCP7upCE";
                                        strArr6[0] = "tV31aGArCsXy4K1N5Jjs7nQ9FZDzw28J";
                                        if (i26 >= i27 - 1) {
                                        }
                                        this.A0f[i26] = 0;
                                        while (true) {
                                            i25++;
                                            A0E(interfaceC2443lN, i25);
                                            bArrA0l = this.A0l.A0l();
                                            String[] strArr7 = A0u;
                                            String str5 = strArr7[1];
                                            String str6 = strArr7[0];
                                            iCharAt = str5.charAt(1);
                                            totalSamplesSize = str6.charAt(1);
                                            if (iCharAt != totalSamplesSize) {
                                                String[] strArr8 = A0u;
                                                strArr8[1] = "QqySTVYSyUdR3w6zpaSbgPrcegDpRTeR";
                                                strArr8[0] = "gT3bwZtYi7wT97ycLVgitbKLuY9aoVNS";
                                                int totalSamplesSize12 = i25 - 1;
                                                i13 = bArrA0l[totalSamplesSize12] & 255;
                                                int[] iArr6 = this.A0f;
                                                int totalSamplesSize13 = iArr6[i26];
                                                iArr6[i26] = totalSamplesSize13 + i13;
                                                if (i13 != 255) {
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize14 = i25 - 1;
                                                i14 = bArrA0l[totalSamplesSize14] & 255;
                                                int[] iArr7 = this.A0f;
                                                int totalSamplesSize15 = iArr7[i26];
                                                iArr7[i26] = totalSamplesSize15 + i14;
                                                if (i14 != 255) {
                                                }
                                            }
                                            break;
                                        }
                                        int totalSamplesSize16 = this.A0f[i26];
                                        i24 += totalSamplesSize16;
                                        i26++;
                                    }
                                }
                                int[] iArr8 = this.A0f;
                                int i28 = this.A03 - 1;
                                int totalSamplesSize17 = this.A07;
                                iArr8[i28] = ((i11 - totalSamplesSize17) - i25) - i24;
                            }
                        } else {
                            this.A03 = 1;
                            this.A0f = A0P(this.A0f, 1);
                            this.A0f[0] = (i11 - this.A07) - 3;
                        }
                        int lacing = this.A0l.A0l()[0];
                        this.A0F = this.A0G + A03((lacing << 8) | (this.A0l.A0l()[1] & 255));
                        int timecode6 = ic2.A0V;
                        if (timecode6 != 2) {
                            if (i10 == 163) {
                                byte[] bArrA0l2 = this.A0l.A0l();
                                String[] strArr9 = A0u;
                                String str7 = strArr9[1];
                                String str8 = strArr9[0];
                                int iCharAt3 = str7.charAt(1);
                                int timecode7 = str8.charAt(1);
                                if (iCharAt3 == timecode7) {
                                    throw new RuntimeException();
                                }
                                String[] strArr10 = A0u;
                                strArr10[1] = "Vc6YaXBr4sE6Z9Kledba3u83scjXoejR";
                                strArr10[0] = "GPxnjQ5uiYxzVhoi9JJVxDxAifN9s8px";
                                timecode = (bArrA0l2[2] & 128) == 128 ? 1 : 0;
                            }
                        }
                        int timecode8 = timecode != 0 ? 1 : 0;
                        this.A02 = timecode8;
                        this.A05 = 2;
                        this.A04 = 0;
                    }
                    if (i10 == 163) {
                        while (i < timecode) {
                            int[] iArr9 = this.A0f;
                            int timecode9 = this.A04;
                            int iA02 = A02(interfaceC2443lN, ic2, iArr9[timecode9], false);
                            ic2 = ic2;
                            A0I(ic2, this.A0F + ((long) ((this.A04 * ic2.A0I) / 1000)), this.A02, iA02, 0);
                            this.A04++;
                            break;
                        }
                        this.A05 = 0;
                        return;
                    }
                    while (this.A04 < this.A03) {
                        this.A0f[this.A04] = A02(interfaceC2443lN, ic2, this.A0f[this.A04], true);
                        this.A04++;
                    }
                    return;
                }
                interfaceC2443lN.AJJ(i11 - this.A07);
                this.A05 = 0;
                return;
            case 165:
                if (this.A05 != 2) {
                    return;
                }
                A0H(this.A0P.get(this.A06), this.A01, interfaceC2443lN, i11);
                return;
            case 16877:
                A0J(A05(i10), interfaceC2443lN, i11);
                return;
            case 16981:
                A0D(i10);
                this.A0T.A0m = new byte[i11];
                interfaceC2443lN.readFully(this.A0T.A0m, 0, i11);
                return;
            case 18402:
                byte[] bArr = new byte[i11];
                interfaceC2443lN.readFully(bArr, 0, i11);
                A05(i10).A0a = new C1287Gz(1, bArr, 0, 0);
                return;
            case 21419:
                Arrays.fill(this.A0m.A0l(), (byte) 0);
                interfaceC2443lN.readFully(this.A0m.A0l(), 4 - i11, i11);
                this.A0m.A0f(0);
                this.A0C = (int) this.A0m.A0Q();
                return;
            case 25506:
                A0D(i10);
                String[] strArr11 = A0u;
                if (strArr11[1].charAt(1) != strArr11[0].charAt(1)) {
                    A0u[3] = "vSk1rRCvXwYs114cFInjW7yvt4gWKzzv";
                    this.A0T.A0j = new byte[i11];
                    interfaceC2443lN.readFully(this.A0T.A0j, 0, i11);
                    return;
                }
                break;
            case 30322:
                A0D(i10);
                this.A0T.A0l = new byte[i11];
                interfaceC2443lN.readFully(this.A0T.A0l, 0, i11);
                return;
            default:
                throw C09222i.A01(A06(1126, 15, 8) + i10, null);
        }
        throw new RuntimeException();
    }

    public final void A0V(int i10, long j10) throws C09222i {
        String strA06 = A06(42, 14, 63);
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                A05(i10).A0V = (int) j10;
                return;
            case 136:
                A05(i10).A0f = j10 == 1;
                return;
            case 155:
                this.A0D = A03(j10);
                return;
            case 159:
                A05(i10).A0E = (int) j10;
                return;
            case 176:
                A05(i10).A0W = (int) j10;
                return;
            case 179:
                A0C(i10);
                this.A0R.A04(A03(j10));
                return;
            case 186:
                A05(i10).A0M = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                A05(i10).A0R = (int) j10;
                return;
            case 231:
                this.A0G = A03(j10);
                return;
            case 238:
                this.A01 = (int) j10;
                return;
            case 241:
                if (this.A0d) {
                    return;
                }
                A0C(i10);
                this.A0Q.A04(j10);
                this.A0d = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16871:
                A05(i10).A0n = (int) j10;
                return;
            case 16980:
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "siSTSWWHFDsKrirn3iU8fidRJrb4DuSX";
                    strArr2[0] = "o7Su23MSMUKyfq0AiKXYGeUTl03UpruG";
                    if (j10 == 3) {
                        return;
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[5] = "wDyyIq2mnN";
                    strArr3[6] = "u9jmr3hENDVfo4ybwkpsevoxR";
                    if (j10 == 3) {
                        return;
                    }
                }
                throw C09222i.A01(A06(426, 16, 25) + j10 + strA06, null);
            case 17029:
                if (j10 >= 1 && j10 <= 2) {
                    return;
                } else {
                    throw C09222i.A01(A06(559, 19, 27) + j10 + strA06, null);
                }
            case 17143:
                if (j10 == 1) {
                    return;
                } else {
                    throw C09222i.A01(A06(615, 16, 122) + j10 + strA06, null);
                }
            case 18401:
                if (j10 == 5) {
                    return;
                } else {
                    throw C09222i.A01(A06(442, 15, 36) + j10 + strA06, null);
                }
            case 18408:
                if (j10 == 1) {
                    return;
                } else {
                    throw C09222i.A01(A06(113, 22, 77) + j10 + strA06, null);
                }
            case 20529:
                if (j10 == 0) {
                    return;
                } else {
                    throw C09222i.A01(A06(457, 21, 29) + j10 + strA06, null);
                }
            case 20530:
                if (j10 == 1) {
                    return;
                } else {
                    throw C09222i.A01(A06(478, 21, 16) + j10 + strA06, null);
                }
            case 21420:
                this.A0K = this.A0M + j10;
                return;
            case 21432:
                int i11 = (int) j10;
                A0D(i10);
                switch (i11) {
                    case 0:
                        this.A0T.A0U = 0;
                        return;
                    case 1:
                        this.A0T.A0U = 2;
                        return;
                    case 3:
                        this.A0T.A0U = 1;
                        return;
                    case 15:
                        this.A0T.A0U = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                A05(i10).A0L = (int) j10;
                return;
            case 21682:
                A05(i10).A0K = (int) j10;
                return;
            case 21690:
                A05(i10).A0J = (int) j10;
                return;
            case 21930:
                A05(i10).A0g = j10 == 1;
                return;
            case 21945:
                A0D(i10);
                switch ((int) j10) {
                    case 1:
                        IC ic2 = this.A0T;
                        if (A0u[7].length() != 16) {
                            String[] strArr4 = A0u;
                            strArr4[1] = "46IydxS7gy6otlVQjCqCZWblmnAwVrZG";
                            strArr4[0] = "ABdhU4etfaEDzGqzhVxfZNO7CdkZTY0J";
                            ic2.A0F = 2;
                            return;
                        }
                        ic2.A0F = 2;
                        return;
                    case 2:
                        this.A0T.A0F = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                A0D(i10);
                int iA01 = ColorInfo.A01((int) j10);
                if (iA01 == -1) {
                    return;
                }
                this.A0T.A0H = iA01;
                return;
            case 21947:
                A0D(i10);
                this.A0T.A0h = true;
                int iA00 = ColorInfo.A00((int) j10);
                if (iA00 == -1) {
                    return;
                }
                this.A0T.A0G = iA00;
                return;
            case 21948:
                A05(i10).A0O = (int) j10;
                return;
            case 21949:
                A05(i10).A0P = (int) j10;
                return;
            case 21998:
                A05(i10).A0N = (int) j10;
                return;
            case 22186:
                A05(i10).A0X = j10;
                return;
            case 22203:
                A05(i10).A0Y = j10;
                return;
            case 25188:
                A05(i10).A0D = (int) j10;
                return;
            case 30114:
                this.A0E = j10;
                return;
            case 30321:
                A0D(i10);
                switch ((int) j10) {
                    case 0:
                        this.A0T.A0S = 0;
                        return;
                    case 1:
                        this.A0T.A0S = 1;
                        return;
                    case 2:
                        this.A0T.A0S = 2;
                        return;
                    case 3:
                        this.A0T.A0S = 3;
                        return;
                    default:
                        return;
                }
            case 2352003:
                IC icA05 = A05(i10);
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[3] = "17DkRR24xbcR08jR5ve3iaIolPHvV07P";
                icA05.A0I = (int) j10;
                return;
            case 2807729:
                this.A0O = j10;
                return;
            default:
                return;
        }
    }

    public final void A0W(int i10, long j10, long j11) throws C09222i {
        A09();
        switch (i10) {
            case 160:
                this.A0W = false;
                this.A0E = 0L;
                return;
            case 174:
                this.A0T = new IC();
                return;
            case 187:
                this.A0d = false;
                return;
            case 19899:
                this.A0C = -1;
                this.A0K = -1L;
                return;
            case 20533:
                A05(i10).A0i = true;
                return;
            case 21968:
                A05(i10).A0h = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                if (this.A0M == -1 || this.A0M == j10) {
                    this.A0M = j10;
                    this.A0N = j11;
                    return;
                }
                throw C09222i.A01(A06(886, 39, 119), null);
            case 475249515:
                this.A0R = new AnonymousClass45();
                this.A0Q = new AnonymousClass45();
                return;
            case 524531317:
                if (this.A0e) {
                    return;
                }
                if (this.A0s && this.A0H != -1) {
                    this.A0c = true;
                    return;
                } else {
                    this.A0S.AIN(new C2438lI(this.A0J));
                    this.A0e = true;
                    return;
                }
        }
    }

    @MetaExoPlayerCustomization("Adding support for AR/VR TAGs")
    public final void A0X(int i10, String str) throws C09222i {
        switch (i10) {
            case 134:
                A05(i10).A0d = str;
                return;
            case 17026:
                if (!A06(1375, 4, 110).equals(str) && !A06(1357, 8, 67).equals(str)) {
                    throw C09222i.A01(A06(551, 8, 69) + str + A06(42, 14, 63), null);
                }
                return;
            case 17827:
                this.A0U = str;
                return;
            case 21358:
                IC icA05 = A05(i10);
                if (A0u[7].length() != 16) {
                    String[] strArr = A0u;
                    strArr[1] = "fMu5gmFUMMjyE5zZcj2yfEtnORci9Tka";
                    strArr[0] = "H9jO6y53WPcXDhmRgvdqczqosoX1IojD";
                    icA05.A0e = str;
                    return;
                }
                throw new RuntimeException();
            case 2274716:
                A05(i10).A0o = str;
                return;
            default:
                return;
        }
    }

    public final boolean A0Y(int i10) {
        if (i10 != 357149030 && i10 != 524531317) {
            String[] strArr = A0u;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[5] = "AFdTkHzIX2";
            strArr2[6] = "QjCHXWDM6RodCI1HM4Zn3pBBf";
            if (i10 != 475249515 && i10 != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0S = gy;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        this.A0X = false;
        boolean zAGe = true;
        while (zAGe && !this.A0X) {
            zAGe = this.A0q.AGe(interfaceC2443lN);
            if (zAGe && A0L(c1281Gt, interfaceC2443lN.A8f())) {
                return 1;
            }
        }
        if (zAGe) {
            return 0;
        }
        for (int i10 = 0; i10 < i; i10++) {
            IC icValueAt = this.A0P.valueAt(i10);
            icValueAt.A06();
            icValueAt.A0E();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A0G = -9223372036854775807L;
        this.A05 = 0;
        this.A0q.reset();
        this.A0r.A06();
        A0A();
        for (int i10 = 0; i10 < i; i10++) {
            this.A0P.valueAt(i10).A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2443lN interfaceC2443lN) throws IOException {
        return new ID().A01(interfaceC2443lN);
    }
}
