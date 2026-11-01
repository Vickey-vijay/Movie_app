package com.fyber.inneractive.sdk.dv.banner;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.handler.e;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.x;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f15233a;

    public a(b bVar) {
        this.f15233a = bVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        InneractiveAdRequest inneractiveAdRequest = this.f15233a.f15746a;
        String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
        com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
        b bVar = this.f15233a;
        e.a(spotId, aVar, bVar.f15746a, (i) bVar.f15747b, loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        b bVar = this.f15233a;
        c cVar = bVar.f15230h;
        if (cVar != null) {
            cVar.w();
        } else {
            bVar.f15234j = true;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        b bVar = this.f15233a;
        com.fyber.inneractive.sdk.dv.c cVar = bVar.f15229g;
        if (cVar != null) {
            bVar.f15235k = true;
            cVar.g();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        i iVar;
        l0 l0Var;
        c cVar = this.f15233a.f15230h;
        if (cVar != null) {
            cVar.a(cVar.y(), false, Float.NaN, Float.NaN);
            x xVar = cVar.f15333b;
            if (xVar == null || (iVar = (i) ((b) xVar).f15747b) == null) {
                return;
            }
            b0.a(iVar);
            s0 s0Var = ((b) cVar.f15333b).f15749d;
            if (s0Var == null || (l0Var = ((r0) s0Var).f15146c) == null) {
                return;
            }
            b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, l0Var.f15131b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
        }
    }
}
