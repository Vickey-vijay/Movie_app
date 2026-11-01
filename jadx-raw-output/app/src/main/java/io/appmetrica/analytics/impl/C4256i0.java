package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4256i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56934b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4256i0.class != obj.getClass()) {
            return false;
        }
        C4256i0 c4256i0 = (C4256i0) obj;
        if (this.f56934b != c4256i0.f56934b) {
            return false;
        }
        String str = this.f56933a;
        String str2 = c4256i0.f56933a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f56933a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.f56934b;
        return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public C4256i0(String str, long j10) {
        this.f56933a = str;
        this.f56934b = j10;
    }
}
