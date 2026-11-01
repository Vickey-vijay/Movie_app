package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class t92 implements up2, tp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld3 f82932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u92 f82933c;

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        this.f82932b.a();
    }

    public t92(u92 u92Var, String str, w92 w92Var) {
        this.f82933c = u92Var;
        this.f82931a = str;
        this.f82932b = w92Var;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        ((tg1) this.f82933c.f83400b.f84866a).a("YmadOmSdkJs", (String) obj);
        y92 y92Var = this.f82933c.f83400b;
        ((tg1) y92Var.f84866a).a("YmadOmSdkJsUrl", this.f82931a);
        this.f82932b.a();
    }
}
