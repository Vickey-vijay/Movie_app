package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class c23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f76105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f76106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f76107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f76108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f76109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f76110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f76111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f76112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f76113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f76114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f76115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f76116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f76117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f76118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f76119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f76120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f76121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f76122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f76123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f76124v;

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f76110h / i11;
        int i13 = this.f76104b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f76111i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] b(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f76104b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public c23(int i10, int i11, float f10, float f11, int i12) {
        this.f76103a = i10;
        this.f76104b = i11;
        this.f76105c = f10;
        this.f76106d = f11;
        this.f76107e = i10 / i12;
        this.f76108f = i10 / 400;
        int i13 = i10 / 65;
        this.f76109g = i13;
        int i14 = i13 * 2;
        this.f76110h = i14;
        this.f76111i = new short[i14];
        int i15 = i14 * i11;
        this.f76112j = new short[i15];
        this.f76114l = new short[i15];
        this.f76116n = new short[i15];
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f76104b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i14 * i11) {
                i16 = i11;
                i14 = iAbs;
            }
            if (iAbs * i15 > i17 * i11) {
                i15 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f76123u = i14 / i16;
        this.f76124v = i17 / i15;
        return i16;
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

    /* JADX WARN: Code duplicated, block: B:108:0x018e A[EDGE_INSN: B:108:0x018e->B:64:0x018e BREAK  A[LOOP:4: B:12:0x004a->B:98:0x025e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x025e A[LOOP:4: B:12:0x004a->B:98:0x025e, LOOP_END] */
    public final void a() {
        int iA;
        int i10;
        int iMin;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f76115m;
        float f10 = this.f76105c;
        float f11 = this.f76106d;
        float f12 = f10 / f11;
        float f13 = this.f76107e * f11;
        double d10 = f12;
        int i16 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            short[] sArr = this.f76112j;
            int i17 = this.f76113k;
            short[] sArrB = b(this.f76114l, i15, i17);
            this.f76114l = sArrB;
            int i18 = this.f76104b;
            System.arraycopy(sArr, 0, sArrB, this.f76115m * i18, i18 * i17);
            this.f76115m += i17;
            this.f76113k = 0;
        } else {
            int i19 = this.f76113k;
            if (i19 >= this.f76110h) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f76120r;
                    if (i21 > 0) {
                        iMin = Math.min(this.f76110h, i21);
                        short[] sArr2 = this.f76112j;
                        short[] sArrB2 = b(this.f76114l, this.f76115m, iMin);
                        this.f76114l = sArrB2;
                        int i22 = this.f76104b;
                        System.arraycopy(sArr2, i20 * i22, sArrB2, this.f76115m * i22, i22 * iMin);
                        this.f76115m += iMin;
                        this.f76120r -= iMin;
                    } else {
                        short[] sArr3 = this.f76112j;
                        int i23 = this.f76103a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i16;
                        if (this.f76104b == i16 && i24 == i16) {
                            iA = a(sArr3, i20, this.f76108f, this.f76109g);
                        } else {
                            a(sArr3, i20, i24);
                            int iA2 = a(this.f76111i, 0, this.f76108f / i24, this.f76109g / i24);
                            if (i24 != i16) {
                                int i25 = iA2 * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.f76108f;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f76109g;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.f76104b == i16) {
                                    iA = a(sArr3, i20, i27, i28);
                                } else {
                                    a(sArr3, i20, i16);
                                    iA = a(this.f76111i, 0, i27, i28);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i31 = this.f76123u;
                        int i32 = (i31 == 0 || (i12 = this.f76121s) == 0 || this.f76124v > i31 * 3 || i31 * 2 <= this.f76122t * 3) ? iA : i12;
                        this.f76122t = i31;
                        this.f76121s = iA;
                        if (d10 > 1.0d) {
                            short[] sArr4 = this.f76112j;
                            if (f12 >= 2.0f) {
                                i11 = (int) (i32 / (f12 - 1.0f));
                            } else {
                                this.f76120r = (int) (((2.0f - f12) * i32) / (f12 - 1.0f));
                                i11 = i32;
                            }
                            short[] sArrB3 = b(this.f76114l, this.f76115m, i11);
                            this.f76114l = sArrB3;
                            int i33 = i11;
                            a(i11, this.f76104b, sArrB3, this.f76115m, sArr4, i20, sArr4, i20 + i32);
                            this.f76115m += i33;
                            i20 = i32 + i33 + i20;
                        } else {
                            int i34 = i32;
                            short[] sArr5 = this.f76112j;
                            if (f12 < 0.5f) {
                                i10 = (int) ((i34 * f12) / (1.0f - f12));
                            } else {
                                this.f76120r = (int) ((((2.0f * f12) - 1.0f) * i34) / (1.0f - f12));
                                i10 = i34;
                            }
                            int i35 = i34 + i10;
                            short[] sArrB4 = b(this.f76114l, this.f76115m, i35);
                            this.f76114l = sArrB4;
                            int i36 = this.f76104b;
                            System.arraycopy(sArr5, i20 * i36, sArrB4, this.f76115m * i36, i36 * i34);
                            iMin = i10;
                            a(iMin, this.f76104b, this.f76114l, this.f76115m + i34, sArr5, i20 + i34, sArr5, i20);
                            this.f76115m += i35;
                        }
                        if (this.f76110h + i20 > i19) {
                            break;
                        } else {
                            i16 = 1;
                        }
                    }
                    i20 += iMin;
                    if (this.f76110h + i20 > i19) {
                        break;
                        break;
                    }
                    i16 = 1;
                }
                int i37 = this.f76113k - i20;
                short[] sArr6 = this.f76112j;
                int i38 = this.f76104b;
                System.arraycopy(sArr6, i20 * i38, sArr6, 0, i38 * i37);
                this.f76113k = i37;
            }
        }
        if (f13 == 1.0f || this.f76115m == i15) {
            return;
        }
        int i39 = this.f76103a;
        int i40 = (int) (i39 / f13);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.f76115m - i15;
        short[] sArrB5 = b(this.f76116n, this.f76117o, i41);
        this.f76116n = sArrB5;
        short[] sArr7 = this.f76114l;
        int i42 = this.f76104b;
        System.arraycopy(sArr7, i15 * i42, sArrB5, this.f76117o * i42, i42 * i41);
        this.f76115m = i15;
        this.f76117o += i41;
        int i43 = 0;
        while (true) {
            int i44 = this.f76117o;
            int i45 = i44 - 1;
            if (i43 >= i45) {
                if (i45 == 0) {
                    return;
                }
                short[] sArr8 = this.f76116n;
                int i46 = this.f76104b;
                System.arraycopy(sArr8, i45 * i46, sArr8, 0, (i44 - i45) * i46);
                this.f76117o -= i45;
                return;
            }
            while (true) {
                i13 = this.f76118p + 1;
                int i47 = i13 * i40;
                i14 = this.f76119q;
                if (i47 <= i14 * i39) {
                    break;
                }
                this.f76114l = b(this.f76114l, this.f76115m, 1);
                int i48 = 0;
                while (true) {
                    int i49 = this.f76104b;
                    if (i48 < i49) {
                        short[] sArr9 = this.f76114l;
                        int i50 = (this.f76115m * i49) + i48;
                        short[] sArr10 = this.f76116n;
                        int i51 = (i43 * i49) + i48;
                        short s10 = sArr10[i51];
                        short s11 = sArr10[i51 + i49];
                        int i52 = this.f76119q * i39;
                        int i53 = this.f76118p;
                        int i54 = i53 * i40;
                        int i55 = (i53 + 1) * i40;
                        int i56 = i55 - i52;
                        int i57 = i55 - i54;
                        sArr9[i50] = (short) ((((i57 - i56) * s11) + (s10 * i56)) / i57);
                        i48++;
                    }
                }
                this.f76119q++;
                this.f76115m++;
            }
            this.f76118p = i13;
            if (i13 == i39) {
                this.f76118p = 0;
                if (i14 == i40) {
                    this.f76119q = 0;
                } else {
                    throw new IllegalStateException();
                }
            }
            i43++;
        }
    }
}
