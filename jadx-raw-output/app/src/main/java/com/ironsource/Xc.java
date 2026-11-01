package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes5.dex */
public final class Xc implements InterfaceC3713t7, InterfaceC3713t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3710t4 f27875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M7 f27876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Wc> f27877c;

    public final Map<String, Wc> a() {
        return this.f27877c;
    }

    public Xc(InterfaceC3710t4 interfaceC3710t4, M7 m10) {
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        ck.p.j(m10, "repository");
        this.f27875a = interfaceC3710t4;
        this.f27876b = m10;
        this.f27877c = new LinkedHashMap();
    }

    private final boolean a(Wc wc2, String str) {
        Long lA = this.f27876b.a(str);
        return lA != null && this.f27875a.a() - lA.longValue() < wc2.a();
    }

    @Override // com.ironsource.InterfaceC3713t7.a
    public void b(String str) {
        ck.p.j(str, "identifier");
        if (this.f27877c.get(str) == null) {
            return;
        }
        this.f27876b.a(this.f27875a.a(), str);
    }

    @Override // com.ironsource.InterfaceC3713t7
    public M3 a(String str) {
        ck.p.j(str, "identifier");
        Wc wc2 = this.f27877c.get(str);
        if (wc2 == null) {
            return new M3(false, null, 2, null);
        }
        if (a(wc2, str)) {
            return new M3(true, O3.Pacing);
        }
        return new M3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC3713t7.a
    public Object a(String str, O3 o10, InterfaceC3679r7 interfaceC3679r7) {
        ck.p.j(str, "identifier");
        ck.p.j(o10, "cappingType");
        ck.p.j(interfaceC3679r7, "cappingConfig");
        Object objB = interfaceC3679r7.b();
        if (Result.m3464isSuccessimpl(objB)) {
            Wc wc2 = (Wc) objB;
            if (wc2 != null) {
                this.f27877c.put(str, wc2);
            }
            return Result.m3458constructorimpl(mj.r.f64562a);
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objB);
        if (thM3461exceptionOrNullimpl != null) {
            return Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
        }
        return Result.m3458constructorimpl(mj.r.f64562a);
    }
}
