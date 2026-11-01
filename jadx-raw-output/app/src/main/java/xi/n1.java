package xi;

import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableSwitchIfEmpty.java */
/* JADX INFO: loaded from: classes11.dex */
public final class n1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii.p<? extends T> f74728c;

    /* JADX INFO: compiled from: ObservableSwitchIfEmpty.java */
    public static final class a<T> implements ii.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ii.p<? extends T> f74730c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74732e = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SequentialDisposable f74731d = new SequentialDisposable();

        @Override // ii.r
        public void onComplete() {
            if (!this.f74732e) {
                this.f74729b.onComplete();
            } else {
                this.f74732e = false;
                this.f74730c.subscribe(this);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74729b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74732e) {
                this.f74732e = false;
            }
            this.f74729b.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            this.f74731d.update(bVar);
        }

        public a(ii.r<? super T> rVar, ii.p<? extends T> pVar) {
            this.f74729b = rVar;
            this.f74730c = pVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        a aVar = new a(rVar, this.f74728c);
        rVar.onSubscribe(aVar.f74731d);
        this.f74487b.subscribe(aVar);
    }

    public n1(ii.p<T> pVar, ii.p<? extends T> pVar2) {
        super(pVar);
        this.f74728c = pVar2;
    }
}
