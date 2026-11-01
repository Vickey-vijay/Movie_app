package com.ironsource;

import kotlin.Result;

/* JADX INFO: renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3607n4 implements InterfaceC3552k5<C8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3392b6 f30277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7 f30279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bk.l<Result<? extends C8>, mj.r> f30280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C8 f30281e;

    @Override // com.ironsource.Oc
    public void a(C8 c10) {
        ck.p.j(c10, C3426d4.i.f28530b);
        i().invoke(Result.m3457boximpl(Result.m3458constructorimpl(c10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3607n4(InterfaceC3392b6 interfaceC3392b6, String str, C7 c10, bk.l<? super Result<? extends C8>, mj.r> lVar) {
        ck.p.j(interfaceC3392b6, Y5.c.f27927a);
        ck.p.j(str, "destinationPath");
        ck.p.j(c10, "downloadManager");
        ck.p.j(lVar, "onFinish");
        this.f30277a = interfaceC3392b6;
        this.f30278b = str;
        this.f30279c = c10;
        this.f30280d = lVar;
        this.f30281e = new C8(c());
    }

    @Override // com.ironsource.Oc
    public void a(C8 c10, C3731u8 c3731u8) {
        ck.p.j(c3731u8, "error");
        bk.l<Result<? extends C8>, mj.r> lVarI = i();
        Result.a aVar = Result.Companion;
        lVarI.invoke(Result.m3457boximpl(Result.m3458constructorimpl(kotlin.c.a(new Exception("Unable to download mobileController.html: " + c3731u8.b())))));
    }

    @Override // com.ironsource.InterfaceC3552k5
    public void b(C8 c10) {
        ck.p.j(c10, "<set-?>");
        this.f30281e = c10;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public String c() {
        return this.f30278b;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public InterfaceC3392b6 d() {
        return this.f30277a;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public bk.l<Result<? extends C8>, mj.r> i() {
        return this.f30280d;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public C8 k() {
        return this.f30281e;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public C7 l() {
        return this.f30279c;
    }
}
