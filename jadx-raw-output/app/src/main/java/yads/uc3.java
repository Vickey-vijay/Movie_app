package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class uc3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f83416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf3 f83417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3 f83418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83419d;

    public uc3(zj3 zj3Var, hf3 hf3Var, fk3 fk3Var) {
        this.f83416a = zj3Var;
        this.f83417b = hf3Var;
        this.f83418c = fk3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f83419d || j11 <= 0 || !this.f83418c.a()) {
            return;
        }
        this.f83419d = true;
        this.f83416a.a(this.f83417b.getVolume(), j10);
    }

    public /* synthetic */ uc3(ek3 ek3Var, zj3 zj3Var, hf3 hf3Var) {
        this(zj3Var, hf3Var, new fk3(ek3Var));
    }
}
