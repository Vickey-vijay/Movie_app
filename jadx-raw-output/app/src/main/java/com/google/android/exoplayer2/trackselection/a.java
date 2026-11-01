package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import g5.k0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import m4.l;
import m4.m;

/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends c5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f19886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f19889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f19890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f19891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g5.c f19892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f19896q;

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public interface b {
        long a();
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e5.c f19897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public long[][] f19900d;

        public void b(long[][] jArr) {
            g5.a.a(jArr.length >= 2);
            this.f19900d = jArr;
        }

        @Override // com.google.android.exoplayer2.trackselection.a.b
        public long a() {
            long[][] jArr;
            long jMax = Math.max(0L, ((long) (this.f19897a.getBitrateEstimate() * this.f19898b)) - this.f19899c);
            if (this.f19900d == null) {
                return jMax;
            }
            int i10 = 1;
            while (true) {
                jArr = this.f19900d;
                if (i10 >= jArr.length - 1 || jArr[i10][0] >= jMax) {
                    break;
                }
                i10++;
            }
            long[] jArr2 = jArr[i10 - 1];
            long[] jArr3 = jArr[i10];
            long j10 = jArr2[0];
            float f10 = (jMax - j10) / (jArr3[0] - j10);
            long j11 = jArr2[1];
            return j11 + ((long) (f10 * (jArr3[1] - j11)));
        }

        public c(e5.c cVar, float f10, long j10) {
            this.f19897a = cVar;
            this.f19898b = f10;
            this.f19899c = j10;
        }
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class d implements com.google.android.exoplayer2.trackselection.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final e5.c f19901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f19906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f19907g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g5.c f19908h;

        public d() {
            this(10000, 25000, 25000, 0.7f, 0.75f, 2000L, g5.c.f53058a);
        }

        public d(int i10, int i11, int i12, float f10, float f11, long j10, g5.c cVar) {
            this(null, i10, i11, i12, f10, f11, j10, cVar);
        }

        @Override // com.google.android.exoplayer2.trackselection.c.b
        public final com.google.android.exoplayer2.trackselection.c[] a(com.google.android.exoplayer2.trackselection.c.a[] aVarArr, e5.c cVar) {
            e5.c cVar2 = this.f19901a;
            if (cVar2 != null) {
                cVar = cVar2;
            }
            com.google.android.exoplayer2.trackselection.c[] cVarArr = new com.google.android.exoplayer2.trackselection.c[aVarArr.length];
            int i10 = 0;
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                com.google.android.exoplayer2.trackselection.c.a aVar = aVarArr[i11];
                if (aVar != null) {
                    int[] iArr = aVar.f19918b;
                    if (iArr.length == 1) {
                        cVarArr[i11] = new c5.b(aVar.f19917a, iArr[0], aVar.f19919c, aVar.f19920d);
                        int i12 = aVar.f19917a.a(aVar.f19918b[0]).f18966f;
                        if (i12 != -1) {
                            i10 += i12;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                com.google.android.exoplayer2.trackselection.c.a aVar2 = aVarArr[i13];
                if (aVar2 != null) {
                    int[] iArr2 = aVar2.f19918b;
                    if (iArr2.length > 1) {
                        a aVarB = b(aVar2.f19917a, cVar, iArr2, i10);
                        arrayList.add(aVarB);
                        cVarArr[i13] = aVarB;
                    }
                }
            }
            if (arrayList.size() > 1) {
                long[][] jArr = new long[arrayList.size()][];
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    a aVar3 = (a) arrayList.get(i14);
                    jArr[i14] = new long[aVar3.length()];
                    for (int i15 = 0; i15 < aVar3.length(); i15++) {
                        jArr[i14][i15] = aVar3.getFormat((aVar3.length() - i15) - 1).f18966f;
                    }
                }
                long[][][] jArrI = a.i(jArr);
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((a) arrayList.get(i16)).h(jArrI[i16]);
                }
            }
            return cVarArr;
        }

        public a b(TrackGroup trackGroup, e5.c cVar, int[] iArr, int i10) {
            return new a(trackGroup, iArr, new c(cVar, this.f19905e, i10), this.f19902b, this.f19903c, this.f19904d, this.f19906f, this.f19907g, this.f19908h);
        }

        @Deprecated
        public d(@Nullable e5.c cVar, int i10, int i11, int i12, float f10, float f11, long j10, g5.c cVar2) {
            this.f19901a = cVar;
            this.f19902b = i10;
            this.f19903c = i11;
            this.f19904d = i12;
            this.f19905e = f10;
            this.f19906f = f11;
            this.f19907g = j10;
            this.f19908h = cVar2;
        }
    }

    public static int f(double[][] dArr) {
        int length = 0;
        for (double[] dArr2 : dArr) {
            length += dArr2.length;
        }
        return length;
    }

    public static double[][] j(long[][] jArr) {
        double[][] dArr = new double[jArr.length][];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            dArr[i10] = new double[jArr[i10].length];
            int i11 = 0;
            while (true) {
                long[] jArr2 = jArr[i10];
                if (i11 < jArr2.length) {
                    double[] dArr2 = dArr[i10];
                    long j10 = jArr2[i11];
                    dArr2[i11] = j10 == -1 ? 0.0d : Math.log(j10);
                    i11++;
                }
            }
        }
        return dArr;
    }

    public static double[][] l(double[][] dArr) {
        double[][] dArr2 = new double[dArr.length][];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            double[] dArr3 = new double[dArr[i10].length - 1];
            dArr2[i10] = dArr3;
            if (dArr3.length != 0) {
                double[] dArr4 = dArr[i10];
                double d10 = dArr4[dArr4.length - 1] - dArr4[0];
                int i11 = 0;
                while (true) {
                    double[] dArr5 = dArr[i10];
                    if (i11 < dArr5.length - 1) {
                        int i12 = i11 + 1;
                        dArr2[i10][i11] = d10 == 0.0d ? 1.0d : (((dArr5[i11] + dArr5[i12]) * 0.5d) - dArr5[0]) / d10;
                        i11 = i12;
                    }
                }
            }
        }
        return dArr2;
    }

    public static void n(long[][][] jArr, int i10, long[][] jArr2, int[] iArr) {
        long j10 = 0;
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long[] jArr3 = jArr[i11][i10];
            long j11 = jArr2[i11][iArr[i11]];
            jArr3[1] = j11;
            j10 += j11;
        }
        for (long[][] jArr4 : jArr) {
            jArr4[i10][0] = j10;
        }
    }

    public boolean e(Format format, int i10, float f10, long j10) {
        return ((long) Math.round(((float) i10) * f10)) <= j10;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    public a(TrackGroup trackGroup, int[] iArr, b bVar, long j10, long j11, long j12, float f10, long j13, g5.c cVar) {
        super(trackGroup, iArr);
        this.f19886g = bVar;
        this.f19887h = j10 * 1000;
        this.f19888i = j11 * 1000;
        this.f19889j = j12 * 1000;
        this.f19890k = f10;
        this.f19891l = j13;
        this.f19892m = cVar;
        this.f19893n = 1.0f;
        this.f19895p = 0;
        this.f19896q = -9223372036854775807L;
    }

    public static long[][][] i(long[][] jArr) {
        int i10;
        double[][] dArrJ = j(jArr);
        double[][] dArrL = l(dArrJ);
        int iF = f(dArrL) + 3;
        int i11 = 0;
        long[][][] jArr2 = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, dArrJ.length, iF, 2);
        int[] iArr = new int[dArrJ.length];
        n(jArr2, 1, jArr, iArr);
        int i12 = 2;
        while (true) {
            i10 = iF - 1;
            if (i12 >= i10) {
                break;
            }
            double d10 = Double.MAX_VALUE;
            int i13 = i11;
            int i14 = i13;
            while (i13 < dArrJ.length) {
                int i15 = iArr[i13];
                if (i15 + 1 != dArrJ[i13].length) {
                    double d11 = dArrL[i13][i15];
                    if (d11 < d10) {
                        i14 = i13;
                        d10 = d11;
                    }
                }
                i13++;
            }
            iArr[i14] = iArr[i14] + 1;
            n(jArr2, i12, jArr, iArr);
            i12++;
            i11 = 0;
        }
        for (long[][] jArr3 : jArr2) {
            long[] jArr4 = jArr3[i10];
            long[] jArr5 = jArr3[iF - 2];
            jArr4[0] = jArr5[0] * 2;
            jArr4[1] = jArr5[1] * 2;
        }
        return jArr2;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void a(long j10, long j11, long j12, List<? extends l> list, m[] mVarArr) {
        long jElapsedRealtime = this.f19892m.elapsedRealtime();
        if (this.f19895p == 0) {
            this.f19895p = 1;
            this.f19894o = g(jElapsedRealtime);
            return;
        }
        int i10 = this.f19894o;
        int iG = g(jElapsedRealtime);
        this.f19894o = iG;
        if (iG == i10) {
            return;
        }
        if (!c(i10, jElapsedRealtime)) {
            Format format = getFormat(i10);
            Format format2 = getFormat(this.f19894o);
            if (format2.f18966f > format.f18966f && j11 < m(j12)) {
                this.f19894o = i10;
            } else if (format2.f18966f < format.f18966f && j11 >= this.f19888i) {
                this.f19894o = i10;
            }
        }
        if (this.f19894o != i10) {
            this.f19895p = 3;
        }
    }

    @Override // c5.a, com.google.android.exoplayer2.trackselection.c
    public int evaluateQueueSize(long j10, List<? extends l> list) {
        int i10;
        int i11;
        long jElapsedRealtime = this.f19892m.elapsedRealtime();
        if (!o(jElapsedRealtime)) {
            return list.size();
        }
        this.f19896q = jElapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jT = k0.T(list.get(size - 1).f64046f - j10, this.f19893n);
        long jK = k();
        if (jT < jK) {
            return size;
        }
        Format format = getFormat(g(jElapsedRealtime));
        for (int i12 = 0; i12 < size; i12++) {
            l lVar = list.get(i12);
            Format format2 = lVar.f64043c;
            if (k0.T(lVar.f64046f - j10, this.f19893n) >= jK && format2.f18966f < format.f18966f && (i10 = format2.f18976p) != -1 && i10 < 720 && (i11 = format2.f18975o) != -1 && i11 < 1280 && i10 < format.f18976p) {
                return i12;
            }
        }
        return size;
    }

    public final int g(long j10) {
        long jA = this.f19886g.a();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5638b; i11++) {
            if (j10 == Long.MIN_VALUE || !c(i11, j10)) {
                Format format = getFormat(i11);
                if (e(format, format.f18966f, this.f19893n, jA)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int getSelectedIndex() {
        return this.f19894o;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int getSelectionReason() {
        return this.f19895p;
    }

    public void h(long[][] jArr) {
        ((c) this.f19886g).b(jArr);
    }

    public long k() {
        return this.f19889j;
    }

    public boolean o(long j10) {
        long j11 = this.f19896q;
        return j11 == -9223372036854775807L || j10 - j11 >= this.f19891l;
    }

    @Override // c5.a, com.google.android.exoplayer2.trackselection.c
    public void onPlaybackSpeed(float f10) {
        this.f19893n = f10;
    }

    @Override // c5.a, com.google.android.exoplayer2.trackselection.c
    public void enable() {
        this.f19896q = -9223372036854775807L;
    }

    public final long m(long j10) {
        boolean z10;
        if (j10 != -9223372036854775807L && j10 <= this.f19887h) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return (long) (j10 * this.f19890k);
        }
        return this.f19887h;
    }
}
