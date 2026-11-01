package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: loaded from: classes6.dex */
public final class Ac extends AbstractC2894h implements InterfaceC3160rh, Ck, ro, Sl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC2786cj f22360c;

    @Override // com.inmobi.media.AbstractC2863fj
    public final InterfaceC2786cj a() {
        return this.f22360c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac(C3070o1 c3070o1, Hc hc2) {
        super(c3070o1.f24941e);
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(hc2, "nativeCallbacks");
        this.f22360c = new Tc(c3070o1, hc2, this);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        Fc fc2;
        String strA;
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        if (interfaceC2786cj instanceof Cd) {
            fc2 = ((Cd) interfaceC2786cj).f22469j;
        } else if (interfaceC2786cj instanceof C3107pd) {
            fc2 = ((C3107pd) interfaceC2786cj).f25073h;
        } else if (interfaceC2786cj instanceof C3182se) {
            fc2 = ((C3182se) interfaceC2786cj).f25321f;
        } else {
            fc2 = interfaceC2786cj instanceof C3307xe ? ((C3307xe) interfaceC2786cj).f25720a : null;
        }
        return (fc2 == null || (strA = fc2.a(i10, d10)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.Sl
    public final void b() {
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        Sl sl2 = interfaceC2786cj instanceof Sl ? (Sl) interfaceC2786cj : null;
        if (sl2 != null) {
            sl2.b();
        }
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        Ck ck2 = interfaceC2786cj instanceof Ck ? (Ck) interfaceC2786cj : null;
        if (ck2 != null) {
            ck2.d();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void f() {
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        Sl sl2 = interfaceC2786cj instanceof Sl ? (Sl) interfaceC2786cj : null;
        if (sl2 != null) {
            sl2.f();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void h() {
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        Sl sl2 = interfaceC2786cj instanceof Sl ? (Sl) interfaceC2786cj : null;
        if (sl2 != null) {
            sl2.h();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void i() {
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        Sl sl2 = interfaceC2786cj instanceof Sl ? (Sl) interfaceC2786cj : null;
        if (sl2 != null) {
            sl2.i();
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        Fc fc2;
        String strA;
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        if (interfaceC2786cj instanceof Cd) {
            fc2 = ((Cd) interfaceC2786cj).f22469j;
        } else if (interfaceC2786cj instanceof C3107pd) {
            fc2 = ((C3107pd) interfaceC2786cj).f25073h;
        } else if (interfaceC2786cj instanceof C3182se) {
            fc2 = ((C3182se) interfaceC2786cj).f25321f;
        } else {
            fc2 = interfaceC2786cj instanceof C3307xe ? ((C3307xe) interfaceC2786cj).f25720a : null;
        }
        return (fc2 == null || (strA = fc2.a(d10)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.Sl
    public final void a(boolean z10) {
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        Sl sl2 = interfaceC2786cj instanceof Sl ? (Sl) interfaceC2786cj : null;
        if (sl2 != null) {
            sl2.a(z10);
        }
    }

    @Override // com.inmobi.media.InterfaceC3160rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        ck.p.j(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC2786cj interfaceC2786cj = this.f22360c;
        InterfaceC3160rh interfaceC3160rh = interfaceC2786cj instanceof InterfaceC3160rh ? (InterfaceC3160rh) interfaceC2786cj : null;
        if (interfaceC3160rh != null) {
            interfaceC3160rh.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC2863fj
    public final void a(InterfaceC2786cj interfaceC2786cj) {
        ck.p.j(interfaceC2786cj, "<set-?>");
        this.f22360c = interfaceC2786cj;
    }
}
