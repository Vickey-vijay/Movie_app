package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import ni.a;
import oi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class CancellableDisposable extends AtomicReference<f> implements b {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(f fVar) {
        super(fVar);
    }

    @Override // mi.b
    public void dispose() {
        f andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            try {
                andSet.cancel();
            } catch (Exception e10) {
                a.b(e10);
                ej.a.s(e10);
            }
        }
    }

    @Override // mi.b
    public boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
