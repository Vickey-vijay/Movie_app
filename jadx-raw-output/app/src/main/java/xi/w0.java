package xi;

/* JADX INFO: compiled from: ObservableMap.java */
/* JADX INFO: loaded from: classes11.dex */
public final class w0<T, U> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.o<? super T, ? extends U> f74889c;

    /* JADX INFO: compiled from: ObservableMap.java */
    public static final class a<T, U> extends si.a<T, U> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final oi.o<? super T, ? extends U> f74890g;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            if (this.f71909e) {
                return;
            }
            if (this.f71910f != 0) {
                this.f71906b.onNext(null);
                return;
            }
            try {
                this.f71906b.onNext((Object) qi.a.e(this.f74890g.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // ri.h
        public U poll() throws Exception {
            T tPoll = this.f71908d.poll();
            if (tPoll != null) {
                return (U) qi.a.e(this.f74890g.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        public a(ii.r<? super U> rVar, oi.o<? super T, ? extends U> oVar) {
            super(rVar);
            this.f74890g = oVar;
        }

        @Override // ri.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super U> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74889c));
    }

    public w0(ii.p<T> pVar, oi.o<? super T, ? extends U> oVar) {
        super(pVar);
        this.f74889c = oVar;
    }
}
