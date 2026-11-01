package nk;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class q extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.c<?> f64815f;

    @Override // nk.u1
    public boolean u() {
        return true;
    }

    @Override // nk.u1
    public void v(Throwable th2) {
        kotlinx.coroutines.c<?> cVar = this.f64815f;
        cVar.S(cVar.w(t()));
    }

    public q(kotlinx.coroutines.c<?> cVar) {
        this.f64815f = cVar;
    }
}
