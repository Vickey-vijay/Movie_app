package io.reactivex.internal.operators.observable;

import ii.h;
import ii.i;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableConcatWithMaybe<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<? extends T> f61158c;

    public static final class ConcatWithObserver<T> extends AtomicReference<b> implements r<T>, h<T>, b {
        private static final long serialVersionUID = -1953724749712440952L;
        public final r<? super T> downstream;
        public boolean inMaybe;
        public i<? extends T> other;

        @Override // ii.r
        public void onComplete() {
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            DisposableHelper.replace(this, null);
            i<? extends T> iVar = this.other;
            this.other = null;
            iVar.b(this);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // ii.h
        public void onSuccess(T t10) {
            this.downstream.onNext(t10);
            this.downstream.onComplete();
        }

        public ConcatWithObserver(r<? super T> rVar, i<? extends T> iVar) {
            this.downstream = rVar;
            this.other = iVar;
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
            if (DisposableHelper.setOnce(this, bVar) && !this.inMaybe) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new ConcatWithObserver(rVar, this.f61158c));
    }

    public ObservableConcatWithMaybe(k<T> kVar, i<? extends T> iVar) {
        super(kVar);
        this.f61158c = iVar;
    }
}
