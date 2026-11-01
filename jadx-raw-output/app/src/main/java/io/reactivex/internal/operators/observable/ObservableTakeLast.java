package io.reactivex.internal.operators.observable;

import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import mi.b;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableTakeLast<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61308c;

    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements r<T>, b {
        private static final long serialVersionUID = 7240042530241604978L;
        public volatile boolean cancelled;
        public final int count;
        public final r<? super T> downstream;
        public b upstream;

        @Override // mi.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // ii.r
        public void onComplete() {
            r<? super T> rVar = this.downstream;
            while (!this.cancelled) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.cancelled) {
                        return;
                    }
                    rVar.onComplete();
                    return;
                }
                rVar.onNext(tPoll);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.count == size()) {
                poll();
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

        public TakeLastObserver(r<? super T> rVar, int i10) {
            this.downstream = rVar;
            this.count = i10;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new TakeLastObserver(rVar, this.f61308c));
    }

    public ObservableTakeLast(p<T> pVar, int i10) {
        super(pVar);
        this.f61308c = i10;
    }
}
