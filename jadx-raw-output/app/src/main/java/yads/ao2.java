package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ao2 implements ye3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p52 f75584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je3 f75585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf3 f75586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zn2 f75587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ef3 f75588e;

    public /* synthetic */ ao2(p52 p52Var, je3 je3Var, rf3 rf3Var) {
        this(p52Var, je3Var, new vf3(new r52(p52Var), rf3Var));
    }

    @Override // yads.ye3
    public final void a(zd2 zd2Var) {
        this.f75588e = zd2Var;
    }

    @Override // yads.ye3
    public final void play() {
        this.f75584a.a(this.f75587d);
        p52 p52Var = this.f75584a;
        je3 je3Var = this.f75585b;
        p52Var.a((n62) je3Var.f79016d, (n62) je3Var.f79017e);
    }

    @Override // yads.ye3
    public final void stop() {
        this.f75586c.a();
        this.f75584a.pauseAd();
        this.f75584a.a();
    }

    public ao2(p52 p52Var, je3 je3Var, vf3 vf3Var) {
        this.f75584a = p52Var;
        this.f75585b = je3Var;
        this.f75586c = vf3Var;
        this.f75587d = new zn2(this);
    }
}
