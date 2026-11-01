package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class kz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q80 f79624a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, boolean z10, rj.c cVar) throws Throwable {
        jz0 jz0Var;
        if (cVar instanceof jz0) {
            jz0Var = (jz0) cVar;
            int i10 = jz0Var.f79248e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jz0Var.f79248e = i10 - Integer.MIN_VALUE;
            } else {
                jz0Var = new jz0(this, cVar);
            }
        } else {
            jz0Var = new jz0(this, cVar);
        }
        Object objG = jz0Var.f79246c;
        Object objF = sj.a.f();
        int i11 = jz0Var.f79248e;
        if (i11 == 0) {
            kotlin.c.b(objG);
            q80 q80Var = this.f79624a;
            jz0Var.f79245b = str;
            jz0Var.f79248e = 1;
            objG = nk.h.g(q80Var.f81770d, new p80(q80Var, z10, null), jz0Var);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = jz0Var.f79245b;
            kotlin.c.b(objG);
        }
        for (Object obj : ((u50) objG).f83379d.f76578a) {
            if (ck.p.e(((b50) obj).f75725a, str)) {
                return obj;
            }
        }
        return null;
    }

    public kz0(q80 q80Var) {
        this.f79624a = q80Var;
    }
}
