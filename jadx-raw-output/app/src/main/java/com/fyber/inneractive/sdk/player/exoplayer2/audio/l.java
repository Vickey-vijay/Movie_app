package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AudioTimestamp f16325j = new AudioTimestamp();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16328m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long b() {
        return this.f16328m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long c() {
        return this.f16325j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final boolean e() {
        boolean timestamp = this.f16316a.getTimestamp(this.f16325j);
        if (timestamp) {
            long j10 = this.f16325j.framePosition;
            if (this.f16327l > j10) {
                this.f16326k++;
            }
            this.f16327l = j10;
            this.f16328m = j10 + (this.f16326k << 32);
        }
        return timestamp;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final void a(AudioTrack audioTrack, boolean z10) {
        super.a(audioTrack, z10);
        this.f16326k = 0L;
        this.f16327l = 0L;
        this.f16328m = 0L;
    }
}
