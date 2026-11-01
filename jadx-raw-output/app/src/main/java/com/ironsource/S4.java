package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class S4 implements InterfaceC3713t7, InterfaceC3713t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, P4> f27572a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC3713t7
    public M3 a(String str) {
        ck.p.j(str, "identifier");
        P4 p10 = this.f27572a.get(str);
        return (p10 == null || p10.a()) ? new M3(false, null, 2, null) : new M3(true, O3.Delivery);
    }

    @Override // com.ironsource.InterfaceC3713t7.a
    public void b(String str) {
        ck.p.j(str, "identifier");
    }

    @Override // com.ironsource.InterfaceC3713t7.a
    public Object a(String str, O3 o10, InterfaceC3679r7 interfaceC3679r7) {
        ck.p.j(str, "identifier");
        ck.p.j(o10, "cappingType");
        ck.p.j(interfaceC3679r7, "cappingConfig");
        Object objA = interfaceC3679r7.a();
        if (Result.m3464isSuccessimpl(objA)) {
            P4 p10 = (P4) objA;
            if (p10 != null) {
                this.f27572a.put(str, p10);
            }
            return Result.m3458constructorimpl(mj.r.f64562a);
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objA);
        if (thM3461exceptionOrNullimpl != null) {
            return Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
        }
        return Result.m3458constructorimpl(mj.r.f64562a);
    }
}
