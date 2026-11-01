package com.inmobi.media;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public final class E8 implements Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F8 f22574a;

    public E8(F8 f10) {
        this.f22574a = f10;
    }

    @Override // com.inmobi.media.Vf
    public final Object a(Xf xf2, rj.c cVar) throws Throwable {
        WeakReference weakReference = (WeakReference) this.f22574a.f24559b.get(xf2.f23799a.f23459h);
        InterfaceC2860fg interfaceC2860fg = weakReference != null ? (InterfaceC2860fg) weakReference.get() : null;
        if (!AbstractC2731ag.a(xf2)) {
            Object objA = this.f22574a.a(xf2, interfaceC2860fg, cVar);
            return objA == sj.a.f() ? objA : mj.r.f64562a;
        }
        F8 f10 = this.f22574a;
        f10.getClass();
        AbstractC2935ig.a(xf2, interfaceC2860fg);
        Object objA2 = f10.f24558a.f24997a.a("pings", "id=?", new String[]{xf2.f23799a.f23453b}, cVar);
        if (objA2 != sj.a.f()) {
            objA2 = mj.r.f64562a;
        }
        if (objA2 != sj.a.f()) {
            objA2 = mj.r.f64562a;
        }
        return objA2 == sj.a.f() ? objA2 : mj.r.f64562a;
    }
}
