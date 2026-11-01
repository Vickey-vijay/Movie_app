package io.reactivex.internal.operators.single;

import ii.t;
import ii.u;
import ii.v;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;
import qi.a;
import si.n;

/* JADX INFO: loaded from: classes8.dex */
public final class SingleResumeNext<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<? extends T> f61375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super Throwable, ? extends v<? extends T>> f61376b;

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<b> implements u<T>, b {
        private static final long serialVersionUID = -5314538511045349925L;
        public final u<? super T> downstream;
        public final o<? super Throwable, ? extends v<? extends T>> nextFunction;

        @Override // ii.u
        public void onError(Throwable th2) {
            try {
                ((v) a.e(this.nextFunction.apply(th2), "The nextFunction returned a null SingleSource.")).b(new n(this, this.downstream));
            } catch (Throwable th3) {
                ni.a.b(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // ii.u
        public void onSuccess(T t10) {
            this.downstream.onSuccess(t10);
        }

        public ResumeMainSingleObserver(u<? super T> uVar, o<? super Throwable, ? extends v<? extends T>> oVar) {
            this.downstream = uVar;
            this.nextFunction = oVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.u
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    @Override // ii.t
    public void m(u<? super T> uVar) {
        this.f61375a.b(new ResumeMainSingleObserver(uVar, this.f61376b));
    }

    public SingleResumeNext(v<? extends T> vVar, o<? super Throwable, ? extends v<? extends T>> oVar) {
        this.f61375a = vVar;
        this.f61376b = oVar;
    }
}
