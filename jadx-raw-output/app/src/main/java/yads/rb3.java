package yads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class rb3 implements tb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f82176a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb3) && ck.p.e(this.f82176a, ((rb3) obj).f82176a);
    }

    public final int hashCode() {
        return this.f82176a.hashCode();
    }

    public final String toString() {
        return "Success(warnings=" + this.f82176a + ")";
    }

    public rb3(List list) {
        this.f82176a = list;
    }
}
