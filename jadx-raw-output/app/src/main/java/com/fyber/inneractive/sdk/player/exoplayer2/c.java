package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l f16416a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16417b = ((long) 15000) * 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16418c = ((long) 30000) * 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16419d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16420e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16422g;

    public final void a(boolean z10) {
        this.f16421f = 0;
        this.f16422g = false;
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.f16416a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
