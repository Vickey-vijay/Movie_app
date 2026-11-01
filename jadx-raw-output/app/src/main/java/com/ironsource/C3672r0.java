package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3672r0 implements InterfaceC3496h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3476g0 f30582a;

    public C3672r0(C3476g0 c3476g0) {
        ck.p.j(c3476g0, "adProperties");
        this.f30582a = c3476g0;
    }

    @Override // com.ironsource.InterfaceC3496h2
    public void a(com.ironsource.mediationsdk.i iVar) {
        ck.p.j(iVar, "auctionRequestParams");
        iVar.b(this.f30582a.c());
        iVar.a(this.f30582a.a().toString());
        iVar.a(Boolean.TRUE);
    }
}
