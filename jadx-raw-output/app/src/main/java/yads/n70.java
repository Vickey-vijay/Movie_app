package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class n70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80580b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n70) && ck.p.e(this.f80580b, ((n70) obj).f80580b);
    }

    public n70(String str) {
        super("Ad Units", 0);
        this.f80580b = str;
    }

    public final int hashCode() {
        return this.f80580b.hashCode();
    }

    public final String toString() {
        return "AdUnit(unitId=" + this.f80580b + ")";
    }
}
