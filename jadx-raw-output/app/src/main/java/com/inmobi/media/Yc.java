package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class Yc extends O6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3292x f23841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InMobiJsonResponse f23842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC3169s1 f23843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f23844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f23845j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yc(C3292x c3292x, InMobiJsonResponse inMobiJsonResponse, AbstractC3169s1 abstractC3169s1, Hc hc2, Ac ac2) {
        super(c3292x, abstractC3169s1, hc2, ac2);
        ck.p.j(c3292x, "adComponent");
        ck.p.j(inMobiJsonResponse, "inMobiJsonResponse");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "nativeCallback");
        ck.p.j(ac2, "stateMachine");
        this.f23841f = c3292x;
        this.f23842g = inMobiJsonResponse;
        this.f23843h = abstractC3169s1;
        this.f23844i = hc2;
        this.f23845j = ac2;
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeFetchedState", "Initialize Called - ad fetched successfully");
        }
        InterfaceC3028m9 interfaceC3028m9L2 = l();
        if (interfaceC3028m9L2 != null) {
            ((C3053n9) interfaceC3028m9L2).a("AUM-FetchedState", "Initialize Called");
        }
        this.f23272c.getClass();
        C3292x c3292x = this.f25754a;
        C3019m0 c3019m0 = c3292x.f25676a.f24942f;
        G g10 = c3292x.f25677b;
        c3019m0.getClass();
        ck.p.j(g10, "adContext");
        nk.j.d(c3019m0.f24793a, null, null, new C2920i0(g10, c3019m0, null), 3, null);
        P4.a(k(), new N6(this, null));
    }
}
