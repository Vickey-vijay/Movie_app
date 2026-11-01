package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17276a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17281f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f17278c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f17164d, 4);
        this.f17277b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f17165e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        int i10;
        if (this.f17278c && (i10 = this.f17280e) != 0 && this.f17281f == i10) {
            this.f17277b.a(this.f17279d, 1, i10, 0, null);
            this.f17278c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        if (z10) {
            this.f17278c = true;
            this.f17279d = j10;
            this.f17280e = 0;
            this.f17281f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (this.f17278c) {
            int i10 = nVar.f17847c - nVar.f17846b;
            int i11 = this.f17281f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(nVar.f17845a, nVar.f17846b, this.f17276a.f17845a, this.f17281f, iMin);
                if (this.f17281f + iMin == 10) {
                    this.f17276a.e(0);
                    if (73 == this.f17276a.j() && 68 == this.f17276a.j() && 51 == this.f17276a.j()) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17276a;
                        nVar2.e(nVar2.f17846b + 3);
                        this.f17280e = this.f17276a.i() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f17278c = false;
                        return;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f17280e - this.f17281f);
            this.f17277b.a(iMin2, nVar);
            this.f17281f += iMin2;
        }
    }
}
