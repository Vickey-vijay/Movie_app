package xi;

/* JADX INFO: compiled from: ObservableLift.java */
/* JADX INFO: loaded from: classes11.dex */
public final class v0<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii.o<? extends R, ? super T> f74867c;

    @Override // ii.k
    public void subscribeActual(ii.r<? super R> rVar) {
        try {
            this.f74487b.subscribe((ii.r) qi.a.e(this.f74867c.a(rVar), "Operator " + this.f74867c + " returned a null Observer"));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            ni.a.b(th2);
            ej.a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public v0(ii.p<T> pVar, ii.o<? extends R, ? super T> oVar) {
        super(pVar);
        this.f74867c = oVar;
    }
}
