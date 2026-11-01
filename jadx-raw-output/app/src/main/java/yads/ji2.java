package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ji2 implements yp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f79052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f79053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79054c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji2)) {
            return false;
        }
        ji2 ji2Var = (ji2) obj;
        return ck.p.e(this.f79052a, ji2Var.f79052a) && ck.p.e(this.f79053b, ji2Var.f79053b) && this.f79054c == ji2Var.f79054c;
    }

    public final int hashCode() {
        Object obj = this.f79052a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f79053b;
        return Long.hashCode(this.f79054c) + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CachedItem(params=" + this.f79052a + ", item=" + this.f79053b + ", expiresAtTimestampMillis=" + this.f79054c + ")";
    }

    public ji2(ny0 ny0Var, Object obj, long j10) {
        this.f79052a = ny0Var;
        this.f79053b = obj;
        this.f79054c = j10;
    }
}
