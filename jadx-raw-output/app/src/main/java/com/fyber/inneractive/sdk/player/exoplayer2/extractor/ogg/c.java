package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements h, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f17035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f17036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17037c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17038d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f17039e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        long j10 = this.f17038d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f17038d = -1L;
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        long j11 = (((long) this.f17039e.f17069i) * j10) / 1000000;
        this.f17038d = this.f17035a[z.a(this.f17035a, j11, true)];
        return j11;
    }

    public c(d dVar) {
        this.f17039e = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f17037c + this.f17036b[z.a(this.f17035a, (((long) this.f17039e.f17069i) * j10) / 1000000, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f17039e.f17040n;
        return (fVar.f17822d * 1000000) / ((long) fVar.f17819a);
    }
}
