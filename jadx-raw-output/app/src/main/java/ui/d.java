package ui;

import ii.k;
import ii.r;

/* JADX INFO: compiled from: FlowableFromObservable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d<T> extends ii.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k<T> f72880c;

    /* JADX INFO: compiled from: FlowableFromObservable.java */
    public static final class a<T> implements r<T>, qo.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final qo.b<? super T> f72881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f72882c;

        @Override // qo.c
        public void request(long j10) {
        }

        @Override // qo.c
        public void cancel() {
            this.f72882c.dispose();
        }

        @Override // ii.r
        public void onComplete() {
            this.f72881b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f72881b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f72881b.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            this.f72882c = bVar;
            this.f72881b.onSubscribe(this);
        }

        public a(qo.b<? super T> bVar) {
            this.f72881b = bVar;
        }
    }

    @Override // ii.e
    public void n(qo.b<? super T> bVar) {
        this.f72880c.subscribe(new a(bVar));
    }

    public d(k<T> kVar) {
        this.f72880c = kVar;
    }
}
