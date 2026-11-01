package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class xv2 implements by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy0 f84709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f84710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i02 f84711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zs2 f84712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t42 f84713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d4 f84714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d22 f84715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ky0 f84716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v9 f84717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w02 f84718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84719k;

    public /* synthetic */ xv2(fy0 fy0Var, lu2 lu2Var) {
        this(fy0Var, lu2Var, new i02());
    }

    @Override // yads.fc
    public final List a() {
        i02 i02Var = this.f84711c;
        w02 w02Var = this.f84718j;
        i02Var.getClass();
        return i02.a(w02Var);
    }

    @Override // yads.by0
    public final void a(Context context) {
        this.f84719k = true;
        this.f84717i = null;
        this.f84718j = null;
        this.f84713e.f82882b.a();
        boolean z10 = ad1.f75480a;
    }

    @Override // yads.fc
    public final List b() {
        i02 i02Var = this.f84711c;
        w02 w02Var = this.f84718j;
        i02Var.getClass();
        return i02.b(w02Var);
    }

    @Override // yads.by0
    public final String getAdInfo() {
        return this.f84711c.c(this.f84718j);
    }

    public xv2(fy0 fy0Var, lu2 lu2Var, i02 i02Var) {
        this.f84709a = fy0Var;
        this.f84710b = lu2Var;
        this.f84711c = i02Var;
        Context contextG = fy0Var.g();
        d4 d4VarE = fy0Var.e();
        this.f84714f = d4VarE;
        this.f84715g = new d22(d4VarE);
        w5 w5VarF = fy0Var.f();
        this.f84712d = new zs2(d4VarE, lu2Var);
        this.f84713e = new t42(contextG, lu2Var, d4VarE, w5VarF);
        this.f84716h = new ky0(lu2Var);
    }

    @Override // yads.by0
    public final void a(Context context, v9 v9Var) {
        if (this.f84719k) {
            return;
        }
        this.f84717i = v9Var;
        this.f84709a.f85496b.a(v5.f83743c, null);
        this.f84713e.a(v9Var, new wv2(this), new vv2(this, context, v9Var));
    }

    @Override // yads.by0
    public final Object a(qy0 qy0Var, Activity activity) {
        Result.a aVar = Result.Companion;
        Object objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(o7.f80954b));
        v9 v9Var = this.f84717i;
        w02 w02Var = this.f84718j;
        if (v9Var == null || w02Var == null) {
            return objM3458constructorimpl;
        }
        d4 d4Var = this.f84714f;
        Object objA = this.f84716h.a(activity, new x1(v9Var, d4Var, qy0Var.f77265c, this.f84710b, w02Var, d4Var.f76572n, null, 64));
        this.f84717i = null;
        this.f84718j = null;
        return objA;
    }
}
