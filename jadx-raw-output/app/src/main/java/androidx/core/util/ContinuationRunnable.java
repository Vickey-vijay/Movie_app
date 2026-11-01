package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import mj.r;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes10.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final rj.c<r> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(rj.c<? super r> cVar) {
        super(false);
        this.continuation = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            rj.c<r> cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m3458constructorimpl(r.f64562a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
