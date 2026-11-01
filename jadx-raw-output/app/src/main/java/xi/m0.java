package xi;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: ObservableFromPublisher.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m0<T> extends ii.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo.a<? extends T> f74711b;

    /* JADX INFO: compiled from: ObservableFromPublisher.java */
    public static final class a<T> implements ii.f<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public qo.c f74713c;

        @Override // mi.b
        public void dispose() {
            this.f74713c.cancel();
            this.f74713c = SubscriptionHelper.CANCELLED;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74713c == SubscriptionHelper.CANCELLED;
        }

        @Override // qo.b
        public void onComplete() {
            this.f74712b.onComplete();
        }

        @Override // qo.b
        public void onError(Throwable th2) {
            this.f74712b.onError(th2);
        }

        @Override // qo.b
        public void onNext(T t10) {
            this.f74712b.onNext(t10);
        }

        @Override // ii.f
        public void onSubscribe(qo.c cVar) {
            if (SubscriptionHelper.validate(this.f74713c, cVar)) {
                this.f74713c = cVar;
                this.f74712b.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public a(ii.r<? super T> rVar) {
            this.f74712b = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74711b.a(new a(rVar));
    }

    public m0(qo.a<? extends T> aVar) {
        this.f74711b = aVar;
    }
}
