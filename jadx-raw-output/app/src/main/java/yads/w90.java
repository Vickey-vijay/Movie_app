package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class w90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84130a;

    public w90(String str) {
        super(0);
        this.f84130a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w90) && ck.p.e(this.f84130a, ((w90) obj).f84130a);
    }

    public final int hashCode() {
        return this.f84130a.hashCode();
    }

    public final String toString() {
        return "Header(text=" + this.f84130a + ")";
    }
}
