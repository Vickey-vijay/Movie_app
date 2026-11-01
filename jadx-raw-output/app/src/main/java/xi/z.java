package xi;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableDoOnEach.java */
/* JADX INFO: loaded from: classes4.dex */
public final class z<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.g<? super T> f74960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.g<? super Throwable> f74961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oi.a f74962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oi.a f74963f;

    /* JADX INFO: compiled from: ObservableDoOnEach.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.g<? super T> f74965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final oi.g<? super Throwable> f74966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final oi.a f74967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final oi.a f74968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public mi.b f74969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74970h;

        @Override // mi.b
        public void dispose() {
            this.f74969g.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74969g.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74970h) {
                return;
            }
            try {
                this.f74967e.run();
                this.f74970h = true;
                this.f74964b.onComplete();
                try {
                    this.f74968f.run();
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    ej.a.s(th2);
                }
            } catch (Throwable th3) {
                ni.a.b(th3);
                onError(th3);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74970h) {
                ej.a.s(th2);
                return;
            }
            this.f74970h = true;
            try {
                this.f74966d.accept(th2);
            } catch (Throwable th3) {
                ni.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f74964b.onError(th2);
            try {
                this.f74968f.run();
            } catch (Throwable th4) {
                ni.a.b(th4);
                ej.a.s(th4);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74970h) {
                return;
            }
            try {
                this.f74965c.accept(t10);
                this.f74964b.onNext(t10);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74969g.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74969g, bVar)) {
                this.f74969g = bVar;
                this.f74964b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, oi.g<? super T> gVar, oi.g<? super Throwable> gVar2, oi.a aVar, oi.a aVar2) {
            this.f74964b = rVar;
            this.f74965c = gVar;
            this.f74966d = gVar2;
            this.f74967e = aVar;
            this.f74968f = aVar2;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74960c, this.f74961d, this.f74962e, this.f74963f));
    }

    public z(ii.p<T> pVar, oi.g<? super T> gVar, oi.g<? super Throwable> gVar2, oi.a aVar, oi.a aVar2) {
        super(pVar);
        this.f74960c = gVar;
        this.f74961d = gVar2;
        this.f74962e = aVar;
        this.f74963f = aVar2;
    }
}
