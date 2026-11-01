package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableFlattenIterable.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h0<T, R> extends xi.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.o<? super T, ? extends Iterable<? extends R>> f74603c;

    /* JADX INFO: compiled from: ObservableFlattenIterable.java */
    public static final class a<T, R> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super R> f74604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.o<? super T, ? extends Iterable<? extends R>> f74605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74606d;

        @Override // mi.b
        public void dispose() {
            this.f74606d.dispose();
            this.f74606d = DisposableHelper.DISPOSED;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74606d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            mi.b bVar = this.f74606d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            this.f74606d = disposableHelper;
            this.f74604b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            mi.b bVar = this.f74606d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                ej.a.s(th2);
            } else {
                this.f74606d = disposableHelper;
                this.f74604b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74606d == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f74605c.apply(t10).iterator();
                ii.r<? super R> rVar = this.f74604b;
                while (it.hasNext()) {
                    try {
                        try {
                            rVar.onNext((Object) qi.a.e(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th2) {
                            ni.a.b(th2);
                            this.f74606d.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        ni.a.b(th3);
                        this.f74606d.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                ni.a.b(th4);
                this.f74606d.dispose();
                onError(th4);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74606d, bVar)) {
                this.f74606d = bVar;
                this.f74604b.onSubscribe(this);
            }
        }

        public a(ii.r<? super R> rVar, oi.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f74604b = rVar;
            this.f74605c = oVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super R> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74603c));
    }

    public h0(ii.p<T> pVar, oi.o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(pVar);
        this.f74603c = oVar;
    }
}
