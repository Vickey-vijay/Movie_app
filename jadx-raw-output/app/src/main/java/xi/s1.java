package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableTimeInterval.java */
/* JADX INFO: loaded from: classes11.dex */
public final class s1<T> extends xi.a<T, gj.b<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii.s f74829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f74830d;

    /* JADX INFO: compiled from: ObservableTimeInterval.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super gj.b<T>> f74831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f74832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ii.s f74833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f74834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public mi.b f74835f;

        @Override // mi.b
        public void dispose() {
            this.f74835f.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74835f.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74831b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74831b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            long jB = this.f74833d.b(this.f74832c);
            long j10 = this.f74834e;
            this.f74834e = jB;
            this.f74831b.onNext(new gj.b(t10, jB - j10, this.f74832c));
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74835f, bVar)) {
                this.f74835f = bVar;
                this.f74834e = this.f74833d.b(this.f74832c);
                this.f74831b.onSubscribe(this);
            }
        }

        public a(ii.r<? super gj.b<T>> rVar, TimeUnit timeUnit, ii.s sVar) {
            this.f74831b = rVar;
            this.f74833d = sVar;
            this.f74832c = timeUnit;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super gj.b<T>> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74830d, this.f74829c));
    }

    public s1(ii.p<T> pVar, TimeUnit timeUnit, ii.s sVar) {
        super(pVar);
        this.f74829c = sVar;
        this.f74830d = timeUnit;
    }
}
