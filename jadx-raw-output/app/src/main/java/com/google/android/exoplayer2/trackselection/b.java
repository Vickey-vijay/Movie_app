package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import androidx.annotation.Nullable;
import c5.d;
import c5.e;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import g5.k0;
import g5.p;
import java.util.Arrays;
import k3.q0;
import k3.r0;
import k3.v0;
import k4.r;

/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f19909c;

    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public final int f19910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f19912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TrackGroupArray[] f19913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f19914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[][][] f19915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TrackGroupArray f19916g;

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f19913d[i10].a(i11).a(iArr[i12]).f18970j;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !k0.c(str, str2);
                }
                iMin = Math.min(iMin, q0.getAdaptiveSupport(this.f19915f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f19914e[i10]) : iMin;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f19913d[i10].a(i11).f19431b;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iF = f(i10, i11, i14);
                if (iF == 4 || (z10 && iF == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int c() {
            return this.f19911b;
        }

        public int d(int i10) {
            return this.f19912c[i10];
        }

        public TrackGroupArray e(int i10) {
            return this.f19913d[i10];
        }

        public int f(int i10, int i11, int i12) {
            return q0.getFormatSupport(this.f19915f[i10][i11][i12]);
        }

        public TrackGroupArray g() {
            return this.f19916g;
        }

        public a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f19912c = iArr;
            this.f19913d = trackGroupArrayArr;
            this.f19915f = iArr3;
            this.f19914e = iArr2;
            this.f19916g = trackGroupArray;
            int length = iArr.length;
            this.f19911b = length;
            this.f19910a = length;
        }
    }

    public static int f(q0[] q0VarArr, TrackGroup trackGroup, int[] iArr, boolean z10) throws ExoPlaybackException {
        int length = q0VarArr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < q0VarArr.length; i11++) {
            q0 q0Var = q0VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < trackGroup.f19431b; i12++) {
                iMax = Math.max(iMax, q0.getFormatSupport(q0Var.a(trackGroup.a(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    public static int[] i(q0[] q0VarArr) throws ExoPlaybackException {
        int length = q0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = q0VarArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Override // c5.d
    public final e e(q0[] q0VarArr, TrackGroupArray trackGroupArray, r.a aVar, v0 v0Var) throws ExoPlaybackException {
        int[] iArr = new int[q0VarArr.length + 1];
        int length = q0VarArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[q0VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = trackGroupArray.f19435b;
            trackGroupArr[i10] = new TrackGroup[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrI = i(q0VarArr);
        for (int i12 = 0; i12 < trackGroupArray.f19435b; i12++) {
            TrackGroup trackGroupA = trackGroupArray.a(i12);
            int iF = f(q0VarArr, trackGroupA, iArr, p.h(trackGroupA.a(0).f18970j) == 4);
            int[] iArrH = iF == q0VarArr.length ? new int[trackGroupA.f19431b] : h(q0VarArr[iF], trackGroupA);
            int i13 = iArr[iF];
            trackGroupArr[iF][i13] = trackGroupA;
            iArr2[iF][i13] = iArrH;
            iArr[iF] = i13 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[q0VarArr.length];
        int[] iArr3 = new int[q0VarArr.length];
        for (int i14 = 0; i14 < q0VarArr.length; i14++) {
            int i15 = iArr[i14];
            trackGroupArrayArr[i14] = new TrackGroupArray((TrackGroup[]) k0.q0(trackGroupArr[i14], i15));
            iArr2[i14] = (int[][]) k0.q0(iArr2[i14], i15);
            iArr3[i14] = q0VarArr[i14].getTrackType();
        }
        a aVar2 = new a(iArr3, trackGroupArrayArr, iArrI, iArr2, new TrackGroupArray((TrackGroup[]) k0.q0(trackGroupArr[q0VarArr.length], iArr[q0VarArr.length])));
        Pair<r0[], c[]> pairJ = j(aVar2, iArr2, iArrI);
        return new e((r0[]) pairJ.first, (c[]) pairJ.second, aVar2);
    }

    public abstract Pair<r0[], c[]> j(a aVar, int[][][] iArr, int[] iArr2) throws ExoPlaybackException;

    public static int[] h(q0 q0Var, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.f19431b];
        for (int i10 = 0; i10 < trackGroup.f19431b; i10++) {
            iArr[i10] = q0Var.a(trackGroup.a(i10));
        }
        return iArr;
    }

    @Override // c5.d
    public final void d(Object obj) {
        this.f19909c = (a) obj;
    }

    @Nullable
    public final a g() {
        return this.f19909c;
    }
}
