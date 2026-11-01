package g5;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f53130a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f53131b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f53132c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f53133d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f53136c;

        public a(int i10, int i11, boolean z10) {
            this.f53134a = i10;
            this.f53135b = i11;
            this.f53136c = z10;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f53140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f53141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f53142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f53143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53144h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f53145i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53146j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f53147k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53148l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f53149m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f53137a = i10;
            this.f53138b = i11;
            this.f53139c = i12;
            this.f53140d = i13;
            this.f53141e = i14;
            this.f53142f = i15;
            this.f53143g = f10;
            this.f53144h = z10;
            this.f53145i = z11;
            this.f53146j = i16;
            this.f53147k = i17;
            this.f53148l = i18;
            this.f53149m = z12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0095, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = r2
            goto L9
        L8:
            r3 = r1
        L9:
            g5.a.f(r3)
            if (r0 != 0) goto Lf
            return r10
        Lf:
            r3 = 2
            if (r11 == 0) goto L40
            boolean r4 = r11[r1]
            if (r4 == 0) goto L1c
            a(r11)
            int r9 = r9 + (-3)
            return r9
        L1c:
            if (r0 <= r2) goto L2b
            boolean r4 = r11[r2]
            if (r4 == 0) goto L2b
            r4 = r8[r9]
            if (r4 != r2) goto L2b
            a(r11)
            int r9 = r9 - r3
            return r9
        L2b:
            if (r0 <= r3) goto L40
            boolean r4 = r11[r3]
            if (r4 == 0) goto L40
            r4 = r8[r9]
            if (r4 != 0) goto L40
            int r4 = r9 + 1
            r4 = r8[r4]
            if (r4 != r2) goto L40
            a(r11)
            int r9 = r9 - r2
            return r9
        L40:
            int r4 = r10 + (-1)
            int r9 = r9 + r3
        L43:
            if (r9 >= r4) goto L65
            r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L4c
            goto L62
        L4c:
            int r6 = r9 + (-2)
            r7 = r8[r6]
            if (r7 != 0) goto L60
            int r7 = r9 + (-1)
            r7 = r8[r7]
            if (r7 != 0) goto L60
            if (r5 != r2) goto L60
            if (r11 == 0) goto L5f
            a(r11)
        L5f:
            return r6
        L60:
            int r9 = r9 + (-2)
        L62:
            int r9 = r9 + 3
            goto L43
        L65:
            if (r11 == 0) goto Lb9
            if (r0 <= r3) goto L7c
            int r9 = r10 + (-3)
            r9 = r8[r9]
            if (r9 != 0) goto L7a
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L7a
            r9 = r8[r4]
            if (r9 != r2) goto L7a
            goto L95
        L7a:
            r9 = r1
            goto L96
        L7c:
            if (r0 != r3) goto L8d
            boolean r9 = r11[r3]
            if (r9 == 0) goto L7a
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L7a
            r9 = r8[r4]
            if (r9 != r2) goto L7a
            goto L95
        L8d:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L7a
            r9 = r8[r4]
            if (r9 != r2) goto L7a
        L95:
            r9 = r2
        L96:
            r11[r1] = r9
            if (r0 <= r2) goto La5
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto Laf
            r9 = r8[r4]
            if (r9 != 0) goto Laf
            goto Lad
        La5:
            boolean r9 = r11[r3]
            if (r9 == 0) goto Laf
            r9 = r8[r4]
            if (r9 != 0) goto Laf
        Lad:
            r9 = r2
            goto Lb0
        Laf:
            r9 = r1
        Lb0:
            r11[r2] = r9
            r8 = r8[r4]
            if (r8 != 0) goto Lb7
            r1 = r2
        Lb7:
            r11[r3] = r1
        Lb9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.c(byte[], int, int, boolean[]):int");
    }

    public static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        u uVar = new u(bArr, i10, i11);
        uVar.l(8);
        int iH = uVar.h();
        int iH2 = uVar.h();
        uVar.k();
        return new a(iH, iH2, uVar.d());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162 A[PHI: r1
  0x0162: PHI (r1v8 float) = (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v10 float) binds: [B:71:0x011f, B:73:0x0125, B:83:0x014c, B:77:0x013b, B:78:0x013d, B:79:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    public static b i(byte[] bArr, int i10, int i11) {
        int iH;
        boolean zD;
        int iH2;
        boolean z10;
        boolean zD2;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15;
        int i16;
        u uVar = new u(bArr, i10, i11);
        uVar.l(8);
        int iE = uVar.e(8);
        int iE2 = uVar.e(8);
        int iE3 = uVar.e(8);
        int iH3 = uVar.h();
        int i17 = 1;
        if (iE == 100 || iE == 110 || iE == 122 || iE == 244 || iE == 44 || iE == 83 || iE == 86 || iE == 118 || iE == 128 || iE == 138) {
            iH = uVar.h();
            zD = iH == 3 ? uVar.d() : false;
            uVar.h();
            uVar.h();
            uVar.k();
            if (uVar.d()) {
                int i18 = iH != 3 ? 8 : 12;
                int i19 = 0;
                while (i19 < i18) {
                    if (uVar.d()) {
                        j(uVar, i19 < 6 ? 16 : 64);
                    }
                    i19++;
                }
            }
        } else {
            iH = 1;
            zD = false;
        }
        int iH4 = uVar.h() + 4;
        int iH5 = uVar.h();
        if (iH5 != 0) {
            if (iH5 == 1) {
                boolean zD3 = uVar.d();
                uVar.g();
                uVar.g();
                long jH = uVar.h();
                for (int i20 = 0; i20 < jH; i20++) {
                    uVar.h();
                }
                z10 = zD3;
                iH2 = 0;
            } else {
                iH2 = 0;
            }
            uVar.h();
            uVar.k();
            int iH6 = uVar.h() + 1;
            int iH7 = uVar.h() + 1;
            zD2 = uVar.d();
            int i21 = (2 - (zD2 ? 1 : 0)) * iH7;
            if (!zD2) {
                uVar.k();
            }
            uVar.k();
            i12 = iH6 * 16;
            i13 = i21 * 16;
            if (uVar.d()) {
                int iH8 = uVar.h();
                int iH9 = uVar.h();
                int iH10 = uVar.h();
                int iH11 = uVar.h();
                if (iH == 0) {
                    i16 = 2 - (zD2 ? 1 : 0);
                } else {
                    if (iH == 3) {
                        i15 = 1;
                        i14 = 1;
                    } else {
                        i14 = 2;
                        i15 = 1;
                    }
                    if (iH == i15) {
                        i15 = 2;
                    }
                    i16 = (2 - (zD2 ? 1 : 0)) * i15;
                    i17 = i14;
                }
                i12 -= (iH8 + iH9) * i17;
                i13 -= (iH10 + iH11) * i16;
            }
            int i22 = i13;
            int i23 = i12;
            f10 = 1.0f;
            if (uVar.d() || !uVar.d()) {
                f11 = f10;
            } else {
                int iE4 = uVar.e(8);
                if (iE4 == 255) {
                    int iE5 = uVar.e(16);
                    int iE6 = uVar.e(16);
                    if (iE5 != 0 && iE6 != 0) {
                        f10 = iE5 / iE6;
                    }
                } else {
                    float[] fArr = f53131b;
                    if (iE4 < fArr.length) {
                        f11 = fArr[iE4];
                    } else {
                        m.h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iE4);
                    }
                }
                f11 = f10;
            }
            return new b(iE, iE2, iE3, iH3, i23, i22, f11, zD, zD2, iH4, iH5, iH2, z10);
        }
        iH2 = uVar.h() + 4;
        z10 = false;
        uVar.h();
        uVar.k();
        int iH12 = uVar.h() + 1;
        int iH13 = uVar.h() + 1;
        zD2 = uVar.d();
        int i24 = (2 - (zD2 ? 1 : 0)) * iH13;
        if (!zD2) {
            uVar.k();
        }
        uVar.k();
        i12 = iH12 * 16;
        i13 = i24 * 16;
        if (uVar.d()) {
            int iH14 = uVar.h();
            int iH15 = uVar.h();
            int iH16 = uVar.h();
            int iH17 = uVar.h();
            if (iH == 0) {
                i16 = 2 - (zD2 ? 1 : 0);
            } else {
                if (iH == 3) {
                    i15 = 1;
                    i14 = 1;
                } else {
                    i14 = 2;
                    i15 = 1;
                }
                if (iH == i15) {
                    i15 = 2;
                }
                i16 = (2 - (zD2 ? 1 : 0)) * i15;
                i17 = i14;
            }
            i12 -= (iH14 + iH15) * i17;
            i13 -= (iH16 + iH17) * i16;
        }
        int i25 = i13;
        int i26 = i12;
        f10 = 1.0f;
        if (uVar.d()) {
            f11 = f10;
        } else {
            f11 = f10;
        }
        return new b(iE, iE2, iE3, iH3, i26, i25, f11, zD, zD2, iH4, iH5, iH2, z10);
    }

    public static void j(u uVar, int i10) {
        int iG = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iG != 0) {
                iG = ((uVar.g() + i11) + 256) % 256;
            }
            if (iG != 0) {
                i11 = iG;
            }
        }
    }

    public static int k(byte[] bArr, int i10) {
        int i11;
        synchronized (f53132c) {
            int iD = 0;
            int i12 = 0;
            while (iD < i10) {
                try {
                    iD = d(bArr, iD, i10);
                    if (iD < i10) {
                        int[] iArr = f53133d;
                        if (iArr.length <= i12) {
                            f53133d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f53133d[i12] = iD;
                        iD += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f53133d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i18 + 1;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < iPosition) {
                int i13 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i10 - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                } else if (i13 == 0) {
                    i11++;
                }
                if (i13 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }
}
