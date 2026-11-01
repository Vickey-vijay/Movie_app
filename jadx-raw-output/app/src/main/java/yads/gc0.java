package yads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class gc0 implements ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f77728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw f77729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z30 f77730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw f77732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wb2 f77733f;

    @Override // yads.ew
    public final void a() {
        ((zb2) this.f77733f).d();
    }

    @Override // yads.ew
    public final void b() {
        ((zb2) this.f77733f).b();
    }

    @Override // yads.ew
    public final void c() {
        fc0 fc0Var = new fc0(this.f77728a, this.f77729b, this.f77730c);
        long jMax = (long) Math.max(0.0d, this.f77731d - this.f77732e.f79948a);
        if (jMax == 0) {
            this.f77729b.b(this.f77728a);
            return;
        }
        zb2 zb2Var = (zb2) this.f77733f;
        zb2Var.f85305e = this.f77732e;
        zb2Var.a(jMax, fc0Var);
        this.f77730c.a(y30.f84800d);
    }

    public final View d() {
        return this.f77728a;
    }

    @Override // yads.ew
    public final void invalidate() {
        ((zb2) this.f77733f).a();
    }

    public gc0(View view, cw cwVar, z30 z30Var, long j10, lw lwVar, wb2 wb2Var) {
        this.f77728a = view;
        this.f77729b = cwVar;
        this.f77730c = z30Var;
        this.f77731d = j10;
        this.f77732e = lwVar;
        this.f77733f = wb2Var;
        cwVar.a(d());
    }
}
