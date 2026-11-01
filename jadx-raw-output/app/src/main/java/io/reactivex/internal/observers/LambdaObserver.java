package io.reactivex.internal.observers;

import ii.r;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.a;
import oi.g;

/* JADX INFO: loaded from: classes3.dex */
public final class LambdaObserver<T> extends AtomicReference<b> implements r<T>, b {
    private static final long serialVersionUID = -7251123623727029452L;
    public final a onComplete;
    public final g<? super Throwable> onError;
    public final g<? super T> onNext;
    public final g<? super b> onSubscribe;

    public boolean hasCustomOnError() {
        return this.onError != Functions.f61034f;
    }

    public LambdaObserver(g<? super T> gVar, g<? super Throwable> gVar2, a aVar, g<? super b> gVar3) {
        this.onNext = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
        this.onSubscribe = gVar3;
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

    @Override // ii.r
    public void onComplete() {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onComplete.run();
            } catch (Throwable th2) {
                ni.a.b(th2);
                ej.a.s(th2);
            }
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th2);
                return;
            } catch (Throwable th3) {
                ni.a.b(th3);
                ej.a.s(new CompositeException(th2, th3));
                return;
            }
        }
        ej.a.s(th2);
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t10);
            } catch (Throwable th2) {
                ni.a.b(th2);
                get().dispose();
                onError(th2);
            }
        }
    }

    @Override // ii.r
    public void onSubscribe(b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th2) {
                ni.a.b(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }
}
