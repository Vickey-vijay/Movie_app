package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class t42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv2 f82881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mz1 f82882b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t42(Context context, lu2 lu2Var, d4 d4Var, w5 w5Var) {
        nk.l0 l0VarA = z10.a((rm0) ((iu3) lu2Var).a());
        this(d4Var, new mv2(lu2Var), new mz1(context.getApplicationContext(), lu2Var, d4Var, w5Var, l0VarA));
    }

    public final void a(v9 v9Var, s42 s42Var, zp2 zp2Var) {
        d12 d12Var = (d12) v9Var.f83828t;
        if (d12Var == null) {
            s42Var.a(h9.f78103c);
            zp2Var.a();
            return;
        }
        zp2Var.a(d12Var);
        xz1 xz1VarA = this.f82881a.a(v9Var);
        y22 y22Var = new y22(s42Var);
        mz1 mz1Var = this.f82882b;
        nk.j.d(mz1Var.f80481d, null, null, new lz1(mz1Var, v9Var, d12Var, xz1VarA, y22Var, null), 3, null);
    }

    public t42(d4 d4Var, mv2 mv2Var, mz1 mz1Var) {
        this.f82881a = mv2Var;
        this.f82882b = mz1Var;
        v42 v42Var = v42.f83737c;
        d4Var.e();
    }
}
