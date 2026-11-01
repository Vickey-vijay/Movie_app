package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3307xe implements InterfaceC2786cj, InterfaceC3160rh, I, InterfaceC2869g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fc f25720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3292x f25721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PublisherCallbacks f25722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2863fj f25723d;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        C3053n9 c3053n9 = this.f25721b.f25676a.f24939c;
        if (c3053n9 != null) {
            c3053n9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.f25720a.f22639b.d();
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    public C3307xe(Fc fc2, C3292x c3292x, PublisherCallbacks publisherCallbacks, AbstractC2863fj abstractC2863fj) {
        ck.p.j(fc2, "adUnit");
        ck.p.j(c3292x, "adComponent");
        ck.p.j(publisherCallbacks, "publisherCallbacks");
        ck.p.j(abstractC2863fj, "stateMachine");
        this.f25720a = fc2;
        this.f25721b = c3292x;
        this.f25722c = publisherCallbacks;
        this.f25723d = abstractC2863fj;
    }

    @Override // com.inmobi.media.I
    public final void g() {
        C3053n9 c3053n9 = this.f25721b.f25676a.f24939c;
        if (c3053n9 != null) {
            c3053n9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.f25723d.a(new C3182se(this.f25720a, this.f25721b, this.f25722c, this.f25723d), this);
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        this.f25723d.a(new C3148r5(this.f25720a, null, this.f25721b), this);
    }

    @Override // com.inmobi.media.InterfaceC3160rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        ck.p.j(inMobiNativeViewData, "inMobiNativeViewData");
        C3053n9 c3053n9 = this.f25721b.f25676a.f24939c;
        if (c3053n9 != null) {
            c3053n9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        Fc fc2 = this.f25720a;
        fc2.getClass();
        ck.p.j(inMobiNativeViewData, "inMobiNativeViewData");
        fc2.f22639b.a(inMobiNativeViewData);
    }
}
