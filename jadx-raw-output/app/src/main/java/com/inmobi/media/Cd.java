package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class Cd extends AbstractC2955jb {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3292x f22465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC3169s1 f22466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Hc f22467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ac f22468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Fc f22469j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(C3292x c3292x, InMobiJsonResponse inMobiJsonResponse, AbstractC3169s1 abstractC3169s1, Hc hc2, Ac ac2) {
        super(c3292x, abstractC3169s1, hc2, ac2);
        ck.p.j(c3292x, "adComponent");
        ck.p.j(inMobiJsonResponse, "inMobiJsonResponse");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "nativeCallback");
        ck.p.j(ac2, "stateMachine");
        this.f22465f = c3292x;
        this.f22466g = abstractC3169s1;
        this.f22467h = hc2;
        this.f22468i = ac2;
        this.f22469j = new Fc(new Ec(c3292x, inMobiJsonResponse, ac2));
    }

    public final void a(C2755be c2755be) {
        ck.p.j(c2755be, "pubData");
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeLoadingState", "onLoadSuccess - ad loaded successfully " + c2755be);
        }
        this.f22468i.a(new C3107pd(c2755be, this.f22465f, this.f22469j, this.f22466g, this.f22467h, this.f22468i), this);
    }
}
