package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes5.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f55286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55289f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h10 = (H0) obj;
        return ck.p.e(this.f55284a, h10.f55284a) && ck.p.e(this.f55285b, h10.f55285b) && this.f55286c == h10.f55286c && this.f55287d == h10.f55287d && ck.p.e(this.f55288e, h10.f55288e) && ck.p.e(this.f55289f, h10.f55289f);
    }

    public final int hashCode() {
        int iHashCode = (this.f55288e.hashCode() + ((Integer.hashCode(this.f55287d) + ((this.f55286c.hashCode() + ((this.f55285b.hashCode() + (this.f55284a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f55289f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f55284a + ", packageName=" + this.f55285b + ", reporterType=" + this.f55286c + ", processID=" + this.f55287d + ", processSessionID=" + this.f55288e + ", errorEnvironment=" + this.f55289f + ')';
    }

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i10, String str3, String str4) {
        this.f55284a = str;
        this.f55285b = str2;
        this.f55286c = counterConfigurationReporterType;
        this.f55287d = i10;
        this.f55288e = str3;
        this.f55289f = str4;
    }
}
