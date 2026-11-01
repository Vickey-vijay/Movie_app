package v4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import g5.k0;
import g5.m;
import g5.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f73050h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f73051i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f73052j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f73053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f73054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f73055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0765b f73056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f73057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f73058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f73059g;

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f73081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f73085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f73086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f73087h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f73088i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f73089j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f73090k;

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f73090k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f73090k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f73080a = i10;
            this.f73081b = z10;
            this.f73082c = i11;
            this.f73083d = i12;
            this.f73084e = i13;
            this.f73085f = i14;
            this.f73086g = i15;
            this.f73087h = i16;
            this.f73088i = i17;
            this.f73089j = i18;
            this.f73090k = sparseArray;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f73099c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f73100d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f73101e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f73102f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f73103g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public C0765b f73104h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public d f73105i;

        public void a() {
            this.f73099c.clear();
            this.f73100d.clear();
            this.f73101e.clear();
            this.f73102f.clear();
            this.f73103g.clear();
            this.f73104h = null;
            this.f73105i = null;
        }

        public h(int i10, int i11) {
            this.f73097a = i10;
            this.f73098b = i11;
        }
    }

    public static int[] c() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int g(s sVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int iH3 = sVar.h(2);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else {
                if (sVar.g()) {
                    iH = sVar.h(3) + 3;
                    iH2 = sVar.h(2);
                } else {
                    if (sVar.g()) {
                        i12 = 1;
                    } else {
                        int iH4 = sVar.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = sVar.h(4) + 12;
                            iH2 = sVar.h(2);
                        } else if (iH4 != 3) {
                            z10 = z10;
                        } else {
                            iH = sVar.h(8) + 29;
                            iH2 = sVar.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    public static int h(s sVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int iH2 = sVar.h(4);
            int i14 = 2;
            if (iH2 != 0) {
                z10 = z10;
                i12 = 1;
            } else if (sVar.g()) {
                if (sVar.g()) {
                    int iH3 = sVar.h(2);
                    if (iH3 != 0) {
                        if (iH3 != 1) {
                            if (iH3 == 2) {
                                iH = sVar.h(4) + 9;
                                iH2 = sVar.h(4);
                            } else if (iH3 != 3) {
                                z10 = z10;
                                iH2 = 0;
                                i12 = 0;
                            } else {
                                iH = sVar.h(8) + 25;
                                iH2 = sVar.h(4);
                            }
                        }
                        i12 = i14;
                    } else {
                        i12 = 1;
                    }
                    iH2 = 0;
                } else {
                    iH = sVar.h(2) + 4;
                    iH2 = sVar.h(4);
                }
                z10 = z10;
                i12 = iH;
            } else {
                int iH4 = sVar.h(3);
                if (iH4 != 0) {
                    i14 = iH4 + 2;
                    i12 = i14;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    public static int i(s sVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int iH2 = sVar.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (sVar.g()) {
                z10 = z11;
                iH = sVar.h(7);
                iH2 = sVar.h(8);
            } else {
                int iH3 = sVar.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i12, i11, i12 + iH, i11 + 1, paint);
            }
            i12 += iH;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    public static void k(c cVar, a aVar, int i10, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f73063d;
        } else {
            iArr = i10 == 2 ? aVar.f73062c : aVar.f73061b;
        }
        int[] iArr2 = iArr;
        j(cVar.f73072c, iArr2, i10, i11, i12, paint, canvas);
        j(cVar.f73073d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    public static C0765b m(s sVar) {
        int i10;
        int i11;
        int i12;
        int iH;
        sVar.q(4);
        boolean zG = sVar.g();
        sVar.q(3);
        int iH2 = sVar.h(16);
        int iH3 = sVar.h(16);
        if (zG) {
            int iH4 = sVar.h(16);
            int iH5 = sVar.h(16);
            int iH6 = sVar.h(16);
            iH = sVar.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new C0765b(iH2, iH3, i10, i12, i11, iH);
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f73061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f73062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f73063d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f73060a = i10;
            this.f73061b = iArr;
            this.f73062c = iArr2;
            this.f73063d = iArr3;
        }
    }

    /* JADX INFO: renamed from: v4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class C0765b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f73069f;

        public C0765b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f73064a = i10;
            this.f73065b = i11;
            this.f73066c = i12;
            this.f73067d = i13;
            this.f73068e = i14;
            this.f73069f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f73071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f73072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f73073d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f73070a = i10;
            this.f73071b = z10;
            this.f73072c = bArr;
            this.f73073d = bArr2;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f73077d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f73074a = i10;
            this.f73075b = i11;
            this.f73076c = i12;
            this.f73077d = sparseArray;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73079b;

        public e(int i10, int i11) {
            this.f73078a = i10;
            this.f73079b = i11;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f73096f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f73091a = i10;
            this.f73092b = i11;
            this.f73093c = i12;
            this.f73094d = i13;
            this.f73095e = i14;
            this.f73096f = i15;
        }
    }

    public static byte[] a(int i10, int i11, s sVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) sVar.h(i11);
        }
        return bArr;
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        s sVar = new s(bArr);
        int iG = i11;
        int i13 = i12;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (sVar.b() != 0) {
            int iH = sVar.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArrA3 == null ? f73050h : bArrA3;
                            } else {
                                bArr2 = null;
                            }
                            iG = g(sVar, iArr, bArr2, iG, i13, paint, canvas);
                            sVar.c();
                        } else {
                            bArr3 = bArrA == null ? f73051i : bArrA;
                        }
                        bArr2 = bArr3;
                        iG = g(sVar, iArr, bArr2, iG, i13, paint, canvas);
                        sVar.c();
                        break;
                    case 17:
                        iG = h(sVar, iArr, i10 == 3 ? bArrA2 == null ? f73052j : bArrA2 : null, iG, i13, paint, canvas);
                        sVar.c();
                        break;
                    case 18:
                        iG = i(sVar, iArr, null, iG, i13, paint, canvas);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA3 = a(4, 4, sVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, sVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, sVar);
                                break;
                        }
                        break;
                }
            } else {
                i13 += 2;
                iG = i11;
            }
        }
    }

    public static a l(s sVar, int i10) {
        int[] iArr;
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = sVar.h(8);
        sVar.q(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i14 > 0) {
            int iH6 = sVar.h(i12);
            int iH7 = sVar.h(i12);
            int i15 = i14 - 2;
            if ((iH7 & 128) != 0) {
                iArr = iArrC;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrD : iArrE;
            }
            if ((iH7 & 1) != 0) {
                iH3 = sVar.h(i12);
                iH4 = sVar.h(i12);
                iH = sVar.h(i12);
                iH2 = sVar.h(i12);
                i11 = i15 - 4;
            } else {
                int iH8 = sVar.h(6) << i13;
                int iH9 = sVar.h(4) << 4;
                iH = sVar.h(4) << 4;
                i11 = i15 - 2;
                iH2 = sVar.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), k0.q((int) (d10 + (1.402d * d11)), 0, 255), k0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), k0.q((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    public static c n(s sVar) {
        byte[] bArr;
        int iH = sVar.h(16);
        sVar.q(4);
        int iH2 = sVar.h(2);
        boolean zG = sVar.g();
        sVar.q(1);
        byte[] bArr2 = null;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = sVar.h(16);
                int iH4 = sVar.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    sVar.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    sVar.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        sVar.q(sVar.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    public static d o(s sVar, int i10) {
        int iH = sVar.h(8);
        int iH2 = sVar.h(4);
        int iH3 = sVar.h(2);
        sVar.q(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = sVar.h(8);
            sVar.q(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(sVar.h(16), sVar.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    public static f p(s sVar, int i10) {
        int iH;
        int iH2;
        int iH3 = sVar.h(8);
        sVar.q(4);
        boolean zG = sVar.g();
        sVar.q(3);
        int i11 = 16;
        int iH4 = sVar.h(16);
        int iH5 = sVar.h(16);
        int iH6 = sVar.h(3);
        int iH7 = sVar.h(3);
        int i12 = 2;
        sVar.q(2);
        int iH8 = sVar.h(8);
        int iH9 = sVar.h(8);
        int iH10 = sVar.h(4);
        int iH11 = sVar.h(2);
        sVar.q(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int iH12 = sVar.h(i11);
            int iH13 = sVar.h(i12);
            int iH14 = sVar.h(i12);
            int iH15 = sVar.h(12);
            int i14 = iH11;
            sVar.q(4);
            int iH16 = sVar.h(12);
            i13 -= 6;
            if (iH13 == 1 || iH13 == 2) {
                i13 -= 2;
                iH = sVar.h(8);
                iH2 = sVar.h(8);
            } else {
                iH = 0;
                iH2 = 0;
            }
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH, iH2));
            iH11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    public static void q(s sVar, h hVar) {
        f fVar;
        int iH = sVar.h(8);
        int iH2 = sVar.h(16);
        int iH3 = sVar.h(16);
        int iD = sVar.d() + iH3;
        if (iH3 * 8 > sVar.b()) {
            m.h("DvbParser", "Data field length exceeds limit");
            sVar.q(sVar.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f73097a) {
                    d dVar = hVar.f73105i;
                    d dVarO = o(sVar, iH3);
                    if (dVarO.f73076c != 0) {
                        hVar.f73105i = dVarO;
                        hVar.f73099c.clear();
                        hVar.f73100d.clear();
                        hVar.f73101e.clear();
                    } else if (dVar != null && dVar.f73075b != dVarO.f73075b) {
                        hVar.f73105i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f73105i;
                if (iH2 == hVar.f73097a && dVar2 != null) {
                    f fVarP = p(sVar, iH3);
                    if (dVar2.f73076c == 0 && (fVar = hVar.f73099c.get(fVarP.f73080a)) != null) {
                        fVarP.a(fVar);
                    }
                    hVar.f73099c.put(fVarP.f73080a, fVarP);
                }
                break;
            case 18:
                if (iH2 == hVar.f73097a) {
                    a aVarL = l(sVar, iH3);
                    hVar.f73100d.put(aVarL.f73060a, aVarL);
                } else if (iH2 == hVar.f73098b) {
                    a aVarL2 = l(sVar, iH3);
                    hVar.f73102f.put(aVarL2.f73060a, aVarL2);
                }
                break;
            case 19:
                if (iH2 == hVar.f73097a) {
                    c cVarN = n(sVar);
                    hVar.f73101e.put(cVarN.f73070a, cVarN);
                } else if (iH2 == hVar.f73098b) {
                    c cVarN2 = n(sVar);
                    hVar.f73103g.put(cVarN2.f73070a, cVarN2);
                }
                break;
            case 20:
                if (iH2 == hVar.f73097a) {
                    hVar.f73104h = m(sVar);
                }
                break;
        }
        sVar.r(iD - sVar.d());
    }

    public List<t4.b> b(byte[] bArr, int i10) {
        s sVar = new s(bArr, i10);
        while (sVar.b() >= 48 && sVar.h(8) == 15) {
            q(sVar, this.f73058f);
        }
        h hVar = this.f73058f;
        d dVar = hVar.f73105i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0765b c0765b = hVar.f73104h;
        if (c0765b == null) {
            c0765b = this.f73056d;
        }
        Bitmap bitmap = this.f73059g;
        if (bitmap == null || c0765b.f73064a + 1 != bitmap.getWidth() || c0765b.f73065b + 1 != this.f73059g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0765b.f73064a + 1, c0765b.f73065b + 1, Bitmap.Config.ARGB_8888);
            this.f73059g = bitmapCreateBitmap;
            this.f73055c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f73077d;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            this.f73055c.save();
            e eVarValueAt = sparseArray.valueAt(i11);
            f fVar = this.f73058f.f73099c.get(sparseArray.keyAt(i11));
            int i12 = eVarValueAt.f73078a + c0765b.f73066c;
            int i13 = eVarValueAt.f73079b + c0765b.f73068e;
            this.f73055c.clipRect(i12, i13, Math.min(fVar.f73082c + i12, c0765b.f73067d), Math.min(fVar.f73083d + i13, c0765b.f73069f));
            a aVar = this.f73058f.f73100d.get(fVar.f73086g);
            if (aVar == null && (aVar = this.f73058f.f73102f.get(fVar.f73086g)) == null) {
                aVar = this.f73057e;
            }
            int i14 = 0;
            for (SparseArray<g> sparseArray2 = fVar.f73090k; i14 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i14);
                g gVarValueAt = sparseArray2.valueAt(i14);
                c cVar = this.f73058f.f73101e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f73058f.f73103g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    k(cVar2, aVar, fVar.f73085f, gVarValueAt.f73093c + i12, i13 + gVarValueAt.f73094d, cVar2.f73071b ? null : this.f73053a, this.f73055c);
                }
                i14++;
            }
            if (fVar.f73081b) {
                int i15 = fVar.f73085f;
                this.f73054b.setColor(i15 == 3 ? aVar.f73063d[fVar.f73087h] : i15 == 2 ? aVar.f73062c[fVar.f73088i] : aVar.f73061b[fVar.f73089j]);
                this.f73055c.drawRect(i12, i13, fVar.f73082c + i12, fVar.f73083d + i13, this.f73054b);
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f73059g, i12, i13, fVar.f73082c, fVar.f73083d);
            int i16 = c0765b.f73064a;
            float f10 = i12 / i16;
            int i17 = c0765b.f73065b;
            arrayList.add(new t4.b(bitmapCreateBitmap2, f10, 0, i13 / i17, 0, fVar.f73082c / i16, fVar.f73083d / i17));
            this.f73055c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f73055c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f73058f.a();
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f73053a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f73054b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f73055c = new Canvas();
        this.f73056d = new C0765b(719, 575, 0, 719, 0, 575);
        this.f73057e = new a(0, c(), d(), e());
        this.f73058f = new h(i10, i11);
    }
}
