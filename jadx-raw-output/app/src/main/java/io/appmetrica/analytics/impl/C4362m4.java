package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4362m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f57246f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4362m4.class != obj.getClass()) {
            return false;
        }
        C4362m4 c4362m4 = (C4362m4) obj;
        if (this.f57241a != c4362m4.f57241a || this.f57242b != c4362m4.f57242b || this.f57243c != c4362m4.f57243c || this.f57244d != c4362m4.f57244d || this.f57245e != c4362m4.f57245e) {
            return false;
        }
        Boolean bool = this.f57246f;
        Boolean bool2 = c4362m4.f57246f;
        if (bool != null) {
            return bool.equals(bool2);
        }
        return bool2 == null;
    }

    public final int hashCode() {
        int i10 = (((((((((this.f57241a ? 1 : 0) * 31) + (this.f57242b ? 1 : 0)) * 31) + (this.f57243c ? 1 : 0)) * 31) + (this.f57244d ? 1 : 0)) * 31) + (this.f57245e ? 1 : 0)) * 31;
        Boolean bool = this.f57246f;
        return i10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f57241a + ", featuresCollectingEnabled=" + this.f57242b + ", googleAid=" + this.f57243c + ", simInfo=" + this.f57244d + ", huaweiOaid=" + this.f57245e + ", sslPinning=" + this.f57246f + '}';
    }

    public C4362m4(C4311k4 c4311k4) {
        this.f57241a = c4311k4.f57071a;
        this.f57242b = c4311k4.f57072b;
        this.f57243c = c4311k4.f57073c;
        this.f57244d = c4311k4.f57074d;
        this.f57245e = c4311k4.f57075e;
        this.f57246f = c4311k4.f57076f;
    }
}
