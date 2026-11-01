package io.reactivex.disposables;

/* JADX INFO: loaded from: classes6.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }
}
