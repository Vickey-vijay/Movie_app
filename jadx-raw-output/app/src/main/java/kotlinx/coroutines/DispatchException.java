package kotlinx.coroutines;

import nk.h0;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DispatchException extends Exception {
    private final Throwable cause;

    public DispatchException(Throwable th2, h0 h0Var, kotlin.coroutines.d dVar) {
        super("Coroutine dispatcher " + h0Var + " threw an exception, context = " + dVar, th2);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
