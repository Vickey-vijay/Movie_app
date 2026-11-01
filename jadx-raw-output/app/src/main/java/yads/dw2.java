package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class dw2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f76819j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile dw2 f76820k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile nt2 f76821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f76822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f76823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f76824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76826f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76827g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f76828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f76829i;

    public final boolean a() {
        boolean z10;
        synchronized (f76819j) {
            z10 = this.f76829i;
        }
        return z10;
    }

    public final nt2 a(Context context) {
        nt2 nt2VarA;
        nt2 nt2Var = this.f76821a;
        if (nt2Var != null) {
            return nt2Var;
        }
        synchronized (f76819j) {
            nt2 nt2Var2 = this.f76821a;
            if (nt2Var2 == null) {
                zy.f85651a.getClass();
                nt2VarA = ((cz) yy.a(context)).a();
                this.f76821a = nt2VarA;
            } else {
                nt2VarA = nt2Var2;
            }
        }
        return nt2VarA;
    }

    public final Boolean b() {
        Boolean bool;
        synchronized (f76819j) {
            bool = this.f76823c;
        }
        return bool;
    }

    public final boolean c() {
        boolean z10;
        synchronized (f76819j) {
            z10 = this.f76825e;
        }
        return z10;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (f76819j) {
            bool = this.f76822b;
        }
        return bool;
    }

    public final void a(Context context, nt2 nt2Var) {
        synchronized (f76819j) {
            this.f76821a = nt2Var;
            zy.f85651a.getClass();
            ((cz) yy.a(context)).a(nt2Var);
            mj.r rVar = mj.r.f64562a;
        }
    }
}
