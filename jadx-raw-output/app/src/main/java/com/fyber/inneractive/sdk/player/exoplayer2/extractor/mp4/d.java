package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f16861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16863i;

    public final boolean a() {
        int i10 = this.f16856b + 1;
        this.f16856b = i10;
        if (i10 == this.f16855a) {
            return false;
        }
        this.f16858d = this.f16859e ? this.f16860f.n() : this.f16860f.k();
        if (this.f16856b == this.f16862h) {
            this.f16857c = this.f16861g.m();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f16861g;
            nVar.e(nVar.f17846b + 4);
            int i11 = this.f16863i - 1;
            this.f16863i = i11;
            this.f16862h = i11 > 0 ? this.f16861g.m() - 1 : -1;
        }
        return true;
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2, boolean z10) {
        this.f16861g = nVar;
        this.f16860f = nVar2;
        this.f16859e = z10;
        nVar2.e(12);
        this.f16855a = nVar2.m();
        nVar.e(12);
        this.f16863i = nVar.m();
        if (nVar.b() == 1) {
            this.f16856b = -1;
            return;
        }
        throw new IllegalStateException("first_chunk must be 1");
    }
}
