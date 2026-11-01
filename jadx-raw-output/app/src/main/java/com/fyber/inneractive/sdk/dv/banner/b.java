package com.fyber.inneractive.sdk.dv.banner;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends com.fyber.inneractive.sdk.dv.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f15236l;

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        l0 l0Var;
        this.f15229g = cVar;
        AdView adView = new AdView(o.f18599a);
        this.f15231i = adView;
        AdSize adSize = AdSize.BANNER;
        s0 s0Var = this.f15749d;
        if (s0Var != null && (l0Var = ((r0) s0Var).f15146c) != null && l0Var.f15131b == UnitDisplayType.MRECT) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.f15231i).setAdUnitId("FyberBanner");
        ((AdView) this.f15231i).setAdListener(this.f15236l);
        ((AdView) this.f15231i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f15235k;
    }

    public b(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f15234j = false;
        this.f15235k = false;
        this.f15236l = new a(this);
    }
}
