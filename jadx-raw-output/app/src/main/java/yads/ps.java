package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.ps;

/* JADX INFO: loaded from: classes10.dex */
public final class ps implements hd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f81555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f81556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f81557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd1 f81558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd1 f81559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii2 f81560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f81561g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w00 f81562h;

    @Override // yads.hd1
    public final void a(final g9 g9Var) {
        this.f81556b.a();
        if (this.f81562h == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f81557c.a(new Runnable() { // from class: cp.l8
            @Override // java.lang.Runnable
            public final void run() {
                ps.a(this.f51430b, g9Var);
            }
        });
    }

    public final void b(final g9 g9Var) {
        this.f81557c.a(new Runnable() { // from class: cp.m8
            @Override // java.lang.Runnable
            public final void run() {
                ps.b(this.f51450b, g9Var);
            }
        });
    }

    public static final void b(ps psVar, g9 g9Var) {
        boolean zB;
        psVar.f81560f.getClass();
        if (ii2.a(g9Var)) {
            qd1 qd1Var = psVar.f81559e;
            synchronized (qd1Var) {
                zB = qd1Var.f81832a.b();
            }
            if (zB) {
                psVar.a(g9Var, new ns(psVar, g9Var), "render");
            }
        }
    }

    public ps(Context context, rh1 rh1Var, mh1 mh1Var, gd1 gd1Var, qd1 qd1Var, ii2 ii2Var) {
        this.f81555a = context;
        this.f81556b = rh1Var;
        this.f81557c = mh1Var;
        this.f81558d = gd1Var;
        this.f81559e = qd1Var;
        this.f81560f = ii2Var;
    }

    public final void a(g9 g9Var, w00 w00Var, String str) {
        g9 g9VarA = g9.a(g9Var, null, str, 2047);
        fd1 fd1VarA = this.f81558d.a(this.f81555a, this, g9VarA, new ms(this, g9VarA));
        this.f81561g.add(fd1VarA);
        String str2 = g9VarA.f77696a;
        fd1VarA.f85497c.a(str2);
        fd1VarA.F.f82679f = str2;
        fd1VarA.a(w00Var);
        fd1VarA.b(g9VarA);
    }

    public static final void a(ps psVar, g9 g9Var) {
        jd1 jd1Var;
        psVar.f81560f.getClass();
        if (ii2.a(g9Var)) {
            qd1 qd1Var = psVar.f81559e;
            synchronized (qd1Var) {
                ki2 ki2Var = qd1Var.f81832a;
                qd1Var.f81833b.getClass();
                jd1Var = (jd1) ki2Var.a(oy0.a(g9Var));
            }
            if (jd1Var != null) {
                w00 w00Var = psVar.f81562h;
                if (w00Var != null) {
                    w00Var.a(jd1Var);
                    return;
                }
                return;
            }
            psVar.a(g9Var, new os(psVar), "default");
            return;
        }
        psVar.a(g9Var, new os(psVar), "default");
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        fd1 fd1Var = (fd1) fy0Var;
        if (this.f81562h == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        fd1Var.a((w00) null);
        this.f81561g.remove(fd1Var);
    }

    @Override // yads.hd1
    public final void a(ct3 ct3Var) {
        this.f81556b.a();
        this.f81562h = ct3Var;
    }
}
