package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@xk.f
public final class m40 {
    public static final l40 Companion = new l40();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xk.b[] f80076c = {new bl.f(s40.f82517a), new bl.f(f40.f77294a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f80077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f80078b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return ck.p.e(this.f80077a, m40Var.f80077a) && ck.p.e(this.f80078b, m40Var.f80078b);
    }

    public /* synthetic */ m40(int i10, List list, List list2) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, k40.f79295a.getDescriptor());
        }
        this.f80077a = list;
        this.f80078b = list2;
    }

    public final int hashCode() {
        return this.f80078b.hashCode() + (this.f80077a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.f80077a + ", bidding=" + this.f80078b + ")";
    }
}
