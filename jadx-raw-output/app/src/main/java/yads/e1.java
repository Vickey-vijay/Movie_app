package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f76876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f76877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n43 f76878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f76879e;

    public e1(Context context, i1 i1Var, w0 w0Var, n43 n43Var) {
        this.f76875a = context;
        this.f76876b = i1Var;
        this.f76877c = w0Var;
        this.f76878d = n43Var;
        this.f76879e = new d1(this);
    }

    public final void a() {
        ((z0) this.f76877c).a(this.f76875a, (l1) this.f76879e);
        ((z0) this.f76877c).a(this.f76875a, this.f76879e);
    }

    public final void b() {
        this.f76876b.a(h1.f78007c);
        ((z0) this.f76877c).b(this.f76875a, this.f76879e);
        w0 w0Var = this.f76877c;
        Context context = this.f76875a;
        d1 d1Var = this.f76879e;
        z0 z0Var = (z0) w0Var;
        synchronized (z0Var.f85161a) {
            z0Var.f85163c.remove(d1Var);
            z0Var.b(context);
            mj.r rVar = mj.r.f64562a;
        }
        this.f76878d.a(ie1.f78608d, this);
    }

    public final void c() {
        this.f76878d.b(ie1.f78608d, this);
        ((z0) this.f76877c).a(this.f76875a, (l1) this.f76879e);
        ((z0) this.f76877c).a(this.f76875a, this.f76879e);
        this.f76876b.b(h1.f78007c);
    }

    public final void d() {
        this.f76876b.a(h1.f78008d);
    }

    public final void e() {
        this.f76876b.b(h1.f78008d);
    }

    public /* synthetic */ e1(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, g1 g1Var, dr0 dr0Var) {
        Context applicationContext = context.getApplicationContext();
        i1 i1Var = new i1(context, d4Var, lu2Var, v9Var, g1Var, dr0Var);
        z0 z0VarA = x0.a();
        n43 n43Var = n43.f80556b;
        this(applicationContext, i1Var, z0VarA, m43.a());
    }
}
