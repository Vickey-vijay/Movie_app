package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f15255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f15256l;

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f15229g = cVar;
        InterstitialAd interstitialAd = new InterstitialAd(o.f18599a);
        this.f15231i = interstitialAd;
        interstitialAd.setAdListener(this.f15255k);
        ((InterstitialAd) this.f15231i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f15231i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        Object obj = this.f15231i;
        return obj != null && ((InterstitialAd) obj).isLoaded();
    }

    public g(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f15255k = new e(this);
        this.f15256l = new f(this);
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.f14820j = aVar;
        Object obj = this.f15231i;
        if (obj != null) {
            ((InterstitialAd) obj).setAdListener(this.f15256l);
            ((InterstitialAd) this.f15231i).show();
        }
    }
}
