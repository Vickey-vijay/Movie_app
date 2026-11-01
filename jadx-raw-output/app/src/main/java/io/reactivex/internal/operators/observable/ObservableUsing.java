package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import mi.b;
import oi.g;
import oi.o;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableUsing<T, D> extends k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends D> f61339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super D, ? extends p<? extends T>> f61340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g<? super D> f61341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61342e;

    public static final class UsingObserver<T, D> extends AtomicBoolean implements r<T>, b {
        private static final long serialVersionUID = 5904473792286235046L;
        public final g<? super D> disposer;
        public final r<? super T> downstream;
        public final boolean eager;
        public final D resource;
        public b upstream;

        public void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    ej.a.s(th2);
                }
            }
        }

        @Override // ii.r
        public void onComplete() {
            if (!this.eager) {
                this.downstream.onComplete();
                this.upstream.dispose();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
            this.upstream.dispose();
            this.downstream.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.eager) {
                this.downstream.onError(th2);
                this.upstream.dispose();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th3) {
                    ni.a.b(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.upstream.dispose();
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public UsingObserver(r<? super T> rVar, D d10, g<? super D> gVar, boolean z10) {
            this.downstream = rVar;
            this.resource = d10;
            this.disposer = gVar;
            this.eager = z10;
        }

        @Override // mi.b
        public void dispose() {
            disposeAfter();
            this.upstream.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return get();
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        try {
            D dCall = this.f61339b.call();
            try {
                ((p) qi.a.e(this.f61340c.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new UsingObserver(rVar, dCall, this.f61341d, this.f61342e));
            } catch (Throwable th2) {
                ni.a.b(th2);
                try {
                    this.f61341d.accept(dCall);
                    EmptyDisposable.error(th2, rVar);
                } catch (Throwable th3) {
                    ni.a.b(th3);
                    EmptyDisposable.error(new CompositeException(th2, th3), rVar);
                }
            }
        } catch (Throwable th4) {
            ni.a.b(th4);
            EmptyDisposable.error(th4, rVar);
        }
    }

    public ObservableUsing(Callable<? extends D> callable, o<? super D, ? extends p<? extends T>> oVar, g<? super D> gVar, boolean z10) {
        this.f61339b = callable;
        this.f61340c = oVar;
        this.f61341d = gVar;
        this.f61342e = z10;
    }
}
