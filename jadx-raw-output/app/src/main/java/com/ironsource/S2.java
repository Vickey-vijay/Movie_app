package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;

/* JADX INFO: loaded from: classes6.dex */
public final class S2 extends C3672r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ISBannerSize f27569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(C3476g0 c3476g0, ISBannerSize iSBannerSize) {
        super(c3476g0);
        ck.p.j(c3476g0, "adProperties");
        this.f27569b = iSBannerSize;
    }

    @Override // com.ironsource.C3672r0, com.ironsource.InterfaceC3496h2
    public void a(com.ironsource.mediationsdk.i iVar) {
        ck.p.j(iVar, "auctionRequestParams");
        super.a(iVar);
        iVar.a(this.f27569b);
    }
}
