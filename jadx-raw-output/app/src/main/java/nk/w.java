package nk;

import kotlin.Result;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class w {
    public static final <T> u<T> a(T t10) {
        v vVar = new v(null);
        vVar.i(t10);
        return vVar;
    }

    public static final <T> u<T> b(kotlinx.coroutines.g gVar) {
        return new v(gVar);
    }

    public static /* synthetic */ u c(kotlinx.coroutines.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        return b(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(u<T> uVar, Object obj) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        if (thM3461exceptionOrNullimpl == null) {
            return uVar.i(obj);
        }
        return uVar.g(thM3461exceptionOrNullimpl);
    }
}
