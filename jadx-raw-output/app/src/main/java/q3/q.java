package q3;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: MpegAudioHeader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f66463h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f66464i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f66465j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f66466k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f66467l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f66468m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f66469n = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f66471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66476g;

    public static int c(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean d(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public final void f(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.f66470a = i10;
        this.f66471b = str;
        this.f66472c = i11;
        this.f66473d = i12;
        this.f66474e = i13;
        this.f66475f = i14;
        this.f66476g = i15;
    }

    public static int a(int i10) {
        int i11;
        int i12;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return c(i11, i12);
    }

    public static int b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f66464i[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f66465j[i13 - 1];
            } else {
                i16 = f66466k[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f66467l[i13 - 1];
            } else {
                i15 = f66468m[i13 - 1];
            }
        } else {
            i15 = f66469n[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i17) + i18;
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return ((i19 * i15) / i17) + i18;
    }

    public static boolean e(int i10, q qVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i20 = f66464i[i14];
        if (i11 == 2) {
            i20 /= 2;
        } else if (i11 == 0) {
            i20 /= 4;
        }
        int i21 = i20;
        int i22 = (i10 >>> 9) & 1;
        int iC = c(i11, i12);
        if (i12 == 3) {
            if (i11 == 3) {
                i15 = f66465j[i13 - 1];
            } else {
                i15 = f66466k[i13 - 1];
            }
            i18 = (((i15 * 12) / i21) + i22) * 4;
        } else {
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = f66467l[i13 - 1];
                } else {
                    i15 = f66468m[i13 - 1];
                }
                i17 = (i15 * 144) / i21;
            } else {
                i15 = f66469n[i13 - 1];
                if (i12 == 1) {
                    i16 = 72;
                } else {
                    i16 = 144;
                }
                i17 = (i16 * i15) / i21;
            }
            i18 = i17 + i22;
        }
        int i23 = i15;
        String str = f66463h[3 - i12];
        if (((i10 >> 6) & 3) == 3) {
            i19 = 1;
        } else {
            i19 = 2;
        }
        qVar.f(i11, str, i18, i21, i19, i23, iC);
        return true;
    }
}
