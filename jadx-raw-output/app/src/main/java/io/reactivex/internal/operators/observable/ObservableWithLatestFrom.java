package io.reactivex.internal.operators.observable;

import dj.e;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.c;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableWithLatestFrom<T, U, R> extends xi.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<? super T, ? super U, ? extends R> f61354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<? extends U> f61355d;

    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements r<T>, b {
        private static final long serialVersionUID = -312246233408980075L;
        public final c<? super T, ? super U, ? extends R> combiner;
        public final r<? super R> downstream;
        public final AtomicReference<b> upstream = new AtomicReference<>();
        public final AtomicReference<b> other = new AtomicReference<>();

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.other);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // ii.r
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            this.downstream.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        public void otherError(Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(th2);
        }

        public boolean setOther(b bVar) {
            return DisposableHelper.setOnce(this.other, bVar);
        }

        public WithLatestFromObserver(r<? super R> rVar, c<? super T, ? super U, ? extends R> cVar) {
            this.downstream = rVar;
            this.combiner = cVar;
        }

        @Override // ii.r
        public void onNext(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    this.downstream.onNext(qi.a.e(this.combiner.apply(t10, u10), "The combiner returned a null value"));
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    dispose();
                    this.downstream.onError(th2);
                }
            }
        }
    }

    public final class a implements r<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WithLatestFromObserver<T, U, R> f61356b;

        @Override // ii.r
        public void onComplete() {
        }

        public a(WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.f61356b = withLatestFromObserver;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f61356b.otherError(th2);
        }

        @Override // ii.r
        public void onNext(U u10) {
            this.f61356b.lazySet(u10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            this.f61356b.setOther(bVar);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        e eVar = new e(rVar);
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(eVar, this.f61354c);
        eVar.onSubscribe(withLatestFromObserver);
        this.f61355d.subscribe(new a(withLatestFromObserver));
        this.f74487b.subscribe(withLatestFromObserver);
    }

    public ObservableWithLatestFrom(p<T> pVar, c<? super T, ? super U, ? extends R> cVar, p<? extends U> pVar2) {
        super(pVar);
        this.f61354c = cVar;
        this.f61355d = pVar2;
    }
}
