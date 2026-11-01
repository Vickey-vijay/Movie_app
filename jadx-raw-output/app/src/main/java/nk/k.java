package nk;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class k implements kotlinx.coroutines.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Future<?> f64795b;

    @Override // kotlinx.coroutines.b
    public void a(Throwable th2) {
        this.f64795b.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f64795b + ']';
    }

    public k(Future<?> future) {
        this.f64795b = future;
    }
}
