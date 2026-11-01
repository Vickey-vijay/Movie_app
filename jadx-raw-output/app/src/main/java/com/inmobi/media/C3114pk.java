package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3114pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25091c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3114pk)) {
            return false;
        }
        C3114pk c3114pk = (C3114pk) obj;
        return this.f25089a == c3114pk.f25089a && this.f25090b == c3114pk.f25090b && this.f25091c == c3114pk.f25091c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25091c) + ((Long.hashCode(this.f25090b) + (Long.hashCode(this.f25089a) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.f25089a + ", readTimeoutInSec=" + this.f25090b + ", callTimeoutInSec=" + this.f25091c + ")";
    }

    public C3114pk(long j10, long j11, long j12) {
        this.f25089a = j10;
        this.f25090b = j11;
        this.f25091c = j12;
    }
}
