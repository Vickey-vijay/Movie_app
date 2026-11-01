package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* JADX INFO: loaded from: classes5.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f55250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H0 f55255f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g10 = (G0) obj;
        return this.f55250a == g10.f55250a && ck.p.e(this.f55251b, g10.f55251b) && ck.p.e(this.f55252c, g10.f55252c) && ck.p.e(this.f55253d, g10.f55253d) && this.f55254e == g10.f55254e && ck.p.e(this.f55255f, g10.f55255f);
    }

    public final int hashCode() {
        return this.f55255f.hashCode() + ((Long.hashCode(this.f55254e) + ((this.f55253d.hashCode() + ((this.f55252c.hashCode() + ((this.f55251b.hashCode() + (this.f55250a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f55250a + ", handlerVersion=" + this.f55251b + ", uuid=" + this.f55252c + ", dumpFile=" + this.f55253d + ", creationTime=" + this.f55254e + ", metadata=" + this.f55255f + ')';
    }

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, H0 h10) {
        this.f55250a = nativeCrashSource;
        this.f55251b = str;
        this.f55252c = str2;
        this.f55253d = str3;
        this.f55254e = j10;
        this.f55255f = h10;
    }
}
