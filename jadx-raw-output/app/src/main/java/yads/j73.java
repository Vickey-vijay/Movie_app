package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class j73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f78930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c83 f78931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb3 f78932c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j73)) {
            return false;
        }
        j73 j73Var = (j73) obj;
        return ck.p.e(this.f78930a, j73Var.f78930a) && ck.p.e(this.f78931b, j73Var.f78931b) && ck.p.e(this.f78932c, j73Var.f78932c);
    }

    public final int hashCode() {
        return this.f78932c.f82176a.hashCode() + ((this.f78931b.hashCode() + (this.f78930a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrackNoticeObject(manager=" + this.f78930a + ", notice=" + this.f78931b + ", validationResult=" + this.f78932c + ")";
    }

    public j73(WeakReference weakReference, c83 c83Var, rb3 rb3Var) {
        this.f78930a = weakReference;
        this.f78931b = c83Var;
        this.f78932c = rb3Var;
    }
}
