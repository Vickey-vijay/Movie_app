package nk;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Future<?> f64836b;

    @Override // nk.y0
    public void dispose() {
        this.f64836b.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f64836b + ']';
    }

    public x0(Future<?> future) {
        this.f64836b = future;
    }
}
