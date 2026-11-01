package com.monetization.ads.mediation.banner;

import jk.k;
import yads.do1;
import yads.dp1;
import yads.km;
import yads.lm2;
import yads.mm2;
import yads.w51;
import yads.wb;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements MediatedBannerAdapter.MediatedBannerAdapterListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f42965f = {wb.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/banner/BannerAdLoadController;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do1 f42966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dp1 f42967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w51 f42968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f42969d;

    public /* synthetic */ a(km kmVar, do1 do1Var, dp1 dp1Var) {
        this(kmVar, do1Var, dp1Var, new w51(do1Var));
    }

    public a(km kmVar, do1 do1Var, dp1 dp1Var, w51 w51Var) {
        this.f42966a = do1Var;
        this.f42967b = dp1Var;
        this.f42968c = w51Var;
        this.f42969d = mm2.a(kmVar);
    }
}
