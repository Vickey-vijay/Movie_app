package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import e5.n;
import e5.q;
import g5.k0;
import g5.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k3.k;
import k3.t0;
import m4.e;
import m4.l;
import m4.m;
import o4.h;
import o4.i;
import q3.g;
import q3.s;
import q3.u;
import w3.f;

/* JADX INFO: compiled from: DefaultDashChunkSource.java */
/* JADX INFO: loaded from: classes9.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f19515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f19516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f19518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final d.c f19521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b[] f19522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.android.exoplayer2.trackselection.c f19523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o4.b f19524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IOException f19526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f19528n;

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class a implements com.google.android.exoplayer2.source.dash.a.InterfaceC0180a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f19529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19530b;

        public a(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this(interfaceC0188a, 1);
        }

        public a(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, int i10) {
            this.f19529a = interfaceC0188a;
            this.f19530b = i10;
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0180a
        public com.google.android.exoplayer2.source.dash.a a(n nVar, o4.b bVar, int i10, int[] iArr, com.google.android.exoplayer2.trackselection.c cVar, int i11, long j10, boolean z10, List<Format> list, @Nullable d.c cVar2, @Nullable q qVar) {
            com.google.android.exoplayer2.upstream.a aVarCreateDataSource = this.f19529a.createDataSource();
            if (qVar != null) {
                aVarCreateDataSource.b(qVar);
            }
            return new c(nVar, bVar, i10, iArr, cVar, i11, aVarCreateDataSource, j10, this.f19530b, z10, list, cVar2);
        }
    }

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final e f19531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f19532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final n4.c f19533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f19534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19535e;

        public b(long j10, int i10, i iVar, boolean z10, List<Format> list, @Nullable u uVar) {
            this(j10, iVar, d(i10, iVar, z10, list, uVar), 0L, iVar.b());
        }

        @Nullable
        public static e d(int i10, i iVar, boolean z10, List<Format> list, @Nullable u uVar) {
            g fVar;
            String str = iVar.f65040b.f18969i;
            if (m(str)) {
                return null;
            }
            if ("application/x-rawcc".equals(str)) {
                fVar = new y3.a(iVar.f65040b);
            } else if (n(str)) {
                fVar = new u3.e(1);
            } else {
                fVar = new f(z10 ? 4 : 0, null, null, list, uVar);
            }
            return new e(fVar, i10, iVar.f65040b);
        }

        public static boolean n(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        @CheckResult
        public b b(long j10, i iVar) throws BehindLiveWindowException {
            long segmentNum;
            n4.c cVarB = this.f19532b.b();
            n4.c cVarB2 = iVar.b();
            if (cVarB == null) {
                return new b(j10, iVar, this.f19531a, this.f19535e, cVarB);
            }
            if (!cVarB.isExplicit()) {
                return new b(j10, iVar, this.f19531a, this.f19535e, cVarB2);
            }
            int segmentCount = cVarB.getSegmentCount(j10);
            if (segmentCount == 0) {
                return new b(j10, iVar, this.f19531a, this.f19535e, cVarB2);
            }
            long firstSegmentNum = cVarB.getFirstSegmentNum();
            long timeUs = cVarB.getTimeUs(firstSegmentNum);
            long j11 = (((long) segmentCount) + firstSegmentNum) - 1;
            long timeUs2 = cVarB.getTimeUs(j11) + cVarB.getDurationUs(j11, j10);
            long firstSegmentNum2 = cVarB2.getFirstSegmentNum();
            long timeUs3 = cVarB2.getTimeUs(firstSegmentNum2);
            long j12 = this.f19535e;
            if (timeUs2 == timeUs3) {
                segmentNum = j12 + ((j11 + 1) - firstSegmentNum2);
            } else {
                if (timeUs2 < timeUs3) {
                    throw new BehindLiveWindowException();
                }
                segmentNum = timeUs3 < timeUs ? j12 - (cVarB2.getSegmentNum(timeUs, j10) - firstSegmentNum) : (cVarB.getSegmentNum(timeUs3, j10) - firstSegmentNum2) + j12;
            }
            return new b(j10, iVar, this.f19531a, segmentNum, cVarB2);
        }

        @CheckResult
        public b c(n4.c cVar) {
            return new b(this.f19534d, this.f19532b, this.f19531a, this.f19535e, cVar);
        }

        public long f() {
            return this.f19533c.getFirstSegmentNum() + this.f19535e;
        }

        public int h() {
            return this.f19533c.getSegmentCount(this.f19534d);
        }

        public long j(long j10) {
            return this.f19533c.getSegmentNum(j10, this.f19534d) + this.f19535e;
        }

        public long k(long j10) {
            return this.f19533c.getTimeUs(j10 - this.f19535e);
        }

        public h l(long j10) {
            return this.f19533c.getSegmentUrl(j10 - this.f19535e);
        }

        public static boolean m(String str) {
            if (!p.m(str) && !"application/ttml+xml".equals(str)) {
                return false;
            }
            return true;
        }

        public long e(o4.b bVar, int i10, long j10) {
            if (h() == -1 && bVar.f64999f != -9223372036854775807L) {
                return Math.max(f(), j(((j10 - k.a(bVar.f64994a)) - k.a(bVar.c(i10).f65026b)) - k.a(bVar.f64999f)));
            }
            return f();
        }

        public long g(o4.b bVar, int i10, long j10) {
            long jF;
            int iH = h();
            if (iH == -1) {
                jF = j((j10 - k.a(bVar.f64994a)) - k.a(bVar.c(i10).f65026b));
            } else {
                jF = f() + ((long) iH);
            }
            return jF - 1;
        }

        public long i(long j10) {
            return k(j10) + this.f19533c.getDurationUs(j10 - this.f19535e, this.f19534d);
        }

        public b(long j10, i iVar, @Nullable e eVar, long j11, @Nullable n4.c cVar) {
            this.f19534d = j10;
            this.f19532b = iVar;
            this.f19535e = j11;
            this.f19531a = eVar;
            this.f19533c = cVar;
        }
    }

    @Override // m4.h
    public boolean c(m4.d dVar, boolean z10, Exception exc, long j10) {
        b bVar;
        int iH;
        if (!z10) {
            return false;
        }
        d.c cVar = this.f19521g;
        if (cVar != null && cVar.g(dVar)) {
            return true;
        }
        if (!this.f19524j.f64997d && (dVar instanceof l) && (exc instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) exc).responseCode == 404 && (iH = (bVar = this.f19522h[this.f19523i.b(dVar.f64043c)]).h()) != -1 && iH != 0) {
            if (((l) dVar).e() > (bVar.f() + ((long) iH)) - 1) {
                this.f19527m = true;
                return true;
            }
        }
        if (j10 == -9223372036854775807L) {
            return false;
        }
        com.google.android.exoplayer2.trackselection.c cVar2 = this.f19523i;
        return cVar2.blacklist(cVar2.b(dVar.f64043c), j10);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class C0181c extends m4.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f19536e;

        public C0181c(b bVar, long j10, long j11) {
            super(j10, j11);
            this.f19536e = bVar;
        }
    }

    public c(n nVar, o4.b bVar, int i10, int[] iArr, com.google.android.exoplayer2.trackselection.c cVar, int i11, com.google.android.exoplayer2.upstream.a aVar, long j10, int i12, boolean z10, List<Format> list, @Nullable d.c cVar2) {
        this.f19515a = nVar;
        this.f19524j = bVar;
        this.f19516b = iArr;
        this.f19523i = cVar;
        this.f19517c = i11;
        this.f19518d = aVar;
        this.f19525k = i10;
        this.f19519e = j10;
        this.f19520f = i12;
        this.f19521g = cVar2;
        long jF = bVar.f(i10);
        this.f19528n = -9223372036854775807L;
        ArrayList<i> arrayListI = i();
        this.f19522h = new b[cVar.length()];
        for (int i13 = 0; i13 < this.f19522h.length; i13++) {
            this.f19522h[i13] = new b(jF, i11, arrayListI.get(cVar.getIndexInTrackGroup(i13)), z10, list, cVar2);
        }
    }

    @Override // m4.h
    public long a(long j10, t0 t0Var) {
        for (b bVar : this.f19522h) {
            if (bVar.f19533c != null) {
                long j11 = bVar.j(j10);
                long jK = bVar.k(j11);
                return k0.x0(j10, t0Var, jK, (jK >= j10 || j11 >= ((long) (bVar.h() + (-1)))) ? jK : bVar.k(j11 + 1));
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void b(com.google.android.exoplayer2.trackselection.c cVar) {
        this.f19523i = cVar;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void e(o4.b bVar, int i10) {
        try {
            this.f19524j = bVar;
            this.f19525k = i10;
            long jF = bVar.f(i10);
            ArrayList<i> arrayListI = i();
            for (int i11 = 0; i11 < this.f19522h.length; i11++) {
                i iVar = arrayListI.get(this.f19523i.getIndexInTrackGroup(i11));
                b[] bVarArr = this.f19522h;
                bVarArr[i11] = bVarArr[i11].b(jF, iVar);
            }
        } catch (BehindLiveWindowException e10) {
            this.f19526l = e10;
        }
    }

    @Override // m4.h
    public void f(long j10, long j11, List<? extends l> list, m4.f fVar) {
        int i10;
        int i11;
        m[] mVarArr;
        boolean z10;
        long j12;
        if (this.f19526l != null) {
            return;
        }
        long j13 = j11 - j10;
        long jM = m(j10);
        long jA = k.a(this.f19524j.f64994a) + k.a(this.f19524j.c(this.f19525k).f65026b) + j11;
        d.c cVar = this.f19521g;
        if (cVar == null || !cVar.f(jA)) {
            long jH = h();
            boolean z11 = true;
            l lVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f19523i.length();
            m[] mVarArr2 = new m[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f19522h[i12];
                if (bVar.f19533c == null) {
                    mVarArr2[i12] = m.f64109a;
                    i10 = i12;
                    i11 = length;
                    mVarArr = mVarArr2;
                    z10 = z11;
                    j12 = jH;
                } else {
                    long jE = bVar.e(this.f19524j, this.f19525k, jH);
                    long jG = bVar.g(this.f19524j, this.f19525k, jH);
                    i10 = i12;
                    i11 = length;
                    mVarArr = mVarArr2;
                    z10 = true;
                    j12 = jH;
                    long j14 = j(bVar, lVar, j11, jE, jG);
                    if (j14 < jE) {
                        mVarArr[i10] = m.f64109a;
                    } else {
                        mVarArr[i10] = new C0181c(bVar, j14, jG);
                    }
                }
                i12 = i10 + 1;
                z11 = z10;
                length = i11;
                mVarArr2 = mVarArr;
                jH = j12;
            }
            boolean z12 = z11;
            long j15 = jH;
            this.f19523i.a(j10, j13, jM, list, mVarArr2);
            b bVar2 = this.f19522h[this.f19523i.getSelectedIndex()];
            e eVar = bVar2.f19531a;
            if (eVar != null) {
                i iVar = bVar2.f19532b;
                h hVarD = eVar.a() == null ? iVar.d() : null;
                h hVarC = bVar2.f19533c == null ? iVar.c() : null;
                if (hVarD != null || hVarC != null) {
                    fVar.f64065a = k(bVar2, this.f19518d, this.f19523i.getSelectedFormat(), this.f19523i.getSelectionReason(), this.f19523i.getSelectionData(), hVarD, hVarC);
                    return;
                }
            }
            long j16 = bVar2.f19534d;
            boolean z13 = j16 != -9223372036854775807L ? z12 : false;
            if (bVar2.h() == 0) {
                fVar.f64066b = z13;
                return;
            }
            long jE2 = bVar2.e(this.f19524j, this.f19525k, j15);
            long jG2 = bVar2.g(this.f19524j, this.f19525k, j15);
            n(bVar2, jG2);
            boolean z14 = z13;
            long j17 = j(bVar2, lVar, j11, jE2, jG2);
            if (j17 < jE2) {
                this.f19526l = new BehindLiveWindowException();
                return;
            }
            if (j17 > jG2 || (this.f19527m && j17 >= jG2)) {
                fVar.f64066b = z14;
                return;
            }
            if (z14 && bVar2.k(j17) >= j16) {
                fVar.f64066b = true;
                return;
            }
            int iMin = (int) Math.min(this.f19520f, (jG2 - j17) + 1);
            if (j16 != -9223372036854775807L) {
                while (iMin > 1 && bVar2.k((((long) iMin) + j17) - 1) >= j16) {
                    iMin--;
                }
            }
            fVar.f64065a = l(bVar2, this.f19518d, this.f19517c, this.f19523i.getSelectedFormat(), this.f19523i.getSelectionReason(), this.f19523i.getSelectionData(), j17, iMin, list.isEmpty() ? j11 : -9223372036854775807L);
        }
    }

    @Override // m4.h
    public void g(m4.d dVar) {
        s sVarB;
        if (dVar instanceof m4.k) {
            int iB = this.f19523i.b(((m4.k) dVar).f64043c);
            b bVar = this.f19522h[iB];
            if (bVar.f19533c == null && (sVarB = bVar.f19531a.b()) != null) {
                this.f19522h[iB] = bVar.c(new n4.d((q3.b) sVarB, bVar.f19532b.f65042d));
            }
        }
        d.c cVar = this.f19521g;
        if (cVar != null) {
            cVar.h(dVar);
        }
    }

    @Override // m4.h
    public int getPreferredQueueSize(long j10, List<? extends l> list) {
        return (this.f19526l != null || this.f19523i.length() < 2) ? list.size() : this.f19523i.evaluateQueueSize(j10, list);
    }

    public final long h() {
        return (this.f19519e != 0 ? SystemClock.elapsedRealtime() + this.f19519e : System.currentTimeMillis()) * 1000;
    }

    public final ArrayList<i> i() {
        List<o4.a> list = this.f19524j.c(this.f19525k).f65027c;
        ArrayList<i> arrayList = new ArrayList<>();
        for (int i10 : this.f19516b) {
            arrayList.addAll(list.get(i10).f64990c);
        }
        return arrayList;
    }

    public final long j(b bVar, @Nullable l lVar, long j10, long j11, long j12) {
        return lVar != null ? lVar.e() : k0.r(bVar.j(j10), j11, j12);
    }

    public m4.d k(b bVar, com.google.android.exoplayer2.upstream.a aVar, Format format, int i10, Object obj, h hVar, h hVar2) {
        String str = bVar.f19532b.f65041c;
        if (hVar == null || (hVar2 = hVar.a(hVar2, str)) != null) {
            hVar = hVar2;
        }
        return new m4.k(aVar, new e5.h(hVar.b(str), hVar.f65035a, hVar.f65036b, bVar.f19532b.a()), format, i10, obj, bVar.f19531a);
    }

    public m4.d l(b bVar, com.google.android.exoplayer2.upstream.a aVar, int i10, Format format, int i11, Object obj, long j10, int i12, long j11) {
        i iVar = bVar.f19532b;
        long jK = bVar.k(j10);
        h hVarL = bVar.l(j10);
        String str = iVar.f65041c;
        if (bVar.f19531a == null) {
            return new m4.n(aVar, new e5.h(hVarL.b(str), hVarL.f65035a, hVarL.f65036b, iVar.a()), format, i11, obj, jK, bVar.i(j10), j10, i10, format);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            h hVarA = hVarL.a(bVar.l(((long) i13) + j10), str);
            if (hVarA == null) {
                break;
            }
            i14++;
            i13++;
            hVarL = hVarA;
        }
        long jI = bVar.i((((long) i14) + j10) - 1);
        long j12 = bVar.f19534d;
        return new m4.i(aVar, new e5.h(hVarL.b(str), hVarL.f65035a, hVarL.f65036b, iVar.a()), format, i11, obj, jK, jI, j11, (j12 == -9223372036854775807L || j12 > jI) ? -9223372036854775807L : j12, j10, i14, -iVar.f65042d, bVar.f19531a);
    }

    public final long m(long j10) {
        if (this.f19524j.f64997d && this.f19528n != -9223372036854775807L) {
            return this.f19528n - j10;
        }
        return -9223372036854775807L;
    }

    @Override // m4.h
    public void maybeThrowError() throws IOException {
        IOException iOException = this.f19526l;
        if (iOException != null) {
            throw iOException;
        }
        this.f19515a.maybeThrowError();
    }

    public final void n(b bVar, long j10) {
        this.f19528n = this.f19524j.f64997d ? bVar.i(j10) : -9223372036854775807L;
    }
}
