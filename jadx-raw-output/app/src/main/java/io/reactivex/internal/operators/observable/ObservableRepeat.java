package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import mi.b;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableRepeat<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61240c;

    public static final class RepeatObserver<T> extends AtomicInteger implements r<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final r<? super T> downstream;
        public long remaining;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public final SequentialDisposable f61241sd;
        public final p<? extends T> source;

        @Override // ii.r
        public void onComplete() {
            long j10 = this.remaining;
            if (j10 != Long.MAX_VALUE) {
                this.remaining = j10 - 1;
            }
            if (j10 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
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
            this.f61241sd.replace(bVar);
        }

        public RepeatObserver(r<? super T> rVar, long j10, SequentialDisposable sequentialDisposable, p<? extends T> pVar) {
            this.downstream = rVar;
            this.f61241sd = sequentialDisposable;
            this.source = pVar;
            this.remaining = j10;
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f61241sd.isDisposed()) {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        rVar.onSubscribe(sequentialDisposable);
        long j10 = this.f61240c;
        new RepeatObserver(rVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, sequentialDisposable, this.f74487b).subscribeNext();
    }

    public ObservableRepeat(k<T> kVar, long j10) {
        super(kVar);
        this.f61240c = j10;
    }
}
