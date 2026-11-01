package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ze3 implements kf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f85367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf3 f85368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf3 f85369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yf3 f85370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jg3 f85371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5 f85372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yj3 f85373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final af3 f85374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f85375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gf3 f85376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f85377k;

    @Override // yads.kf3
    public final void a() {
        if (this.f85377k) {
            this.f85371e.a(hg3.f78223e);
            this.f85373g.j();
        }
    }

    @Override // yads.kf3
    public final void c() {
        this.f85377k = true;
        this.f85371e.a(hg3.f78223e);
        vf3 vf3Var = this.f85369c;
        if (!vf3Var.f83901d) {
            vf3Var.f83901d = true;
            vf3Var.f83899b.a();
            vf3Var.f83900c.post(new uf3(vf3Var));
        }
        this.f85376j = new gf3(this.f85368b, this.f85373g);
        this.f85374h.b(this.f85367a);
    }

    @Override // yads.kf3
    public final void d() {
        this.f85377k = false;
        this.f85371e.a(hg3.f78225g);
        if (this.f85375i) {
            this.f85373g.b();
        }
        this.f85369c.a();
        this.f85370d.b();
        this.f85374h.c(this.f85367a);
        this.f85368b.a((ze3) null);
        this.f85374h.g(this.f85367a);
    }

    @Override // yads.kf3
    public final void b() {
        if (this.f85377k) {
            this.f85371e.a(hg3.f78227i);
            this.f85373g.f();
        }
    }

    @Override // yads.kf3
    public final void e() {
        this.f85373g.g();
        this.f85377k = false;
        this.f85371e.a(hg3.f78224f);
        this.f85369c.a();
        this.f85370d.b();
        this.f85374h.h(this.f85367a);
        this.f85368b.a((ze3) null);
        this.f85374h.g(this.f85367a);
    }

    @Override // yads.kf3
    public final void f() {
        this.f85371e.a(hg3.f78223e);
        if (this.f85377k) {
            this.f85373g.c();
        }
        vf3 vf3Var = this.f85369c;
        if (!vf3Var.f83901d) {
            vf3Var.f83901d = true;
            vf3Var.f83899b.a();
            vf3Var.f83900c.post(new uf3(vf3Var));
        }
        this.f85374h.d(this.f85367a);
    }

    @Override // yads.kf3
    public final void h() {
        this.f85371e.a(hg3.f78222d);
        this.f85372f.a(v5.f83762v);
        this.f85374h.j(this.f85367a);
    }

    @Override // yads.kf3
    public final void i() {
        this.f85371e.a(hg3.f78226h);
        if (this.f85377k) {
            this.f85373g.d();
        }
        this.f85374h.k(this.f85367a);
    }

    @Override // yads.kf3
    public final void onVolumeChanged(float f10) {
        this.f85373g.a(f10);
        gf3 gf3Var = this.f85376j;
        if (gf3Var != null) {
            if (f10 == 0.0f) {
                if (!gf3Var.f77798b) {
                    gf3Var.f77798b = true;
                    gf3Var.f77797a.l();
                }
            } else if (gf3Var.f77798b) {
                gf3Var.f77798b = false;
                gf3Var.f77797a.a();
            }
        }
        this.f85374h.a(this.f85367a, f10);
    }

    public ze3(je3 je3Var, hf3 hf3Var, vf3 vf3Var, yf3 yf3Var, jg3 jg3Var, w5 w5Var, zj3 zj3Var, af3 af3Var, boolean z10) {
        this.f85367a = je3Var;
        this.f85368b = hf3Var;
        this.f85369c = vf3Var;
        this.f85370d = yf3Var;
        this.f85371e = jg3Var;
        this.f85372f = w5Var;
        this.f85373g = zj3Var;
        this.f85374h = af3Var;
        this.f85375i = z10;
    }

    @Override // yads.kf3
    public final void a(jf3 jf3Var) {
        hg3 hg3Var;
        this.f85377k = false;
        jg3 jg3Var = this.f85371e;
        if (jg3Var.f79043a.contains(hg3.f78222d)) {
            hg3Var = hg3.f78228j;
        } else {
            hg3Var = hg3.f78229k;
        }
        this.f85371e.a(hg3Var);
        this.f85369c.a();
        this.f85370d.a(jf3Var);
        this.f85373g.a(jf3Var);
        this.f85374h.a(this.f85367a, jf3Var);
        this.f85368b.a((ze3) null);
        this.f85374h.g(this.f85367a);
    }
}
