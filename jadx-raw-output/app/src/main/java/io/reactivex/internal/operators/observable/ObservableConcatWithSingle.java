package io.reactivex.internal.operators.observable;

import ii.k;
import ii.r;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableConcatWithSingle<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<? extends T> f61159c;

    public static final class ConcatWithObserver<T> extends AtomicReference<b> implements r<T>, u<T>, b {
        private static final long serialVersionUID = -1953724749712440952L;
        public final r<? super T> downstream;
        public boolean inSingle;
        public v<? extends T> other;

        @Override // ii.r
        public void onComplete() {
            this.inSingle = true;
            DisposableHelper.replace(this, null);
            v<? extends T> vVar = this.other;
            this.other = null;
            vVar.b(this);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // ii.u
        public void onSuccess(T t10) {
            this.downstream.onNext(t10);
            this.downstream.onComplete();
        }

        public ConcatWithObserver(r<? super T> rVar, v<? extends T> vVar) {
            this.downstream = rVar;
            this.other = vVar;
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
            if (DisposableHelper.setOnce(this, bVar) && !this.inSingle) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new ConcatWithObserver(rVar, this.f61159c));
    }

    public ObservableConcatWithSingle(k<T> kVar, v<? extends T> vVar) {
        super(kVar);
        this.f61159c = vVar;
    }
}
