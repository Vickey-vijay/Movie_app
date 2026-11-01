package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class Hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55324a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Hm.class == obj.getClass() && this.f55324a == ((Hm) obj).f55324a;
    }

    public final int hashCode() {
        long j10 = this.f55324a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f55324a + '}';
    }

    public Hm(long j10) {
        this.f55324a = j10;
    }
}
