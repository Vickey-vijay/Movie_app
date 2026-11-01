package kotlinx.coroutines;

import ck.p;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient g f63015b;

    public JobCancellationException createCopy() {
        return null;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!p.e(jobCancellationException.getMessage(), getMessage()) || !p.e(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) || !p.e(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public final g getJob$kotlinx_coroutines_core() {
        g gVar = this.f63015b;
        return gVar == null ? h.f63171b : gVar;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + getJob$kotlinx_coroutines_core();
    }

    public JobCancellationException(String str, Throwable th2, g gVar) {
        super(str);
        this.f63015b = gVar;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public int hashCode() {
        int iHashCode;
        String message = getMessage();
        p.g(message);
        int iHashCode2 = message.hashCode() * 31;
        g job$kotlinx_coroutines_core = getJob$kotlinx_coroutines_core();
        int iHashCode3 = 0;
        if (job$kotlinx_coroutines_core != null) {
            iHashCode = job$kotlinx_coroutines_core.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = (iHashCode2 + iHashCode) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            iHashCode3 = cause.hashCode();
        }
        return i10 + iHashCode3;
    }
}
