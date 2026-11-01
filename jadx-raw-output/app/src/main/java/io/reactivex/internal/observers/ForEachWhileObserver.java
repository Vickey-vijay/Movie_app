package io.reactivex.internal.observers;

import ii.r;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.a;
import oi.g;
import oi.q;

/* JADX INFO: loaded from: classes8.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<b> implements r<T>, b {
    private static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final a onComplete;
    public final g<? super Throwable> onError;
    public final q<? super T> onNext;

    @Override // ii.r
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.onComplete.run();
        } catch (Throwable th2) {
            ni.a.b(th2);
            ej.a.s(th2);
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        if (this.done) {
            ej.a.s(th2);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th2);
        } catch (Throwable th3) {
            ni.a.b(th3);
            ej.a.s(new CompositeException(th2, th3));
        }
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (this.done) {
            return;
        }
        try {
            if (this.onNext.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            ni.a.b(th2);
            dispose();
            onError(th2);
        }
    }

    public ForEachWhileObserver(q<? super T> qVar, g<? super Throwable> gVar, a aVar) {
        this.onNext = qVar;
        this.onError = gVar;
        this.onComplete = aVar;
    }

    @Override // mi.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // mi.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // ii.r
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
