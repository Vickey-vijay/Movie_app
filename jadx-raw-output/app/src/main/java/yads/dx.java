package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class dx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f76834a;

    public dx(boolean z10) {
        super(0);
        this.f76834a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx) && this.f76834a == ((dx) obj).f76834a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76834a);
    }

    public final String toString() {
        return "CmpPresent(value=" + this.f76834a + ")";
    }
}
