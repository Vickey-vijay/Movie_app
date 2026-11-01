package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class by2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76014a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by2) && ck.p.e(this.f76014a, ((by2) obj).f76014a);
    }

    public final String a() {
        return this.f76014a;
    }

    public final int hashCode() {
        return this.f76014a.hashCode();
    }

    public final String toString() {
        return "SessionParameters(token=" + this.f76014a + ")";
    }

    public by2(String str) {
        this.f76014a = str;
    }
}
