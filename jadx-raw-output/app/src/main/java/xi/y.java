package xi;

/* JADX INFO: compiled from: ObservableDoAfterNext.java */
/* JADX INFO: loaded from: classes11.dex */
public final class y<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.g<? super T> f74956c;

    /* JADX INFO: compiled from: ObservableDoAfterNext.java */
    public static final class a<T> extends si.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final oi.g<? super T> f74957g;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            this.f71906b.onNext((Object) t10);
            if (this.f71910f == 0) {
                try {
                    this.f74957g.accept(t10);
                } catch (Throwable th2) {
                    c(th2);
                }
            }
        }

        @Override // ri.h
        public T poll() throws Exception {
            T tPoll = this.f71908d.poll();
            if (tPoll != null) {
                this.f74957g.accept(tPoll);
            }
            return tPoll;
        }

        public a(ii.r<? super T> rVar, oi.g<? super T> gVar) {
            super(rVar);
            this.f74957g = gVar;
        }

        @Override // ri.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74956c));
    }

    public y(ii.p<T> pVar, oi.g<? super T> gVar) {
        super(pVar);
        this.f74956c = gVar;
    }
}
