package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioTrack f16316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16324i;

    public void a(AudioTrack audioTrack, boolean z10) {
        this.f16316a = audioTrack;
        this.f16317b = z10;
        this.f16322g = -9223372036854775807L;
        this.f16319d = 0L;
        this.f16320e = 0L;
        this.f16321f = 0L;
        if (audioTrack != null) {
            this.f16318c = audioTrack.getSampleRate();
        }
    }

    public boolean e() {
        return false;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        if (this.f16322g != -9223372036854775807L) {
            return;
        }
        this.f16316a.pause();
    }

    public final void a(long j10) {
        this.f16323h = a();
        this.f16322g = SystemClock.elapsedRealtime() * 1000;
        this.f16324i = j10;
        this.f16316a.stop();
    }

    public final long a() {
        if (this.f16322g != -9223372036854775807L) {
            return Math.min(this.f16324i, this.f16323h + ((((SystemClock.elapsedRealtime() * 1000) - this.f16322g) * ((long) this.f16318c)) / 1000000));
        }
        int playState = this.f16316a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f16316a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f16317b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f16321f = this.f16319d;
            }
            playbackHeadPosition += this.f16321f;
        }
        if (this.f16319d > playbackHeadPosition) {
            this.f16320e++;
        }
        this.f16319d = playbackHeadPosition;
        return playbackHeadPosition + (this.f16320e << 32);
    }
}
