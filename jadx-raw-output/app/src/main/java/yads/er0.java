package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class er0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f77180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f77182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr0 f77183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f77184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f77185f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return this.f77180a == er0Var.f77180a && this.f77181b == er0Var.f77181b && this.f77182c == er0Var.f77182c && ck.p.e(this.f77183d, er0Var.f77183d) && ck.p.e(this.f77184e, er0Var.f77184e) && ck.p.e(this.f77185f, er0Var.f77185f);
    }

    public final int hashCode() {
        int iHashCode = (this.f77182c.hashCode() + ((Long.hashCode(this.f77181b) + (this.f77180a.hashCode() * 31)) * 31)) * 31;
        dr0 dr0Var = this.f77183d;
        int iHashCode2 = (this.f77184e.hashCode() + ((iHashCode + (dr0Var == null ? 0 : dr0Var.hashCode())) * 31)) * 31;
        c cVar = this.f77185f;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.f77180a + ", startTime=" + this.f77181b + ", activityInteractionType=" + this.f77182c + ", falseClick=" + this.f77183d + ", reportData=" + this.f77184e + ", abExperiments=" + this.f77185f + ")";
    }

    public er0(e00 e00Var, long j10, h1 h1Var, dr0 dr0Var, Map map, c cVar) {
        this.f77180a = e00Var;
        this.f77181b = j10;
        this.f77182c = h1Var;
        this.f77183d = dr0Var;
        this.f77184e = map;
        this.f77185f = cVar;
    }
}
