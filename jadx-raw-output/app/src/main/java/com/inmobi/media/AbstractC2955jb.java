package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2955jb extends AbstractC3317y implements InterfaceC2786cj, InterfaceC2828ea, InterfaceC2869g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3292x f24597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3169s1 f24598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hc f24599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f24600e;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-LoadingState", "Initialize Called");
        }
        this.f24598c.getClass();
        InterfaceC2786cj interfaceC2786cj = ((Cd) this).f22469j.f22639b.f22924c;
        Uc uc2 = interfaceC2786cj instanceof Uc ? (Uc) interfaceC2786cj : null;
        if (uc2 != null) {
            C3053n9 c3053n9 = uc2.f23639a.f22583a.f25676a.f24939c;
            if (c3053n9 != null) {
                c3053n9.a("NativeCreatedState", "Inflate Called");
            }
            uc2.f23640b.a(new Dd(uc2.f23639a, uc2.f23640b), uc2);
        }
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2955jb(C3292x c3292x, AbstractC3169s1 abstractC3169s1, Hc hc2, Ac ac2) {
        super(c3292x);
        ck.p.j(c3292x, "adComponent");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "publisherCallbacks");
        ck.p.j(ac2, "stateMachine");
        this.f24597b = c3292x;
        this.f24598c = abstractC3169s1;
        this.f24599d = hc2;
        this.f24600e = ac2;
    }

    @Override // com.inmobi.media.InterfaceC2828ea
    public final void e() {
        short s10;
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        if (Re.a() == null) {
            s10 = 2139;
        } else {
            s10 = 2203;
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), s10);
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-LoadingState", "onDestroy");
        }
        this.f24600e.a(new C3148r5(((Cd) this).f22469j, this.f24598c, this.f24597b), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-LoadingState", "transitionToLoadFailedState " + ((int) s10));
        }
        this.f24600e.a(new C2855fb(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10))), inMobiAdRequestStatus, this.f24598c, this.f24597b, this.f24599d, this.f24600e), this);
    }
}
