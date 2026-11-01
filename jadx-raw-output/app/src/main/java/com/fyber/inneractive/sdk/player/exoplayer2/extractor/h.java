package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements r {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        nVar.e(nVar.f17846b + i10);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j10, int i10, int i11, int i12, byte[] bArr) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i10, boolean z10) throws InterruptedException, EOFException {
        int iMin = Math.min(bVar.f16455f, i10);
        bVar.b(iMin);
        if (iMin == 0) {
            iMin = bVar.a(b.f16449g, 0, Math.min(i10, 4096), 0, true);
        }
        if (iMin != -1) {
            bVar.f16452c += (long) iMin;
        }
        if (iMin != -1) {
            return iMin;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
