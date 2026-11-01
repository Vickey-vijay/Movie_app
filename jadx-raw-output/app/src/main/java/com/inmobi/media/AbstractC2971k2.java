package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2971k2 implements InterfaceC2786cj, InterfaceC2869g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3169s1 f24644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3276w8 f24645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f24646c;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    public AbstractC2971k2(AbstractC3169s1 abstractC3169s1, InterfaceC3276w8 interfaceC3276w8, Ac ac2) {
        ck.p.j(interfaceC3276w8, "adManagerComponent");
        ck.p.j(ac2, "stateMachine");
        this.f24644a = abstractC3169s1;
        this.f24645b = interfaceC3276w8;
        this.f24646c = ac2;
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        this.f24646c.a(new C3148r5(this.f24645b), this);
    }
}
