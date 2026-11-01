package nk;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class p extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f64812c = AtomicIntegerFieldUpdater.newUpdater(p.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public p(rj.c<?> cVar, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + cVar + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final boolean e() {
        return f64812c.compareAndSet(this, 0, 1);
    }
}
