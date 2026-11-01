package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes5.dex */
public final class X7 implements N1 {
    @Override // com.ironsource.N1
    public void a(InterfaceC3593ma interfaceC3593ma) {
        ck.p.j(interfaceC3593ma, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(interfaceC3593ma);
    }

    @Override // com.ironsource.N1
    public void b(InterfaceC3593ma interfaceC3593ma) {
        ck.p.j(interfaceC3593ma, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(interfaceC3593ma);
    }
}
