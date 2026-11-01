package io.reactivex.internal.observers;

import ii.u;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import ni.a;
import oi.g;

/* JADX INFO: loaded from: classes11.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<b> implements u<T>, b {
    private static final long serialVersionUID = -7012088219455310787L;
    public final g<? super Throwable> onError;
    public final g<? super T> onSuccess;

    public boolean hasCustomOnError() {
        return this.onError != Functions.f61034f;
    }

    @Override // ii.u
    public void onError(Throwable th2) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th2);
        } catch (Throwable th3) {
            a.b(th3);
            ej.a.s(new CompositeException(th2, th3));
        }
    }

    @Override // ii.u
    public void onSuccess(T t10) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t10);
        } catch (Throwable th2) {
            a.b(th2);
            ej.a.s(th2);
        }
    }

    public ConsumerSingleObserver(g<? super T> gVar, g<? super Throwable> gVar2) {
        this.onSuccess = gVar;
        this.onError = gVar2;
    }

    @Override // mi.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // mi.b
    public boolean isDisposed() {
        if (get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // ii.u
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
