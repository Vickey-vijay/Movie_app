package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes.dex */
public final class ObservablePublishSelector<T, R> extends xi.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super k<T>, ? extends p<R>> f61227c;

    public static final class TargetObserver<T, R> extends AtomicReference<b> implements r<R>, b {
        private static final long serialVersionUID = 854110278590336484L;
        public final r<? super R> downstream;
        public b upstream;

        @Override // mi.b
        public void dispose() {
            this.upstream.dispose();
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // ii.r
        public void onNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public TargetObserver(r<? super R> rVar) {
            this.downstream = rVar;
        }

        @Override // ii.r
        public void onComplete() {
            DisposableHelper.dispose(this);
            this.downstream.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this);
            this.downstream.onError(th2);
        }
    }

    public static final class a<T, R> implements r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PublishSubject<T> f61228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<b> f61229c;

        @Override // ii.r
        public void onComplete() {
            this.f61228b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f61228b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f61228b.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.f61229c, bVar);
        }

        public a(PublishSubject<T> publishSubject, AtomicReference<b> atomicReference) {
            this.f61228b = publishSubject;
            this.f61229c = atomicReference;
        }
    }

    public ObservablePublishSelector(p<T> pVar, o<? super k<T>, ? extends p<R>> oVar) {
        super(pVar);
        this.f61227c = oVar;
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        PublishSubject publishSubjectD = PublishSubject.d();
        try {
            p pVar = (p) qi.a.e(this.f61227c.apply(publishSubjectD), "The selector returned a null ObservableSource");
            TargetObserver targetObserver = new TargetObserver(rVar);
            pVar.subscribe(targetObserver);
            this.f74487b.subscribe(new a(publishSubjectD, targetObserver));
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
