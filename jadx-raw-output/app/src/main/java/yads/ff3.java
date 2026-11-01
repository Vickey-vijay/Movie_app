package yads;

import com.ironsource.Q6;

/* JADX INFO: loaded from: classes9.dex */
public final class ff3 implements ag3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f77384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f77385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t22 f77386c;

    public /* synthetic */ ff3(d4 d4Var, v9 v9Var) {
        this(d4Var, v9Var, new f22());
    }

    @Override // yads.ag3
    public final fo2 a() {
        v9 v9Var = this.f77385b;
        d12 d12Var = (d12) v9Var.f83828t;
        if (d12Var == null) {
            d12Var = null;
        }
        fo2 fo2VarA = this.f77386c.a(v9Var, this.f77384a, d12Var);
        fo2VarA.b(bo2.f75924a, Q6.G1);
        fo2VarA.f77472b = this.f77385b.f83817i;
        return fo2VarA;
    }

    public ff3(d4 d4Var, v9 v9Var, t22 t22Var) {
        this.f77384a = d4Var;
        this.f77385b = v9Var;
        this.f77386c = t22Var;
    }
}
