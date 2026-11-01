package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class kq2 extends sa2 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sa2 f79525b;

    @Override // yads.sa2
    public final sa2 a() {
        return this.f79525b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f79525b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq2) {
            return this.f79525b.equals(((kq2) obj).f79525b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f79525b.hashCode();
    }

    public final String toString() {
        return this.f79525b + ".reverse()";
    }

    public kq2(sa2 sa2Var) {
        this.f79525b = (sa2) ng2.a(sa2Var);
    }
}
