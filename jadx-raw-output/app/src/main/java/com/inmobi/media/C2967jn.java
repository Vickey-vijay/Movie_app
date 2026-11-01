package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2967jn extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24635a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2967jn) && this.f24635a == ((C2967jn) obj).f24635a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24635a);
    }

    public final String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.f24635a + ")";
    }

    public C2967jn(long j10) {
        this.f24635a = j10;
    }
}
