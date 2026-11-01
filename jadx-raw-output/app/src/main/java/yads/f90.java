package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class f90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77337a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f90) && ck.p.e(this.f77337a, ((f90) obj).f77337a);
    }

    public final int hashCode() {
        return this.f77337a.hashCode();
    }

    public final String toString() {
        return "OnWarningButtonClick(waring=" + this.f77337a + ")";
    }

    public f90(String str) {
        this.f77337a = str;
    }
}
