package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes7.dex */
public class K4 extends G {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4(AbstractC3757w0 abstractC3757w0, yg ygVar) {
        super(abstractC3757w0, ygVar);
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(ygVar, "waterfallInstances");
    }

    @Override // com.ironsource.G
    public void a(A a10, G.b bVar) {
        ck.p.j(a10, C3605n2.f30210p);
        ck.p.j(bVar, "loadSelection");
        IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " is ready to load");
        bVar.a().add(a10);
    }
}
