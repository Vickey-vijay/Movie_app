package io.reactivex.internal.operators.observable;

import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import mi.b;
import ri.c;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableDoFinally<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.a f61172c;

    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements r<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        public final r<? super T> downstream;
        public final oi.a onFinally;

        /* JADX INFO: renamed from: qd, reason: collision with root package name */
        public c<T> f61173qd;
        public boolean syncFused;
        public b upstream;

        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    ej.a.s(th2);
                }
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public void clear() {
            this.f61173qd.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public boolean isEmpty() {
            return this.f61173qd.isEmpty();
        }

        @Override // ii.r
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
            runFinally();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof c) {
                    this.f61173qd = (c) bVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public T poll() throws Exception {
            T tPoll = this.f61173qd.poll();
            if (tPoll == null && this.syncFused) {
                runFinally();
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.d
        public int requestFusion(int i10) {
            c<T> cVar = this.f61173qd;
            if (cVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = cVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        public DoFinallyObserver(r<? super T> rVar, oi.a aVar) {
            this.downstream = rVar;
            this.onFinally = aVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new DoFinallyObserver(rVar, this.f61172c));
    }

    public ObservableDoFinally(p<T> pVar, oi.a aVar) {
        super(pVar);
        this.f61172c = aVar;
    }
}
