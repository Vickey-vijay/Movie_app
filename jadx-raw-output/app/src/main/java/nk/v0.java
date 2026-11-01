package nk;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f64824b;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        h0 h0Var = this.f64824b;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (sk.h.d(h0Var, emptyCoroutineContext)) {
            sk.h.c(this.f64824b, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f64824b.toString();
    }

    public v0(h0 h0Var) {
        this.f64824b = h0Var;
    }
}
