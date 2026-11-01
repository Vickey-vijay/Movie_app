package com.inmobi.media;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3049n5 implements Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3099p5 f24875a;

    public C3049n5(C3099p5 c3099p5) {
        this.f24875a = c3099p5;
    }

    @Override // com.inmobi.media.Vf
    public final Object a(Xf xf2, rj.c cVar) throws Throwable {
        WeakReference weakReference = (WeakReference) this.f24875a.f24559b.get(xf2.f23799a.f23459h);
        InterfaceC2860fg interfaceC2860fg = weakReference != null ? (InterfaceC2860fg) weakReference.get() : null;
        if (!AbstractC2731ag.a(xf2)) {
            Object objA = this.f24875a.a(xf2, interfaceC2860fg, cVar);
            return objA == sj.a.f() ? objA : mj.r.f64562a;
        }
        C3099p5 c3099p5 = this.f24875a;
        c3099p5.getClass();
        AbstractC2935ig.a(xf2, interfaceC2860fg);
        Object objA2 = c3099p5.f24558a.f24997a.a("pings", "id=?", new String[]{xf2.f23799a.f23453b}, cVar);
        if (objA2 != sj.a.f()) {
            objA2 = mj.r.f64562a;
        }
        if (objA2 != sj.a.f()) {
            objA2 = mj.r.f64562a;
        }
        return objA2 == sj.a.f() ? objA2 : mj.r.f64562a;
    }
}
