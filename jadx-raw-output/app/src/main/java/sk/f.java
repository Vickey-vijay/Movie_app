package sk;

import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final void a(kotlin.coroutines.d dVar, Throwable th2) {
        Iterator<nk.i0> it = e.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(dVar, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                e.b(nk.j0.b(th2, th3));
            }
        }
        try {
            mj.d.a(th2, new DiagnosticCoroutineContextException(dVar));
        } catch (Throwable unused2) {
        }
        e.b(th2);
    }
}
