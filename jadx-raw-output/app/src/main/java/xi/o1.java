package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableTake.java */
/* JADX INFO: loaded from: classes11.dex */
public final class o1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74746c;

    /* JADX INFO: compiled from: ObservableTake.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f74748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f74750e;

        @Override // mi.b
        public void dispose() {
            this.f74749d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74749d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74748c) {
                return;
            }
            this.f74748c = true;
            this.f74749d.dispose();
            this.f74747b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74748c) {
                ej.a.s(th2);
                return;
            }
            this.f74748c = true;
            this.f74749d.dispose();
            this.f74747b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74748c) {
                return;
            }
            long j10 = this.f74750e;
            long j11 = j10 - 1;
            this.f74750e = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f74747b.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74749d, bVar)) {
                this.f74749d = bVar;
                if (this.f74750e != 0) {
                    this.f74747b.onSubscribe(this);
                    return;
                }
                this.f74748c = true;
                bVar.dispose();
                EmptyDisposable.complete(this.f74747b);
            }
        }

        public a(ii.r<? super T> rVar, long j10) {
            this.f74747b = rVar;
            this.f74750e = j10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74746c));
    }

    public o1(ii.p<T> pVar, long j10) {
        super(pVar);
        this.f74746c = j10;
    }
}
