package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes6.dex */
public abstract class O6 extends AbstractC3317y implements InterfaceC2786cj, InterfaceC2828ea, InterfaceC2869g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3292x f23271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3169s1 f23272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hc f23273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f23274e;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O6(C3292x c3292x, AbstractC3169s1 abstractC3169s1, Hc hc2, Ac ac2) {
        super(c3292x);
        ck.p.j(c3292x, "adComponent");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "publisherCallbacks");
        ck.p.j(ac2, "stateMachine");
        this.f23271b = c3292x;
        this.f23272c = abstractC3169s1;
        this.f23273d = hc2;
        this.f23274e = ac2;
    }

    @Override // com.inmobi.media.InterfaceC2828ea
    public final void e() {
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-FetchedState", "transitionToLoadFailedState Called");
        }
        this.f23274e.a(new C2855fb(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), inMobiAdRequestStatus, this.f23272c, this.f23271b, this.f23273d, this.f23274e), this);
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-FetchedState", "onDestroy Called");
        }
        this.f23274e.a(new C3148r5(null, this.f23272c, this.f23271b), this);
    }
}
