package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes.dex */
public final class Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f55770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f55772e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q3.class != obj.getClass()) {
            return false;
        }
        Q3 q10 = (Q3) obj;
        String str = this.f55768a;
        if (str == null ? q10.f55768a != null : !str.equals(q10.f55768a)) {
            return false;
        }
        if (!this.f55769b.equals(q10.f55769b)) {
            return false;
        }
        Integer num = this.f55770c;
        if (num == null ? q10.f55770c != null : !num.equals(q10.f55770c)) {
            return false;
        }
        String str2 = this.f55771d;
        if (str2 == null ? q10.f55771d == null : str2.equals(q10.f55771d)) {
            return this.f55772e == q10.f55772e;
        }
        return false;
    }

    public static Q3 a(I3 i10) {
        return new Q3(i10.f55335b.getApiKey(), i10.f55334a.f55103a.getAsString("PROCESS_CFG_PACKAGE_NAME"), i10.f55334a.f55103a.getAsInteger("PROCESS_CFG_PROCESS_ID"), i10.f55334a.f55103a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), i10.f55335b.getReporterType());
    }

    public final int hashCode() {
        String str = this.f55768a;
        int iHashCode = (this.f55769b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f55770c;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f55771d;
        return this.f55772e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f55768a + "', mPackageName='" + this.f55769b + "', mProcessID=" + this.f55770c + ", mProcessSessionID='" + this.f55771d + "', mReporterType=" + this.f55772e + '}';
    }

    public Q3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f55768a = str;
        this.f55769b = str2;
        this.f55770c = num;
        this.f55771d = str3;
        this.f55772e = counterConfigurationReporterType;
    }
}
