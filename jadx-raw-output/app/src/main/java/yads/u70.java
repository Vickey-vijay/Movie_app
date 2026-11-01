package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class u70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f83389a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u70) && this.f83389a == ((u70) obj).f83389a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83389a);
    }

    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.f83389a + ")";
    }

    public u70(boolean z10) {
        this.f83389a = z10;
    }
}
