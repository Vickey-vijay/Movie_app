package nk;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j2 {
    public static final x a(kotlinx.coroutines.g gVar) {
        return new i2(gVar);
    }

    public static /* synthetic */ x b(kotlinx.coroutines.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        return a(gVar);
    }

    public static final <R> Object c(bk.p<? super l0, ? super rj.c<? super R>, ? extends Object> pVar, rj.c<? super R> cVar) {
        h2 h2Var = new h2(cVar.getContext(), cVar);
        Object objB = tk.b.b(h2Var, h2Var, pVar);
        if (objB == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objB;
    }
}
