package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class s01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f82480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f82481b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, hp hpVar, rj.c cVar) throws Throwable {
        r01 r01Var;
        if (cVar instanceof r01) {
            r01Var = (r01) cVar;
            int i10 = r01Var.f82063d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                r01Var.f82063d = i10 - Integer.MIN_VALUE;
            } else {
                r01Var = new r01(this, cVar);
            }
        } else {
            r01Var = new r01(this, cVar);
        }
        Object objA = r01Var.f82061b;
        Object objF = sj.a.f();
        int i11 = r01Var.f82063d;
        if (i11 == 0) {
            kotlin.c.b(objA);
            d4 d4Var = this.f82480a;
            cm0 cm0Var = new cm0(d4Var, new jn(), new ib(hpVar), new z82(new xo1(d4Var, this.f82481b, null)));
            r01Var.f82063d = 1;
            objA = cm0Var.a(context, r01Var);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        return (String) objA;
    }

    public s01(lu2 lu2Var, d4 d4Var) {
        this.f82480a = d4Var;
        this.f82481b = lu2Var;
    }
}
