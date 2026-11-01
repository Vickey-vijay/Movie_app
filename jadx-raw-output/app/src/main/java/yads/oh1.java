package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class oh1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt f81044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1 f81045d;

    public oh1(ph1 ph1Var, long j10, xw1 xw1Var) {
        this.f81045d = ph1Var;
        this.f81043b = j10;
        this.f81044c = xw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dt dtVar = this.f81044c;
        if (dtVar.f76794b == ct.f76416b) {
            ((xw1) dtVar).run();
            this.f81045d.f81415a.postDelayed(this, this.f81043b);
        }
    }
}
