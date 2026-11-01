package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4155e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56634a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4155e3.class == obj.getClass() && this.f56634a == ((C4155e3) obj).f56634a;
    }

    public final int hashCode() {
        long j10 = this.f56634a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f56634a + '}';
    }

    public C4155e3(long j10) {
        this.f56634a = j10;
    }
}
