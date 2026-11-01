package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2804db extends AbstractC2971k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f24231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f24232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Hc f24233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2804db(short s10, InMobiAdRequestStatus inMobiAdRequestStatus, C3070o1 c3070o1, Hc hc2, Ac ac2) {
        super(null, c3070o1, ac2);
        ck.p.j(inMobiAdRequestStatus, "status");
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(hc2, "publisherCallbacks");
        ck.p.j(ac2, "stateMachine");
        this.f24231d = s10;
        this.f24232e = inMobiAdRequestStatus;
        this.f24233f = hc2;
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9C = this.f24645b.c();
        if (interfaceC3028m9C != null) {
            short s10 = this.f24231d;
            ((C3053n9) interfaceC3028m9C).b("AUM-LoadDroppedState", "Initialize Called " + ((int) s10) + com.ironsource.Z7.f27998r + this.f24232e.getStatusCode() + com.ironsource.Z7.f27998r + this.f24232e.getMessage());
        }
        P4.a(this.f24645b.a(), new C2778cb(this, null));
        C3019m0 c3019m0B = this.f24645b.b();
        nk.j.d(c3019m0B.f24793a, null, null, new C2870g0(c3019m0B, this.f24231d, null), 3, null);
        AbstractC3169s1 abstractC3169s1 = this.f24644a;
        if (abstractC3169s1 != null) {
            abstractC3169s1.a();
        }
        j();
    }
}
