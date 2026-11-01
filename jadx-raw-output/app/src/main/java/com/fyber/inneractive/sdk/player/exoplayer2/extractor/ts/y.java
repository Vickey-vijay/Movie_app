package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f17333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17335c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f17333a = vVar;
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f17164d, 4);
        this.f17334b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f17165e, "application/x-scte35", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        long j10;
        long j11;
        long j12;
        long j13 = -9223372036854775807L;
        if (!this.f17335c) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = this.f17333a;
            long j14 = 0;
            if (vVar.f17869a == Long.MAX_VALUE) {
                j11 = 0;
            } else {
                j11 = vVar.f17871c == -9223372036854775807L ? -9223372036854775807L : vVar.f17870b;
            }
            if (j11 == -9223372036854775807L) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f17334b;
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2 = this.f17333a;
            if (vVar2.f17869a == Long.MAX_VALUE) {
                j12 = j14;
            } else if (vVar2.f17871c == -9223372036854775807L) {
                j12 = -9223372036854775807L;
            } else {
                j14 = vVar2.f17870b;
                j12 = j14;
            }
            rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j12, null, null, null));
            this.f17335c = true;
        }
        int i10 = nVar.f17847c - nVar.f17846b;
        this.f17334b.a(i10, nVar);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f17334b;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3 = this.f17333a;
        if (vVar3.f17871c != -9223372036854775807L) {
            j13 = vVar3.f17871c;
        } else {
            long j15 = vVar3.f17869a;
            if (j15 != Long.MAX_VALUE) {
                j10 = j15;
            }
            rVar2.a(j10, 1, i10, 0, null);
        }
        j10 = j13;
        rVar2.a(j10, 1, i10, 0, null);
    }
}
