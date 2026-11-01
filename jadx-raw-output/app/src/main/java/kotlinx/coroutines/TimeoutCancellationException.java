package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient g coroutine;

    public TimeoutCancellationException(String str, g gVar) {
        super(str);
        this.coroutine = gVar;
    }

    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
