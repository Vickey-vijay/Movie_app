package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f17336a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[4]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f17337b;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }

    public z(b0 b0Var) {
        this.f17337b = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (nVar.j() != 0) {
            return;
        }
        nVar.e(nVar.f17846b + 7);
        int i10 = (nVar.f17847c - nVar.f17846b) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f17336a;
            nVar.a(mVar.f17841a, 0, 4);
            mVar.b(0);
            int iA = this.f17336a.a(16);
            this.f17336a.c(3);
            if (iA == 0) {
                this.f17336a.c(13);
            } else {
                int iA2 = this.f17336a.a(13);
                b0 b0Var = this.f17337b;
                b0Var.f17125f.put(iA2, new w(new a0(b0Var, iA2)));
                this.f17337b.f17128i++;
            }
        }
        b0 b0Var2 = this.f17337b;
        if (b0Var2.f17120a != 2) {
            b0Var2.f17125f.remove(0);
        }
    }
}
