package nk;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class o {
    public static final void a(l<?> lVar, y0 y0Var) {
        c(lVar, new z0(y0Var));
    }

    public static final <T> kotlinx.coroutines.c<T> b(rj.c<? super T> cVar) {
        if (!(cVar instanceof sk.g)) {
            return new kotlinx.coroutines.c<>(cVar, 1);
        }
        kotlinx.coroutines.c<T> cVarL = ((sk.g) cVar).l();
        if (cVarL != null) {
            if (!cVarL.U()) {
                cVarL = null;
            }
            if (cVarL != null) {
                return cVarL;
            }
        }
        return new kotlinx.coroutines.c<>(cVar, 2);
    }

    public static final <T> void c(l<? super T> lVar, kotlinx.coroutines.b bVar) {
        if (!(lVar instanceof kotlinx.coroutines.c)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((kotlinx.coroutines.c) lVar).O(bVar);
    }
}
