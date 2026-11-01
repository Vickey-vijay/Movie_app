package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f16794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f16795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16796c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f16795b[z.a(this.f16794a, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return this.f16794a[z.a(this.f16795b, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f16796c;
    }

    public d(long[] jArr, long[] jArr2, long j10) {
        this.f16794a = jArr;
        this.f16795b = jArr2;
        this.f16796c = j10;
    }
}
