package com.fyber.inneractive.sdk.dv.interstitial;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.AdListener;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f15253a;

    public e(g gVar) {
        this.f15253a = gVar;
    }

    public final void onAdFailedToLoad(int i10) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f15253a.f15229g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f15253a.f15746a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            g gVar = this.f15253a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, gVar.f15746a, (i) gVar.f15747b, String.format("errorCode - %d", Integer.valueOf(i10)));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        g gVar = this.f15253a;
        if (gVar.f15229g != null) {
            gVar.g();
            this.f15253a.f15229g.g();
        }
    }
}
