package com.ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class W0 extends C3621o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3621o0 f27817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S0 f27818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3496h2 f27819i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(C3621o0 c3621o0, AbstractC3757w0 abstractC3757w0, E0.b bVar) {
        super(c3621o0, bVar);
        ck.p.j(c3621o0, "adTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f27817g = c3621o0;
        S0 s0A = C3772wf.a(abstractC3757w0, abstractC3757w0.e().c());
        ck.p.i(s0A, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f27818h = s0A;
    }

    public final void a(InterfaceC3496h2 interfaceC3496h2) {
        this.f27819i = interfaceC3496h2;
    }

    public final BaseAdAdapter<?, ?> a(B b10) {
        ck.p.j(b10, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(b10.u(), b10.h(), b10.i().b().b());
    }

    public final void c(AbstractRunnableC3526ie abstractRunnableC3526ie) {
        ck.p.j(abstractRunnableC3526ie, "task");
        C3789xf.a(C3789xf.f31600a, abstractRunnableC3526ie, 0L, 2, null);
    }

    public final String e(String str) {
        ck.p.j(str, C3605n2.f30213s);
        String strC = com.ironsource.mediationsdk.d.b().c(str);
        ck.p.i(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    public final S0 h() {
        return this.f27818h;
    }

    public final InterfaceC3496h2 i() {
        return this.f27819i;
    }

    public final P8.a l() {
        return Lb.f26968s.a().h();
    }

    public final String j() {
        return com.ironsource.mediationsdk.r.m().l();
    }

    public final C3450ea k() {
        return C3772wf.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(W0 w10, E0.b bVar) {
        super(w10, bVar);
        ck.p.j(w10, "adUnitTools");
        ck.p.j(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f27817g = w10.f27817g;
        this.f27818h = w10.f27818h;
        this.f27819i = w10.f27819i;
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        ck.p.j(networkSettings, "providerSettings");
        ck.p.j(aVar, "adFormat");
        ck.p.j(uuid, com.ironsource.sdk.controller.f.b.f30919c);
        return com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, uuid);
    }

    public final String a(long j10, String str) {
        ck.p.j(str, "instanceName");
        String strA = IronSourceUtils.a(j10, str);
        ck.p.i(strA, "getTransId(timeStamp, instanceName)");
        return strA;
    }
}
