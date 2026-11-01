package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f15267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f15268l;

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f15229g = cVar;
        RewardedAd rewardedAd = new RewardedAd(o.f18599a, "FyberRewarded");
        this.f15231i = rewardedAd;
        rewardedAd.loadAd(adRequest, this.f15267k);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        Object obj = this.f15231i;
        if (obj != null) {
            return ((RewardedAd) obj).isLoaded();
        }
        return false;
    }

    public g(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f15267k = new e(this);
        this.f15268l = new f(this);
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f14820j = aVar;
        ((RewardedAd) this.f15231i).show(activity, this.f15268l);
    }
}
