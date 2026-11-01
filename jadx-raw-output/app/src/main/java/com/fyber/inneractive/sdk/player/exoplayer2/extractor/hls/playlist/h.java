package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.t;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements x, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f16680b = new b0("HlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f16681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f16682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IOException f16688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f16689k;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11, boolean z10) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f16689k.f16698i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f17725a;
        long j12 = d0Var.f17730f;
        if (fVar.f17560b != null) {
            fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16687i = false;
        b();
    }

    public h(k kVar, a aVar, long j10) {
        this.f16689k = kVar;
        this.f16679a = aVar;
        this.f16685g = j10;
        this.f16681c = new d0(kVar.f16690a.f16522a.a(), com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(kVar.f16699j.f16653a, aVar.f16623a), kVar.f16691b);
    }

    public final void b() {
        this.f16686h = 0L;
        if (this.f16687i || this.f16680b.a()) {
            return;
        }
        b0 b0Var = this.f16680b;
        d0 d0Var = this.f16681c;
        int i10 = this.f16689k.f16692c;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, this, i10, SystemClock.elapsedRealtime());
        if (b0Var.f17655b != null) {
            throw new IllegalStateException();
        }
        b0Var.f17655b = yVar;
        yVar.f17806e = null;
        b0Var.f17654a.execute(yVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11) {
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f17728d;
        if (eVar instanceof d) {
            a((d) eVar);
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f16689k.f16698i;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f17725a;
            long j12 = d0Var.f17730f;
            if (fVar.f17560b != null) {
                fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
                return;
            }
            return;
        }
        this.f16688j = new r("Loaded playlist has unexpected type.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j10, long j11, IOException iOException) {
        boolean z10;
        d0 d0Var = (d0) zVar;
        boolean z11 = iOException instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f16689k.f16698i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f17725a;
        long j12 = d0Var.f17730f;
        if (fVar.f17560b != null) {
            z10 = z11;
            fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10));
        } else {
            z10 = z11;
        }
        if (z10) {
            return 3;
        }
        if (!(iOException instanceof v)) {
            return 0;
        }
        int i10 = ((v) iOException).f17799a;
        if (i10 != 404 && i10 != 410) {
            return 0;
        }
        a();
        k kVar2 = this.f16689k;
        if (kVar2.f16700k == this.f16679a) {
            List list = kVar2.f16699j.f16625b;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = (h) kVar2.f16693d.get(list.get(i11));
                if (jElapsedRealtime > hVar.f16686h) {
                    kVar2.f16700k = hVar.f16679a;
                    hVar.b();
                }
            }
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0218  */
    /* JADX WARN: Code duplicated, block: B:108:0x021c  */
    /* JADX WARN: Code duplicated, block: B:110:0x022e  */
    /* JADX WARN: Code duplicated, block: B:111:0x023d  */
    /* JADX WARN: Code duplicated, block: B:113:0x024c  */
    /* JADX WARN: Code duplicated, block: B:115:0x025f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0264  */
    /* JADX WARN: Code duplicated, block: B:124:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:71:0x015a  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x016c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Code duplicated, block: B:81:0x0187 A[PHI: r10
  0x0187: PHI (r10v15 long) = (r10v12 long), (r10v17 long) binds: [B:76:0x016a, B:80:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x0200  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x01f4, please report this as an issue */
    public final void a(d dVar) {
        long j10;
        long j11;
        long j12;
        int i10;
        d dVar2;
        long j13;
        k kVar;
        a aVar;
        int size;
        int i11;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar;
        int i12;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar;
        long j14;
        long j15;
        com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar;
        long j16;
        List list;
        long j17;
        int size2;
        int size3;
        d dVar3 = this.f16682d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f16683e = jElapsedRealtime;
        k kVar2 = this.f16689k;
        kVar2.getClass();
        if (dVar3 != null) {
            int i13 = dVar.f16644g;
            int i14 = dVar3.f16644g;
            if (i13 <= i14 && (i13 < i14 || ((size2 = dVar.f16650m.size()) <= (size3 = dVar3.f16650m.size()) && (size2 != size3 || !dVar.f16647j || dVar3.f16647j)))) {
                dVar2 = (!dVar.f16647j || dVar3.f16647j) ? dVar3 : new d(dVar3.f16639b, dVar3.f16653a, dVar3.f16640c, dVar3.f16641d, dVar3.f16642e, dVar3.f16643f, dVar3.f16644g, dVar3.f16645h, dVar3.f16646i, true, dVar3.f16648k, dVar3.f16649l, dVar3.f16650m, dVar3.f16651n);
            }
            this.f16682d = dVar2;
            if (dVar2 != dVar3) {
                this.f16688j = null;
                this.f16684f = jElapsedRealtime;
                kVar = this.f16689k;
                aVar = this.f16679a;
                if (aVar == kVar.f16700k) {
                    if (kVar.f16701l == null) {
                        kVar.f16702m = !dVar2.f16647j;
                    }
                    kVar.f16701l = dVar2;
                    jVar = kVar.f16695f;
                    jVar.getClass();
                    j14 = dVar2.f16640c;
                    if (jVar.f16584d.f16702m) {
                        if (dVar2.f16647j) {
                            j16 = dVar2.f16641d + dVar2.f16652o;
                        } else {
                            j16 = -9223372036854775807L;
                        }
                        list = dVar2.f16650m;
                        if (j14 != -9223372036854775807L) {
                            j17 = j14;
                        } else if (list.isEmpty()) {
                            j17 = 0;
                        } else {
                            j14 = ((c) list.get(Math.max(0, list.size() - 3))).f16633d;
                            j17 = j14;
                        }
                        xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j16, dVar2.f16652o, dVar2.f16641d, j17, true, !dVar2.f16647j);
                    } else {
                        if (j14 == -9223372036854775807L) {
                            j15 = 0;
                        } else {
                            j15 = j14;
                        }
                        long j18 = dVar2.f16641d;
                        long j19 = dVar2.f16652o;
                        xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j18 + j19, j19, j18, j15, true, false);
                    }
                    t tVar = jVar.f16585e;
                    b bVar = jVar.f16584d.f16699j;
                    tVar.a(xVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g());
                }
                size = kVar.f16696g.size();
                for (i11 = 0; i11 < size; i11++) {
                    iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar.f16696g.get(i11);
                    if (iVar.f16577m != null) {
                        l lVar = (l) iVar.f16574j;
                        lVar.getClass();
                        lVar.f17407f.obtainMessage(9, iVar).sendToTarget();
                    } else {
                        for (n nVar : iVar.f16578n) {
                            if (!nVar.f16603o) {
                                nVar.b(nVar.f16611w);
                            }
                        }
                    }
                }
                if (aVar == kVar.f16700k || dVar2.f16647j) {
                    j13 = -9223372036854775807L;
                } else {
                    j13 = this.f16682d.f16646i;
                }
            } else if (dVar2.f16647j) {
                j13 = -9223372036854775807L;
            } else {
                if (jElapsedRealtime - this.f16684f > com.fyber.inneractive.sdk.player.exoplayer2.b.a(dVar2.f16646i) * 3.5d) {
                    String str = this.f16679a.f16623a;
                    this.f16688j = new j();
                    a();
                } else if (dVar.f16650m.size() + dVar.f16644g < this.f16682d.f16644g) {
                    String str2 = this.f16679a.f16623a;
                    this.f16688j = new i();
                }
                j13 = this.f16682d.f16646i / 2;
            }
            if (j13 != -9223372036854775807L) {
                this.f16687i = this.f16689k.f16694e.postDelayed(this, com.fyber.inneractive.sdk.player.exoplayer2.b.a(j13));
            }
        }
        dVar.getClass();
        if (dVar.f16648k) {
            j10 = dVar.f16641d;
        } else {
            d dVar4 = kVar2.f16701l;
            j10 = dVar4 != null ? dVar4.f16641d : 0L;
            if (dVar3 != null) {
                int size4 = dVar3.f16650m.size();
                int i15 = dVar.f16644g - dVar3.f16644g;
                List list2 = dVar3.f16650m;
                c cVar = i15 < list2.size() ? (c) list2.get(i15) : null;
                if (cVar != null) {
                    j11 = dVar3.f16641d;
                    j12 = cVar.f16633d;
                } else if (size4 == dVar.f16644g - dVar3.f16644g) {
                    j11 = dVar3.f16641d;
                    j12 = dVar3.f16652o;
                }
                j10 = j11 + j12;
            }
        }
        long j20 = j10;
        if (dVar.f16642e) {
            i10 = dVar.f16643f;
        } else {
            d dVar5 = kVar2.f16701l;
            i10 = dVar5 != null ? dVar5.f16643f : 0;
            if (dVar3 != null) {
                int i16 = dVar.f16644g - dVar3.f16644g;
                List list3 = dVar3.f16650m;
                c cVar2 = i16 < list3.size() ? (c) list3.get(i16) : null;
                if (cVar2 != null) {
                    i10 = (dVar3.f16643f + cVar2.f16632c) - ((c) dVar.f16650m.get(0)).f16632c;
                }
            }
        }
        dVar2 = new d(dVar.f16639b, dVar.f16653a, dVar.f16640c, j20, true, i10, dVar.f16644g, dVar.f16645h, dVar.f16646i, dVar.f16647j, dVar.f16648k, dVar.f16649l, dVar.f16650m, dVar.f16651n);
        this.f16682d = dVar2;
        if (dVar2 != dVar3) {
            this.f16688j = null;
            this.f16684f = jElapsedRealtime;
            kVar = this.f16689k;
            aVar = this.f16679a;
            if (aVar == kVar.f16700k) {
                if (kVar.f16701l == null) {
                    kVar.f16702m = !dVar2.f16647j;
                }
                kVar.f16701l = dVar2;
                jVar = kVar.f16695f;
                jVar.getClass();
                j14 = dVar2.f16640c;
                if (jVar.f16584d.f16702m) {
                    if (dVar2.f16647j) {
                        j16 = dVar2.f16641d + dVar2.f16652o;
                    } else {
                        j16 = -9223372036854775807L;
                    }
                    list = dVar2.f16650m;
                    if (j14 != -9223372036854775807L) {
                        j17 = j14;
                    } else if (list.isEmpty()) {
                        j17 = 0;
                    } else {
                        j14 = ((c) list.get(Math.max(0, list.size() - 3))).f16633d;
                        j17 = j14;
                    }
                    xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j16, dVar2.f16652o, dVar2.f16641d, j17, true, !dVar2.f16647j);
                } else {
                    if (j14 == -9223372036854775807L) {
                        j15 = 0;
                    } else {
                        j15 = j14;
                    }
                    long j110 = dVar2.f16641d;
                    long j111 = dVar2.f16652o;
                    xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j110 + j111, j111, j110, j15, true, false);
                }
                t tVar2 = jVar.f16585e;
                b bVar2 = jVar.f16584d.f16699j;
                tVar2.a(xVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g());
            }
            size = kVar.f16696g.size();
            while (i11 < size) {
                iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar.f16696g.get(i11);
                if (iVar.f16577m != null) {
                    l lVar2 = (l) iVar.f16574j;
                    lVar2.getClass();
                    lVar2.f17407f.obtainMessage(9, iVar).sendToTarget();
                } else {
                    while (i12 < r10) {
                        if (!nVar.f16603o) {
                            nVar.b(nVar.f16611w);
                        }
                    }
                }
            }
            if (aVar == kVar.f16700k) {
                j13 = -9223372036854775807L;
            } else {
                j13 = -9223372036854775807L;
            }
        } else if (dVar2.f16647j) {
            if (jElapsedRealtime - this.f16684f > com.fyber.inneractive.sdk.player.exoplayer2.b.a(dVar2.f16646i) * 3.5d) {
                String str3 = this.f16679a.f16623a;
                this.f16688j = new j();
                a();
            } else if (dVar.f16650m.size() + dVar.f16644g < this.f16682d.f16644g) {
                String str4 = this.f16679a.f16623a;
                this.f16688j = new i();
            }
            j13 = this.f16682d.f16646i / 2;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            this.f16687i = this.f16689k.f16694e.postDelayed(this, com.fyber.inneractive.sdk.player.exoplayer2.b.a(j13));
        }
    }

    public final void a() {
        this.f16686h = SystemClock.elapsedRealtime() + 60000;
        k kVar = this.f16689k;
        a aVar = this.f16679a;
        int size = kVar.f16696g.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar.f16696g.get(i10);
            for (n nVar : iVar.f16578n) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = nVar.f16591c;
                int iA = fVar.f16537f.a(aVar.f16624b);
                if (iA != -1) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.f16547p;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= bVar.f17637b) {
                            i11 = -1;
                            break;
                        } else if (bVar.f17638c[i11] == iA) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 != -1) {
                        fVar.f16547p.a(i11);
                    }
                }
            }
            if (iVar.f16577m != null) {
                l lVar = (l) iVar.f16574j;
                lVar.getClass();
                lVar.f17407f.obtainMessage(9, iVar).sendToTarget();
            } else {
                for (n nVar2 : iVar.f16578n) {
                    if (!nVar2.f16603o) {
                        nVar2.b(nVar2.f16611w);
                    }
                }
            }
        }
    }
}
