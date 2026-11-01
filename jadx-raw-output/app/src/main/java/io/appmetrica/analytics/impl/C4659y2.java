package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4659y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC4634x2 f57987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f57988b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4659y2.class != obj.getClass()) {
            return false;
        }
        C4659y2 c4659y2 = (C4659y2) obj;
        if (this.f57987a != c4659y2.f57987a) {
            return false;
        }
        Boolean bool = this.f57988b;
        if (bool != null) {
            return bool.equals(c4659y2.f57988b);
        }
        return c4659y2.f57988b == null;
    }

    public final int hashCode() {
        EnumC4634x2 enumC4634x2 = this.f57987a;
        int iHashCode = (enumC4634x2 != null ? enumC4634x2.hashCode() : 0) * 31;
        Boolean bool = this.f57988b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f57987a + ", mBackgroundRestricted=" + this.f57988b + '}';
    }

    public C4659y2(EnumC4634x2 enumC4634x2, Boolean bool) {
        this.f57987a = enumC4634x2;
        this.f57988b = bool;
    }
}
