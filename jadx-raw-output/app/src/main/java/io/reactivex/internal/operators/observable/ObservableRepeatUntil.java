package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import mi.b;
import oi.e;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableRepeatUntil<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f61242c;

    public static final class RepeatUntilObserver<T> extends AtomicInteger implements r<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final r<? super T> downstream;
        public final p<? extends T> source;
        public final e stop;
        public final SequentialDisposable upstream;

        @Override // ii.r
        public void onComplete() {
            try {
                if (this.stop.a()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            this.upstream.replace(bVar);
        }

        public RepeatUntilObserver(r<? super T> rVar, e eVar, SequentialDisposable sequentialDisposable, p<? extends T> pVar) {
            this.downstream = rVar;
            this.upstream = sequentialDisposable;
            this.source = pVar;
            this.stop = eVar;
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        rVar.onSubscribe(sequentialDisposable);
        new RepeatUntilObserver(rVar, this.f61242c, sequentialDisposable, this.f74487b).subscribeNext();
    }

    public ObservableRepeatUntil(k<T> kVar, e eVar) {
        super(kVar);
        this.f61242c = eVar;
    }
}
