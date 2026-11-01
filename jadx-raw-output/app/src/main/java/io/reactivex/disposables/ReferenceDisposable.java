package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes10.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    public abstract void onDisposed(T t10);

    public ReferenceDisposable(T t10) {
        super(qi.a.e(t10, "value is null"));
    }

    @Override // mi.b
    public final void dispose() {
        T andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            onDisposed(andSet);
        }
    }

    @Override // mi.b
    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
