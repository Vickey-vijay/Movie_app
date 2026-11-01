package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableElementAtMaybe.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c0<T> extends ii.g<T> implements ri.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74522b;

    /* JADX INFO: compiled from: ObservableElementAtMaybe.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.h<? super T> f74523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f74526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74527f;

        @Override // mi.b
        public void dispose() {
            this.f74525d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74525d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74527f) {
                return;
            }
            this.f74527f = true;
            this.f74523b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74527f) {
                ej.a.s(th2);
            } else {
                this.f74527f = true;
                this.f74523b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74527f) {
                return;
            }
            long j10 = this.f74526e;
            if (j10 != this.f74524c) {
                this.f74526e = j10 + 1;
                return;
            }
            this.f74527f = true;
            this.f74525d.dispose();
            this.f74523b.onSuccess(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74525d, bVar)) {
                this.f74525d = bVar;
                this.f74523b.onSubscribe(this);
            }
        }

        public a(ii.h<? super T> hVar, long j10) {
            this.f74523b = hVar;
            this.f74524c = j10;
        }
    }

    @Override // ri.b
    public ii.k<T> a() {
        return ej.a.o(new b0(this.f74521a, this.f74522b, null, false));
    }

    @Override // ii.g
    public void d(ii.h<? super T> hVar) {
        this.f74521a.subscribe(new a(hVar, this.f74522b));
    }

    public c0(ii.p<T> pVar, long j10) {
        this.f74521a = pVar;
        this.f74522b = j10;
    }
}
