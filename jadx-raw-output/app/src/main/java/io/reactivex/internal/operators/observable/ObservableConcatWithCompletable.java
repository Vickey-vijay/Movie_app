package io.reactivex.internal.operators.observable;

import ii.c;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableConcatWithCompletable<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f61157c;

    public static final class ConcatWithObserver<T> extends AtomicReference<b> implements r<T>, ii.b, b {
        private static final long serialVersionUID = -1953724749712440952L;
        public final r<? super T> downstream;
        public boolean inCompletable;
        public c other;

        @Override // ii.r
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            DisposableHelper.replace(this, null);
            c cVar = this.other;
            this.other = null;
            cVar.b(this);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        public ConcatWithObserver(r<? super T> rVar, c cVar) {
            this.downstream = rVar;
            this.other = cVar;
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
            if (DisposableHelper.setOnce(this, bVar) && !this.inCompletable) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new ConcatWithObserver(rVar, this.f61157c));
    }

    public ObservableConcatWithCompletable(k<T> kVar, c cVar) {
        super(kVar);
        this.f61157c = cVar;
    }
}
