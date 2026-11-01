package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f16800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16802f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f16800d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (!a()) {
            return this.f16797a;
        }
        float f10 = (j10 * 100.0f) / this.f16798b;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            if (f10 >= 100.0f) {
                f11 = 256.0f;
            } else {
                int i10 = (int) f10;
                f11 = i10 != 0 ? this.f16800d[i10 - 1] : 0.0f;
                f11 += (f10 - i10) * ((i10 < 99 ? this.f16800d[i10] : 256.0f) - f11);
            }
        }
        long jRound = Math.round(((double) f11) * 0.00390625d * this.f16801e);
        long j11 = this.f16797a;
        long j12 = jRound + j11;
        long j13 = this.f16799c;
        return Math.min(j12, j13 != -1 ? j13 - 1 : ((j11 - ((long) this.f16802f)) + this.f16801e) - 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        long j11;
        if (!a()) {
            return 0L;
        }
        long j12 = this.f16797a;
        if (j10 < j12) {
            return 0L;
        }
        double d10 = ((j10 - j12) * 256.0d) / this.f16801e;
        int iA = z.a(this.f16800d, (long) d10, false);
        int i10 = iA + 1;
        long j13 = this.f16798b;
        long j14 = (((long) i10) * j13) / 100;
        long j15 = i10 == 0 ? 0L : this.f16800d[iA];
        long j16 = i10 == 99 ? 256L : this.f16800d[i10];
        long j17 = (j13 * ((long) (iA + 2))) / 100;
        if (j16 == j15) {
            j11 = 0;
        } else {
            j11 = (long) (((d10 - j15) * (j17 - j14)) / (j16 - j15));
        }
        return j14 + j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f16798b;
    }

    public e(long j10, long j11, long j12, long[] jArr, long j13, int i10) {
        this.f16797a = j10;
        this.f16798b = j11;
        this.f16799c = j12;
        this.f16800d = jArr;
        this.f16801e = j13;
        this.f16802f = i10;
    }
}
