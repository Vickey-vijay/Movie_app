package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import jk.k;
import kotlin.Result;
import mj.h;
import mj.r;
import nj.l0;
import nj.s;
import yads.a9;
import yads.ad1;
import yads.by0;
import yads.co1;
import yads.co2;
import yads.d4;
import yads.do1;
import yads.ep1;
import yads.fy0;
import yads.hq1;
import yads.ip1;
import yads.lm2;
import yads.lu2;
import yads.mo1;
import yads.qq1;
import yads.qy0;
import yads.sb2;
import yads.t8;
import yads.v9;
import yads.w5;
import yads.xo1;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy0 f42993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do1 f42994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f42995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f42996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo1 f42997e;

    @Override // yads.by0
    public final void a(Context context, v9 v9Var) {
        this.f42994b.a(context, this.f42996d);
    }

    @Override // yads.by0
    public final String getAdInfo() {
        return null;
    }

    @Override // yads.by0
    public final Object a(qy0 qy0Var, Activity activity) {
        Object objM3458constructorimpl;
        co1 co1Var;
        try {
            Result.a aVar = Result.Companion;
            MediatedInterstitialAdapter mediatedInterstitialAdapter = this.f42995c.f42992a;
            if (mediatedInterstitialAdapter != null) {
                lm2 lm2Var = this.f42996d.f42990c;
                k kVar = a.f42987e[0];
                lm2Var.getClass();
                lm2Var.f79854a = new WeakReference(qy0Var);
                t8 t8Var = this.f42993a.f85500f;
                if (t8Var.b()) {
                    ((a9) t8Var.f82917f.getValue()).onAdWillDisplay();
                }
                mediatedInterstitialAdapter.showInterstitial(activity);
            }
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null && (co1Var = this.f42994b.f76755i) != null) {
            Context applicationContext = activity.getApplicationContext();
            boolean z10 = ad1.f75480a;
            Map mapG = l0.g(h.a("reason", l0.g(h.a("exception_in_adapter", thM3461exceptionOrNullimpl.toString()))));
            xo1 xo1Var = this.f42997e;
            qq1 qq1Var = co1Var.f76349b;
            String networkName = co1Var.f76350c.b().getNetworkName();
            xo1Var.getClass();
            xo1Var.a(applicationContext, co2.f76355f, qq1Var, networkName, mapG);
        }
        return objM3458constructorimpl;
    }

    public c(fy0 fy0Var, v9 v9Var, hq1 hq1Var) {
        this.f42993a = fy0Var;
        d4 d4VarE = fy0Var.e();
        lu2 lu2VarH = fy0Var.h();
        ep1 ep1Var = new ep1(d4VarE);
        xo1 xo1Var = new xo1(d4VarE, lu2VarH, v9Var);
        this.f42997e = xo1Var;
        ip1 ip1Var = new ip1(new mo1(hq1Var.c(), ep1Var, xo1Var));
        w5 w5VarF = fy0Var.f();
        sb2 sb2Var = new sb2(fy0Var, hq1Var);
        b bVar = new b();
        this.f42995c = bVar;
        do1 do1Var = new do1(d4VarE, lu2VarH, w5VarF, bVar, xo1Var, ip1Var, sb2Var);
        this.f42994b = do1Var;
        this.f42996d = new a(fy0Var, do1Var);
    }

    @Override // yads.fc
    public final List b() {
        return s.k();
    }

    @Override // yads.fc
    public final List a() {
        return s.k();
    }

    @Override // yads.by0
    public final void a(Context context) {
        this.f42993a.f85500f.a();
        this.f42994b.a(context);
    }
}
