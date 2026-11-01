package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Pl extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23347a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pl) && this.f23347a == ((Pl) obj).f23347a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23347a);
    }

    public final String toString() {
        return "VideoComplete(duration=" + this.f23347a + ")";
    }

    public Pl(long j10) {
        this.f23347a = j10;
    }
}
