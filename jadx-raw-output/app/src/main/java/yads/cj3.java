package yads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes10.dex */
public final class cj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f76296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj3 f76297b;

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51676b.b(str, j10, j11);
                }
            });
        }
    }

    public final void b(final pa0 pa0Var) {
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51218b.d(pa0Var);
                }
            });
        }
    }

    public final void c(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        dj3 dj3Var = this.f76297b;
        int i10 = ib3.f78556a;
        wn0 wn0Var = (wn0) dj3Var;
        ((kb0) wn0Var.f84275a.f85532o).c(pa0Var);
        wn0Var.f84275a.getClass();
        wn0Var.f84275a.getClass();
    }

    public final void d(pa0 pa0Var) {
        dj3 dj3Var = this.f76297b;
        int i10 = ib3.f78556a;
        wn0 wn0Var = (wn0) dj3Var;
        wn0Var.f84275a.getClass();
        ((kb0) wn0Var.f84275a.f85532o).d(pa0Var);
    }

    public cj3(Handler handler, wn0 wn0Var) {
        this.f76296a = (Handler) ni.a(handler);
        this.f76297b = wn0Var;
    }

    public final void a(final String str) {
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51255b.b(str);
                }
            });
        }
    }

    public final void b(String str, long j10, long j11) {
        dj3 dj3Var = this.f76297b;
        int i10 = ib3.f78556a;
        ((kb0) ((wn0) dj3Var).f84275a.f85532o).b(str, j10, j11);
    }

    public final void a(final pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51648b.c(pa0Var);
                }
            });
        }
    }

    public final void b(String str) {
        dj3 dj3Var = this.f76297b;
        int i10 = ib3.f78556a;
        ((kb0) ((wn0) dj3Var).f84275a.f85532o).b(str);
    }

    public final void a(final int i10, final long j10) {
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51723b.b(i10, j10);
                }
            });
        }
    }

    public final void c(final int i10, final long j10) {
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51295b.a(j10, i10);
                }
            });
        }
    }

    public final void a(final mx0 mx0Var, final va0 va0Var) {
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51621b.b(mx0Var, va0Var);
                }
            });
        }
    }

    public final void b(int i10, long j10) {
        dj3 dj3Var = this.f76297b;
        int i11 = ib3.f78556a;
        ((kb0) ((wn0) dj3Var).f84275a.f85532o).a(i10, j10);
    }

    public final void a(Object obj, long j10) {
        dj3 dj3Var = this.f76297b;
        int i10 = ib3.f78556a;
        ((wn0) dj3Var).a(obj, j10);
    }

    public final void a(long j10, int i10) {
        dj3 dj3Var = this.f76297b;
        int i11 = ib3.f78556a;
        ((kb0) ((wn0) dj3Var).f84275a.f85532o).b(i10, j10);
    }

    public final void b(mx0 mx0Var, va0 va0Var) {
        dj3 dj3Var = this.f76297b;
        int i10 = ib3.f78556a;
        dj3Var.getClass();
        wn0 wn0Var = (wn0) this.f76297b;
        wn0Var.f84275a.getClass();
        ((kb0) wn0Var.f84275a.f85532o).b(mx0Var, va0Var);
    }

    public final void a(Exception exc) {
        dj3 dj3Var = this.f76297b;
        int i10 = ib3.f78556a;
        ((kb0) ((wn0) dj3Var).f84275a.f85532o).c(exc);
    }

    public final void b(final Exception exc) {
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51700b.a(exc);
                }
            });
        }
    }

    public final void a(oj3 oj3Var) {
        dj3 dj3Var = this.f76297b;
        int i10 = ib3.f78556a;
        ((wn0) dj3Var).a(oj3Var);
    }

    public final void b(final oj3 oj3Var) {
        Handler handler = this.f76296a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cp.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51271b.a(oj3Var);
                }
            });
        }
    }

    public final void a(final Surface surface) {
        if (this.f76296a != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f76296a.post(new Runnable() { // from class: cp.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51235b.a(surface, jElapsedRealtime);
                }
            });
        }
    }
}
