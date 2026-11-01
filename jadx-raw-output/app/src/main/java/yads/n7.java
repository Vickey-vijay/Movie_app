package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class n7 extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80579b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7) && ck.p.e(this.f80579b, ((n7) obj).f80579b);
    }

    public final int hashCode() {
        return this.f80579b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdPresentationError(description=" + this.f80579b + ")";
    }

    public n7(String str) {
        super(str);
        this.f80579b = str;
    }
}
