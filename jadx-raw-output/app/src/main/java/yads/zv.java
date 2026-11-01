package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class zv implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85615a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv) && ck.p.e(this.f85615a, ((zv) obj).f85615a);
    }

    @Override // yads.m0
    public final String a() {
        return this.f85615a;
    }

    public final int hashCode() {
        return this.f85615a.hashCode();
    }

    public final String toString() {
        return "CloseAction(actionType=" + this.f85615a + ")";
    }

    public zv(String str) {
        this.f85615a = str;
    }
}
