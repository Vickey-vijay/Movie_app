package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.so;

/* JADX INFO: loaded from: classes11.dex */
public final class so implements br2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f82710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f82711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ar2 f82712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f82713e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q10 f82714f;

    @Override // yads.br2
    public final void a(final g9 g9Var) {
        this.f82710b.a();
        if (this.f82714f == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f82711c.a(new Runnable() { // from class: cp.x9
            @Override // java.lang.Runnable
            public final void run() {
                so.a(this.f51692b, g9Var);
            }
        });
    }

    public so(Context context, rh1 rh1Var, mh1 mh1Var, ar2 ar2Var) {
        this.f82709a = context;
        this.f82710b = rh1Var;
        this.f82711c = mh1Var;
        this.f82712d = ar2Var;
    }

    public static final void a(so soVar, g9 g9Var) {
        zq2 zq2VarA = soVar.f82712d.a(soVar.f82709a, soVar, g9Var, null);
        soVar.f82713e.add(zq2VarA);
        String str = g9Var.f77696a;
        zq2VarA.f85497c.a(str);
        zq2VarA.F.f83522d = str;
        zq2VarA.a(soVar.f82714f);
        zq2VarA.b(g9Var);
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        zq2 zq2Var = (zq2) fy0Var;
        if (this.f82714f == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        zq2Var.a((q10) null);
        this.f82713e.remove(zq2Var);
    }

    @Override // yads.br2
    public final void a(hu3 hu3Var) {
        this.f82710b.a();
        this.f82714f = hu3Var;
        Iterator it = this.f82713e.iterator();
        while (it.hasNext()) {
            ((zq2) it.next()).a((q10) hu3Var);
        }
    }
}
