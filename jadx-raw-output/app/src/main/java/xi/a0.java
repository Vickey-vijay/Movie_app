package xi;

/* JADX INFO: compiled from: ObservableDoOnLifecycle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a0<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.g<? super mi.b> f74488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.a f74489d;

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new si.g(rVar, this.f74488c, this.f74489d));
    }

    public a0(ii.k<T> kVar, oi.g<? super mi.b> gVar, oi.a aVar) {
        super(kVar);
        this.f74488c = gVar;
        this.f74489d = aVar;
    }
}
