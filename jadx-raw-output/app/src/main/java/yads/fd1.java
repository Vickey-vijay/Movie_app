package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class fd1 extends fy0 {
    public final sk2 F;

    public fd1(Context context, lu2 lu2Var, r5 r5Var, g9 g9Var, w5 w5Var, d4 d4Var, i12 i12Var, dd1 dd1Var, sk2 sk2Var) {
        super(context, d4Var, lu2Var, sk2Var, w5Var, dd1Var, i12Var);
        this.F = sk2Var;
        d4Var.a(g9Var);
        sk2Var.a(new ed1(r5Var, this));
        sk2Var.a(d4Var);
        sk2Var.a(i12Var);
    }

    @Override // yads.fy0
    public final by0 a(cy0 cy0Var) {
        return cy0Var.c(this);
    }

    public final void a(w00 w00Var) {
        sk2 sk2Var = this.F;
        sk2Var.f82677d = w00Var;
        sk2Var.f82676c.a(w00Var);
    }
}
