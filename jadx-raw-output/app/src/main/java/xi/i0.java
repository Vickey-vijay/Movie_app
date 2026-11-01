package xi;

/* JADX INFO: compiled from: ObservableFromArray.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i0<T> extends ii.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T[] f74607b;

    /* JADX INFO: compiled from: ObservableFromArray.java */
    public static final class a<T> extends si.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T[] f74609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f74612f;

        @Override // mi.b
        public void dispose() {
            this.f74612f = true;
        }

        @Override // ri.d
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f74611e = true;
            return 1;
        }

        public void a() {
            T[] tArr = this.f74609c;
            int length = tArr.length;
            for (int i10 = 0; i10 < length && !isDisposed(); i10++) {
                T t10 = tArr[i10];
                if (t10 == null) {
                    this.f74608b.onError(new NullPointerException("The " + i10 + "th element is null"));
                    return;
                }
                this.f74608b.onNext(t10);
            }
            if (isDisposed()) {
                return;
            }
            this.f74608b.onComplete();
        }

        @Override // ri.h
        public void clear() {
            this.f74610d = this.f74609c.length;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74612f;
        }

        @Override // ri.h
        public boolean isEmpty() {
            return this.f74610d == this.f74609c.length;
        }

        @Override // ri.h
        public T poll() {
            int i10 = this.f74610d;
            T[] tArr = this.f74609c;
            if (i10 == tArr.length) {
                return null;
            }
            this.f74610d = i10 + 1;
            return (T) qi.a.e(tArr[i10], "The array element is null");
        }

        public a(ii.r<? super T> rVar, T[] tArr) {
            this.f74608b = rVar;
            this.f74609c = tArr;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        a aVar = new a(rVar, this.f74607b);
        rVar.onSubscribe(aVar);
        if (aVar.f74611e) {
            return;
        }
        aVar.a();
    }

    public i0(T[] tArr) {
        this.f74607b = tArr;
    }
}
