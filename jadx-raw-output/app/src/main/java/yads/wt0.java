package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84312a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt0) && ck.p.e(this.f84312a, ((wt0) obj).f84312a);
    }

    public final int hashCode() {
        return this.f84312a.hashCode();
    }

    public final String toString() {
        return "FeedSessionData(value=" + this.f84312a + ")";
    }

    public wt0(String str) {
        this.f84312a = str;
    }
}
