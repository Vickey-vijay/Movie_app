package xi;

/* JADX INFO: compiled from: ObservableFilter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g0<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.q<? super T> f74588c;

    /* JADX INFO: compiled from: ObservableFilter.java */
    public static final class a<T> extends si.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final oi.q<? super T> f74589g;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            if (this.f71910f != 0) {
                this.f71906b.onNext(null);
                return;
            }
            try {
                if (this.f74589g.test(t10)) {
                    this.f71906b.onNext((Object) t10);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // ri.h
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f71908d.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f74589g.test(tPoll));
            return tPoll;
        }

        public a(ii.r<? super T> rVar, oi.q<? super T> qVar) {
            super(rVar);
            this.f74589g = qVar;
        }

        @Override // ri.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74588c));
    }

    public g0(ii.p<T> pVar, oi.q<? super T> qVar) {
        super(pVar);
        this.f74588c = qVar;
    }
}
