package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements InterfaceC3572l7, InterfaceC3572l7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, AtomicBoolean> f30581a = kotlin.collections.a.m(mj.h.a(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), mj.h.a(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), mj.h.a(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC3572l7.a
    public void a(IronSource.a aVar, boolean z10) {
        ck.p.j(aVar, "adFormat");
        AtomicBoolean atomicBoolean = this.f30581a.get(aVar);
        if (atomicBoolean != null) {
            atomicBoolean.set(z10);
        }
    }

    @Override // com.ironsource.InterfaceC3572l7
    public boolean a(IronSource.a aVar) {
        ck.p.j(aVar, "adFormat");
        AtomicBoolean atomicBoolean = this.f30581a.get(aVar);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
