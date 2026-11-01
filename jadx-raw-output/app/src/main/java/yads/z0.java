package yads;

import android.app.Application;
import android.content.Context;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 implements w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f85159f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile z0 f85160g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f85161a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f85162b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f85163c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f85164d = new y0(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85165e;

    public final void a(Context context, l1 l1Var) {
        synchronized (this.f85161a) {
            this.f85162b.put(l1Var, null);
            if (!a()) {
                a(context);
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void b(Context context, l1 l1Var) {
        synchronized (this.f85161a) {
            this.f85162b.remove(l1Var);
            b(context);
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void b(Context context) {
        synchronized (this.f85161a) {
            if (this.f85162b.isEmpty() && this.f85163c.isEmpty()) {
                try {
                    if (a()) {
                        Context applicationContext = context.getApplicationContext();
                        ck.p.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.f85164d);
                        this.f85165e = false;
                    }
                } catch (Throwable unused) {
                    boolean z10 = ad1.f75480a;
                }
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void a(Context context, d1 d1Var) {
        synchronized (this.f85161a) {
            this.f85163c.put(d1Var, null);
            if (!a()) {
                a(context);
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f85161a) {
            z10 = this.f85165e;
        }
        return z10;
    }

    public final void a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            ck.p.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.f85164d);
            this.f85165e = true;
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
        }
    }
}
