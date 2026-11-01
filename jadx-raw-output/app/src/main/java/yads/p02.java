package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class p02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q02 f81195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m02 f81196b;

    public p02(Context context, lu2 lu2Var, a12 a12Var, o02 o02Var, w5 w5Var, d4 d4Var, k02 k02Var, n02 n02Var) {
        this.f81195a = o02Var;
        k02Var.getClass();
        v02 v02VarA = k02.a(context, d4Var, lu2Var, w5Var, this);
        n02Var.getClass();
        m02 m02VarA = n02.a(context, lu2Var, a12Var, d4Var, v02VarA, w5Var);
        this.f81196b = m02VarA;
        v02VarA.a(m02VarA.e());
    }

    public final void a() {
        m02 m02Var = this.f81196b;
        a12 a12Var = m02Var.f80019w;
        g9 g9Var = a12Var.f75362a;
        if (!a12Var.f75364c.a()) {
            m02Var.b(h9.f78108h);
            return;
        }
        m02Var.f85496b.a(v5.f83745e, null);
        m02Var.A.b(ie1.f78606b, m02Var);
        m02Var.f85497c.f76568j = Integer.valueOf(m02Var.f80019w.f75365d);
        m02Var.f85497c.a(g9Var.f77696a);
        d4 d4Var = m02Var.f85497c;
        d4Var.f76564f = m02Var.f80019w.f75363b;
        d4Var.f76571m = g9Var.f77706k;
        synchronized (m02Var) {
            m02Var.c(g9Var);
        }
    }

    public /* synthetic */ p02(Context context, lu2 lu2Var, a12 a12Var, o02 o02Var, e00 e00Var, int i10) {
        this(context, lu2Var, a12Var, o02Var, new w5(), new d4((i10 & 32) != 0 ? e00.f76862g : e00Var), new k02(), new n02());
    }
}
