package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f17042a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        boolean zA;
        boolean zEquals;
        try {
            g gVar = new g();
            if (gVar.a(bVar, true) && (gVar.f17049a & 2) == 2) {
                int iMin = Math.min(gVar.f17053e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(iMin);
                bVar.a(nVar.f17845a, 0, iMin, false);
                nVar.e(0);
                if (nVar.f17847c - nVar.f17846b >= 5 && nVar.j() == 127 && nVar.k() == 1179402563) {
                    this.f17042a = new d();
                } else {
                    nVar.e(0);
                    try {
                        zA = s.a(1, nVar, true);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused) {
                        zA = false;
                    }
                    if (zA) {
                        this.f17042a = new o();
                    } else {
                        nVar.e(0);
                        int i10 = i.f17056o;
                        int i11 = nVar.f17847c - nVar.f17846b;
                        byte[] bArr = i.f17057p;
                        if (i11 < bArr.length) {
                            zEquals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            nVar.a(bArr2, 0, bArr.length);
                            zEquals = Arrays.equals(bArr2, bArr);
                        }
                        if (zEquals) {
                            this.f17042a = new i();
                        }
                    }
                }
                return true;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused2) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(0, 1);
        jVar.b();
        l lVar = this.f17042a;
        lVar.f17063c = jVar;
        lVar.f17062b = gVarA;
        lVar.f17061a = new f();
        lVar.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        l lVar = this.f17042a;
        f fVar = lVar.f17061a;
        g gVar = fVar.f17043a;
        gVar.f17049a = 0;
        gVar.f17050b = 0L;
        gVar.f17051c = 0;
        gVar.f17052d = 0;
        gVar.f17053e = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = fVar.f17044b;
        nVar.f17846b = 0;
        nVar.f17847c = 0;
        fVar.f17045c = -1;
        fVar.f17047e = false;
        if (j10 == 0) {
            lVar.a(!lVar.f17072l);
        } else if (lVar.f17068h != 0) {
            lVar.f17065e = lVar.f17064d.c(j11);
            lVar.f17068h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        l lVar = this.f17042a;
        int i10 = lVar.f17068h;
        if (i10 == 0) {
            boolean zA = true;
            while (zA) {
                if (!lVar.f17061a.a(bVar)) {
                    lVar.f17068h = 3;
                    return -1;
                }
                long j10 = bVar.f16452c;
                long j11 = lVar.f17066f;
                lVar.f17071k = j10 - j11;
                zA = lVar.a(lVar.f17061a.f17044b, j11, lVar.f17070j);
                if (zA) {
                    lVar.f17066f = bVar.f16452c;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = lVar.f17070j.f17059a;
            lVar.f17069i = oVar2.f17517s;
            if (!lVar.f17073m) {
                lVar.f17062b.a(oVar2);
                lVar.f17073m = true;
            }
            c cVar = lVar.f17070j.f17060b;
            if (cVar != null) {
                lVar.f17064d = cVar;
            } else {
                long j12 = bVar.f16451b;
                if (j12 == -1) {
                    lVar.f17064d = new k();
                } else {
                    g gVar = lVar.f17061a.f17043a;
                    lVar.f17064d = new b(lVar.f17066f, j12, lVar, gVar.f17052d + gVar.f17053e, gVar.f17050b);
                }
            }
            lVar.f17070j = null;
            lVar.f17068h = 2;
            lVar.f17061a.a();
        } else if (i10 == 1) {
            bVar.a((int) lVar.f17066f);
            lVar.f17068h = 2;
        } else if (i10 == 2) {
            long jA = lVar.f17064d.a(bVar);
            if (jA >= 0) {
                oVar.f17021a = jA;
                return 1;
            }
            if (jA < -1) {
                lVar.a(-(jA + 2));
            }
            if (!lVar.f17072l) {
                lVar.f17063c.a(lVar.f17064d.b());
                lVar.f17072l = true;
            }
            if (lVar.f17071k <= 0 && !lVar.f17061a.a(bVar)) {
                lVar.f17068h = 3;
                return -1;
            }
            lVar.f17071k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = lVar.f17061a.f17044b;
            long jA2 = lVar.a(nVar);
            if (jA2 >= 0) {
                long j13 = lVar.f17067g;
                if (j13 + jA2 >= lVar.f17065e) {
                    long j14 = (j13 * 1000000) / ((long) lVar.f17069i);
                    lVar.f17062b.a(nVar.f17847c, nVar);
                    lVar.f17062b.a(j14, 1, nVar.f17847c, 0, null);
                    lVar.f17065e = -1L;
                }
            }
            lVar.f17067g += jA2;
        } else {
            throw new IllegalStateException();
        }
        return 0;
    }
}
