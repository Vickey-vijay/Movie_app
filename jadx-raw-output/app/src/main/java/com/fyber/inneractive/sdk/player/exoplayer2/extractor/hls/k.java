package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f16587b;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        n nVar = this.f16587b;
        nVar.f16595g.b();
        f fVar = nVar.f16591c;
        com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f16541j;
        if (gVar != null) {
            throw gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f16542k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f16536e.f16693d.get(aVar);
            hVar.f16680b.b();
            IOException iOException = hVar.f16688j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z10;
        n nVar = this.f16587b;
        int i10 = this.f16586a;
        if (!nVar.f16613y) {
            if (nVar.f16612x != -9223372036854775807L) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f16598j.valueAt(i10)).f16506c;
            synchronized (eVar) {
                z10 = eVar.f16469i == 0;
            }
            if (z10) {
                return false;
            }
        }
        return true;
    }

    public k(n nVar, int i10) {
        this.f16587b = nVar;
        this.f16586a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        n nVar = this.f16587b;
        int i10 = this.f16586a;
        if (nVar.f16612x != -9223372036854775807L) {
            return -3;
        }
        loop0: while (nVar.f16599k.size() > 1) {
            int i11 = ((h) nVar.f16599k.getFirst()).f16548j;
            for (int i12 = 0; i12 < nVar.f16598j.size(); i12++) {
                if (nVar.f16610v[i12]) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f16598j.valueAt(i12)).f16506c;
                    if ((eVar.f16469i == 0 ? eVar.f16478r : eVar.f16462b[eVar.f16471k]) == i11) {
                        break loop0;
                    }
                }
            }
            nVar.f16599k.removeFirst();
        }
        h hVar = (h) nVar.f16599k.getFirst();
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = hVar.f17544c;
        if (!oVar.equals(nVar.f16605q)) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = nVar.f16596h;
            int i13 = nVar.f16589a;
            int i14 = hVar.f17545d;
            Object obj = hVar.f17546e;
            long j10 = hVar.f17547f;
            if (fVar.f17560b != null) {
                fVar.f17559a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.e(fVar, i13, oVar, i14, obj, j10));
            }
        }
        nVar.f16605q = oVar;
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f16598j.valueAt(i10)).a(pVar, cVar, z10, nVar.f16613y, nVar.f16611w);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j10) {
        n nVar = this.f16587b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f16598j.valueAt(this.f16586a);
        if (nVar.f16613y && j10 > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j10);
        }
    }
}
