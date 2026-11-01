package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class z80 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85241a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z80) && ck.p.e(this.f85241a, ((z80) obj).f85241a);
    }

    public final int hashCode() {
        return this.f85241a.hashCode();
    }

    public final String toString() {
        return "OnAdUnitClick(id=" + this.f85241a + ")";
    }

    public z80(String str) {
        this.f85241a = str;
    }
}
