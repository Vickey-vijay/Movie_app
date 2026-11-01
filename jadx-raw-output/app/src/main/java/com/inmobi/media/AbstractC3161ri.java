package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;

/* JADX INFO: renamed from: com.inmobi.media.ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3161ri extends AbstractC3317y implements InterfaceC2786cj, InterfaceC2869g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f25268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3292x f25269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublisherCallbacks f25270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2863fj f25271e;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3161ri(Fc fc2, C3292x c3292x, PublisherCallbacks publisherCallbacks, AbstractC2863fj abstractC2863fj) {
        super(c3292x);
        ck.p.j(fc2, "adUnit");
        ck.p.j(c3292x, "adComponent");
        ck.p.j(publisherCallbacks, "publisherCallbacks");
        ck.p.j(abstractC2863fj, "stateMachine");
        this.f25268b = fc2;
        this.f25269c = c3292x;
        this.f25270d = publisherCallbacks;
        this.f25271e = abstractC2863fj;
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-RenderedState", "Initialize Called");
        }
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("AUM-RenderedState", "onDestroy");
        }
        this.f25271e.a(new C3148r5(this.f25268b, null, this.f25269c), this);
    }
}
