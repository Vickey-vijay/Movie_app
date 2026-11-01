package nk;

import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j0 {
    public static final void a(kotlin.coroutines.d dVar, Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        try {
            i0 i0Var = (i0) dVar.get(i0.F8);
            if (i0Var != null) {
                i0Var.handleException(dVar, th2);
            } else {
                sk.f.a(dVar, th2);
            }
        } catch (Throwable th3) {
            sk.f.a(dVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        mj.d.a(runtimeException, th2);
        return runtimeException;
    }
}
