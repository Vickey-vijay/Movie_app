package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f76227b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return this.f76226a == ccVar.f76226a && this.f76227b == ccVar.f76227b;
    }

    public final int hashCode() {
        return (((int) this.f76226a) * 31) + ((int) this.f76227b);
    }

    public cc(long j10, long j11) {
        this.f76226a = j10;
        this.f76227b = j11;
    }
}
