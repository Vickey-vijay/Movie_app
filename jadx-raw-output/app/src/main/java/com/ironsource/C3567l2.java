package com.ironsource;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3567l2 implements InterfaceC3585m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3753vd f29391b;

    public C3567l2(String str, InterfaceC3753vd interfaceC3753vd) {
        ck.p.j(str, "encryptedAuctionResponse");
        ck.p.j(interfaceC3753vd, "providerName");
        this.f29390a = str;
        this.f29391b = interfaceC3753vd;
    }

    @Override // com.ironsource.InterfaceC3585m2
    public Object a() {
        Object objM3458constructorimpl;
        String strC = C3644p5.b().c();
        ck.p.i(strC, "getInstance().mediationKey");
        C3716ta c3716ta = new C3716ta(new J4(this.f29390a, strC));
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c3716ta.a());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl == null) {
            return C3531j2.f29217h.a((JSONObject) objM3458constructorimpl, this.f29391b.value());
        }
        C3676r4.d().a(thM3461exceptionOrNullimpl);
        if (thM3461exceptionOrNullimpl instanceof IllegalArgumentException) {
            return Result.m3458constructorimpl(kotlin.c.a(new C3466f8(C3813z5.f31697a.d())));
        }
        return Result.m3458constructorimpl(kotlin.c.a(new C3466f8(C3813z5.f31697a.h())));
    }
}
