package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class do1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f76747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f76748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f76749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lo1 f76750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo1 f76751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eo1 f76752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sb2 f76753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final so1 f76754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public co1 f76755i;

    public /* synthetic */ do1(d4 d4Var, lu2 lu2Var, w5 w5Var, lo1 lo1Var, xo1 xo1Var, eo1 eo1Var, sb2 sb2Var) {
        this(d4Var, lu2Var, w5Var, lo1Var, xo1Var, eo1Var, sb2Var, new so1());
    }

    public final void a() {
        qq1 qq1Var;
        co1 co1Var = this.f76755i;
        this.f76749c.a(v5.f83743c, new ac(do2.f76757d, (co1Var == null || (qq1Var = co1Var.f76349b) == null) ? null : qq1Var.f81930b), null);
    }

    public do1(d4 d4Var, lu2 lu2Var, w5 w5Var, lo1 lo1Var, xo1 xo1Var, eo1 eo1Var, sb2 sb2Var, so1 so1Var) {
        this.f76747a = d4Var;
        this.f76748b = lu2Var;
        this.f76749c = w5Var;
        this.f76750d = lo1Var;
        this.f76751e = xo1Var;
        this.f76752f = eo1Var;
        this.f76753g = sb2Var;
        this.f76754h = so1Var;
    }

    public final void a(Context context) {
        co1 co1Var = this.f76755i;
        if (co1Var != null) {
            try {
                this.f76750d.a(co1Var.f76348a);
            } catch (Throwable th2) {
                qq1 qq1Var = co1Var.f76349b;
                String networkName = co1Var.f76350c.b().getNetworkName();
                boolean z10 = ad1.f75480a;
                Map mapG = nj.l0.g(mj.h.a("reason", nj.l0.g(mj.h.a("exception_in_adapter", th2.toString()))));
                xo1 xo1Var = this.f76751e;
                xo1Var.getClass();
                xo1Var.a(context, co2.f76355f, qq1Var, networkName, mapG);
            }
        }
    }

    public final void a(Context context, Object obj) {
        co1 co1VarA = this.f76752f.a(context);
        this.f76755i = co1VarA;
        if (co1VarA != null) {
            d4 d4Var = this.f76747a;
            d4Var.f76569k = co1VarA.f76349b;
            d4Var.f76570l = co1VarA.f76350c.b().getNetworkName();
            this.f76749c.a(v5.f83743c, null);
            qq1 qq1Var = co1VarA.f76349b;
            String networkName = co1VarA.f76350c.b().getNetworkName();
            xo1 xo1Var = this.f76751e;
            xo1Var.getClass();
            xo1Var.a(context, co2.f76356g, qq1Var, networkName, kotlin.collections.a.j());
            try {
                lo1 lo1Var = this.f76750d;
                com.monetization.ads.mediation.base.a aVar = co1VarA.f76348a;
                Map mapA = co1VarA.f76351d.a(context);
                ep1 ep1Var = co1VarA.f76351d;
                qq1 qq1Var2 = co1VarA.f76349b;
                ep1Var.getClass();
                lo1Var.a(context, aVar, obj, mapA, qq1Var2.f81931c);
                return;
            } catch (Throwable th2) {
                boolean z10 = ad1.f75480a;
                Map mapG = nj.l0.g(mj.h.a("reason", nj.l0.g(mj.h.a("exception_in_adapter", th2.toString()))));
                xo1 xo1Var2 = this.f76751e;
                xo1Var2.getClass();
                xo1Var2.a(context, co2.f76355f, qq1Var, networkName, mapG);
                a();
                a(context, obj);
                return;
            }
        }
        sb2 sb2Var = this.f76753g;
        lm2 lm2Var = sb2Var.f82585b;
        jk.k kVar = sb2.f82583c[0];
        zn znVar = (zn) lm2Var.f79854a.get();
        if (znVar == null || znVar.f85512r == z5.f85211b) {
            return;
        }
        tb2 tb2Var = sb2Var.f82584a;
        znVar.a(z5.f85213d);
        synchronized (znVar) {
            nk.j.d(znVar.f85499e, null, null, new qn(znVar, tb2Var, null), 3, null);
        }
    }
}
