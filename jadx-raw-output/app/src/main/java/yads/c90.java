package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class c90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f76215a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c90) && this.f76215a == ((c90) obj).f76215a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76215a);
    }

    public final String toString() {
        return "OnDebugErrorIndicatorSwitch(isChecked=" + this.f76215a + ")";
    }

    public c90(boolean z10) {
        this.f76215a = z10;
    }
}
