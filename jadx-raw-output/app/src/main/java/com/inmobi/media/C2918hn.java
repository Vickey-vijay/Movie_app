package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2918hn extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24517a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2918hn) && this.f24517a == ((C2918hn) obj).f24517a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24517a);
    }

    public final String toString() {
        return "VideoResume(currentPlaybackTime=" + this.f24517a + ")";
    }

    public C2918hn(long j10) {
        this.f24517a = j10;
    }
}
