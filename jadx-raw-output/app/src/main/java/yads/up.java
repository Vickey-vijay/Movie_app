package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class up {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ry1 f83556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j52 f83557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l72 f83558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j72 f83559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xz1 f83560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f32 f83561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t12 f83562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lu2 f83563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fy1 f83564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final va f83565j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up)) {
            return false;
        }
        up upVar = (up) obj;
        return ck.p.e(this.f83556a, upVar.f83556a) && ck.p.e(this.f83557b, upVar.f83557b) && ck.p.e(this.f83558c, upVar.f83558c) && ck.p.e(this.f83559d, upVar.f83559d) && ck.p.e(this.f83560e, upVar.f83560e) && ck.p.e(this.f83561f, upVar.f83561f) && ck.p.e(this.f83562g, upVar.f83562g) && ck.p.e(this.f83563h, upVar.f83563h) && ck.p.e(this.f83564i, upVar.f83564i) && this.f83565j == upVar.f83565j;
    }

    public final va a() {
        return this.f83565j;
    }

    public final t12 b() {
        return this.f83562g;
    }

    public final f32 c() {
        return this.f83561f;
    }

    public final ry1 d() {
        return this.f83556a;
    }

    public final xz1 e() {
        return this.f83560e;
    }

    public final fy1 f() {
        return this.f83564i;
    }

    public final j52 g() {
        return this.f83557b;
    }

    public final j72 h() {
        return this.f83559d;
    }

    public final int hashCode() {
        int iHashCode = (this.f83563h.hashCode() + ((this.f83562g.hashCode() + ((this.f83561f.hashCode() + ((this.f83560e.hashCode() + ((this.f83559d.hashCode() + ((this.f83558c.hashCode() + ((this.f83557b.hashCode() + (this.f83556a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        fy1 fy1Var = this.f83564i;
        return this.f83565j.hashCode() + ((iHashCode + (fy1Var == null ? 0 : fy1Var.hashCode())) * 31);
    }

    public final l72 i() {
        return this.f83558c;
    }

    public final lu2 j() {
        return this.f83563h;
    }

    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.f83556a + ", nativeValidator=" + this.f83557b + ", nativeVisualBlock=" + this.f83558c + ", nativeViewRenderer=" + this.f83559d + ", nativeAdFactoriesProvider=" + this.f83560e + ", forceImpressionConfigurator=" + this.f83561f + ", adViewRenderingValidator=" + this.f83562g + ", sdkEnvironmentModule=" + this.f83563h + ", nativeData=" + this.f83564i + ", adStructureType=" + this.f83565j + ")";
    }

    public up(ry1 ry1Var, k12 k12Var, l72 l72Var, j72 j72Var, xz1 xz1Var, f32 f32Var, t12 t12Var, lu2 lu2Var, fy1 fy1Var, va vaVar) {
        this.f83556a = ry1Var;
        this.f83557b = k12Var;
        this.f83558c = l72Var;
        this.f83559d = j72Var;
        this.f83560e = xz1Var;
        this.f83561f = f32Var;
        this.f83562g = t12Var;
        this.f83563h = lu2Var;
        this.f83564i = fy1Var;
        this.f83565j = vaVar;
    }
}
