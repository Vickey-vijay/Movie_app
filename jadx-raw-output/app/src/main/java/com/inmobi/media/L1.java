package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class L1 implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M1 f23047a;

    public L1(M1 m10) {
        this.f23047a = m10;
    }

    public final mj.r a(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23047a.f23126e;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("WindowLifecycleHandler", "startObservingVisibility - Window visibility changed: " + z10);
        }
        this.f23047a.f23124c.setValue(tj.a.a(z10));
        return mj.r.f64562a;
    }

    @Override // qk.d
    public final /* bridge */ /* synthetic */ Object emit(Object obj, rj.c cVar) {
        return a(((Boolean) obj).booleanValue());
    }
}
