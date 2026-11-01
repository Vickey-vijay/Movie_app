package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class j90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78949a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && ck.p.e(this.f78949a, ((j90) obj).f78949a);
    }

    public final int hashCode() {
        return this.f78949a.hashCode();
    }

    public final String toString() {
        return "Message(text=" + this.f78949a + ")";
    }

    public j90(String str) {
        this.f78949a = str;
    }
}
