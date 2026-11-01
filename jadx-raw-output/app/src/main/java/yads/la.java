package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79736b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return this.f79735a == laVar.f79735a && this.f79736b == laVar.f79736b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79736b) + (Integer.hashCode(this.f79735a) * 31);
    }

    public final String toString() {
        return "AdSize(width=" + this.f79735a + ", height=" + this.f79736b + ")";
    }

    public la(int i10, int i11) {
        this.f79735a = i10;
        this.f79736b = i11;
    }
}
