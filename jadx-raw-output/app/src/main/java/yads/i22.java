package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class i22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f78458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f78460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d12 f78461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t22 f78462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q22 f78463f;

    public /* synthetic */ i22(d4 d4Var, String str, v9 v9Var, d12 d12Var, t22 t22Var) {
        this(d4Var, str, v9Var, d12Var, t22Var, null);
    }

    public i22(d4 d4Var, String str, v9 v9Var, d12 d12Var, t22 t22Var, q22 q22Var) {
        this.f78458a = d4Var;
        this.f78459b = str;
        this.f78460c = v9Var;
        this.f78461d = d12Var;
        this.f78462e = t22Var;
        this.f78463f = q22Var;
    }

    public final fo2 a() {
        fo2 fo2VarA = this.f78462e.a(this.f78460c, this.f78458a, this.f78461d);
        q22 q22Var = this.f78463f;
        if (q22Var != null) {
            fo2VarA.b(q22Var.f81690b, "bind_type");
        }
        fo2VarA.a(this.f78459b, "native_ad_type");
        a03 a03Var = this.f78458a.f76562d.f75685a;
        if (a03Var != null) {
            fo2VarA.b(a03Var.b().f85668b, "size_type");
            fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
        }
        fo2VarA.f77472b = this.f78460c.f83817i;
        return fo2VarA;
    }
}
