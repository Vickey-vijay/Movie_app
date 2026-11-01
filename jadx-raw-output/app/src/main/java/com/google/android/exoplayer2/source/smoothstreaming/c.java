package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import e5.m;
import e5.n;
import java.io.IOException;
import java.util.ArrayList;
import k3.t0;
import k4.b0;
import k4.i0;
import k4.j0;
import k4.q;
import m4.g;

/* JADX INFO: compiled from: SsMediaPeriod.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements q, j0.a<g<b>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f19731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final e5.q f19732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f19733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f19734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f19735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0.a f19736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e5.b f19737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TrackGroupArray f19738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k4.g f19739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public q.a f19740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a f19741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g<b>[] f19742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j0 f19743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19744o;

    public final g<b> b(com.google.android.exoplayer2.trackselection.c cVar, long j10) {
        int iB = this.f19738i.b(cVar.getTrackGroup());
        return new g<>(this.f19741l.f19782f[iB].f19788a, null, null, this.f19731b.a(this.f19733d, this.f19741l, iB, cVar, this.f19732c), this, this.f19737h, j10, this.f19734e, this.f19735f, this.f19736g);
    }

    public static TrackGroupArray g(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, com.google.android.exoplayer2.drm.a<?> aVar2) {
        TrackGroup[] trackGroupArr = new TrackGroup[aVar.f19782f.length];
        int i10 = 0;
        while (true) {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = aVar.f19782f;
            if (i10 >= bVarArr.length) {
                return new TrackGroupArray(trackGroupArr);
            }
            Format[] formatArr = bVarArr[i10].f19797j;
            Format[] formatArr2 = new Format[formatArr.length];
            for (int i11 = 0; i11 < formatArr.length; i11++) {
                Format formatE = formatArr[i11];
                DrmInitData drmInitData = formatE.f18973m;
                if (drmInitData != null) {
                    formatE = formatE.e(aVar2.c(drmInitData));
                }
                formatArr2[i11] = formatE;
            }
            trackGroupArr[i10] = new TrackGroup(formatArr2);
            i10++;
        }
    }

    public static g<b>[] h(int i10) {
        return new g[i10];
    }

    @Override // k4.q
    public long a(long j10, t0 t0Var) {
        for (g<b> gVar : this.f19742m) {
            if (gVar.f64067b == 2) {
                return gVar.a(j10, t0Var);
            }
        }
        return j10;
    }

    @Override // k4.q
    public void c(q.a aVar, long j10) {
        this.f19740k = aVar;
        aVar.f(this);
    }

    @Override // k4.q, k4.j0
    public boolean continueLoading(long j10) {
        return this.f19743n.continueLoading(j10);
    }

    @Override // k4.q
    public long d(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        com.google.android.exoplayer2.trackselection.c cVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            i0 i0Var = i0VarArr[i10];
            if (i0Var != null) {
                g gVar = (g) i0Var;
                if (cVarArr[i10] == null || !zArr[i10]) {
                    gVar.z();
                    i0VarArr[i10] = null;
                } else {
                    ((b) gVar.o()).b(cVarArr[i10]);
                    arrayList.add(gVar);
                }
            }
            if (i0VarArr[i10] == null && (cVar = cVarArr[i10]) != null) {
                g<b> gVarB = b(cVar, j10);
                arrayList.add(gVarB);
                i0VarArr[i10] = gVarB;
                zArr2[i10] = true;
            }
        }
        g<b>[] gVarArrH = h(arrayList.size());
        this.f19742m = gVarArrH;
        arrayList.toArray(gVarArrH);
        this.f19743n = this.f19739j.a(this.f19742m);
        return j10;
    }

    @Override // k4.q
    public void discardBuffer(long j10, boolean z10) {
        for (g<b> gVar : this.f19742m) {
            gVar.discardBuffer(j10, z10);
        }
    }

    @Override // k4.q, k4.j0
    public long getBufferedPositionUs() {
        return this.f19743n.getBufferedPositionUs();
    }

    @Override // k4.q, k4.j0
    public long getNextLoadPositionUs() {
        return this.f19743n.getNextLoadPositionUs();
    }

    @Override // k4.q
    public TrackGroupArray getTrackGroups() {
        return this.f19738i;
    }

    @Override // k4.j0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(g<b> gVar) {
        this.f19740k.e(this);
    }

    @Override // k4.q, k4.j0
    public boolean isLoading() {
        return this.f19743n.isLoading();
    }

    public void j() {
        for (g<b> gVar : this.f19742m) {
            gVar.z();
        }
        this.f19740k = null;
        this.f19736g.J();
    }

    public void k(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        this.f19741l = aVar;
        for (g<b> gVar : this.f19742m) {
            ((b) gVar.o()).d(aVar);
        }
        this.f19740k.e(this);
    }

    @Override // k4.q
    public void maybeThrowPrepareError() throws IOException {
        this.f19733d.maybeThrowError();
    }

    @Override // k4.q
    public long readDiscontinuity() {
        if (this.f19744o) {
            return -9223372036854775807L;
        }
        this.f19736g.L();
        this.f19744o = true;
        return -9223372036854775807L;
    }

    @Override // k4.q, k4.j0
    public void reevaluateBuffer(long j10) {
        this.f19743n.reevaluateBuffer(j10);
    }

    @Override // k4.q
    public long seekToUs(long j10) {
        for (g<b> gVar : this.f19742m) {
            gVar.B(j10);
        }
        return j10;
    }

    public c(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, b.a aVar2, @Nullable e5.q qVar, k4.g gVar, com.google.android.exoplayer2.drm.a<?> aVar3, m mVar, b0.a aVar4, n nVar, e5.b bVar) {
        this.f19741l = aVar;
        this.f19731b = aVar2;
        this.f19732c = qVar;
        this.f19733d = nVar;
        this.f19734e = aVar3;
        this.f19735f = mVar;
        this.f19736g = aVar4;
        this.f19737h = bVar;
        this.f19739j = gVar;
        this.f19738i = g(aVar, aVar3);
        g<b>[] gVarArrH = h(0);
        this.f19742m = gVarArrH;
        this.f19743n = gVar.a(gVarArrH);
        aVar4.I();
    }
}
