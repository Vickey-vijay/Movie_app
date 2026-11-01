package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f17868d = com.fyber.inneractive.sdk.player.exoplayer2.s.f17526d;

    public final void a(long j10) {
        this.f17866b = j10;
        if (this.f17865a) {
            this.f17867c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j10 = this.f17866b;
        if (!this.f17865a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f17867c;
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f17868d;
        if (sVar.f17527a != 1.0f) {
            return j10 + (jElapsedRealtime * ((long) sVar.f17529c));
        }
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.b.f16414a;
        return j10 + (jElapsedRealtime != -9223372036854775807L ? 1000 * jElapsedRealtime : -9223372036854775807L);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f17865a) {
            a(b());
        }
        this.f17868d = sVar;
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.f17868d;
    }
}
