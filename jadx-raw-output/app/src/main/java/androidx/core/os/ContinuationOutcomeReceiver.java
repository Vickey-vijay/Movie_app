package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(31)
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final rj.c<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(rj.c<? super R> cVar) {
        super(false);
        this.continuation = cVar;
    }

    public void onError(E e10) {
        if (compareAndSet(false, true)) {
            rj.c<R> cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(e10)));
        }
    }

    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m3458constructorimpl(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
