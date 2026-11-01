package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class fn0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final po2 f77454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vp2 f77455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f77456d;

    @Override // java.lang.Runnable
    public final void run() {
        tp2 tp2Var;
        if (this.f77454b.i()) {
            this.f77454b.c("canceled-at-delivery");
            return;
        }
        vp2 vp2Var = this.f77455c;
        im3 im3Var = vp2Var.f83982c;
        if (im3Var == null) {
            this.f77454b.a(vp2Var.f83980a);
        } else {
            po2 po2Var = this.f77454b;
            synchronized (po2Var.f81492f) {
                tp2Var = po2Var.f81493g;
            }
            if (tp2Var != null) {
                tp2Var.a(im3Var);
            }
        }
        if (this.f77455c.f83983d) {
            this.f77454b.a("intermediate-response");
        } else {
            this.f77454b.c("done");
        }
        Runnable runnable = this.f77456d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public fn0(po2 po2Var, vp2 vp2Var, sr srVar) {
        this.f77454b = po2Var;
        this.f77455c = vp2Var;
        this.f77456d = srVar;
    }
}
