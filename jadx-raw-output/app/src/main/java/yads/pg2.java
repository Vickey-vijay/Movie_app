package yads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class pg2 implements og2, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f81414b;

    @Override // yads.og2
    public final boolean apply(Object obj) {
        for (int i10 = 0; i10 < this.f81414b.size(); i10++) {
            if (!((og2) this.f81414b.get(i10)).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pg2) {
            return this.f81414b.equals(((pg2) obj).f81414b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f81414b.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f81414b;
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : list) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    public pg2(List list) {
        this.f81414b = list;
    }
}
