package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends com.fyber.inneractive.sdk.player.exoplayer2.x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f17618g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17623f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.w a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.w wVar, long j10) {
        if (i10 < 0 || i10 >= 1) {
            throw new IndexOutOfBoundsException();
        }
        long j11 = this.f17622e;
        boolean z10 = this.f17623f;
        if (z10) {
            j11 += j10;
            if (j11 > this.f17620c) {
                j11 = -9223372036854775807L;
            }
        }
        long j12 = this.f17620c;
        long j13 = this.f17621d;
        wVar.f17955a = null;
        wVar.f17956b = z10;
        wVar.f17959e = j11;
        wVar.f17960f = j12;
        wVar.f17957c = 0;
        wVar.f17958d = 0;
        wVar.f17961g = j13;
        return wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int b() {
        return 1;
    }

    public x(long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f17619b = j10;
        this.f17620c = j11;
        this.f17621d = j12;
        this.f17622e = j13;
        this.f17623f = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.v a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.v vVar, boolean z10) {
        if (i10 >= 0 && i10 < 1) {
            Object obj = z10 ? f17618g : null;
            long j10 = this.f17619b;
            long j11 = -this.f17621d;
            vVar.f17881a = obj;
            vVar.f17882b = obj;
            vVar.f17883c = 0;
            vVar.f17884d = j10;
            vVar.f17885e = j11;
            return vVar;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a(Object obj) {
        return f17618g.equals(obj) ? 0 : -1;
    }
}
