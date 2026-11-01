package nk;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bk.l<Throwable, mj.r> f64818f;

    @Override // nk.u1
    public boolean u() {
        return false;
    }

    @Override // nk.u1
    public void v(Throwable th2) {
        this.f64818f.invoke(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r1(bk.l<? super Throwable, mj.r> lVar) {
        this.f64818f = lVar;
    }
}
