package yads;

import android.os.Handler;
import android.os.SystemClock;
import yads.zb2;

/* JADX INFO: loaded from: classes2.dex */
public final class zb2 implements wb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f85302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yb2 f85303c = yb2.f84877b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ac2 f85304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w63 f85305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f85308h;

    public final void a(long j10, ac2 ac2Var) {
        a();
        this.f85304d = ac2Var;
        this.f85306f = j10;
        this.f85307g = j10;
        if (this.f85301a) {
            this.f85302b.post(new Runnable() { // from class: cp.xc
                @Override // java.lang.Runnable
                public final void run() {
                    zb2.a(this.f51697b);
                }
            });
        } else {
            c();
        }
    }

    public final void b() {
        if (yb2.f84878c == this.f85303c) {
            this.f85303c = yb2.f84879d;
            this.f85302b.removeCallbacksAndMessages(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f85308h;
            this.f85308h = jElapsedRealtime;
            long j11 = this.f85306f - j10;
            this.f85306f = j11;
            long jMax = (long) Math.max(0.0d, j11);
            w63 w63Var = this.f85305e;
            if (w63Var != null) {
                w63Var.a(jMax, this.f85307g - jMax);
            }
        }
    }

    public final void c() {
        this.f85303c = yb2.f84878c;
        this.f85308h = SystemClock.elapsedRealtime();
        long jMin = (long) Math.min(200.0d, this.f85306f);
        if (jMin > 0) {
            this.f85302b.postDelayed(new xb2(this), jMin);
            return;
        }
        ac2 ac2Var = this.f85304d;
        if (ac2Var != null) {
            ac2Var.a();
        }
        a();
    }

    public final void d() {
        if (yb2.f84879d == this.f85303c) {
            c();
        }
    }

    public zb2(boolean z10, Handler handler) {
        this.f85301a = z10;
        this.f85302b = handler;
    }

    public static final void a(zb2 zb2Var) {
        zb2Var.c();
    }

    public final void a() {
        yb2 yb2Var = yb2.f84877b;
        if (yb2Var == this.f85303c) {
            return;
        }
        this.f85303c = yb2Var;
        this.f85304d = null;
        this.f85302b.removeCallbacksAndMessages(null);
    }
}
