package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class ya0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db0 f84872a;

    @Override // yads.o0
    public final /* bridge */ /* synthetic */ Object a(View view, m0 m0Var, u0 u0Var) {
        return a(view, (wa0) m0Var, (rj.c) u0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(View view, wa0 wa0Var, rj.c cVar) throws Throwable {
        xa0 xa0Var;
        if (cVar instanceof xa0) {
            xa0Var = (xa0) cVar;
            int i10 = xa0Var.f84517d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xa0Var.f84517d = i10 - Integer.MIN_VALUE;
            } else {
                xa0Var = new xa0(this, cVar);
            }
        } else {
            xa0Var = new xa0(this, cVar);
        }
        Object objA = xa0Var.f84515b;
        Object objF = sj.a.f();
        int i11 = xa0Var.f84517d;
        if (i11 == 0) {
            kotlin.c.b(objA);
            Context context = view.getContext();
            db0 db0Var = this.f84872a;
            xa0Var.f84517d = 1;
            objA = db0Var.a(context, wa0Var, xa0Var);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        return new o01(true, (sg2) objA);
    }

    public ya0(db0 db0Var) {
        this.f84872a = db0Var;
    }
}
