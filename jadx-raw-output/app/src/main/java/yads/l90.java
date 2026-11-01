package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class l90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79729a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        l90Var.getClass();
        return ck.p.e("Warning", "Warning") && ck.p.e(this.f79729a, l90Var.f79729a);
    }

    public final int hashCode() {
        return this.f79729a.hashCode() + 562735108;
    }

    public final String toString() {
        return "Warning(title=Warning, message=" + this.f79729a + ")";
    }

    public l90(String str) {
        this.f79729a = str;
    }
}
