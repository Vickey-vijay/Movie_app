package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import yads.uk2;

/* JADX INFO: loaded from: classes3.dex */
public final class uk2 implements gy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er2 f83519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f83520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f83521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f83522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q10 f83523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t5 f83524f;

    public /* synthetic */ uk2(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var, er2 er2Var) {
        this(er2Var, new Handler(Looper.getMainLooper()), new y5(context, d4Var, lu2Var, w5Var));
    }

    @Override // yads.gy0
    public final void a(final l4 l4Var) {
        this.f83521c.a(l4Var.f79698b, l4Var.f79699c);
        this.f83520b.post(new Runnable() { // from class: cp.xa
            @Override // java.lang.Runnable
            public final void run() {
                uk2.a(l4Var, this);
            }
        });
    }

    public uk2(er2 er2Var, Handler handler, y5 y5Var) {
        this.f83519a = er2Var;
        this.f83520b = handler;
        this.f83521c = y5Var;
    }

    public static final void a(l4 l4Var, uk2 uk2Var) {
        l4 l4Var2 = new l4(l4Var.f79697a, l4Var.f79698b, l4Var.f79699c, uk2Var.f83522d);
        q10 q10Var = uk2Var.f83523e;
        if (q10Var != null) {
            q10Var.a(l4Var2);
        }
        t5 t5Var = uk2Var.f83524f;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    @Override // yads.gy0
    public final void a(wq2 wq2Var) {
        this.f83521c.a();
        er2 er2Var = this.f83519a;
        final dr2 dr2Var = new dr2(wq2Var, er2Var.f77187a, new rh1(er2Var.f77188b), new mh1());
        this.f83520b.post(new Runnable() { // from class: cp.ya
            @Override // java.lang.Runnable
            public final void run() {
                uk2.a(this.f51719b, dr2Var);
            }
        });
    }

    public static final void a(uk2 uk2Var, dr2 dr2Var) {
        q10 q10Var = uk2Var.f83523e;
        if (q10Var != null) {
            q10Var.a(dr2Var);
        }
        t5 t5Var = uk2Var.f83524f;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    public final void a(d4 d4Var) {
        this.f83521c.f84823e = new j9(d4Var);
    }

    public final void a(t5 t5Var) {
        this.f83524f = t5Var;
    }

    public final void a(fq2 fq2Var) {
        this.f83521c.f84824f = fq2Var;
    }
}
