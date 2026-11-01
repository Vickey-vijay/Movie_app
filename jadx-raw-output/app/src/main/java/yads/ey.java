package yads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class ey extends sa2 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f77222b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f77222b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ey) {
            return this.f77222b.equals(((ey) obj).f77222b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f77222b.hashCode();
    }

    public final String toString() {
        return this.f77222b.toString();
    }

    public ey(Comparator comparator) {
        this.f77222b = (Comparator) ng2.a(comparator);
    }
}
