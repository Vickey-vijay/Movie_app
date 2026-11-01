package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableElementAt.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b0<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f74503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f74504e;

    /* JADX INFO: compiled from: ObservableElementAt.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final T f74507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f74508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public mi.b f74509f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f74510g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74511h;

        @Override // mi.b
        public void dispose() {
            this.f74509f.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74509f.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74511h) {
                return;
            }
            this.f74511h = true;
            T t10 = this.f74507d;
            if (t10 == null && this.f74508e) {
                this.f74505b.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                this.f74505b.onNext(t10);
            }
            this.f74505b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74511h) {
                ej.a.s(th2);
            } else {
                this.f74511h = true;
                this.f74505b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74511h) {
                return;
            }
            long j10 = this.f74510g;
            if (j10 != this.f74506c) {
                this.f74510g = j10 + 1;
                return;
            }
            this.f74511h = true;
            this.f74509f.dispose();
            this.f74505b.onNext(t10);
            this.f74505b.onComplete();
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74509f, bVar)) {
                this.f74509f = bVar;
                this.f74505b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, long j10, T t10, boolean z10) {
            this.f74505b = rVar;
            this.f74506c = j10;
            this.f74507d = t10;
            this.f74508e = z10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74502c, this.f74503d, this.f74504e));
    }

    public b0(ii.p<T> pVar, long j10, T t10, boolean z10) {
        super(pVar);
        this.f74502c = j10;
        this.f74503d = t10;
        this.f74504e = z10;
    }
}
