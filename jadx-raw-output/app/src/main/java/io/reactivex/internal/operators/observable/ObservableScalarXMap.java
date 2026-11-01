package io.reactivex.internal.operators.observable;

import a.h;
import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import oi.o;
import ri.c;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements c<T>, Runnable {
        public static final int FUSED = 1;
        public static final int ON_COMPLETE = 3;
        public static final int ON_NEXT = 2;
        public static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        public final r<? super T> observer;
        public final T value;

        @Override // ri.h
        public void clear() {
            lazySet(3);
        }

        @Override // mi.b
        public void dispose() {
            set(3);
        }

        @Override // ri.h
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // ri.d
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public ScalarDisposable(r<? super T> rVar, T t10) {
            this.observer = rVar;
            this.value = t10;
        }

        @Override // mi.b
        public boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        @Override // ri.h
        public boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        @Override // ri.h
        public T poll() throws Exception {
            if (get() == 1) {
                lazySet(3);
                return this.value;
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }

    public static final class a<T, R> extends k<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f61272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? super T, ? extends p<? extends R>> f61273c;

        @Override // ii.k
        public void subscribeActual(r<? super R> rVar) {
            try {
                p pVar = (p) qi.a.e(this.f61273c.apply(this.f61272b), "The mapper returned a null ObservableSource");
                if (!(pVar instanceof Callable)) {
                    pVar.subscribe(rVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) pVar).call();
                    if (objCall == null) {
                        EmptyDisposable.complete(rVar);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(rVar, objCall);
                    rVar.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    EmptyDisposable.error(th2, rVar);
                }
            } catch (Throwable th3) {
                EmptyDisposable.error(th3, rVar);
            }
        }

        public a(T t10, o<? super T, ? extends p<? extends R>> oVar) {
            this.f61272b = t10;
            this.f61273c = oVar;
        }
    }

    public static <T, U> k<U> a(T t10, o<? super T, ? extends p<? extends U>> oVar) {
        return ej.a.o(new a(t10, oVar));
    }

    public static <T, R> boolean b(p<T> pVar, r<? super R> rVar, o<? super T, ? extends p<? extends R>> oVar) {
        if (!(pVar instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) pVar).call();
            if (hVar == null) {
                EmptyDisposable.complete(rVar);
                return true;
            }
            try {
                p pVar2 = (p) qi.a.e(oVar.apply(hVar), "The mapper returned a null ObservableSource");
                if (pVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) pVar2).call();
                        if (objCall == null) {
                            EmptyDisposable.complete(rVar);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(rVar, objCall);
                        rVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        EmptyDisposable.error(th2, rVar);
                        return true;
                    }
                } else {
                    pVar2.subscribe(rVar);
                }
                return true;
            } catch (Throwable th3) {
                ni.a.b(th3);
                EmptyDisposable.error(th3, rVar);
                return true;
            }
        } catch (Throwable th4) {
            ni.a.b(th4);
            EmptyDisposable.error(th4, rVar);
            return true;
        }
    }
}
