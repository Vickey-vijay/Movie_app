package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import java.util.Map;
import yads.lo1;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements lo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediatedInterstitialAdapter f42992a;

    @Override // yads.lo1
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        ((MediatedInterstitialAdapter) aVar).onInvalidate();
    }

    @Override // yads.lo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = (MediatedInterstitialAdapter) aVar;
        this.f42992a = mediatedInterstitialAdapter;
        mediatedInterstitialAdapter.loadInterstitial(context, (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj, map, map2);
    }
}
