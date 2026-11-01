package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3762w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3657q1 f31522a;

    public final void a() {
        InterfaceC3530j1.c.f29197a.a().a(this.f31522a);
    }

    public C3762w5(InterfaceC3657q1 interfaceC3657q1, String str, InterfaceC3753vd interfaceC3753vd) {
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(str, "adRequestAdId");
        ck.p.j(interfaceC3753vd, "adRequestProviderName");
        this.f31522a = interfaceC3657q1;
        interfaceC3657q1.a(new C3584m1.s(interfaceC3753vd.value()), new C3584m1.b(str));
    }

    public final void a(IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        InterfaceC3530j1.c.f29197a.a(new C3584m1.j(ironSourceError.getErrorCode()), new C3584m1.k(ironSourceError.getErrorMessage()), new C3584m1.f(0L)).a(this.f31522a);
    }
}
