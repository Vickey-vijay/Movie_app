package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import e5.m;
import e5.n;
import g5.k0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.t0;
import k4.b0;
import k4.i0;
import k4.j0;
import k4.k;
import k4.q;
import m4.g;
import o4.e;
import o4.f;
import o4.i;

/* JADX INFO: compiled from: DashMediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements q, j0.a<g<com.google.android.exoplayer2.source.dash.a>>, g.b<com.google.android.exoplayer2.source.dash.a> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f19485x = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.dash.a.InterfaceC0180a f19487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final e5.q f19488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f19489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f19490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f19492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e5.b f19493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TrackGroupArray f19494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f19495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k4.g f19496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f19497m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.a f19499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public q.a f19500p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j0 f19503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o4.b f19504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19505u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<e> f19506v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19507w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g<com.google.android.exoplayer2.source.dash.a>[] f19501q = v(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n4.e[] f19502r = new n4.e[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final IdentityHashMap<g<com.google.android.exoplayer2.source.dash.a>, d.c> f19498n = new IdentityHashMap<>();

    /* JADX INFO: compiled from: DashMediaPeriod.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f19508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19514g;

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(4, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(4, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f19509b = i10;
            this.f19508a = iArr;
            this.f19510c = i11;
            this.f19512e = i12;
            this.f19513f = i13;
            this.f19514g = i14;
            this.f19511d = i15;
        }
    }

    public static Format g(int i10) {
        return h(i10, null, -1);
    }

    public static void i(List<e> list, TrackGroup[] trackGroupArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            trackGroupArr[i10] = new TrackGroup(Format.t(list.get(i11).a(), "application/x-emsg", null, -1, null));
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    public static int j(com.google.android.exoplayer2.drm.a<?> aVar, List<o4.a> list, int[][] iArr, int i10, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f64990c);
            }
            int size = arrayList.size();
            Format[] formatArr2 = new Format[size];
            for (int i16 = 0; i16 < size; i16++) {
                Format formatE = ((i) arrayList.get(i16)).f65040b;
                DrmInitData drmInitData = formatE.f18973m;
                if (drmInitData != null) {
                    formatE = formatE.e(aVar.c(drmInitData));
                }
                formatArr2[i16] = formatE;
            }
            o4.a aVar2 = list.get(iArr2[0]);
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i11 = i17 + 1;
            } else {
                i11 = i17;
                i17 = -1;
            }
            if (formatArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            trackGroupArr[i14] = new TrackGroup(formatArr2);
            aVarArr[i14] = a.d(aVar2.f64989b, iArr2, i14, i17, i11);
            if (i17 != -1) {
                trackGroupArr[i17] = new TrackGroup(Format.t(aVar2.f64988a + ":emsg", "application/x-emsg", null, -1, null));
                aVarArr[i17] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                trackGroupArr[i11] = new TrackGroup(formatArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    @Nullable
    public static o4.d n(List<o4.d> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            o4.d dVar = list.get(i10);
            if (str.equals(dVar.f65017a)) {
                return dVar;
            }
        }
        return null;
    }

    public static Format[] p(List<o4.a> list, int[] iArr) {
        for (int i10 : iArr) {
            o4.a aVar = list.get(i10);
            List<o4.d> list2 = list.get(i10).f64991d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                o4.d dVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f65017a)) {
                    String str = dVar.f65018b;
                    if (str == null) {
                        return new Format[]{g(aVar.f64988a)};
                    }
                    String[] strArrD0 = k0.D0(str, ";");
                    Format[] formatArr = new Format[strArrD0.length];
                    for (int i12 = 0; i12 < strArrD0.length; i12++) {
                        Matcher matcher = f19485x.matcher(strArrD0[i12]);
                        if (!matcher.matches()) {
                            return new Format[]{g(aVar.f64988a)};
                        }
                        formatArr[i12] = h(aVar.f64988a, matcher.group(2), Integer.parseInt(matcher.group(1)));
                    }
                    return formatArr;
                }
            }
        }
        return new Format[0];
    }

    public static boolean t(List<o4.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<i> list2 = list.get(i10).f64990c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f65043e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int u(int i10, List<o4.a> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (t(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            Format[] formatArrP = p(list, iArr[i12]);
            formatArr[i12] = formatArrP;
            if (formatArrP.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    public final void A(com.google.android.exoplayer2.trackselection.c[] cVarArr, i0[] i0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            com.google.android.exoplayer2.trackselection.c cVar = cVarArr[i10];
            if (cVar != null) {
                i0 i0Var = i0VarArr[i10];
                if (i0Var == null) {
                    zArr[i10] = true;
                    a aVar = this.f19495k[iArr[i10]];
                    int i11 = aVar.f19510c;
                    if (i11 == 0) {
                        i0VarArr[i10] = k(aVar, cVar, j10);
                    } else if (i11 == 2) {
                        i0VarArr[i10] = new n4.e(this.f19506v.get(aVar.f19511d), cVar.getTrackGroup().a(0), this.f19504t.f64997d);
                    }
                } else if (i0Var instanceof g) {
                    ((com.google.android.exoplayer2.source.dash.a) ((g) i0Var).o()).b(cVar);
                }
            }
        }
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            if (i0VarArr[i12] == null && cVarArr[i12] != null) {
                a aVar2 = this.f19495k[iArr[i12]];
                if (aVar2.f19510c == 1) {
                    int iR = r(i12, iArr);
                    if (iR == -1) {
                        i0VarArr[i12] = new k();
                    } else {
                        i0VarArr[i12] = ((g) i0VarArr[iR]).C(j10, aVar2.f19509b);
                    }
                }
            }
        }
    }

    @Override // m4.g.b
    public synchronized void b(g<com.google.android.exoplayer2.source.dash.a> gVar) {
        d.c cVarRemove = this.f19498n.remove(gVar);
        if (cVarRemove != null) {
            cVarRemove.l();
        }
    }

    public final int[] s(com.google.android.exoplayer2.trackselection.c[] cVarArr) {
        int[] iArr = new int[cVarArr.length];
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            com.google.android.exoplayer2.trackselection.c cVar = cVarArr[i10];
            if (cVar != null) {
                iArr[i10] = this.f19494j.b(cVar.getTrackGroup());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    public final void y(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr) {
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10] == null || !zArr[i10]) {
                i0 i0Var = i0VarArr[i10];
                if (i0Var instanceof g) {
                    ((g) i0Var).A(this);
                } else if (i0Var instanceof g.a) {
                    ((g.a) i0Var).c();
                }
                i0VarArr[i10] = null;
            }
        }
    }

    public final void z(com.google.android.exoplayer2.trackselection.c[] cVarArr, i0[] i0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            i0 i0Var = i0VarArr[i10];
            if ((i0Var instanceof k) || (i0Var instanceof g.a)) {
                int iR = r(i10, iArr);
                if (iR == -1) {
                    z10 = i0VarArr[i10] instanceof k;
                } else {
                    i0 i0Var2 = i0VarArr[i10];
                    z10 = (i0Var2 instanceof g.a) && ((g.a) i0Var2).f64089b == i0VarArr[iR];
                }
                if (!z10) {
                    i0 i0Var3 = i0VarArr[i10];
                    if (i0Var3 instanceof g.a) {
                        ((g.a) i0Var3).c();
                    }
                    i0VarArr[i10] = null;
                }
            }
        }
    }

    public static Format h(int i10, String str, int i11) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(":cea608");
        if (i11 != -1) {
            str2 = StringUtils.PROCESS_POSTFIX_DELIMITER + i11;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        return Format.y(sb2.toString(), "application/cea-608", null, -1, 0, str, i11, null, Long.MAX_VALUE, null);
    }

    public static o4.d m(List<o4.d> list) {
        return n(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @Nullable
    public static o4.d o(List<o4.d> list) {
        return n(list, "http://dashif.org/guidelines/trickmode");
    }

    public static g<com.google.android.exoplayer2.source.dash.a>[] v(int i10) {
        return new g[i10];
    }

    public void B(o4.b bVar, int i10) {
        this.f19504t = bVar;
        this.f19505u = i10;
        this.f19497m.p(bVar);
        g<com.google.android.exoplayer2.source.dash.a>[] gVarArr = this.f19501q;
        if (gVarArr != null) {
            for (g<com.google.android.exoplayer2.source.dash.a> gVar : gVarArr) {
                ((com.google.android.exoplayer2.source.dash.a) gVar.o()).e(bVar, i10);
            }
            this.f19500p.e(this);
        }
        this.f19506v = bVar.c(i10).f65028d;
        for (n4.e eVar : this.f19502r) {
            for (e eVar2 : this.f19506v) {
                if (eVar2.a().equals(eVar.a())) {
                    eVar.d(eVar2, bVar.f64997d && i10 == bVar.d() - 1);
                    break;
                }
            }
        }
    }

    @Override // k4.q
    public long a(long j10, t0 t0Var) {
        for (g<com.google.android.exoplayer2.source.dash.a> gVar : this.f19501q) {
            if (gVar.f64067b == 2) {
                return gVar.a(j10, t0Var);
            }
        }
        return j10;
    }

    @Override // k4.q
    public void c(q.a aVar, long j10) {
        this.f19500p = aVar;
        aVar.f(this);
    }

    @Override // k4.q, k4.j0
    public boolean continueLoading(long j10) {
        return this.f19503s.continueLoading(j10);
    }

    @Override // k4.q
    public void discardBuffer(long j10, boolean z10) {
        for (g<com.google.android.exoplayer2.source.dash.a> gVar : this.f19501q) {
            gVar.discardBuffer(j10, z10);
        }
    }

    @Override // k4.q, k4.j0
    public long getBufferedPositionUs() {
        return this.f19503s.getBufferedPositionUs();
    }

    @Override // k4.q, k4.j0
    public long getNextLoadPositionUs() {
        return this.f19503s.getNextLoadPositionUs();
    }

    @Override // k4.q
    public TrackGroupArray getTrackGroups() {
        return this.f19494j;
    }

    @Override // k4.q, k4.j0
    public boolean isLoading() {
        return this.f19503s.isLoading();
    }

    public final g<com.google.android.exoplayer2.source.dash.a> k(a aVar, com.google.android.exoplayer2.trackselection.c cVar, long j10) {
        int i10;
        TrackGroup trackGroupA;
        TrackGroup trackGroupA2;
        int i11;
        int i12 = aVar.f19513f;
        boolean z10 = i12 != -1;
        d.c cVarK = null;
        if (z10) {
            trackGroupA = this.f19494j.a(i12);
            i10 = 1;
        } else {
            i10 = 0;
            trackGroupA = null;
        }
        int i13 = aVar.f19514g;
        boolean z11 = i13 != -1;
        if (z11) {
            trackGroupA2 = this.f19494j.a(i13);
            i10 += trackGroupA2.f19431b;
        } else {
            trackGroupA2 = null;
        }
        Format[] formatArr = new Format[i10];
        int[] iArr = new int[i10];
        if (z10) {
            formatArr[0] = trackGroupA.a(0);
            iArr[0] = 4;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < trackGroupA2.f19431b; i14++) {
                Format formatA = trackGroupA2.a(i14);
                formatArr[i11] = formatA;
                iArr[i11] = 3;
                arrayList.add(formatA);
                i11++;
            }
        }
        if (this.f19504t.f64997d && z10) {
            cVarK = this.f19497m.k();
        }
        d.c cVar2 = cVarK;
        g<com.google.android.exoplayer2.source.dash.a> gVar = new g<>(aVar.f19509b, iArr, formatArr, this.f19487c.a(this.f19492h, this.f19504t, this.f19505u, aVar.f19508a, cVar, aVar.f19509b, this.f19491g, z10, arrayList, cVar2, this.f19488d), this, this.f19493i, j10, this.f19489e, this.f19490f, this.f19499o);
        synchronized (this) {
            this.f19498n.put(gVar, cVar2);
        }
        return gVar;
    }

    @Override // k4.q
    public void maybeThrowPrepareError() throws IOException {
        this.f19492h.maybeThrowError();
    }

    public final int r(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f19495k[i11].f19512e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f19495k[i14].f19510c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // k4.q
    public long readDiscontinuity() {
        if (this.f19507w) {
            return -9223372036854775807L;
        }
        this.f19499o.L();
        this.f19507w = true;
        return -9223372036854775807L;
    }

    @Override // k4.q, k4.j0
    public void reevaluateBuffer(long j10) {
        this.f19503s.reevaluateBuffer(j10);
    }

    @Override // k4.q
    public long seekToUs(long j10) {
        for (g<com.google.android.exoplayer2.source.dash.a> gVar : this.f19501q) {
            gVar.B(j10);
        }
        for (n4.e eVar : this.f19502r) {
            eVar.c(j10);
        }
        return j10;
    }

    @Override // k4.j0.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void e(g<com.google.android.exoplayer2.source.dash.a> gVar) {
        this.f19500p.e(this);
    }

    public void x() {
        this.f19497m.n();
        for (g<com.google.android.exoplayer2.source.dash.a> gVar : this.f19501q) {
            gVar.A(this);
        }
        this.f19500p = null;
        this.f19499o.J();
    }

    public b(int i10, o4.b bVar, int i11, com.google.android.exoplayer2.source.dash.a.InterfaceC0180a interfaceC0180a, @Nullable e5.q qVar, com.google.android.exoplayer2.drm.a<?> aVar, m mVar, b0.a aVar2, long j10, n nVar, e5.b bVar2, k4.g gVar, d.b bVar3) {
        this.f19486b = i10;
        this.f19504t = bVar;
        this.f19505u = i11;
        this.f19487c = interfaceC0180a;
        this.f19488d = qVar;
        this.f19489e = aVar;
        this.f19490f = mVar;
        this.f19499o = aVar2;
        this.f19491g = j10;
        this.f19492h = nVar;
        this.f19493i = bVar2;
        this.f19496l = gVar;
        this.f19497m = new d(bVar, bVar3, bVar2);
        this.f19503s = gVar.a(this.f19501q);
        f fVarC = bVar.c(i11);
        List<e> list = fVarC.f65028d;
        this.f19506v = list;
        Pair<TrackGroupArray, a[]> pairL = l(aVar, fVarC.f65027c, list);
        this.f19494j = (TrackGroupArray) pairL.first;
        this.f19495k = (a[]) pairL.second;
        aVar2.I();
    }

    public static Pair<TrackGroupArray, a[]> l(com.google.android.exoplayer2.drm.a<?> aVar, List<o4.a> list, List<e> list2) {
        int[][] iArrQ = q(list);
        int length = iArrQ.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length][];
        int iU = u(length, list, iArrQ, zArr, formatArr) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[iU];
        a[] aVarArr = new a[iU];
        i(list2, trackGroupArr, aVarArr, j(aVar, list, iArrQ, length, zArr, formatArr, trackGroupArr, aVarArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), aVarArr);
    }

    public static int[][] q(List<o4.a> list) {
        int iMin;
        o4.d dVarM;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            sparseIntArray.put(list.get(i10).f64988a, i10);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            o4.a aVar = list.get(i11);
            o4.d dVarO = o(aVar.f64992e);
            if (dVarO == null) {
                dVarO = o(aVar.f64993f);
            }
            if (dVarO == null || (iMin = sparseIntArray.get(Integer.parseInt(dVarO.f65018b), -1)) == -1) {
                iMin = i11;
            }
            if (iMin == i11 && (dVarM = m(aVar.f64993f)) != null) {
                for (String str : k0.D0(dVarM.f65018b, StringUtils.COMMA)) {
                    int i12 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i12 != -1) {
                        iMin = Math.min(iMin, i12);
                    }
                }
            }
            if (iMin != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iMin);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i13 = 0; i13 < size2; i13++) {
            int[] iArrI0 = k0.I0((List) arrayList.get(i13));
            iArr[i13] = iArrI0;
            Arrays.sort(iArrI0);
        }
        return iArr;
    }

    @Override // k4.q
    public long d(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        int[] iArrS = s(cVarArr);
        y(cVarArr, zArr, i0VarArr);
        z(cVarArr, i0VarArr, iArrS);
        A(cVarArr, i0VarArr, zArr2, j10, iArrS);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i0 i0Var : i0VarArr) {
            if (i0Var instanceof g) {
                arrayList.add((g) i0Var);
            } else if (i0Var instanceof n4.e) {
                arrayList2.add((n4.e) i0Var);
            }
        }
        g<com.google.android.exoplayer2.source.dash.a>[] gVarArrV = v(arrayList.size());
        this.f19501q = gVarArrV;
        arrayList.toArray(gVarArrV);
        n4.e[] eVarArr = new n4.e[arrayList2.size()];
        this.f19502r = eVarArr;
        arrayList2.toArray(eVarArr);
        this.f19503s = this.f19496l.a(this.f19501q);
        return j10;
    }
}
