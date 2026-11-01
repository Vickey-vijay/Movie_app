package yads;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class yp1 implements by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy0 f85081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do1 f85082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aq1 f85083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hr2 f85084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo1 f85085e;

    @Override // yads.by0
    public final void a(Context context) {
        this.f85081a.f85500f.a();
        this.f85082b.a(context);
    }

    @Override // yads.by0
    public final String getAdInfo() {
        return null;
    }

    public yp1(fy0 fy0Var, v9 v9Var, hq1 hq1Var) {
        this.f85081a = fy0Var;
        d4 d4VarE = fy0Var.e();
        lu2 lu2VarH = fy0Var.h();
        ep1 ep1Var = new ep1(d4VarE);
        xo1 xo1Var = new xo1(d4VarE, lu2VarH, v9Var);
        this.f85085e = xo1Var;
        zp1 zp1Var = new zp1(new mo1(hq1Var.c(), ep1Var, xo1Var));
        w5 w5VarF = fy0Var.f();
        sb2 sb2Var = new sb2(fy0Var, hq1Var);
        aq1 aq1Var = new aq1();
        this.f85083c = aq1Var;
        do1 do1Var = new do1(d4VarE, lu2VarH, w5VarF, aq1Var, xo1Var, zp1Var, sb2Var);
        this.f85082b = do1Var;
        this.f85084d = new hr2(fy0Var, do1Var);
    }

    @Override // yads.fc
    public final List b() {
        return nj.s.k();
    }

    @Override // yads.by0
    public final void a(Context context, v9 v9Var) {
        this.f85082b.a(context, this.f85084d);
    }

    @Override // yads.by0
    public final Object a(qy0 qy0Var, Activity activity) {
        Object objM3458constructorimpl;
        co1 co1Var;
        wq2 wq2Var = (wq2) qy0Var;
        try {
            Result.a aVar = Result.Companion;
            MediatedRewardedAdapter mediatedRewardedAdapter = this.f85083c.f75593a;
            if (mediatedRewardedAdapter != null) {
                lm2 lm2Var = this.f85084d.f78335c;
                jk.k kVar = hr2.f78332e[0];
                lm2Var.getClass();
                lm2Var.f79854a = new WeakReference(wq2Var);
                t8 t8Var = this.f85081a.f85500f;
                if (t8Var.b()) {
                    ((a9) t8Var.f82917f.getValue()).onAdWillDisplay();
                }
                mediatedRewardedAdapter.showRewardedAd(activity);
            }
            objM3458constructorimpl = Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null && (co1Var = this.f85082b.f76755i) != null) {
            Context applicationContext = activity.getApplicationContext();
            boolean z10 = ad1.f75480a;
            Map mapG = nj.l0.g(mj.h.a("reason", nj.l0.g(mj.h.a("exception_in_adapter", thM3461exceptionOrNullimpl.toString()))));
            xo1 xo1Var = this.f85085e;
            qq1 qq1Var = co1Var.f76349b;
            String networkName = co1Var.f76350c.b().getNetworkName();
            xo1Var.getClass();
            xo1Var.a(applicationContext, co2.f76355f, qq1Var, networkName, mapG);
        }
        return objM3458constructorimpl;
    }

    @Override // yads.fc
    public final List a() {
        return nj.s.k();
    }
}
