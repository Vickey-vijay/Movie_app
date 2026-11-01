package rk;

/* JADX INFO: compiled from: SendingCollector.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class q<T> implements qk.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pk.q<T> f66797b;

    @Override // qk.d
    public Object emit(T t10, rj.c<? super mj.r> cVar) {
        Object objU = this.f66797b.u(t10, cVar);
        return objU == sj.a.f() ? objU : mj.r.f64562a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(pk.q<? super T> qVar) {
        this.f66797b = qVar;
    }
}
