package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zv1 implements o11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv1 f85618a;

    @Override // yads.o11
    public final void a(hb2 hb2Var, Map map) {
        o11 o11Var;
        wv1 wv1Var = this.f85618a;
        hb2 hb2Var2 = wv1Var.f84332a;
        z43 z43Var = new z43(hb2Var2);
        wv1Var.f84335d.getClass();
        rl3 rl3Var = new rl3(nl3.a(hb2Var2));
        bq0 bq0VarA = wv1Var.f84337f.a(wv1Var.f84332a);
        dq0 dq0Var = new dq0(bq0VarA.f75930a, bq0VarA.f75931b);
        gl3 gl3Var = gl3.f77848c;
        wv1Var.f84348q = gl3Var;
        wv1Var.f84333b.a(gl3Var, rl3Var, dq0Var, z43Var);
        wv1Var.f84333b.b("notifyReadyEvent();");
        hw1 hw1Var = wv1Var.f84343l;
        if (hw1Var == null || (o11Var = (o11) hw1Var.f78402a.get()) == null) {
            return;
        }
        o11Var.a(hb2Var, map);
    }

    public zv1(wv1 wv1Var) {
        this.f85618a = wv1Var;
    }

    @Override // yads.o11
    public final void a(String str) throws tv1 {
        this.f85618a.b(str);
    }

    @Override // yads.o11
    public final void a() {
        this.f85618a.a();
    }

    @Override // yads.o11
    public final void a(boolean z10) {
        wv1 wv1Var = this.f85618a;
        wv1Var.getClass();
        wv1Var.f84333b.a(new rl3(z10));
        if (z10) {
            fq0 fq0Var = wv1Var.f84341j;
            if (fq0Var.f77485e == null) {
                eq0 eq0Var = new eq0(fq0Var.f77484d, fq0Var.f77481a, fq0Var.f77482b, fq0Var.f77483c);
                fq0Var.f77485e = eq0Var;
                fq0Var.f77484d.post(eq0Var);
                return;
            }
            return;
        }
        fq0 fq0Var2 = wv1Var.f84341j;
        fq0Var2.f77484d.removeCallbacksAndMessages(null);
        fq0Var2.f77485e = null;
        bq0 bq0VarA = wv1Var.f84337f.a(wv1Var.f84332a);
        if (ck.p.e(bq0VarA, wv1Var.f84349r)) {
            return;
        }
        wv1Var.f84349r = bq0VarA;
        wv1Var.f84333b.a(new dq0(bq0VarA.f75930a, bq0VarA.f75931b));
    }
}
