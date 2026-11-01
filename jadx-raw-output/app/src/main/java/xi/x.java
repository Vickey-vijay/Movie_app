package xi;

/* JADX INFO: compiled from: ObservableDistinctUntilChanged.java */
/* JADX INFO: loaded from: classes11.dex */
public final class x<T, K> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.o<? super T, K> f74934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.d<? super K, ? super K> f74935d;

    /* JADX INFO: compiled from: ObservableDistinctUntilChanged.java */
    public static final class a<T, K> extends si.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final oi.o<? super T, K> f74936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final oi.d<? super K, ? super K> f74937h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public K f74938i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f74939j;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            if (this.f71909e) {
                return;
            }
            if (this.f71910f != 0) {
                this.f71906b.onNext((Object) t10);
                return;
            }
            try {
                K kApply = this.f74936g.apply(t10);
                if (this.f74939j) {
                    boolean zTest = this.f74937h.test(this.f74938i, kApply);
                    this.f74938i = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f74939j = true;
                    this.f74938i = kApply;
                }
                this.f71906b.onNext((Object) t10);
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // ri.h
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f71908d.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f74936g.apply(tPoll);
                if (!this.f74939j) {
                    this.f74939j = true;
                    this.f74938i = kApply;
                    return tPoll;
                }
                if (!this.f74937h.test(this.f74938i, kApply)) {
                    this.f74938i = kApply;
                    return tPoll;
                }
                this.f74938i = kApply;
            }
        }

        public a(ii.r<? super T> rVar, oi.o<? super T, K> oVar, oi.d<? super K, ? super K> dVar) {
            super(rVar);
            this.f74936g = oVar;
            this.f74937h = dVar;
        }

        @Override // ri.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74934c, this.f74935d));
    }

    public x(ii.p<T> pVar, oi.o<? super T, K> oVar, oi.d<? super K, ? super K> dVar) {
        super(pVar);
        this.f74934c = oVar;
        this.f74935d = dVar;
    }
}
