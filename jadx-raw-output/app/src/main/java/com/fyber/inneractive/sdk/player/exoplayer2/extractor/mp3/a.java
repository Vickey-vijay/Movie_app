package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16778c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f16778c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        long j11 = this.f16778c;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        int i10 = z.f17873a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        return ((jMax * ((long) this.f16777b)) / 8000000) + this.f16776a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f16776a) * 8000000) / ((long) this.f16777b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f16778c;
    }

    public a(int i10, long j10, long j11) {
        long jB;
        this.f16776a = j10;
        this.f16777b = i10;
        if (j11 == -1) {
            jB = -9223372036854775807L;
        } else {
            jB = b(j11);
        }
        this.f16778c = jB;
    }
}
