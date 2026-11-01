package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* JADX INFO: loaded from: classes.dex */
public final class t implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f15425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f15426b;

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        this.f15426b.f15432h.set(false);
        this.f15426b.f15433i.a(iVar);
        this.f15425a.a();
    }

    public t(u uVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f15426b = uVar;
        this.f15425a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f15426b.f15432h.set(false);
        this.f15426b.f15433i.a(iVar, inneractiveInfrastructureError);
        this.f15425a.a(inneractiveInfrastructureError.description());
    }
}
