package kotlinx.coroutines.internal;

import kotlin.coroutines.d;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient d f63172b;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f63172b);
    }

    public DiagnosticCoroutineContextException(d dVar) {
        this.f63172b = dVar;
    }
}
