package m3;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: Sonic.java */
/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f64012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f64013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f64014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f64015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f64016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f64017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f64018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f64019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f64020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f64021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f64022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f64023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f64024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f64025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f64026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f64027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f64028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f64029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f64030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f64031v;

    public static void o(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f64011b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public void i() {
        this.f64020k = 0;
        this.f64022m = 0;
        this.f64024o = 0;
        this.f64025p = 0;
        this.f64026q = 0;
        this.f64027r = 0;
        this.f64028s = 0;
        this.f64029t = 0;
        this.f64030u = 0;
        this.f64031v = 0;
    }

    public final boolean p(int i10, int i11) {
        return i10 != 0 && this.f64028s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f64029t * 3;
    }

    public final void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f64022m == i10) {
            return;
        }
        int i13 = this.f64010a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        n(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f64024o;
            if (i15 >= i16 - 1) {
                t(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f64025p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f64026q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f64021l = f(this.f64021l, this.f64022m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f64011b;
                    if (i18 < i19) {
                        this.f64021l[(this.f64022m * i19) + i18] = m(this.f64023n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f64026q++;
                this.f64022m++;
            }
            int i20 = i11 + 1;
            this.f64025p = i20;
            if (i20 == i13) {
                this.f64025p = 0;
                g5.a.f(i12 == i14);
                this.f64026q = 0;
            }
            i15++;
        }
    }

    public final void b(float f10) {
        int iV;
        int i10 = this.f64020k;
        if (i10 < this.f64017h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f64027r > 0) {
                iV = c(i11);
            } else {
                int iG = g(this.f64019j, i11);
                iV = ((double) f10) > 1.0d ? iG + v(this.f64019j, i11, f10, iG) : l(this.f64019j, i11, f10, iG);
            }
            i11 += iV;
        } while (this.f64017h + i11 <= i10);
        u(i11);
    }

    public final int c(int i10) {
        int iMin = Math.min(this.f64017h, this.f64027r);
        d(this.f64019j, i10, iMin);
        this.f64027r -= iMin;
        return iMin;
    }

    public final void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f64021l, this.f64022m, i11);
        this.f64021l = sArrF;
        int i12 = this.f64011b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f64022m * i12, i12 * i11);
        this.f64022m += i11;
    }

    public final void e(short[] sArr, int i10, int i11) {
        int i12 = this.f64017h / i11;
        int i13 = this.f64011b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f64018i[i16] = (short) (i17 / i14);
        }
    }

    public final int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f64010a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f64011b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f64015f, this.f64016g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f64018i, 0, this.f64015f / i12, this.f64016g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f64015f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f64016g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f64011b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f64018i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = p(this.f64030u, this.f64031v) ? this.f64028s : iH;
        this.f64029t = this.f64030u;
        this.f64028s = iH;
        return i19;
    }

    public final int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f64011b;
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
        this.f64030u = i14 / i16;
        this.f64031v = i17 / i15;
        return i16;
    }

    public int k() {
        return this.f64022m * this.f64011b * 2;
    }

    public final int l(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f64027r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f64021l, this.f64022m, i13);
        this.f64021l = sArrF;
        int i14 = this.f64011b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f64022m * i14, i14 * i11);
        o(i12, this.f64011b, this.f64021l, this.f64022m + i11, sArr, i10 + i11, sArr, i10);
        this.f64022m += i13;
        return i12;
    }

    public final short m(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f64011b];
        int i13 = this.f64026q * i11;
        int i14 = this.f64025p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    public final void n(int i10) {
        int i11 = this.f64022m - i10;
        short[] sArrF = f(this.f64023n, this.f64024o, i11);
        this.f64023n = sArrF;
        short[] sArr = this.f64021l;
        int i12 = this.f64011b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f64024o * i12, i12 * i11);
        this.f64022m = i10;
        this.f64024o += i11;
    }

    public final void q() {
        int i10 = this.f64022m;
        float f10 = this.f64012c;
        float f11 = this.f64013d;
        float f12 = f10 / f11;
        float f13 = this.f64014e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f64019j, 0, this.f64020k);
            this.f64020k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public void r() {
        int i10;
        int i11 = this.f64020k;
        float f10 = this.f64012c;
        float f11 = this.f64013d;
        int i12 = this.f64022m + ((int) ((((i11 / (f10 / f11)) + this.f64024o) / (this.f64014e * f11)) + 0.5f));
        this.f64019j = f(this.f64019j, i11, (this.f64017h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f64017h;
            int i14 = this.f64011b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f64019j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f64020k += i10 * 2;
        q();
        if (this.f64022m > i12) {
            this.f64022m = i12;
        }
        this.f64020k = 0;
        this.f64027r = 0;
        this.f64024o = 0;
    }

    public final void t(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f64023n;
        int i11 = this.f64011b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f64024o - i10) * i11);
        this.f64024o -= i10;
    }

    public final void u(int i10) {
        int i11 = this.f64020k - i10;
        short[] sArr = this.f64019j;
        int i12 = this.f64011b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f64020k = i11;
    }

    public final int v(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f64027r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] sArrF = f(this.f64021l, this.f64022m, i12);
        this.f64021l = sArrF;
        o(i12, this.f64011b, sArrF, this.f64022m, sArr, i10, sArr, i10 + i11);
        this.f64022m += i12;
        return i12;
    }

    public o(int i10, int i11, float f10, float f11, int i12) {
        this.f64010a = i10;
        this.f64011b = i11;
        this.f64012c = f10;
        this.f64013d = f11;
        this.f64014e = i10 / i12;
        this.f64015f = i10 / 400;
        int i13 = i10 / 65;
        this.f64016g = i13;
        int i14 = i13 * 2;
        this.f64017h = i14;
        this.f64018i = new short[i14];
        this.f64019j = new short[i14 * i11];
        this.f64021l = new short[i14 * i11];
        this.f64023n = new short[i14 * i11];
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f64011b, this.f64022m);
        shortBuffer.put(this.f64021l, 0, this.f64011b * iMin);
        int i10 = this.f64022m - iMin;
        this.f64022m = i10;
        short[] sArr = this.f64021l;
        int i11 = this.f64011b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public void s(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f64011b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f64019j, this.f64020k, i11);
        this.f64019j = sArrF;
        shortBuffer.get(sArrF, this.f64020k * this.f64011b, ((i10 * i11) * 2) / 2);
        this.f64020k += i11;
        q();
    }
}
