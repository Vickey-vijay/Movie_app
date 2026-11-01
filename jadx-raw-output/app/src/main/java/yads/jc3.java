package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class jc3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f78987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj3 f78988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af3 f78989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fk3 f78990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78991e;

    public jc3(je3 je3Var, zj3 zj3Var, af3 af3Var, fk3 fk3Var) {
        this.f78987a = je3Var;
        this.f78988b = zj3Var;
        this.f78989c = af3Var;
        this.f78990d = fk3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f78991e || j11 <= 0 || !this.f78990d.a()) {
            return;
        }
        this.f78991e = true;
        this.f78988b.h();
        this.f78989c.f(this.f78987a);
    }

    public /* synthetic */ jc3(je3 je3Var, ek3 ek3Var, zj3 zj3Var, af3 af3Var) {
        this(je3Var, zj3Var, af3Var, new fk3(ek3Var));
    }
}
