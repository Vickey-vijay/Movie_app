package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: renamed from: com.inmobi.media.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3107pd extends AbstractC3317y implements InterfaceC3160rh, InterfaceC2786cj, I, InterfaceC2869g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f25067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3292x f25068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3169s1 f25069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f25070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2755be f25071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3292x f25072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Fc f25073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f25074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f25075j;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        InterfaceC3028m9 interfaceC3028m9L2 = l();
        if (interfaceC3028m9L2 != null) {
            ((C3053n9) interfaceC3028m9L2).a("AUM-LoadedState", "Initialize Called");
        }
        this.f25069d.e();
        C2767c0 c2767c0 = this.f25754a.f25676a.f24940d;
        c2767c0.getClass();
        c2767c0.f24108g = SystemClock.elapsedRealtime();
        P4.a(k(), new C3082od(this, null));
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3107pd(C2755be c2755be, C3292x c3292x, Fc fc2, AbstractC3169s1 abstractC3169s1, Hc hc2, Ac ac2) {
        super(c3292x);
        ck.p.j(c2755be, "nativePubData");
        ck.p.j(c3292x, "adComponent");
        ck.p.j(fc2, "adUnit");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "nativeCallback");
        ck.p.j(ac2, "stateMachine");
        ck.p.j(fc2, "adUnit");
        ck.p.j(c3292x, "adComponent");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(ac2, "stateMachine");
        this.f25067b = fc2;
        this.f25068c = c3292x;
        this.f25069d = abstractC3169s1;
        this.f25070e = ac2;
        this.f25071f = c2755be;
        this.f25072g = c3292x;
        this.f25073h = fc2;
        this.f25074i = hc2;
        this.f25075j = ac2;
    }

    @Override // com.inmobi.media.I
    public final void g() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-LoadedState", "onAdDisplayed");
        }
        InterfaceC3028m9 interfaceC3028m9L2 = l();
        if (interfaceC3028m9L2 != null) {
            ((C3053n9) interfaceC3028m9L2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.f25075j.a(new C3182se(this.f25073h, this.f25072g, this.f25074i, this.f25075j), this);
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-LoadedState", "onDestroy");
        }
        this.f25070e.a(new C3148r5(this.f25067b, this.f25069d, this.f25068c), this);
    }

    @Override // com.inmobi.media.InterfaceC3160rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        ck.p.j(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        Fc fc2 = this.f25073h;
        fc2.getClass();
        ck.p.j(inMobiNativeViewData, "inMobiNativeViewData");
        fc2.f22639b.a(inMobiNativeViewData);
    }
}
