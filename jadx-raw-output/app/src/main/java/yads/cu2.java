package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class cu2 implements yo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw2 f76439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eq2 f76440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au2 f76441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f76442d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu2(Context context, at1 at1Var) {
        this(context, cw2.a(), new fu2(at1Var), new au2());
        Object obj = dw2.f76819j;
    }

    @Override // yads.yo2
    public final Object a(e82 e82Var) {
        return (nt2) this.f76440b.a(e82Var);
    }

    @Override // yads.yo2
    public final boolean a() {
        nt2 nt2VarA = this.f76439a.a(this.f76442d);
        if (nt2VarA == null) {
            return true;
        }
        au2 au2Var = this.f76441c;
        au2Var.f75629a.f81590a.getClass();
        if (System.currentTimeMillis() >= nt2VarA.f80763e) {
            return true;
        }
        au2Var.f75630b.getClass();
        if (!ck.p.e("7.18.1", nt2VarA.R)) {
            return true;
        }
        au2Var.f75631c.getClass();
        Object obj = dw2.f76819j;
        if (!ck.p.e(cw2.a().d(), nt2VarA.L)) {
            return true;
        }
        au2Var.f75631c.getClass();
        if (cw2.a().a() != nt2VarA.f80801x) {
            return true;
        }
        au2Var.f75631c.getClass();
        return ck.p.e(cw2.a().b(), nt2VarA.M) ^ true;
    }

    public cu2(Context context, dw2 dw2Var, eq2 eq2Var, au2 au2Var) {
        this.f76439a = dw2Var;
        this.f76440b = eq2Var;
        this.f76441c = au2Var;
        this.f76442d = context.getApplicationContext();
    }
}
