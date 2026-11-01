package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4639x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57917b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4639x7)) {
            return false;
        }
        C4639x7 c4639x7 = (C4639x7) obj;
        return this.f57916a == c4639x7.f57916a && this.f57917b == c4639x7.f57917b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57917b) + (Long.hashCode(this.f57916a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f57916a + ", exponent=" + this.f57917b + ')';
    }

    public C4639x7(long j10, int i10) {
        this.f57916a = j10;
        this.f57917b = i10;
    }
}
