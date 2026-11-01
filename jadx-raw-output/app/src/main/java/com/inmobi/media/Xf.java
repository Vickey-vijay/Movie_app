package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rf f23799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23802d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xf)) {
            return false;
        }
        Xf xf2 = (Xf) obj;
        return ck.p.e(this.f23799a, xf2.f23799a) && this.f23800b == xf2.f23800b && ck.p.e(this.f23801c, xf2.f23801c) && this.f23802d == xf2.f23802d;
    }

    public final int hashCode() {
        int iA = AbstractC2862fi.a(this.f23800b, this.f23799a.hashCode() * 31, 31);
        String str = this.f23801c;
        return Long.hashCode(this.f23802d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PingResult(ping=" + this.f23799a + ", statusCode=" + this.f23800b + ", error=" + this.f23801c + ", timestamp=" + this.f23802d + ")";
    }

    public Xf(Rf rf2, int i10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ck.p.j(rf2, "ping");
        this.f23799a = rf2;
        this.f23800b = i10;
        this.f23801c = str;
        this.f23802d = jCurrentTimeMillis;
    }
}
