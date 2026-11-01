package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class dg3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eg3 f76672b;

    public dg3(eg3 eg3Var) {
        this.f76672b = eg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eg3 eg3Var = this.f76672b;
        if (eg3Var.f77068d || !eg3Var.f77065a.a()) {
            this.f76672b.f77067c.postDelayed(this, 200L);
            return;
        }
        ((yf3) this.f76672b.f77066b).a();
        eg3 eg3Var2 = this.f76672b;
        eg3Var2.f77068d = true;
        eg3Var2.f77067c.removeCallbacksAndMessages(null);
        eg3Var2.f77069e = false;
    }
}
