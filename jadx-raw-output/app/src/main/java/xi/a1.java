package xi;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableOnErrorNext.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.o<? super Throwable, ? extends ii.p<? extends T>> f74490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f74491d;

    /* JADX INFO: compiled from: ObservableOnErrorNext.java */
    public static final class a<T> implements ii.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.o<? super Throwable, ? extends ii.p<? extends T>> f74493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f74494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SequentialDisposable f74495e = new SequentialDisposable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74497g;

        @Override // ii.r
        public void onComplete() {
            if (this.f74497g) {
                return;
            }
            this.f74497g = true;
            this.f74496f = true;
            this.f74492b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74496f) {
                if (this.f74497g) {
                    ej.a.s(th2);
                    return;
                } else {
                    this.f74492b.onError(th2);
                    return;
                }
            }
            this.f74496f = true;
            if (this.f74494d && !(th2 instanceof Exception)) {
                this.f74492b.onError(th2);
                return;
            }
            try {
                ii.p<? extends T> pVarApply = this.f74493c.apply(th2);
                if (pVarApply != null) {
                    pVarApply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                this.f74492b.onError(nullPointerException);
            } catch (Throwable th3) {
                ni.a.b(th3);
                this.f74492b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74497g) {
                return;
            }
            this.f74492b.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            this.f74495e.replace(bVar);
        }

        public a(ii.r<? super T> rVar, oi.o<? super Throwable, ? extends ii.p<? extends T>> oVar, boolean z10) {
            this.f74492b = rVar;
            this.f74493c = oVar;
            this.f74494d = z10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        a aVar = new a(rVar, this.f74490c, this.f74491d);
        rVar.onSubscribe(aVar.f74495e);
        this.f74487b.subscribe(aVar);
    }

    public a1(ii.p<T> pVar, oi.o<? super Throwable, ? extends ii.p<? extends T>> oVar, boolean z10) {
        super(pVar);
        this.f74490c = oVar;
        this.f74491d = z10;
    }
}
