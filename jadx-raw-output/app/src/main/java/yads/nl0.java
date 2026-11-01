package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public final class nl0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f80692h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f80693i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f80694j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f80695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f80696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f80697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gl0 f80698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fl0 f80699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ml0 f80700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f80701g;

    public static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int[] a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    public static void a(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c10;
        char c11;
        boolean z10;
        boolean z11;
        int iA;
        ?? A;
        int iA2;
        boolean z12;
        int i13;
        int iA3;
        int iA4;
        int i14;
        int i15;
        int iA5;
        ib2 ib2Var = new ib2(bArr.length, bArr);
        int i16 = i11;
        int i17 = i12;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (ib2Var.b() != 0) {
            int i18 = 8;
            int iA6 = ib2Var.a(8);
            if (iA6 != 240) {
                int i19 = 4;
                int i20 = 2;
                int i21 = 0;
                int i22 = 1;
                switch (iA6) {
                    case 16:
                        boolean z13 = false;
                        int i23 = 2;
                        if (i10 == 3) {
                            if (bArr4 == null) {
                                bArr3 = f80693i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr4;
                            }
                        } else if (i10 != 2) {
                            bArr2 = null;
                        } else if (bArr6 == null) {
                            bArr3 = f80692h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArr6;
                        }
                        int i24 = i16;
                        boolean z14 = false;
                        while (true) {
                            int iA7 = ib2Var.a(i23);
                            if (iA7 != 0) {
                                iA = 1;
                                z10 = z14;
                                c10 = 4;
                                c11 = '\b';
                                A = iA7;
                            } else {
                                if (ib2Var.e()) {
                                    int iA8 = ib2Var.a(3) + 3;
                                    iA2 = ib2Var.a(i23);
                                    iA = iA8;
                                    c11 = '\b';
                                } else {
                                    if (ib2Var.e()) {
                                        iA = 1;
                                        z12 = z13;
                                    } else {
                                        int iA9 = ib2Var.a(i23);
                                        if (iA9 == 0) {
                                            c10 = 4;
                                            c11 = '\b';
                                            z10 = true;
                                            z11 = z13;
                                            iA = z11 ? 1 : 0;
                                        } else if (iA9 == 1) {
                                            c10 = 4;
                                            c11 = '\b';
                                            z10 = z14;
                                            A = z13;
                                            iA = i23;
                                        } else if (iA9 == i23) {
                                            c10 = 4;
                                            c11 = '\b';
                                            iA = ib2Var.a(4) + 12;
                                            z10 = z14;
                                            A = ib2Var.a(i23);
                                        } else if (iA9 != 3) {
                                            boolean z15 = z13;
                                            iA = z15 ? 1 : 0;
                                            z12 = z15;
                                        } else {
                                            c11 = '\b';
                                            int iA10 = ib2Var.a(8) + 29;
                                            iA2 = ib2Var.a(i23);
                                            iA = iA10;
                                        }
                                    }
                                    c10 = 4;
                                    c11 = '\b';
                                    A = z12;
                                    z10 = z14;
                                }
                                A = iA2;
                                c10 = 4;
                                z10 = z14;
                            }
                            if (iA == 0 || paint == null) {
                                A = z11;
                            } else {
                                if (bArr2 != 0) {
                                    A = bArr2[A];
                                }
                                paint.setColor(iArr[A]);
                                canvas.drawRect(i24, i17, i24 + iA, i17 + 1, paint);
                            }
                            i24 += iA;
                            if (z10) {
                                if (ib2Var.f78554c != 0) {
                                    ib2Var.f78554c = z13;
                                    ib2Var.f78553b++;
                                    ib2Var.a();
                                }
                                i16 = i24;
                            } else {
                                z13 = z13;
                                z14 = z10;
                                i23 = 2;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr7 = i10 == 3 ? bArr5 == null ? f80694j : bArr5 : null;
                        int i25 = i16;
                        boolean z16 = false;
                        while (true) {
                            int iA11 = ib2Var.a(i19);
                            if (iA11 != 0) {
                                i13 = 1;
                                z16 = z16;
                                iA4 = iA11;
                            } else if (ib2Var.e()) {
                                if (ib2Var.e()) {
                                    int iA12 = ib2Var.a(i20);
                                    if (iA12 == 0) {
                                        i13 = 1;
                                    } else if (iA12 == 1) {
                                        i13 = i20;
                                    } else if (iA12 == i20) {
                                        iA3 = ib2Var.a(i19) + 9;
                                        iA4 = ib2Var.a(i19);
                                    } else if (iA12 != 3) {
                                        z16 = z16;
                                        iA4 = 0;
                                        i13 = 0;
                                    } else {
                                        iA3 = ib2Var.a(i18) + 25;
                                        iA4 = ib2Var.a(i19);
                                    }
                                    iA4 = 0;
                                } else {
                                    iA3 = ib2Var.a(i20) + i19;
                                    iA4 = ib2Var.a(i19);
                                }
                                z16 = z16;
                                i13 = iA3;
                            } else {
                                int iA13 = ib2Var.a(3);
                                if (iA13 != 0) {
                                    i13 = iA13 + 2;
                                    iA4 = 0;
                                } else {
                                    z16 = true;
                                    iA4 = 0;
                                    i13 = 0;
                                }
                            }
                            if (i13 == 0 || paint == null) {
                                i14 = i20;
                            } else {
                                if (bArr7 != 0) {
                                    iA4 = bArr7[iA4];
                                }
                                paint.setColor(iArr[iA4]);
                                i14 = 2;
                                canvas.drawRect(i25, i17, i25 + i13, i17 + 1, paint);
                            }
                            i25 += i13;
                            if (z16) {
                                if (ib2Var.f78554c != 0) {
                                    ib2Var.f78554c = 0;
                                    ib2Var.f78553b++;
                                    ib2Var.a();
                                }
                                i16 = i25;
                            } else {
                                i20 = i14;
                                z16 = z16;
                                i19 = 4;
                                i18 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i26 = i16;
                        int i27 = 0;
                        while (true) {
                            int iA14 = ib2Var.a(8);
                            if (iA14 != 0) {
                                i15 = i27;
                                iA5 = i22;
                            } else if (ib2Var.e()) {
                                i15 = i27;
                                iA5 = ib2Var.a(7);
                                iA14 = ib2Var.a(8);
                            } else {
                                int iA15 = ib2Var.a(7);
                                if (iA15 != 0) {
                                    i15 = i27;
                                    iA5 = iA15;
                                    iA14 = i21;
                                } else {
                                    i15 = i22;
                                    iA14 = i21;
                                    iA5 = iA14;
                                }
                            }
                            if (iA5 != 0 && paint != null) {
                                paint.setColor(iArr[iA14]);
                                canvas.drawRect(i26, i17, i26 + iA5, i17 + 1, paint);
                            }
                            i26 += iA5;
                            if (i15 != 0) {
                                i16 = i26;
                            } else {
                                i22 = i22;
                                i27 = i15;
                                i21 = 0;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iA6) {
                            case 32:
                                bArr6 = new byte[4];
                                while (i21 < 4) {
                                    bArr6[i21] = (byte) ib2Var.a(4);
                                    i21++;
                                }
                                break;
                            case 33:
                                bArr4 = new byte[4];
                                while (i21 < 4) {
                                    bArr4[i21] = (byte) ib2Var.a(8);
                                    i21++;
                                }
                                break;
                            case 34:
                                bArr5 = new byte[16];
                                while (i21 < 16) {
                                    bArr5[i21] = (byte) ib2Var.a(8);
                                    i21++;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i17 += 2;
                i16 = i11;
            }
        }
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public nl0(int i10, int i11) {
        Paint paint = new Paint();
        this.f80695a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f80696b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f80697c = new Canvas();
        this.f80698d = new gl0(719, 575, 0, 719, 0, 575);
        this.f80699e = new fl0(0, a(), b(), c());
        this.f80700f = new ml0(i10, i11);
    }

    public static fl0 a(ib2 ib2Var, int i10) {
        int[] iArr;
        int iA;
        int i11;
        int iA2;
        int iA3;
        int iA4;
        int i12 = 8;
        int iA5 = ib2Var.a(8);
        ib2Var.c(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int iA6 = ib2Var.a(i12);
            int iA7 = ib2Var.a(i12);
            if ((iA7 & 128) != 0) {
                iArr = iArrA;
            } else {
                iArr = (iA7 & 64) != 0 ? iArrB : iArrC;
            }
            if ((iA7 & 1) != 0) {
                iA3 = ib2Var.a(i12);
                iA4 = ib2Var.a(i12);
                iA = ib2Var.a(i12);
                iA2 = ib2Var.a(i12);
                i11 = i14 - 6;
            } else {
                int iA8 = ib2Var.a(6) << i13;
                int iA9 = ib2Var.a(4) << 4;
                iA = ib2Var.a(4) << 4;
                i11 = i14 - 4;
                iA2 = ib2Var.a(i13) << 6;
                iA3 = iA8;
                iA4 = iA9;
            }
            if (iA3 == 0) {
                iA2 = 255;
                iA4 = 0;
                iA = 0;
            }
            double d10 = iA3;
            int i15 = iA5;
            double d11 = iA4 - 128;
            int i16 = (int) ((1.402d * d11) + d10);
            double d12 = iA - 128;
            int i17 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
            int i18 = (int) ((d12 * 1.772d) + d10);
            int i19 = ib3.f78556a;
            iArr[iA6] = a((byte) (255 - (iA2 & 255)), Math.max(0, Math.min(i16, 255)), Math.max(0, Math.min(i17, 255)), Math.max(0, Math.min(i18, 255)));
            i14 = i11;
            iA5 = i15;
            i12 = 8;
            i13 = 2;
        }
        return new fl0(iA5, iArrA, iArrB, iArrC);
    }

    public static hl0 a(ib2 ib2Var) {
        byte[] bArr;
        int iA = ib2Var.a(16);
        ib2Var.c(4);
        int iA2 = ib2Var.a(2);
        boolean zE = ib2Var.e();
        ib2Var.c(1);
        byte[] bArr2 = ib3.f78561f;
        if (iA2 == 1) {
            ib2Var.c(ib2Var.a(8) * 16);
        } else {
            if (iA2 == 0) {
                int iA3 = ib2Var.a(16);
                int iA4 = ib2Var.a(16);
                if (iA3 > 0) {
                    bArr2 = new byte[iA3];
                    if (ib2Var.f78554c == 0) {
                        System.arraycopy(ib2Var.f78552a, ib2Var.f78553b, bArr2, 0, iA3);
                        ib2Var.f78553b += iA3;
                        ib2Var.a();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (iA4 > 0) {
                    bArr = new byte[iA4];
                    if (ib2Var.f78554c == 0) {
                        System.arraycopy(ib2Var.f78552a, ib2Var.f78553b, bArr, 0, iA4);
                        ib2Var.f78553b += iA4;
                        ib2Var.a();
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            return new hl0(iA, zE, bArr2, bArr);
        }
        bArr = bArr2;
        return new hl0(iA, zE, bArr2, bArr);
    }
}
