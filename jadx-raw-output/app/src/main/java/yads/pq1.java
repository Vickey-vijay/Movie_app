package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pq1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f81538d = com.safedk.android.utils.g.f44979y + ".mediation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hr1 f81540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f81541c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq1)) {
            return false;
        }
        pq1 pq1Var = (pq1) obj;
        return ck.p.e(this.f81539a, pq1Var.f81539a) && this.f81540b == pq1Var.f81540b && ck.p.e(this.f81541c, pq1Var.f81541c);
    }

    public final int hashCode() {
        return this.f81541c.hashCode() + ((this.f81540b.hashCode() + (this.f81539a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediationNetwork(name=" + this.f81539a + ", id=" + this.f81540b + ", adapters=" + this.f81541c + ")";
    }

    public pq1(String str, hr1 hr1Var, List list) {
        this.f81539a = str;
        this.f81540b = hr1Var;
        this.f81541c = list;
    }
}
