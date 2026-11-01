package nk;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements kotlinx.coroutines.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f64845b;

    @Override // kotlinx.coroutines.b
    public void a(Throwable th2) {
        this.f64845b.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f64845b + ']';
    }

    public z0(y0 y0Var) {
        this.f64845b = y0Var;
    }
}
