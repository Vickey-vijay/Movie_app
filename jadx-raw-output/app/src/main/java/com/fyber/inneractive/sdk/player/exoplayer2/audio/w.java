package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final short[] f16384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public short[] f16386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f16388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f16390l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16398t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16402x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16391m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16392n = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16399u = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f16393o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f16394p = 1.0f;

    public final void a(int i10) {
        int i11 = this.f16395q + i10;
        int i12 = this.f16385g;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f16385g = i13;
            this.f16386h = Arrays.copyOf(this.f16386h, i13 * this.f16380b);
        }
    }

    public final void b(int i10) {
        int i11 = this.f16396r + i10;
        int i12 = this.f16387i;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f16387i = i13;
            this.f16388j = Arrays.copyOf(this.f16388j, i13 * this.f16380b);
        }
    }

    public w(int i10, int i11) {
        this.f16379a = i10;
        this.f16380b = i11;
        this.f16381c = i10 / 400;
        int i12 = i10 / 65;
        this.f16382d = i12;
        int i13 = i12 * 2;
        this.f16383e = i13;
        this.f16384f = new short[i13];
        this.f16385g = i13;
        int i14 = i11 * i13;
        this.f16386h = new short[i14];
        this.f16387i = i13;
        this.f16388j = new short[i14];
        this.f16389k = i13;
        this.f16390l = new short[i14];
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f16383e / i11;
        int i13 = this.f16380b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f16384f[i16] = (short) (i17 / i14);
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f16380b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f16401w = i14 / i16;
        this.f16402x = i17 / i15;
        return i16;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024b A[LOOP:4: B:12:0x0045->B:101:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0172 A[EDGE_INSN: B:111:0x0172->B:64:0x0172 BREAK  A[LOOP:4: B:12:0x0045->B:101:0x024b], SYNTHETIC] */
    public final void a() {
        int iA;
        int i10;
        int iMin;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f16396r;
        float f10 = this.f16393o / this.f16394p;
        double d10 = f10;
        int i16 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            short[] sArr = this.f16386h;
            int i17 = this.f16395q;
            b(i17);
            int i18 = this.f16380b;
            System.arraycopy(sArr, 0, this.f16388j, this.f16396r * i18, i18 * i17);
            this.f16396r += i17;
            this.f16395q = 0;
        } else {
            int i19 = this.f16395q;
            if (i19 >= this.f16383e) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f16398t;
                    if (i21 > 0) {
                        iMin = Math.min(this.f16383e, i21);
                        short[] sArr2 = this.f16386h;
                        b(iMin);
                        int i22 = this.f16380b;
                        System.arraycopy(sArr2, i20 * i22, this.f16388j, this.f16396r * i22, i22 * iMin);
                        this.f16396r += iMin;
                        this.f16398t -= iMin;
                    } else {
                        short[] sArr3 = this.f16386h;
                        int i23 = this.f16379a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i16;
                        if (this.f16380b == i16 && i24 == i16) {
                            iA = a(sArr3, i20, this.f16381c, this.f16382d);
                        } else {
                            a(sArr3, i20, i24);
                            int iA2 = a(this.f16384f, 0, this.f16381c / i24, this.f16382d / i24);
                            if (i24 != i16) {
                                int i25 = iA2 * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.f16381c;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f16382d;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.f16380b == i16) {
                                    iA = a(sArr3, i20, i27, i28);
                                } else {
                                    a(sArr3, i20, i16);
                                    iA = a(this.f16384f, 0, i27, i28);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i31 = this.f16401w;
                        int i32 = (i31 == 0 || (i12 = this.f16399u) == 0 || this.f16402x > i31 * 3 || i31 * 2 <= this.f16400v * 3) ? iA : i12;
                        this.f16400v = i31;
                        this.f16399u = iA;
                        if (d10 > 1.0d) {
                            short[] sArr4 = this.f16386h;
                            if (f10 >= 2.0f) {
                                i11 = (int) (i32 / (f10 - 1.0f));
                            } else {
                                this.f16398t = (int) (((2.0f - f10) * i32) / (f10 - 1.0f));
                                i11 = i32;
                            }
                            b(i11);
                            int i33 = i11;
                            a(i11, this.f16380b, this.f16388j, this.f16396r, sArr4, i20, sArr4, i20 + i32);
                            this.f16396r += i33;
                            i20 = i32 + i33 + i20;
                        } else {
                            int i34 = i32;
                            short[] sArr5 = this.f16386h;
                            if (f10 < 0.5f) {
                                i10 = (int) ((i34 * f10) / (1.0f - f10));
                            } else {
                                this.f16398t = (int) ((((2.0f * f10) - 1.0f) * i34) / (1.0f - f10));
                                i10 = i34;
                            }
                            int i35 = i34 + i10;
                            b(i35);
                            int i36 = this.f16380b;
                            System.arraycopy(sArr5, i20 * i36, this.f16388j, this.f16396r * i36, i36 * i34);
                            iMin = i10;
                            a(iMin, this.f16380b, this.f16388j, this.f16396r + i34, sArr5, i34 + i20, sArr5, i20);
                            this.f16396r += i35;
                        }
                        if (this.f16383e + i20 > i19) {
                            break;
                        } else {
                            i16 = 1;
                        }
                    }
                    i20 += iMin;
                    if (this.f16383e + i20 > i19) {
                        break;
                        break;
                    }
                    i16 = 1;
                }
                int i37 = this.f16395q - i20;
                short[] sArr6 = this.f16386h;
                int i38 = this.f16380b;
                System.arraycopy(sArr6, i20 * i38, sArr6, 0, i38 * i37);
                this.f16395q = i37;
            }
        }
        float f11 = this.f16394p;
        if (f11 == 1.0f || this.f16396r == i15) {
            return;
        }
        int i39 = this.f16379a;
        int i40 = (int) (i39 / f11);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.f16396r - i15;
        int i42 = this.f16397s + i41;
        int i43 = this.f16389k;
        if (i42 > i43) {
            int i44 = (i43 / 2) + i41 + i43;
            this.f16389k = i44;
            this.f16390l = Arrays.copyOf(this.f16390l, i44 * this.f16380b);
        }
        short[] sArr7 = this.f16388j;
        int i45 = this.f16380b;
        System.arraycopy(sArr7, i15 * i45, this.f16390l, this.f16397s * i45, i45 * i41);
        this.f16396r = i15;
        this.f16397s += i41;
        int i46 = 0;
        while (true) {
            int i47 = this.f16397s;
            int i48 = i47 - 1;
            if (i46 >= i48) {
                if (i48 == 0) {
                    return;
                }
                short[] sArr8 = this.f16390l;
                int i49 = this.f16380b;
                System.arraycopy(sArr8, i48 * i49, sArr8, 0, (i47 - i48) * i49);
                this.f16397s -= i48;
                return;
            }
            while (true) {
                i13 = this.f16391m + 1;
                int i50 = i13 * i40;
                i14 = this.f16392n;
                if (i50 <= i14 * i39) {
                    break;
                }
                b(1);
                int i51 = 0;
                while (true) {
                    int i52 = this.f16380b;
                    if (i51 < i52) {
                        short[] sArr9 = this.f16388j;
                        int i53 = (this.f16396r * i52) + i51;
                        short[] sArr10 = this.f16390l;
                        int i54 = (i46 * i52) + i51;
                        short s10 = sArr10[i54];
                        short s11 = sArr10[i54 + i52];
                        int i55 = this.f16392n * i39;
                        int i56 = this.f16391m;
                        int i57 = i56 * i40;
                        int i58 = (i56 + 1) * i40;
                        int i59 = i58 - i55;
                        int i60 = i58 - i57;
                        sArr9[i53] = (short) ((((i60 - i59) * s11) + (s10 * i59)) / i60);
                        i51++;
                    }
                }
                this.f16392n++;
                this.f16396r++;
            }
            this.f16391m = i13;
            if (i13 == i39) {
                this.f16391m = 0;
                if (i14 == i40) {
                    this.f16392n = 0;
                } else {
                    throw new IllegalStateException();
                }
            }
            i46++;
        }
    }

    public static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }
}
