package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j<T, U extends Collection<? super T>, B> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends ii.p<B>> f74618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<U> f74619d;

    /* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
    public static final class a<T, U extends Collection<? super T>, B> extends dj.c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b<T, U, B> f74620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f74621d;

        @Override // ii.r
        public void onComplete() {
            if (this.f74621d) {
                return;
            }
            this.f74621d = true;
            this.f74620c.m();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74621d) {
                ej.a.s(th2);
            } else {
                this.f74621d = true;
                this.f74620c.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(B b10) {
            if (this.f74621d) {
                return;
            }
            this.f74621d = true;
            dispose();
            this.f74620c.m();
        }

        public a(b<T, U, B> bVar) {
            this.f74620c = bVar;
        }
    }

    /* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
    public static final class b<T, U extends Collection<? super T>, B> extends si.j<T, U, U> implements mi.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74622h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Callable<? extends ii.p<B>> f74623i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public mi.b f74624j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AtomicReference<mi.b> f74625k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public U f74626l;

        @Override // ii.r
        public void onComplete() {
            synchronized (this) {
                U u10 = this.f74626l;
                if (u10 == null) {
                    return;
                }
                this.f74626l = null;
                this.f71927d.offer(u10);
                this.f71929f = true;
                if (g()) {
                    bj.k.c(this.f71927d, this.f71926c, false, this, this);
                }
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f74626l;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        public b(ii.r<? super U> rVar, Callable<U> callable, Callable<? extends ii.p<B>> callable2) {
            super(rVar, new MpscLinkedQueue());
            this.f74625k = new AtomicReference<>();
            this.f74622h = callable;
            this.f74623i = callable2;
        }

        @Override // mi.b
        public void dispose() {
            if (this.f71928e) {
                return;
            }
            this.f71928e = true;
            this.f74624j.dispose();
            l();
            if (g()) {
                this.f71927d.clear();
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f71928e;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // si.j, bj.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void a(ii.r<? super U> rVar, U u10) {
            this.f71926c.onNext((Object) u10);
        }

        public void l() {
            DisposableHelper.dispose(this.f74625k);
        }

        public void m() {
            try {
                U u10 = (U) qi.a.e(this.f74622h.call(), "The buffer supplied is null");
                try {
                    ii.p pVar = (ii.p) qi.a.e(this.f74623i.call(), "The boundary ObservableSource supplied is null");
                    a aVar = new a(this);
                    if (DisposableHelper.replace(this.f74625k, aVar)) {
                        synchronized (this) {
                            U u11 = this.f74626l;
                            if (u11 == null) {
                                return;
                            }
                            this.f74626l = u10;
                            pVar.subscribe(aVar);
                            i(u11, false, this);
                        }
                    }
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    this.f71928e = true;
                    this.f74624j.dispose();
                    this.f71926c.onError(th2);
                }
            } catch (Throwable th3) {
                ni.a.b(th3);
                dispose();
                this.f71926c.onError(th3);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74624j, bVar)) {
                this.f74624j = bVar;
                ii.r<? super V> rVar = this.f71926c;
                try {
                    this.f74626l = (U) qi.a.e(this.f74622h.call(), "The buffer supplied is null");
                    try {
                        ii.p pVar = (ii.p) qi.a.e(this.f74623i.call(), "The boundary ObservableSource supplied is null");
                        a aVar = new a(this);
                        this.f74625k.set(aVar);
                        rVar.onSubscribe(this);
                        if (this.f71928e) {
                            return;
                        }
                        pVar.subscribe(aVar);
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        this.f71928e = true;
                        bVar.dispose();
                        EmptyDisposable.error(th2, rVar);
                    }
                } catch (Throwable th3) {
                    ni.a.b(th3);
                    this.f71928e = true;
                    bVar.dispose();
                    EmptyDisposable.error(th3, rVar);
                }
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            dispose();
            this.f71926c.onError(th2);
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super U> rVar) {
        this.f74487b.subscribe(new b(new dj.e(rVar), this.f74619d, this.f74618c));
    }

    public j(ii.p<T> pVar, Callable<? extends ii.p<B>> callable, Callable<U> callable2) {
        super(pVar);
        this.f74618c = callable;
        this.f74619d = callable2;
    }
}
