package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f15262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f15263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f15264m;

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f15229g = cVar;
        RewardedAd.load(o.f18599a, "FyberRewarded", adRequest, this.f15262k);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f15231i != null;
    }

    public d(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f15262k = new a(this);
        this.f15263l = new b(this);
        this.f15264m = new c(this);
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f14820j = aVar;
        Object obj = this.f15231i;
        if (obj != null) {
            ((RewardedAd) obj).setFullScreenContentCallback(this.f15263l);
            ((RewardedAd) this.f15231i).show(activity, this.f15264m);
        }
    }
}
