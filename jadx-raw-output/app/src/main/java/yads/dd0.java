package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class dd0 implements rk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok0 f76637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mk0 f76638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f76639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gd0 f76640e;

    public final void a(final mx0 mx0Var) {
        Handler handler = this.f76640e.f77760u;
        handler.getClass();
        handler.post(new Runnable() { // from class: cp.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f51624b.b(mx0Var);
            }
        });
    }

    public dd0(gd0 gd0Var, ok0 ok0Var) {
        this.f76640e = gd0Var;
        this.f76637b = ok0Var;
    }

    public final void b(mx0 mx0Var) {
        gd0 gd0Var = this.f76640e;
        if (gd0Var.f77755p == 0 || this.f76639d) {
            return;
        }
        Looper looper = gd0Var.f77759t;
        looper.getClass();
        this.f76638c = gd0Var.a(looper, this.f76637b, mx0Var, false);
        this.f76640e.f77753n.add(this);
    }

    @Override // yads.rk0
    public final void release() {
        Handler handler = this.f76640e.f77760u;
        handler.getClass();
        ib3.a(handler, new Runnable() { // from class: cp.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f51650b.a();
            }
        });
    }

    public final /* synthetic */ void a() {
        if (this.f76639d) {
            return;
        }
        mk0 mk0Var = this.f76638c;
        if (mk0Var != null) {
            mk0Var.a(this.f76637b);
        }
        this.f76640e.f77753n.remove(this);
        this.f76639d = true;
    }
}
