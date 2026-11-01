package io.reactivex.internal.operators.observable;

import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import mi.b;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableSkipLast<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61296c;

    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements r<T>, b {
        private static final long serialVersionUID = -3807491841935125653L;
        public final r<? super T> downstream;
        public final int skip;
        public b upstream;

        @Override // mi.b
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.skip == size()) {
                this.downstream.onNext(poll());
            }
            offer(t10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public SkipLastObserver(r<? super T> rVar, int i10) {
            super(i10);
            this.downstream = rVar;
            this.skip = i10;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new SkipLastObserver(rVar, this.f61296c));
    }

    public ObservableSkipLast(p<T> pVar, int i10) {
        super(pVar);
        this.f61296c = i10;
    }
}
