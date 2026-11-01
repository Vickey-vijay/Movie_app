package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* JADX INFO: compiled from: PlatformConsumer.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    private final rj.c<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(rj.c<? super T> cVar) {
        super(false);
        this.continuation = cVar;
    }

    @Override // java.util.function.Consumer
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m3458constructorimpl(t10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
