package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3743v3 extends G {
    @Override // com.ironsource.G
    public void a(A a10, G.b bVar) {
        String str;
        ck.p.j(a10, C3605n2.f30210p);
        ck.p.j(bVar, "loadSelection");
        if (!a10.u()) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.p() + " (non-bidder) is ready to load");
            bVar.a().add(a10);
            return;
        }
        bVar.a(true);
        if (bVar.e()) {
            str = "Advanced Loading: Starting to load bidder " + a10.p() + ". No other instances will be loaded at the same time.";
            bVar.a().add(a10);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + a10.p() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(a10.d().name() + " - " + str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3743v3(AbstractC3757w0 abstractC3757w0, yg ygVar) {
        super(abstractC3757w0, ygVar);
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(ygVar, "waterfallInstances");
    }

    @Override // com.ironsource.G
    public boolean a(G.b bVar) {
        ck.p.j(bVar, "loadSelection");
        return super.a(bVar) || bVar.d();
    }
}
