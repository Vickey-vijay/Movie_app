package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class fz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q80 f77558a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z10, rj.c cVar) throws Throwable {
        ez0 ez0Var;
        if (cVar instanceof ez0) {
            ez0Var = (ez0) cVar;
            int i10 = ez0Var.f77232d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ez0Var.f77232d = i10 - Integer.MIN_VALUE;
            } else {
                ez0Var = new ez0(this, cVar);
            }
        } else {
            ez0Var = new ez0(this, cVar);
        }
        Object objG = ez0Var.f77230b;
        Object objF = sj.a.f();
        int i11 = ez0Var.f77232d;
        if (i11 == 0) {
            kotlin.c.b(objG);
            q80 q80Var = this.f77558a;
            ez0Var.f77232d = 1;
            objG = nk.h.g(q80Var.f81770d, new p80(q80Var, z10, null), ez0Var);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objG);
        }
        List<e40> list = ((u50) objG).f83382g;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        for (e40 e40Var : list) {
            arrayList.add(new i40(e40Var.f76908a, e40Var.f76909b, e40Var.f76910c));
        }
        return new v40(arrayList);
    }

    public fz0(q80 q80Var) {
        this.f77558a = q80Var;
    }
}
