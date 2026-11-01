package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16875e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.f16872b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i10 = this.f16873c;
        if (i10 == 8) {
            return this.f16871a.j();
        }
        if (i10 == 16) {
            return this.f16871a.o();
        }
        int i11 = this.f16874d;
        this.f16874d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f16875e & 15;
        }
        int iJ = this.f16871a.j();
        this.f16875e = iJ;
        return (iJ & 240) >> 4;
    }

    public h(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.f16871a = nVar;
        nVar.e(12);
        this.f16873c = nVar.m() & 255;
        this.f16872b = nVar.m();
    }
}
