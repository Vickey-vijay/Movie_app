package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3796y5 implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSourceError f31618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3443e3 f31619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3657q1 f31620c;

    public C3796y5(IronSourceError ironSourceError, C3443e3 c3443e3, InterfaceC3657q1 interfaceC3657q1) {
        ck.p.j(ironSourceError, "error");
        ck.p.j(c3443e3, "adLoadTaskListener");
        ck.p.j(interfaceC3657q1, "analytics");
        this.f31618a = ironSourceError;
        this.f31619b = c3443e3;
        this.f31620c = interfaceC3657q1;
    }

    public final IronSourceError a() {
        return this.f31618a;
    }

    @Override // com.ironsource.Cb
    public void start() {
        InterfaceC3530j1.c.a aVar = InterfaceC3530j1.c.f29197a;
        aVar.a().a(this.f31620c);
        aVar.a(new C3584m1.j(this.f31618a.getErrorCode()), new C3584m1.k(this.f31618a.getErrorMessage()), new C3584m1.f(0L)).a(this.f31620c);
        this.f31619b.b(this.f31618a);
    }
}
