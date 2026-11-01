package yads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import yads.jd1;

/* JADX INFO: loaded from: classes4.dex */
public final class jd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd1 f78999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk2 f79000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f79001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh1 f79002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f79003e = new AtomicBoolean(false);

    public final void a(final Activity activity) {
        this.f79001c.a();
        this.f79002d.a(new Runnable() { // from class: cp.j3
            @Override // java.lang.Runnable
            public final void run() {
                jd1.a(this.f51386b, activity);
            }
        });
    }

    public jd1(cd1 cd1Var, tk2 tk2Var, rh1 rh1Var, mh1 mh1Var) {
        this.f78999a = cd1Var;
        this.f79000b = tk2Var;
        this.f79001c = rh1Var;
        this.f79002d = mh1Var;
        cd1Var.a(tk2Var);
    }

    public static final void a(jd1 jd1Var, Activity activity) {
        if (!jd1Var.f79003e.getAndSet(true)) {
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(jd1Var.f78999a.a(activity));
            if (thM3461exceptionOrNullimpl != null) {
                jd1Var.f79000b.a(new n7(String.valueOf(thM3461exceptionOrNullimpl.getMessage())));
                return;
            }
            return;
        }
        jd1Var.f79000b.a(o7.f80953a);
    }
}
