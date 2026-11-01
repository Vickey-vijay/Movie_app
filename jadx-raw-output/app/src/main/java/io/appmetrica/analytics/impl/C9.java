package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class C9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55085a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9) && this.f55085a == ((C9) obj).f55085a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55085a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f55085a + ')';
    }

    public C9(long j10) {
        this.f55085a = j10;
    }
}
