package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class k12 implements j52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22 f79278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f79279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f79280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l12 f79281d;

    public tb3 a(int i10, Context context, boolean z10) {
        l12 l12Var = this.f79281d;
        View viewA = l12Var != null ? l12Var.f79682c.a() : null;
        if (viewA == null) {
            return new qb3(pb3.f81343g, null, null);
        }
        if (kl3.b(viewA)) {
            return new qb3(pb3.f81344h, null, null);
        }
        xl3 xl3VarA = kl3.f79470a.a(viewA);
        String str = xl3VarA.f84629b;
        this.f79280c = str;
        if (xl3VarA.f84628a < 1) {
            return new qb3(pb3.f81345i, null, str);
        }
        if (a(viewA, i10) && !z10) {
            return new qb3(pb3.f81341e, null, this.f79280c);
        }
        String str2 = this.f79279b.f83819k;
        eg0[] eg0VarArr = eg0.f77061b;
        return (!ck.p.e(str2, "divkit") || this.f79279b.H) ? ((ny1) this.f79278a).a(z10) : new rb3(nj.s.k());
    }

    public final kp2 b() {
        return ((ny1) this.f79278a).e();
    }

    public k12(ny1 ny1Var, v9 v9Var) {
        this.f79278a = ny1Var;
        this.f79279b = v9Var;
    }

    public final boolean a() {
        View viewA;
        l12 l12Var = this.f79281d;
        if (l12Var == null || (viewA = l12Var.f79682c.a()) == null) {
            return true;
        }
        return kl3.b(viewA);
    }

    public final boolean a(View view, int i10) {
        int iA = kl3.a(view);
        this.f79280c = "actualPercent: " + iA + ", expectedPercent: " + i10;
        return iA < i10;
    }

    public final void a(l12 l12Var) {
        ((ny1) this.f79278a).f80871d = l12Var;
        this.f79281d = l12Var;
    }
}
