package yads;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class uz2 extends mo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u30 f83703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o30 f83704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mx0 f83705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f83706k = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ae0 f83707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f83708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final pz2 f83709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fm1 f83710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r83 f83711p;

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.f83711p = r83Var;
        a(this.f83709n);
    }

    @Override // yads.mo
    public final void d() {
    }

    @Override // yads.mo
    public final void e() {
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f83710o;
    }

    public uz2(dm1 dm1Var, o30 o30Var, ae0 ae0Var, boolean z10) {
        this.f83704i = o30Var;
        this.f83707l = ae0Var;
        this.f83708m = z10;
        new rl1().a(Uri.EMPTY);
        dm1Var.getClass();
        throw null;
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        ((tz2) pm1Var).f83270j.a((cg1) null);
    }

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        return new tz2(this.f83703h, this.f83704i, this.f83711p, this.f83705j, this.f83706k, this.f83707l, b(ym1Var), this.f83708m);
    }
}
