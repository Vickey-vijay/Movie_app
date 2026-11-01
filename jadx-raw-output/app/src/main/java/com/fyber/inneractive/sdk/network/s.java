package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f16079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q0 f16080f;

    @Override // com.fyber.inneractive.sdk.network.m
    public final void a() {
        this.f16055b = true;
        this.f16054a = null;
        this.f16080f.f16085a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final String b() {
        return this.f16080f.r();
    }

    public s(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.flow.o oVar) {
        super(rVar, str, oVar);
        this.f16079e = inneractiveAdRequest;
        q0 q0Var = new q0(new q(this), inneractiveAdRequest, rVar);
        this.f16080f = q0Var;
        q0Var.f16088d = new r(this);
    }
}
