package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17582b;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        this.f17582b.f17591i.b();
    }

    public o(p pVar, int i10) {
        this.f17582b = pVar;
        this.f17581a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z10;
        p pVar = this.f17582b;
        int i10 = this.f17581a;
        if (!pVar.F) {
            if (pVar.D != -9223372036854775807L) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f17597o.valueAt(i10)).f16506c;
            synchronized (eVar) {
                z10 = eVar.f16469i == 0;
            }
            if (z10) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        p pVar2 = this.f17582b;
        int i10 = this.f17581a;
        if (pVar2.f17603u || pVar2.D != -9223372036854775807L) {
            return -3;
        }
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar2.f17597o.valueAt(i10)).a(pVar, cVar, z10, pVar2.F, pVar2.C);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j10) {
        p pVar = this.f17582b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f17597o.valueAt(this.f17581a);
        if (pVar.F && j10 > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j10);
        }
    }
}
