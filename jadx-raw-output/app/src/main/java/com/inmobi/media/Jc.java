package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: loaded from: classes7.dex */
public final class Jc extends AbstractC2863fj implements InterfaceC3160rh, Ck, InterfaceC2843f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC2786cj f22924c;

    @Override // com.inmobi.media.AbstractC2863fj
    public final InterfaceC2786cj a() {
        return this.f22924c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Jc(Ec ec2) {
        ck.p.j(ec2, "nativeAdUnitComponent");
        C3292x c3292x = ec2.f22583a;
        ck.p.j(c3292x, "adComponent");
        super(c3292x.f25676a.f24941e);
        this.f22924c = new Uc(ec2, this);
    }

    @Override // com.inmobi.media.InterfaceC2843f
    public final Object a(rj.c cVar) {
        InterfaceC2786cj interfaceC2786cj = this.f22924c;
        InterfaceC2843f interfaceC2843f = interfaceC2786cj instanceof InterfaceC2843f ? (InterfaceC2843f) interfaceC2786cj : null;
        if (interfaceC2843f == null) {
            return mj.r.f64562a;
        }
        Object objA = interfaceC2843f.a(cVar);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC2786cj interfaceC2786cj = this.f22924c;
        Ck ck2 = interfaceC2786cj instanceof Ck ? (Ck) interfaceC2786cj : null;
        if (ck2 != null) {
            ck2.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC3160rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        ck.p.j(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC2786cj interfaceC2786cj = this.f22924c;
        InterfaceC3160rh interfaceC3160rh = interfaceC2786cj instanceof InterfaceC3160rh ? (InterfaceC3160rh) interfaceC2786cj : null;
        if (interfaceC3160rh != null) {
            interfaceC3160rh.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC2863fj
    public final void a(InterfaceC2786cj interfaceC2786cj) {
        ck.p.j(interfaceC2786cj, "<set-?>");
        this.f22924c = interfaceC2786cj;
    }
}
