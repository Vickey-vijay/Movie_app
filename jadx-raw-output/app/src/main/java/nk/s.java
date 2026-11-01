package nk;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class s extends u1 implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f64821f;

    @Override // nk.u1
    public boolean u() {
        return true;
    }

    @Override // nk.u1
    public void v(Throwable th2) {
        this.f64821f.s(t());
    }

    public s(t tVar) {
        this.f64821f = tVar;
    }

    @Override // nk.r
    public boolean a(Throwable th2) {
        return t().f0(th2);
    }

    @Override // nk.r
    public kotlinx.coroutines.g getParent() {
        return t();
    }
}
