package w3;

import g5.k0;

/* JADX INFO: compiled from: FixedSampleSizeRechunker.java */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: compiled from: FixedSampleSizeRechunker.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f73376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f73377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f73379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f73380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f73381f;

        public b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f73376a = jArr;
            this.f73377b = iArr;
            this.f73378c = i10;
            this.f73379d = jArr2;
            this.f73380e = iArr2;
            this.f73381f = j10;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iK = 0;
        for (int i12 : iArr) {
            iK += k0.k(i12, i11);
        }
        long[] jArr2 = new long[iK];
        int[] iArr2 = new int[iK];
        long[] jArr3 = new long[iK];
        int[] iArr3 = new int[iK];
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j11 = jArr[i15];
            while (i16 > 0) {
                int iMin = Math.min(i11, i16);
                jArr2[i14] = j11;
                int i17 = i10 * iMin;
                iArr2[i14] = i17;
                iMax = Math.max(iMax, i17);
                jArr3[i14] = ((long) i13) * j10;
                iArr3[i14] = 1;
                j11 += (long) iArr2[i14];
                i13 += iMin;
                i16 -= iMin;
                i14++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j10 * ((long) i13));
    }
}
