package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class ye0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84920c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ye0 ye0Var = (ye0) obj;
        return fy.a(lq.a(this.f84920c, ye0Var.f84920c)).a(this.f84919b, ye0Var.f84919b).a();
    }

    public ye0(int i10, mx0 mx0Var) {
        this.f84919b = (mx0Var.f80421e & 1) != 0;
        this.f84920c = if0.a(false, i10);
    }
}
