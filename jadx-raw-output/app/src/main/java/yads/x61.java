package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class x61 implements a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84463a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x61) && ck.p.e(this.f84463a, ((x61) obj).f84463a);
    }

    public final int hashCode() {
        return this.f84463a.hashCode();
    }

    public final String toString() {
        return "Failure(message=" + this.f84463a + ")";
    }

    public x61(String str) {
        this.f84463a = str;
    }
}
