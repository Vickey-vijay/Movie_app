package yads;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import yads.dr2;

/* JADX INFO: loaded from: classes2.dex */
public final class dr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wq2 f76782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk2 f76783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f76784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh1 f76785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f76786e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c00 f76787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f76788g;

    public final void a(final Activity activity) {
        this.f76784c.a();
        this.f76785d.a(new Runnable() { // from class: cp.z0
            @Override // java.lang.Runnable
            public final void run() {
                dr2.a(this.f51726b, activity);
            }
        });
    }

    public dr2(wq2 wq2Var, vk2 vk2Var, rh1 rh1Var, mh1 mh1Var) {
        this.f76782a = wq2Var;
        this.f76783b = vk2Var;
        this.f76784c = rh1Var;
        this.f76785d = mh1Var;
        this.f76787f = wq2Var.d();
        this.f76788g = wq2Var.e();
        wq2Var.a(vk2Var);
    }

    public static final void a(dr2 dr2Var, Activity activity) {
        if (!dr2Var.f76786e.getAndSet(true)) {
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(dr2Var.f76782a.a(activity));
            if (thM3461exceptionOrNullimpl != null) {
                dr2Var.f76783b.a(new n7(String.valueOf(thM3461exceptionOrNullimpl.getMessage())));
                return;
            }
            return;
        }
        dr2Var.f76783b.a(o7.f80953a);
    }
}
