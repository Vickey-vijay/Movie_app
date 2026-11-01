package com.monetization.ads.mediation.interstitial;

import ck.s;
import jk.k;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import yads.do1;
import yads.fy0;
import yads.lm2;
import yads.mm2;
import yads.w51;
import yads.wb;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k[] f42987e = {s.f(new MutablePropertyReference1Impl(a.class, "contentController", "getContentController()Lcom/monetization/ads/fullscreen/FullscreenContentController;", 0)), wb.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do1 f42988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w51 f42989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f42990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f42991d;

    public /* synthetic */ a(fy0 fy0Var, do1 do1Var) {
        this(fy0Var, do1Var, new w51(do1Var));
    }

    public a(fy0 fy0Var, do1 do1Var, w51 w51Var) {
        this.f42988a = do1Var;
        this.f42989b = w51Var;
        this.f42990c = mm2.a(null);
        this.f42991d = mm2.a(fy0Var);
    }
}
