package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2855fb extends AbstractC2971k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f24364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f24365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Hc f24366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2855fb(Map map, InMobiAdRequestStatus inMobiAdRequestStatus, AbstractC3169s1 abstractC3169s1, InterfaceC3276w8 interfaceC3276w8, Hc hc2, Ac ac2) {
        super(abstractC3169s1, interfaceC3276w8, ac2);
        ck.p.j(map, "telemetryPayload");
        ck.p.j(inMobiAdRequestStatus, "status");
        ck.p.j(interfaceC3276w8, "adManagerComponent");
        ck.p.j(hc2, "publisherCallbacks");
        ck.p.j(ac2, "stateMachine");
        this.f24364d = map;
        this.f24365e = inMobiAdRequestStatus;
        this.f24366f = hc2;
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9C = this.f24645b.c();
        if (interfaceC3028m9C != null) {
            ((C3053n9) interfaceC3028m9C).b("AUM-LoadFailedState", "Initialize Called " + this.f24364d + com.ironsource.Z7.f27998r + this.f24365e.getStatusCode() + com.ironsource.Z7.f27998r + this.f24365e.getMessage());
        }
        P4.a(this.f24645b.a(), new C2829eb(this, null));
        C3019m0 c3019m0B = this.f24645b.b();
        Map map = this.f24364d;
        c3019m0B.getClass();
        ck.p.j(map, "payload");
        nk.j.d(c3019m0B.f24793a, null, null, new C2895h0(c3019m0B, map, null), 3, null);
        AbstractC3169s1 abstractC3169s1 = this.f24644a;
        if (abstractC3169s1 != null) {
            abstractC3169s1.a();
        }
        j();
    }
}
