package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public final class Om extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23301a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Om) && this.f23301a == ((Om) obj).f23301a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23301a);
    }

    public final String toString() {
        return "VideoPause(currentPlaybackTime=" + this.f23301a + ")";
    }

    public Om(long j10) {
        this.f23301a = j10;
    }
}
