package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;

/* JADX INFO: renamed from: com.ironsource.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3595mc implements InterfaceC3577lc {
    @Override // com.ironsource.InterfaceC3577lc
    public void a(O9 o10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        try {
            IronSourceNetwork.destroyAd(o10);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + o10.e() + " failed. error: " + e10.getMessage());
        }
    }
}
