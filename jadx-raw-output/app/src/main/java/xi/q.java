package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableDebounce.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q<T, U> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.o<? super T, ? extends ii.p<U>> f74760c;

    /* JADX INFO: compiled from: ObservableDebounce.java */
    public static final class a<T, U> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.o<? super T, ? extends ii.p<U>> f74762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<mi.b> f74764e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile long f74765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74766g;

        /* JADX INFO: renamed from: xi.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDebounce.java */
        public static final class C0791a<T, U> extends dj.c<U> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a<T, U> f74767c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f74768d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final T f74769e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f74770f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final AtomicBoolean f74771g = new AtomicBoolean();

            public void b() {
                if (this.f74771g.compareAndSet(false, true)) {
                    this.f74767c.a(this.f74768d, this.f74769e);
                }
            }

            @Override // ii.r
            public void onComplete() {
                if (this.f74770f) {
                    return;
                }
                this.f74770f = true;
                b();
            }

            @Override // ii.r
            public void onError(Throwable th2) {
                if (this.f74770f) {
                    ej.a.s(th2);
                } else {
                    this.f74770f = true;
                    this.f74767c.onError(th2);
                }
            }

            @Override // ii.r
            public void onNext(U u10) {
                if (this.f74770f) {
                    return;
                }
                this.f74770f = true;
                dispose();
                b();
            }

            public C0791a(a<T, U> aVar, long j10, T t10) {
                this.f74767c = aVar;
                this.f74768d = j10;
                this.f74769e = t10;
            }
        }

        public void a(long j10, T t10) {
            if (j10 == this.f74765f) {
                this.f74761b.onNext(t10);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f74763d.dispose();
            DisposableHelper.dispose(this.f74764e);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74763d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74766g) {
                return;
            }
            this.f74766g = true;
            mi.b bVar = this.f74764e.get();
            if (bVar != DisposableHelper.DISPOSED) {
                ((C0791a) bVar).b();
                DisposableHelper.dispose(this.f74764e);
                this.f74761b.onComplete();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f74764e);
            this.f74761b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74766g) {
                return;
            }
            long j10 = this.f74765f + 1;
            this.f74765f = j10;
            mi.b bVar = this.f74764e.get();
            if (bVar != null) {
                bVar.dispose();
            }
            try {
                ii.p pVar = (ii.p) qi.a.e(this.f74762c.apply(t10), "The ObservableSource supplied is null");
                C0791a c0791a = new C0791a(this, j10, t10);
                if (androidx.lifecycle.e.a(this.f74764e, bVar, c0791a)) {
                    pVar.subscribe(c0791a);
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                dispose();
                this.f74761b.onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74763d, bVar)) {
                this.f74763d = bVar;
                this.f74761b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, oi.o<? super T, ? extends ii.p<U>> oVar) {
            this.f74761b = rVar;
            this.f74762c = oVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(new dj.e(rVar), this.f74760c));
    }

    public q(ii.p<T> pVar, oi.o<? super T, ? extends ii.p<U>> oVar) {
        super(pVar);
        this.f74760c = oVar;
    }
}
