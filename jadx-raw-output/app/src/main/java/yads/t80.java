package yads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@xk.f
public final class t80 {
    public static final s80 Companion = new s80();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xk.b[] f82918d = {null, null, new bl.f(bl.d2.f5397a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f82921c;

    public /* synthetic */ t80(int i10, String str, boolean z10, List list) {
        if (7 != (i10 & 7)) {
            bl.o1.a(i10, 7, r80.f82142a.getDescriptor());
        }
        this.f82919a = str;
        this.f82920b = z10;
        this.f82921c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return ck.p.e(this.f82919a, t80Var.f82919a) && this.f82920b == t80Var.f82920b && ck.p.e(this.f82921c, t80Var.f82921c);
    }

    public t80(boolean z10, List list) {
        this.f82919a = "7.18.1";
        this.f82920b = z10;
        this.f82921c = list;
    }

    public final int hashCode() {
        return this.f82921c.hashCode() + ((Boolean.hashCode(this.f82920b) + (this.f82919a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelSdkData(version=" + this.f82919a + ", isIntegratedSuccess=" + this.f82920b + ", integrationMessages=" + this.f82921c + ")";
    }
}
