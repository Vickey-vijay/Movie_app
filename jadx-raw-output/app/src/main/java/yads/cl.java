package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f76305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl f76306b;

    public final void a(final Exception exc) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51484b.c(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51400b.d(exc);
                }
            });
        }
    }

    public final void c(Exception exc) {
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        ((kb0) ((wn0) dlVar).f84275a.f85532o).a(exc);
    }

    public final void d(Exception exc) {
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        ((kb0) ((wn0) dlVar).f84275a.f85532o).b(exc);
    }

    public cl(Handler handler, wn0 wn0Var) {
        this.f76305a = (Handler) ni.a(handler);
        this.f76306b = wn0Var;
    }

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.j0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51380b.b(str, j10, j11);
                }
            });
        }
    }

    public final void b(final pa0 pa0Var) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51332b.d(pa0Var);
                }
            });
        }
    }

    public final void a(final String str) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51442b.b(str);
                }
            });
        }
    }

    public final void b(String str, long j10, long j11) {
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        ((kb0) ((wn0) dlVar).f84275a.f85532o).a(str, j10, j11);
    }

    public final void c(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        wn0 wn0Var = (wn0) dlVar;
        ((kb0) wn0Var.f84275a.f85532o).a(pa0Var);
        wn0Var.f84275a.getClass();
        wn0Var.f84275a.getClass();
    }

    public final void d(pa0 pa0Var) {
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        wn0 wn0Var = (wn0) dlVar;
        wn0Var.f84275a.getClass();
        ((kb0) wn0Var.f84275a.f85532o).b(pa0Var);
    }

    public final void a(final pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51352b.c(pa0Var);
                }
            });
        }
    }

    public final void b(String str) {
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        ((kb0) ((wn0) dlVar).f84275a.f85532o).a(str);
    }

    public final void a(final mx0 mx0Var, final va0 va0Var) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51460b.b(mx0Var, va0Var);
                }
            });
        }
    }

    public final void a(long j10) {
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        ((kb0) ((wn0) dlVar).f84275a.f85532o).a(j10);
    }

    public final void b(mx0 mx0Var, va0 va0Var) {
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        dlVar.getClass();
        wn0 wn0Var = (wn0) this.f76306b;
        wn0Var.f84275a.getClass();
        ((kb0) wn0Var.f84275a.f85532o).a(mx0Var, va0Var);
    }

    public final void a(boolean z10) {
        dl dlVar = this.f76306b;
        int i10 = ib3.f78556a;
        ((wn0) dlVar).a(z10);
    }

    public final void a(int i10, long j10, long j11) {
        dl dlVar = this.f76306b;
        int i11 = ib3.f78556a;
        ((kb0) ((wn0) dlVar).f84275a.f85532o).a(i10, j10, j11);
    }

    public final void b(final long j10) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51318b.a(j10);
                }
            });
        }
    }

    public final void b(final boolean z10) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51418b.a(z10);
                }
            });
        }
    }

    public final void b(final int i10, final long j10, final long j11) {
        Handler handler = this.f76305a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51366b.a(i10, j10, j11);
                }
            });
        }
    }
}
