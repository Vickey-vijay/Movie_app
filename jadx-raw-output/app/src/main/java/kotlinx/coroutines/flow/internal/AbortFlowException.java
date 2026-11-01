package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: FlowExceptions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AbortFlowException extends CancellationException {
    public final transient Object owner;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.owner = obj;
    }
}
