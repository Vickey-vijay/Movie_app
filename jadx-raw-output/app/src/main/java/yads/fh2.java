package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class fh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f77403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f77404b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, hp hpVar, rj.c cVar) throws Throwable {
        eh2 eh2Var;
        if (cVar instanceof eh2) {
            eh2Var = (eh2) cVar;
            int i10 = eh2Var.f77077d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eh2Var.f77077d = i10 - Integer.MIN_VALUE;
            } else {
                eh2Var = new eh2(this, cVar);
            }
        } else {
            eh2Var = new eh2(this, cVar);
        }
        Object objA = eh2Var.f77075b;
        Object objF = sj.a.f();
        int i11 = eh2Var.f77077d;
        if (i11 == 0) {
            kotlin.c.b(objA);
            d4 d4Var = this.f77403a;
            lu2 lu2Var = this.f77404b;
            em0 em0Var = new em0(d4Var, new jb(hpVar), new xh2(new xo1(d4Var, lu2Var, null), new nv(d4Var, lu2Var)), ge1.f77787a);
            eh2Var.f77077d = 1;
            objA = em0Var.a(context, eh2Var);
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

    public fh2(lu2 lu2Var, d4 d4Var) {
        this.f77403a = d4Var;
        this.f77404b = lu2Var;
    }
}
