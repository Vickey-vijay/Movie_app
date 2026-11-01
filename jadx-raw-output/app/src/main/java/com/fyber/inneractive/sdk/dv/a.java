package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.flow.x;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f15229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.banner.c f15230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f15231i;

    public abstract void a(AdRequest adRequest, c cVar);

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        this.f15229g = null;
        this.f15231i = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final com.fyber.inneractive.sdk.response.e b() {
        return (i) this.f15747b;
    }

    public a(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar);
        this.f15747b = iVar;
    }
}
