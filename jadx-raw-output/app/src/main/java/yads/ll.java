package yads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes10.dex */
public final class ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f79834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioTimestamp f79835b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f79836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f79837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f79838e;

    public final long a() {
        return this.f79835b.nanoTime / 1000;
    }

    public final boolean b() {
        boolean timestamp = this.f79834a.getTimestamp(this.f79835b);
        if (timestamp) {
            long j10 = this.f79835b.framePosition;
            if (this.f79837d > j10) {
                this.f79836c++;
            }
            this.f79837d = j10;
            this.f79838e = j10 + (this.f79836c << 32);
        }
        return timestamp;
    }

    public ll(AudioTrack audioTrack) {
        this.f79834a = audioTrack;
    }
}
