package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3248v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25530b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3248v5)) {
            return false;
        }
        C3248v5 c3248v5 = (C3248v5) obj;
        return this.f25529a == c3248v5.f25529a && ck.p.e(this.f25530b, c3248v5.f25530b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f25529a) * 31;
        String str = this.f25530b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlayStoreSnapshot(disabled=" + this.f25529a + ", version=" + this.f25530b + ")";
    }

    public C3248v5(String str, boolean z10) {
        this.f25529a = z10;
        this.f25530b = str;
    }
}
