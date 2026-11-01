package xi;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkipUntil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l1<T, U> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii.p<U> f74693c;

    /* JADX INFO: compiled from: ObservableSkipUntil.java */
    public final class a implements ii.r<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayCompositeDisposable f74694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b<T> f74695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final dj.e<T> f74696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mi.b f74697e;

        public a(ArrayCompositeDisposable arrayCompositeDisposable, b<T> bVar, dj.e<T> eVar) {
            this.f74694b = arrayCompositeDisposable;
            this.f74695c = bVar;
            this.f74696d = eVar;
        }

        @Override // ii.r
        public void onComplete() {
            this.f74695c.f74702e = true;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74694b.dispose();
            this.f74696d.onError(th2);
        }

        @Override // ii.r
        public void onNext(U u10) {
            this.f74697e.dispose();
            this.f74695c.f74702e = true;
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74697e, bVar)) {
                this.f74697e = bVar;
                this.f74694b.setResource(1, bVar);
            }
        }
    }

    /* JADX INFO: compiled from: ObservableSkipUntil.java */
    public static final class b<T> implements ii.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayCompositeDisposable f74700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f74702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74703f;

        @Override // ii.r
        public void onComplete() {
            this.f74700c.dispose();
            this.f74699b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74700c.dispose();
            this.f74699b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74703f) {
                this.f74699b.onNext(t10);
            } else if (this.f74702e) {
                this.f74703f = true;
                this.f74699b.onNext(t10);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74701d, bVar)) {
                this.f74701d = bVar;
                this.f74700c.setResource(0, bVar);
            }
        }

        public b(ii.r<? super T> rVar, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f74699b = rVar;
            this.f74700c = arrayCompositeDisposable;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        dj.e eVar = new dj.e(rVar);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        eVar.onSubscribe(arrayCompositeDisposable);
        b bVar = new b(eVar, arrayCompositeDisposable);
        this.f74693c.subscribe(new a(arrayCompositeDisposable, bVar, eVar));
        this.f74487b.subscribe(bVar);
    }

    public l1(ii.p<T> pVar, ii.p<U> pVar2) {
        super(pVar);
        this.f74693c = pVar2;
    }
}
