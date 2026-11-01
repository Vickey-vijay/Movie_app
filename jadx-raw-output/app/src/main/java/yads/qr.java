package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class qr implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nr f81942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av0 f81943b = new av0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yr f81944c = yr.f85093a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o30 f81945d;

    public final rr a() {
        o30 o30Var = this.f81945d;
        return a(o30Var != null ? o30Var.createDataSource() : null, 1, -1000);
    }

    public final nr b() {
        return this.f81942a;
    }

    public final yr c() {
        return this.f81944c;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        o30 o30Var = this.f81945d;
        return a(o30Var != null ? o30Var.createDataSource() : null, 0, 0);
    }

    public final rr a(p30 p30Var, int i10, int i11) {
        nr nrVar = this.f81942a;
        nrVar.getClass();
        pr prVar = p30Var == null ? null : new pr(nrVar);
        this.f81943b.getClass();
        return new rr(nrVar, p30Var, new cv0(), prVar, this.f81944c, i10);
    }
}
