package io.appmetrica.analytics.idsync.impl;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54927c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return ck.p.e(this.f54925a, zVar.f54925a) && this.f54926b == zVar.f54926b && this.f54927c == zVar.f54927c;
    }

    public final int hashCode() {
        return v.a(this.f54927c) + ((Long.hashCode(this.f54926b) + (this.f54925a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f54925a + ", lastAttempt=" + this.f54926b + ", lastAttemptResult=" + u.b(this.f54927c) + ')';
    }

    public z(String str, long j10, int i10) {
        this.f54925a = str;
        this.f54926b = j10;
        this.f54927c = i10;
    }
}
