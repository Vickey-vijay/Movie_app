package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class zn2 implements kf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2 f85547a;

    @Override // yads.kf3
    public final void a() {
    }

    @Override // yads.kf3
    public final void b() {
    }

    @Override // yads.kf3
    public final void f() {
    }

    @Override // yads.kf3
    public final void i() {
    }

    @Override // yads.kf3
    public final void onVolumeChanged(float f10) {
    }

    public zn2(ao2 ao2Var) {
        this.f85547a = ao2Var;
    }

    @Override // yads.kf3
    public final void a(jf3 jf3Var) {
        this.f85547a.f75586c.a();
        this.f85547a.f75584a.a((kf3) null);
        this.f85547a.f75584a.e();
    }

    @Override // yads.kf3
    public final void c() {
        vf3 vf3Var = this.f85547a.f75586c;
        if (!vf3Var.f83901d) {
            vf3Var.f83901d = true;
            vf3Var.f83899b.a();
            vf3Var.f83900c.post(new uf3(vf3Var));
        }
        ef3 ef3Var = this.f85547a.f75588e;
        if (ef3Var != null) {
            ef3Var.c();
        }
    }

    @Override // yads.kf3
    public final void d() {
        this.f85547a.f75586c.a();
        this.f85547a.f75584a.a((kf3) null);
        ef3 ef3Var = this.f85547a.f75588e;
        if (ef3Var != null) {
            ef3Var.b();
        }
    }

    @Override // yads.kf3
    public final void e() {
        this.f85547a.f75586c.a();
        this.f85547a.f75584a.a((kf3) null);
    }

    @Override // yads.kf3
    public final void h() {
        this.f85547a.f75584a.c();
    }
}
