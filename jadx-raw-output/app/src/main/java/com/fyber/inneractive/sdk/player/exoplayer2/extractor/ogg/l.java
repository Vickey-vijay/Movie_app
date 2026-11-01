package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f17061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f17063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f17064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f17070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17073m;

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar);

    public void a(boolean z10) {
        if (z10) {
            this.f17070j = new j();
            this.f17066f = 0L;
            this.f17068h = 0;
        } else {
            this.f17068h = 1;
        }
        this.f17065e = -1L;
        this.f17067g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar);

    public void a(long j10) {
        this.f17067g = j10;
    }
}
