package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;

/* JADX INFO: renamed from: com.inmobi.media.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3182se extends AbstractC3161ri implements Sl, Ck {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Fc f25321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3292x f25322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PublisherCallbacks f25323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC2863fj f25324i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3182se(Fc fc2, C3292x c3292x, PublisherCallbacks publisherCallbacks, AbstractC2863fj abstractC2863fj) {
        super(fc2, c3292x, publisherCallbacks, abstractC2863fj);
        ck.p.j(fc2, "adUnit");
        ck.p.j(c3292x, "adComponent");
        ck.p.j(publisherCallbacks, "publisherCallbacks");
        ck.p.j(abstractC2863fj, "stateMachine");
        this.f25321f = fc2;
        this.f25322g = c3292x;
        this.f25323h = publisherCallbacks;
        this.f25324i = abstractC2863fj;
    }

    @Override // com.inmobi.media.Sl
    public final void a(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeRenderedState", "onAudioStateChanged " + z10);
        }
        P4.a(k(), new C2884ge(this, z10, null));
    }

    @Override // com.inmobi.media.Sl
    public final void b() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        P4.a(k(), new C2958je(this, null));
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.f25324i.a(new C3307xe(this.f25321f, this.f25322g, this.f25323h, this.f25324i), this);
    }

    @Override // com.inmobi.media.Sl
    public final void f() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        P4.a(k(), new C3008le(this, null));
    }

    @Override // com.inmobi.media.Sl
    public final void h() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        P4.a(k(), new C2934ie(this, null));
    }

    @Override // com.inmobi.media.Sl
    public final void i() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        P4.a(k(), new C2983ke(this, null));
    }
}
