package nk;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f64788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<mj.r> f64789c;

    @Override // java.lang.Runnable
    public void run() {
        this.f64789c.z(this.f64788b, mj.r.f64562a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f2(h0 h0Var, l<? super mj.r> lVar) {
        this.f64788b = h0Var;
        this.f64789c = lVar;
    }
}
