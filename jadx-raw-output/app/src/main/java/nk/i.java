package nk;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i {
    public static /* synthetic */ Object b(kotlin.coroutines.d dVar, bk.p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return h.e(dVar, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T a(kotlin.coroutines.d dVar, bk.p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar) throws InterruptedException {
        c1 c1Var;
        c1 c1VarA;
        kotlin.coroutines.d dVarK;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVar.get(kotlin.coroutines.c.D8);
        if (cVar == null) {
            c1VarA = l2.f64799a.b();
            dVarK = f0.k(m1.f64802b, dVar.plus(c1VarA));
        } else {
            c1 c1Var2 = null;
            if (cVar instanceof c1) {
                c1Var = (c1) cVar;
            } else {
                c1Var = null;
            }
            if (c1Var != null) {
                if (c1Var.L()) {
                    c1Var2 = c1Var;
                }
                if (c1Var2 != null) {
                    c1VarA = c1Var2;
                } else {
                    c1VarA = l2.f64799a.a();
                }
            } else {
                c1VarA = l2.f64799a.a();
            }
            dVarK = f0.k(m1.f64802b, dVar);
        }
        f fVar = new f(dVarK, threadCurrentThread, c1VarA);
        fVar.h1(CoroutineStart.DEFAULT, fVar, pVar);
        return (T) fVar.i1();
    }
}
