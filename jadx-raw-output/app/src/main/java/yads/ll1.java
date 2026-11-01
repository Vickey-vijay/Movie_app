package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ll1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79843c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll1)) {
            return false;
        }
        ll1 ll1Var = (ll1) obj;
        return this.f79841a == ll1Var.f79841a && this.f79842b == ll1Var.f79842b && this.f79843c == ll1Var.f79843c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79843c) + nd3.a(this.f79842b, Integer.hashCode(this.f79841a) * 31, 31);
    }

    public final String toString() {
        return "MediaFileInfo(width=" + this.f79841a + ", height=" + this.f79842b + ", bitrate=" + this.f79843c + ")";
    }

    public ll1(int i10, int i11, int i12) {
        this.f79841a = i10;
        this.f79842b = i11;
        this.f79843c = i12;
    }
}
