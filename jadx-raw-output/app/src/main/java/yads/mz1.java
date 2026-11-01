package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class mz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f80478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f80479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f80480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nk.l0 f80481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f80482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oz1 f80483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q42 f80484g;

    public /* synthetic */ mz1(Context context, lu2 lu2Var, d4 d4Var, w5 w5Var, nk.l0 l0Var) {
        Context applicationContext = context.getApplicationContext();
        fz1 fz1Var = new fz1(new h62(d4Var, lu2Var, context, w5Var, l0Var));
        this(lu2Var, d4Var, w5Var, l0Var, applicationContext, new oz1(d4Var, lu2Var, fz1Var), new q42(context, lu2Var, w5Var, fz1Var, l0Var));
    }

    public final void a() {
        q42 q42Var = this.f80484g;
        j42 j42Var = q42Var.f81705b;
        h62 h62Var = j42Var.f78914c;
        ke0 ke0Var = h62Var.f78078b;
        synchronized (ke0Var.f79402d) {
            ke0Var.f79400b.a();
            mj.r rVar = mj.r.f64562a;
        }
        h62Var.f78079c.a();
        j42Var.f78912a.getClass();
        j42Var.f78913b.getClass();
        q42Var.f81706c.a();
        kotlinx.coroutines.d.d(q42Var.f81704a, null, 1, null);
    }

    public mz1(lu2 lu2Var, d4 d4Var, w5 w5Var, nk.l0 l0Var, Context context, oz1 oz1Var, q42 q42Var) {
        this.f80478a = lu2Var;
        this.f80479b = d4Var;
        this.f80480c = w5Var;
        this.f80481d = l0Var;
        this.f80482e = context;
        this.f80483f = oz1Var;
        this.f80484g = q42Var;
    }
}
