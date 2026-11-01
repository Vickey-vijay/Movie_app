package com.fyber.inneractive.sdk.dv.rewarded;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f15265a;

    public e(g gVar) {
        this.f15265a = gVar;
    }

    public final void onRewardedAdFailedToLoad(int i10) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f15265a.f15229g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f15265a.f15746a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            g gVar = this.f15265a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, gVar.f15746a, (i) gVar.f15747b, String.format("errorCode - %d", Integer.valueOf(i10)));
        }
    }

    public final void onRewardedAdLoaded() {
        g gVar = this.f15265a;
        if (gVar.f15229g != null) {
            gVar.g();
            this.f15265a.f15229g.g();
        }
    }
}
