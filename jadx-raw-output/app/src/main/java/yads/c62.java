package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class c62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f76186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f76187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z3 f76188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tj2 f76189d;

    @Override // yads.m62
    public final void a(long j10, long j11) {
        tj2 tj2Var = this.f76189d;
        if (tj2Var != null) {
            tj2Var.a(j10, j11);
        }
        Long l10 = this.f76187b;
        if (l10 == null || j11 <= l10.longValue()) {
            return;
        }
        tj2 tj2Var2 = this.f76189d;
        if (tj2Var2 != null) {
            tj2Var2.a();
        }
        z3 z3Var = this.f76188c;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f76186a.f76588a.remove(this);
        this.f76188c = null;
        this.f76189d = null;
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.m62
    public final void b() {
        tj2 tj2Var = this.f76189d;
        if (tj2Var != null) {
            tj2Var.a();
        }
        z3 z3Var = this.f76188c;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f76186a.f76588a.remove(this);
        this.f76188c = null;
        this.f76189d = null;
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f76186a.f76588a.remove(this);
        this.f76188c = null;
        this.f76189d = null;
    }

    @Override // yads.ay0
    public final void start() {
        this.f76186a.f76588a.add(this);
    }

    public c62(d62 d62Var, z3 z3Var, tj2 tj2Var, Long l10) {
        this.f76186a = d62Var;
        this.f76187b = l10;
        this.f76188c = z3Var;
        this.f76189d = tj2Var;
    }

    @Override // yads.m62
    public final void a() {
        z3 z3Var = this.f76188c;
        if (z3Var != null) {
            z3Var.a();
        }
        this.f76188c = null;
    }
}
