package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import yads.x92;

/* JADX INFO: loaded from: classes7.dex */
public final class x92 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v92 f84499g = new v92();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f84500h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile x92 f84501i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u92 f84504c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84507f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f84502a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f84503b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s92 f84505d = new s92();

    public final void a(ld3 ld3Var) {
        synchronized (this.f84502a) {
            this.f84505d.b(ld3Var);
            if (!this.f84505d.a()) {
                u92 u92Var = this.f84504c;
                xo2 xo2Var = u92Var.f83401c;
                Context context = u92Var.f83399a;
                xo2Var.getClass();
                xo2.a(context, "om_sdk_js_request_tag");
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void b(ld3 ld3Var) {
        boolean z10;
        synchronized (this.f84502a) {
            z10 = !this.f84507f;
            if (z10) {
                this.f84505d.a(ld3Var);
            }
            mj.r rVar = mj.r.f64562a;
        }
        if (z10) {
            a();
        } else {
            ld3Var.a();
        }
    }

    public final void c() {
        synchronized (this.f84502a) {
            this.f84503b.removeCallbacksAndMessages(null);
            this.f84506e = false;
            mj.r rVar = mj.r.f64562a;
        }
    }

    public x92(Context context) {
        this.f84504c = new u92(context);
    }

    public final void b() {
        this.f84503b.postDelayed(new Runnable() { // from class: cp.oc
            @Override // java.lang.Runnable
            public final void run() {
                x92.a(this.f51497b);
            }
        }, f84500h);
    }

    public final void a() {
        boolean z10;
        synchronized (this.f84502a) {
            z10 = true;
            if (this.f84506e) {
                z10 = false;
            } else {
                this.f84506e = true;
            }
            mj.r rVar = mj.r.f64562a;
        }
        if (z10) {
            b();
            this.f84504c.a(new w92(this));
        }
    }

    public static final void a(x92 x92Var) {
        u92 u92Var = x92Var.f84504c;
        xo2 xo2Var = u92Var.f83401c;
        Context context = u92Var.f83399a;
        xo2Var.getClass();
        xo2.a(context, "om_sdk_js_request_tag");
        synchronized (x92Var.f84502a) {
            x92Var.f84507f = true;
            mj.r rVar = mj.r.f64562a;
        }
        x92Var.c();
        x92Var.f84505d.b();
    }
}
