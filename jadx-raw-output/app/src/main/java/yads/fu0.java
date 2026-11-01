package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class fu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77495b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu0)) {
            return false;
        }
        fu0 fu0Var = (fu0) obj;
        return ck.p.e(this.f77494a, fu0Var.f77494a) && ck.p.e(this.f77495b, fu0Var.f77495b);
    }

    public final int hashCode() {
        return this.f77495b.hashCode() + (this.f77494a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(title=" + this.f77494a + ", url=" + this.f77495b + ")";
    }

    public fu0(String str, String str2) {
        this.f77494a = str;
        this.f77495b = str2;
    }
}
