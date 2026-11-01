package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public final class aw2 implements by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy0 f75639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f75640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i02 f75641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zs2 f75642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t42 f75643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d4 f75644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d22 f75645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ky0 f75646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v9 f75647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w02 f75648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f75649k;

    @Override // yads.by0
    public final void a(Context context) {
        this.f75649k = true;
        this.f75647i = null;
        this.f75648j = null;
        this.f75643e.f82882b.a();
        boolean z10 = ad1.f75480a;
    }

    @Override // yads.fc
    public final List b() {
        i02 i02Var = this.f75641c;
        w02 w02Var = this.f75648j;
        i02Var.getClass();
        return i02.b(w02Var);
    }

    @Override // yads.by0
    public final String getAdInfo() {
        return this.f75641c.c(this.f75648j);
    }

    public aw2(fy0 fy0Var, lu2 lu2Var, i02 i02Var) {
        this.f75639a = fy0Var;
        this.f75640b = lu2Var;
        this.f75641c = i02Var;
        Context contextG = fy0Var.g();
        d4 d4VarE = fy0Var.e();
        this.f75644f = d4VarE;
        this.f75645g = new d22(d4VarE);
        w5 w5VarF = fy0Var.f();
        this.f75642d = new zs2(d4VarE, lu2Var);
        this.f75643e = new t42(contextG, lu2Var, d4VarE, w5VarF);
        this.f75646h = new ky0(lu2Var);
    }

    @Override // yads.by0
    public final void a(Context context, v9 v9Var) {
        if (this.f75649k) {
            return;
        }
        this.f75647i = v9Var;
        this.f75639a.f85496b.a(v5.f83743c, null);
        this.f75643e.a(v9Var, new zv2(this), new yv2(this, context, v9Var));
    }

    @Override // yads.by0
    public final Object a(qy0 qy0Var, Activity activity) {
        wq2 wq2Var = (wq2) qy0Var;
        Result.a aVar = Result.Companion;
        Object objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(o7.f80954b));
        v9 v9Var = this.f75647i;
        w02 w02Var = this.f75648j;
        if (v9Var == null || w02Var == null) {
            return objM3458constructorimpl;
        }
        d4 d4Var = this.f75644f;
        Object objA = this.f75646h.a(activity, new x1(v9Var, d4Var, wq2Var.f77265c, this.f75640b, w02Var, d4Var.f76572n, null, 64));
        this.f75647i = null;
        this.f75648j = null;
        return objA;
    }

    @Override // yads.fc
    public final List a() {
        return nj.s.k();
    }
}
