package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.ts;

/* JADX INFO: loaded from: classes11.dex */
public final class ts implements br2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f83156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f83157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ar2 f83158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tr2 f83159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii2 f83160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f83161g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q10 f83162h;

    @Override // yads.br2
    public final void a(final g9 g9Var) {
        this.f83156b.a();
        if (this.f83162h == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f83157c.a(new Runnable() { // from class: cp.na
            @Override // java.lang.Runnable
            public final void run() {
                ts.a(this.f51475b, g9Var);
            }
        });
    }

    public final void b(final g9 g9Var) {
        this.f83157c.a(new Runnable() { // from class: cp.oa
            @Override // java.lang.Runnable
            public final void run() {
                ts.b(this.f51495b, g9Var);
            }
        });
    }

    public static final void b(ts tsVar, g9 g9Var) {
        boolean zB;
        tsVar.f83160f.getClass();
        if (ii2.a(g9Var)) {
            tr2 tr2Var = tsVar.f83159e;
            synchronized (tr2Var) {
                zB = tr2Var.f83153a.b();
            }
            if (zB) {
                tsVar.a(g9Var, new qs(tsVar, g9Var), "render");
            }
        }
    }

    public ts(Context context, rh1 rh1Var, mh1 mh1Var, ar2 ar2Var, tr2 tr2Var, ii2 ii2Var) {
        this.f83155a = context;
        this.f83156b = rh1Var;
        this.f83157c = mh1Var;
        this.f83158d = ar2Var;
        this.f83159e = tr2Var;
        this.f83160f = ii2Var;
    }

    public final void a(g9 g9Var, q10 q10Var, String str) {
        g9 g9VarA = g9.a(g9Var, null, str, 2047);
        zq2 zq2VarA = this.f83158d.a(this.f83155a, this, g9VarA, new ss(this, g9VarA));
        this.f83161g.add(zq2VarA);
        String str2 = g9VarA.f77696a;
        zq2VarA.f85497c.a(str2);
        zq2VarA.F.f83522d = str2;
        zq2VarA.a(q10Var);
        zq2VarA.b(g9VarA);
    }

    public static final void a(ts tsVar, g9 g9Var) {
        dr2 dr2Var;
        tsVar.f83160f.getClass();
        if (ii2.a(g9Var)) {
            tr2 tr2Var = tsVar.f83159e;
            synchronized (tr2Var) {
                ki2 ki2Var = tr2Var.f83153a;
                tr2Var.f83154b.getClass();
                dr2Var = (dr2) ki2Var.a(oy0.a(g9Var));
            }
            if (dr2Var != null) {
                q10 q10Var = tsVar.f83162h;
                if (q10Var != null) {
                    q10Var.a(dr2Var);
                    return;
                }
                return;
            }
            tsVar.a(g9Var, new rs(tsVar), "default");
            return;
        }
        tsVar.a(g9Var, new rs(tsVar), "default");
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        zq2 zq2Var = (zq2) fy0Var;
        if (this.f83162h == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        zq2Var.a((q10) null);
        this.f83161g.remove(zq2Var);
    }

    @Override // yads.br2
    public final void a(hu3 hu3Var) {
        this.f83156b.a();
        this.f83162h = hu3Var;
    }
}
