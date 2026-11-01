package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q80 f78417a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z10, rj.c cVar) throws Throwable {
        gz0 gz0Var;
        hz0 hz0Var;
        v80 v80Var;
        if (cVar instanceof gz0) {
            gz0Var = (gz0) cVar;
            int i10 = gz0Var.f77985e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gz0Var.f77985e = i10 - Integer.MIN_VALUE;
            } else {
                gz0Var = new gz0(this, cVar);
            }
        } else {
            gz0Var = new gz0(this, cVar);
        }
        Object objG = gz0Var.f77983c;
        Object objF = sj.a.f();
        int i11 = gz0Var.f77985e;
        if (i11 == 0) {
            kotlin.c.b(objG);
            q80 q80Var = this.f78417a;
            gz0Var.f77982b = this;
            gz0Var.f77985e = 1;
            objG = nk.h.g(q80Var.f81770d, new p80(q80Var, z10, null), gz0Var);
            if (objG == objF) {
                return objF;
            }
            hz0Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hz0Var = gz0Var.f77982b;
            kotlin.c.b(objG);
        }
        u50 u50Var = (u50) objG;
        List list = u50Var.f83383h;
        m50 m50Var = u50Var.f83376a;
        t80 t80Var = u50Var.f83377b;
        hz0Var.getClass();
        if (t80Var.f82920b) {
            v80Var = t80Var.f82921c.isEmpty() ? v80.f83805b : v80.f83806c;
        } else {
            v80Var = v80.f83807d;
        }
        return new v70(list, m50Var, new u80(t80Var.f82919a, new w80(v80Var, t80Var.f82921c)), u50Var.f83378c, u50Var.f83379d, u50Var.f83380e, u50Var.f83381f);
    }

    public hz0(q80 q80Var) {
        this.f78417a = q80Var;
    }
}
