package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.w;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements x, w, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f16590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f16591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f16592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o f16593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16594f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f16596h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f16605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f16608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean[] f16610v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f16611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f16612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16613y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f16595g = new b0("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f16597i = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f16598j = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedList f16599k = new LinkedList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f16600l = new m(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f16601m = new Handler();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(q qVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f16596h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f17542a;
        int i10 = aVar.f17543b;
        int i11 = this.f16589a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f17544c;
        int i12 = aVar.f17545d;
        Object obj = aVar.f17546e;
        long j12 = aVar.f17547f;
        long j13 = aVar.f17548g;
        long jC = aVar.c();
        if (fVar.f17560b != null) {
            fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC));
        }
        if (z10) {
            return;
        }
        int size = this.f16598j.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f16598j.valueAt(i13)).a(this.f16610v[i13]);
        }
        i iVar = this.f16590b;
        iVar.getClass();
        if (iVar.f16577m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f16574j;
        lVar.getClass();
        lVar.f17407f.obtainMessage(9, iVar).sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x013d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0147  */
    /* JADX WARN: Code duplicated, block: B:82:0x014b  */
    /* JADX WARN: Code duplicated, block: B:83:0x014f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x0174  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        boolean z10;
        h hVar;
        int iMax;
        int size;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar;
        int i10;
        int i11;
        boolean z11;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        int i12;
        o oVar;
        v vVar;
        Uri uriA;
        int i13;
        if (this.f16613y || this.f16595g.a()) {
            return false;
        }
        f fVar = this.f16591c;
        h hVar2 = this.f16599k.isEmpty() ? null : (h) this.f16599k.getLast();
        long j11 = this.f16612x;
        if (j11 == -9223372036854775807L) {
            j11 = j10;
        }
        d dVar = this.f16597i;
        int iA = hVar2 == null ? -1 : fVar.f16537f.a(hVar2.f17544c);
        fVar.f16542k = null;
        if (hVar2 != null) {
            Math.max(0L, hVar2.f17547f - j11);
        }
        fVar.f16547p.d();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.f16547p;
        int i14 = bVar.f17638c[bVar.a()];
        boolean z12 = iA != i14;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = fVar.f16535d[i14];
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f16536e.f16693d.get(aVar2);
        if (hVar3.f16682d == null) {
            dVar.f16530c = aVar2;
            fVar.f16542k = aVar2;
            z10 = true;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            h hVar4 = hVar2;
            long j12 = j11;
            long jMax = Math.max(30000L, com.fyber.inneractive.sdk.player.exoplayer2.b.a(hVar3.f16682d.f16652o));
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar2 = hVar3.f16682d;
            if (dVar2.f16647j || (i13 = dVar2.f16639b) == 2 || i13 == 1 || hVar3.f16683e + jMax > jElapsedRealtime) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVarA = fVar.f16536e.a(aVar2);
                if (hVar4 == null || z12) {
                    hVar = hVar4;
                    long j13 = hVar == null ? j12 : hVar.f17547f;
                    if (dVarA.f16647j || j13 <= dVarA.f16641d + dVarA.f16652o) {
                        List list = dVarA.f16650m;
                        Long lValueOf = Long.valueOf(j13 - dVarA.f16641d);
                        boolean z13 = !fVar.f16536e.f16702m || hVar == null;
                        int i15 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
                        int iBinarySearch = Collections.binarySearch(list, lValueOf);
                        if (iBinarySearch < 0) {
                            iMax = -(iBinarySearch + 2);
                        } else {
                            while (true) {
                                int i16 = iBinarySearch - 1;
                                if (i16 < 0 || ((Comparable) list.get(i16)).compareTo(lValueOf) != 0) {
                                    break;
                                }
                                iBinarySearch = i16;
                            }
                            iMax = iBinarySearch;
                        }
                        if (z13) {
                            iMax = Math.max(0, iMax);
                        }
                        int i17 = dVarA.f16644g;
                        size = iMax + i17;
                        if (size < i17 && hVar != null) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar3 = fVar.f16535d[iA];
                            aVar = aVar3;
                            dVarA = fVar.f16536e.a(aVar3);
                            size = hVar.f17550i + 1;
                        }
                        i10 = dVarA.f16644g;
                        if (size < i10) {
                            fVar.f16541j = new com.fyber.inneractive.sdk.player.exoplayer2.source.g();
                            z10 = true;
                        } else {
                            i11 = size - i10;
                            if (i11 >= dVarA.f16650m.size()) {
                                z11 = true;
                                cVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) dVarA.f16650m.get(i11);
                                if (cVar.f16634e) {
                                    uriA = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f16653a, cVar.f16635f);
                                    if (!uriA.equals(fVar.f16543l)) {
                                        dVar.f16528a = new c(fVar.f16533b, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA, 0L, 0L, -1L, null, 1), fVar.f16535d[iA].f16624b, fVar.f16547p.c(), fVar.f16547p.b(), fVar.f16540i, cVar.f16636g);
                                    } else if (!com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(cVar.f16636g, fVar.f16545n)) {
                                        fVar.a(uriA, cVar.f16636g, fVar.f16544m);
                                    }
                                } else {
                                    fVar.f16543l = null;
                                    fVar.f16544m = null;
                                    fVar.f16545n = null;
                                    fVar.f16546o = null;
                                }
                                cVar2 = dVarA.f16649l;
                                if (cVar2 != null) {
                                    Uri uriA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f16653a, cVar2.f16630a);
                                    long j14 = cVar2.f16637h;
                                    kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA2, j14, j14, cVar2.f16638i, null, 0);
                                } else {
                                    kVar = null;
                                }
                                long j15 = dVarA.f16641d + cVar.f16633d;
                                i12 = dVarA.f16643f + cVar.f16632c;
                                oVar = fVar.f16534c;
                                vVar = (v) oVar.f16614a.get(i12);
                                if (vVar == null) {
                                    vVar = new v(Long.MAX_VALUE);
                                    oVar.f16614a.put(i12, vVar);
                                }
                                Uri uriA3 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f16653a, cVar.f16630a);
                                long j16 = cVar.f16637h;
                                com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA3, j16, j16, cVar.f16638i, null, 0);
                                z10 = true;
                                dVar.f16528a = new h(fVar.f16532a, kVar2, kVar, aVar, fVar.f16538g, fVar.f16547p.c(), fVar.f16547p.b(), j15, j15 + cVar.f16631b, size, i12, fVar.f16539h, vVar, hVar, fVar.f16544m, fVar.f16546o);
                            } else if (dVarA.f16647j) {
                                z11 = true;
                                dVar.f16529b = true;
                            } else {
                                z11 = true;
                                dVar.f16530c = aVar;
                                fVar.f16542k = aVar;
                            }
                            z10 = z11;
                        }
                    } else {
                        size = dVarA.f16650m.size() + dVarA.f16644g;
                    }
                } else {
                    hVar = hVar4;
                    size = hVar.f17550i + 1;
                }
                iA = i14;
                aVar = aVar2;
                i10 = dVarA.f16644g;
                if (size < i10) {
                    fVar.f16541j = new com.fyber.inneractive.sdk.player.exoplayer2.source.g();
                    z10 = true;
                } else {
                    i11 = size - i10;
                    if (i11 >= dVarA.f16650m.size()) {
                        z11 = true;
                        cVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) dVarA.f16650m.get(i11);
                        if (cVar.f16634e) {
                            uriA = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f16653a, cVar.f16635f);
                            if (!uriA.equals(fVar.f16543l)) {
                                dVar.f16528a = new c(fVar.f16533b, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA, 0L, 0L, -1L, null, 1), fVar.f16535d[iA].f16624b, fVar.f16547p.c(), fVar.f16547p.b(), fVar.f16540i, cVar.f16636g);
                            } else if (!com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(cVar.f16636g, fVar.f16545n)) {
                                fVar.a(uriA, cVar.f16636g, fVar.f16544m);
                            }
                        } else {
                            fVar.f16543l = null;
                            fVar.f16544m = null;
                            fVar.f16545n = null;
                            fVar.f16546o = null;
                        }
                        cVar2 = dVarA.f16649l;
                        if (cVar2 != null) {
                            Uri uriA4 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f16653a, cVar2.f16630a);
                            long j17 = cVar2.f16637h;
                            kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA4, j17, j17, cVar2.f16638i, null, 0);
                        } else {
                            kVar = null;
                        }
                        long j18 = dVarA.f16641d + cVar.f16633d;
                        i12 = dVarA.f16643f + cVar.f16632c;
                        oVar = fVar.f16534c;
                        vVar = (v) oVar.f16614a.get(i12);
                        if (vVar == null) {
                            vVar = new v(Long.MAX_VALUE);
                            oVar.f16614a.put(i12, vVar);
                        }
                        Uri uriA5 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f16653a, cVar.f16630a);
                        long j19 = cVar.f16637h;
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA5, j19, j19, cVar.f16638i, null, 0);
                        z10 = true;
                        dVar.f16528a = new h(fVar.f16532a, kVar3, kVar, aVar, fVar.f16538g, fVar.f16547p.c(), fVar.f16547p.b(), j18, j18 + cVar.f16631b, size, i12, fVar.f16539h, vVar, hVar, fVar.f16544m, fVar.f16546o);
                    } else if (dVarA.f16647j) {
                        z11 = true;
                        dVar.f16529b = true;
                    } else {
                        z11 = true;
                        dVar.f16530c = aVar;
                        fVar.f16542k = aVar;
                    }
                    z10 = z11;
                }
            } else {
                dVar.f16530c = aVar2;
                fVar.f16542k = aVar2;
                z10 = true;
            }
        }
        d dVar3 = this.f16597i;
        boolean z14 = dVar3.f16529b;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar4 = dVar3.f16528a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar5 = dVar3.f16530c;
        dVar3.f16528a = null;
        dVar3.f16529b = false;
        dVar3.f16530c = null;
        if (z14) {
            this.f16613y = z10;
            return z10;
        }
        if (aVar4 == null) {
            if (aVar5 == null) {
                return false;
            }
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.f16590b.f16565a.f16693d.get(aVar5)).b();
            return false;
        }
        if (aVar4 instanceof h) {
            this.f16612x = -9223372036854775807L;
            h hVar5 = (h) aVar4;
            hVar5.D = this;
            int i18 = hVar5.f16548j;
            boolean z15 = hVar5.f16558t;
            this.f16606r = i18;
            for (int i19 = 0; i19 < this.f16598j.size(); i19++) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f16598j.valueAt(i19)).f16506c.f16478r = i18;
            }
            if (z15) {
                for (int i20 = 0; i20 < this.f16598j.size(); i20++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f16598j.valueAt(i20)).f16516m = z10;
                }
            }
            this.f16599k.add(hVar5);
        }
        b0 b0Var = this.f16595g;
        int i21 = this.f16594f;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        y yVar = new y(b0Var, looperMyLooper, aVar4, this, i21, jElapsedRealtime2);
        if (b0Var.f17655b != null) {
            throw new IllegalStateException();
        }
        b0Var.f17655b = yVar;
        yVar.f17806e = null;
        b0Var.f17654a.execute(yVar);
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.f16596h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar4 = aVar4.f17542a;
        int i22 = aVar4.f17543b;
        int i23 = this.f16589a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = aVar4.f17544c;
        int i24 = aVar4.f17545d;
        Object obj = aVar4.f17546e;
        long j20 = aVar4.f17547f;
        long j21 = aVar4.f17548g;
        if (fVar2.f17560b != null) {
            fVar2.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.a(fVar2, kVar4, i22, i23, oVar2, i24, obj, j20, j21, jElapsedRealtime2));
        }
        return z10;
    }

    public final void c(long j10) {
        this.f16611w = j10;
        this.f16612x = j10;
        this.f16613y = false;
        this.f16599k.clear();
        if (this.f16595g.a()) {
            this.f16595g.f17655b.a(false);
            return;
        }
        int size = this.f16598j.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f16598j.valueAt(i10)).a(this.f16610v[i10]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f16601m.post(this.f16600l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j10 = this.f16612x;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (this.f16613y) {
            return Long.MIN_VALUE;
        }
        return ((h) this.f16599k.getLast()).f17548g;
    }

    public final void h() {
        if (this.f16607s || this.f16603o || !this.f16602n) {
            return;
        }
        int size = this.f16598j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f16598j.valueAt(i10)).e() == null) {
                return;
            }
        }
        int size2 = this.f16598j.size();
        int i11 = 0;
        char c10 = 0;
        int i12 = -1;
        while (true) {
            char c11 = 3;
            if (i11 >= size2) {
                break;
            }
            String str = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f16598j.valueAt(i11)).e().f17504f;
            if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                c11 = "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 2 : "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 1 : (char) 0;
            }
            if (c11 > c10) {
                i12 = i11;
                c10 = c11;
            } else if (c11 == c10 && i12 != -1) {
                i12 = -1;
            }
            i11++;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar = this.f16591c.f16537f;
        int i13 = yVar.f17624a;
        this.f16609u = -1;
        this.f16610v = new boolean[size2];
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f16598j.valueAt(i14)).e();
            if (i14 == i12) {
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i13];
                for (int i15 = 0; i15 < i13; i15++) {
                    oVarArr[i15] = a(yVar.f17625b[i15], oVarE);
                }
                yVarArr[i14] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(oVarArr);
                this.f16609u = i14;
            } else {
                yVarArr[i14] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(a((c10 == 3 && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(oVarE.f17504f))) ? this.f16593e : null, oVarE));
            }
        }
        this.f16608t = new z(yVarArr);
        this.f16603o = true;
        i iVar = this.f16590b;
        int i16 = iVar.f16575k - 1;
        iVar.f16575k = i16;
        if (i16 > 0) {
            return;
        }
        int i17 = 0;
        for (n nVar : iVar.f16578n) {
            i17 += nVar.f16608t.f17628a;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[i17];
        int i18 = 0;
        for (n nVar2 : iVar.f16578n) {
            int i19 = nVar2.f16608t.f17628a;
            int i20 = 0;
            while (i20 < i19) {
                yVarArr2[i18] = nVar2.f16608t.f17629b[i20];
                i20++;
                i18++;
            }
        }
        iVar.f16577m = new z(yVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f16574j).f17407f.obtainMessage(8, iVar).sendToTarget();
    }

    public n(int i10, i iVar, f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2) {
        this.f16589a = i10;
        this.f16590b = iVar;
        this.f16591c = fVar;
        this.f16592d = bVar;
        this.f16593e = oVar;
        this.f16594f = i11;
        this.f16596h = fVar2;
        this.f16611w = j10;
        this.f16612x = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        f fVar = this.f16591c;
        fVar.getClass();
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            fVar.f16540i = cVar.f16523i;
            fVar.a(cVar.f17542a.f17747a, cVar.f16526l, cVar.f16527m);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.f16596h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f17542a;
        int i10 = aVar.f17543b;
        int i11 = this.f16589a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f17544c;
        int i12 = aVar.f17545d;
        Object obj = aVar.f17546e;
        long j12 = aVar.f17547f;
        long j13 = aVar.f17548g;
        long jC = aVar.c();
        if (fVar2.f17560b != null) {
            fVar2.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar2, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC));
        }
        if (!this.f16603o) {
            b(this.f16611w);
            return;
        }
        i iVar = this.f16590b;
        iVar.getClass();
        if (iVar.f16577m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f16574j;
        lVar.getClass();
        lVar.f17407f.obtainMessage(9, iVar).sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, IOException iOException) {
        boolean z10;
        boolean z11;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        int i10;
        int i11;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        int i12;
        Object obj;
        long j12;
        long j13;
        long jC;
        i iVar;
        boolean z12;
        boolean zA;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.v vVar;
        int i13;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        boolean z13 = aVar instanceof h;
        boolean z14 = !z13 || aVar.c() == 0;
        f fVar2 = this.f16591c;
        if (z14) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar2.f16547p;
            int iA = fVar2.f16537f.a(aVar.f17544c);
            int i14 = 0;
            while (true) {
                if (i14 >= bVar.f17637b) {
                    i14 = -1;
                    break;
                }
                if (bVar.f17638c[i14] == iA) {
                    break;
                }
                i14++;
            }
            if ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) && ((i13 = (vVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) iOException).f17799a) == 404 || i13 == 410)) {
                zA = bVar.a(i14);
                int i15 = vVar.f17799a;
                if (zA) {
                    StringBuilder sbA = l.a("Blacklisted: duration=60000, responseCode=", i15, ", format=");
                    sbA.append(bVar.f17639d[i14]);
                    Log.w("ChunkedTrackBlacklist", sbA.toString());
                } else {
                    StringBuilder sbA2 = l.a("Blacklisting failed (cannot blacklist last enabled track): responseCode=", i15, ", format=");
                    sbA2.append(bVar.f17639d[i14]);
                    Log.w("ChunkedTrackBlacklist", sbA2.toString());
                }
            } else {
                zA = false;
            }
            if (zA) {
                z10 = true;
            }
            if (z10) {
                if (z13) {
                    if (((h) this.f16599k.removeLast()) == aVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (this.f16599k.isEmpty()) {
                            this.f16612x = this.f16611w;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                z11 = true;
            } else {
                z11 = false;
            }
            fVar = this.f16596h;
            kVar = aVar.f17542a;
            i10 = aVar.f17543b;
            i11 = this.f16589a;
            oVar = aVar.f17544c;
            i12 = aVar.f17545d;
            obj = aVar.f17546e;
            j12 = aVar.f17547f;
            j13 = aVar.f17548g;
            jC = aVar.c();
            if (fVar.f17560b != null) {
                fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC, iOException, z11));
            }
            if (z11) {
                return 0;
            }
            if (!this.f16603o) {
                b(this.f16611w);
            } else {
                iVar = this.f16590b;
                iVar.getClass();
                if (iVar.f16577m != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f16574j;
                    lVar.getClass();
                    lVar.f17407f.obtainMessage(9, iVar).sendToTarget();
                }
            }
            return 2;
        }
        fVar2.getClass();
        z10 = false;
        if (z10) {
            if (z13) {
                if (((h) this.f16599k.removeLast()) == aVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (this.f16599k.isEmpty()) {
                        this.f16612x = this.f16611w;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            z11 = true;
        } else {
            z11 = false;
        }
        fVar = this.f16596h;
        kVar = aVar.f17542a;
        i10 = aVar.f17543b;
        i11 = this.f16589a;
        oVar = aVar.f17544c;
        i12 = aVar.f17545d;
        obj = aVar.f17546e;
        j12 = aVar.f17547f;
        j13 = aVar.f17548g;
        jC = aVar.c();
        if (fVar.f17560b != null) {
            fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC, iOException, z11));
        }
        if (z11) {
            return 0;
        }
        if (!this.f16603o) {
            b(this.f16611w);
        } else {
            iVar = this.f16590b;
            iVar.getClass();
            if (iVar.f16577m != null) {
                com.fyber.inneractive.sdk.player.exoplayer2.l lVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f16574j;
                lVar2.getClass();
                lVar2.f17407f.obtainMessage(9, iVar).sendToTarget();
            }
        }
        return 2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i10, int i11) {
        if (this.f16598j.indexOfKey(i10) >= 0) {
            return (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f16598j.get(i10);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f16592d);
        gVar.f16517n = this;
        gVar.f16506c.f16478r = this.f16606r;
        this.f16598j.put(i10, gVar);
        return gVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (oVar == null) {
            return oVar2;
        }
        String strA = null;
        int iC = com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(oVar2.f17504f);
        if (iC == 1) {
            strA = a(oVar.f17501c, 1);
        } else if (iC == 2) {
            strA = a(oVar.f17501c, 2);
        }
        String str = strA;
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f17499a, oVar2.f17503e, oVar2.f17504f, str, oVar.f17500b, oVar2.f17505g, oVar.f17508j, oVar.f17509k, oVar2.f17510l, oVar2.f17511m, oVar2.f17512n, oVar2.f17514p, oVar2.f17513o, oVar2.f17515q, oVar2.f17516r, oVar2.f17517s, oVar2.f17518t, oVar2.f17519u, oVar2.f17520v, oVar.f17522x, oVar.f17523y, oVar2.f17524z, oVar2.f17521w, oVar2.f17506h, oVar2.f17507i, oVar2.f17502d);
    }

    public static String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (i10 == com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f16602n = true;
        this.f16601m.post(this.f16600l);
    }
}
