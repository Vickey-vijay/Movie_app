package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes11.dex */
public final class SequentialDisposable extends AtomicReference<b> implements b {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public SequentialDisposable(b bVar) {
        lazySet(bVar);
    }

    @Override // mi.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // mi.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean replace(b bVar) {
        return DisposableHelper.replace(this, bVar);
    }

    public boolean update(b bVar) {
        return DisposableHelper.set(this, bVar);
    }
}
