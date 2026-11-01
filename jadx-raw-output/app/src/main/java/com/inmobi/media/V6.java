package com.inmobi.media;

import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes7.dex */
public final class V6 implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f23686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f23687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qk.l f23689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3028m9 f23690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f23691f;

    public V6(long j10, ViewGroup viewGroup, InterfaceC3028m9 interfaceC3028m9, nk.l0 l0Var, qk.l lVar) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(viewGroup, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(lVar, "visibilityStateFlow");
        this.f23686a = l0Var;
        this.f23687b = viewGroup;
        this.f23688c = j10;
        this.f23689d = lVar;
        this.f23690e = interfaceC3028m9;
    }

    public final mj.r a(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23690e;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("WindowLifecycleHandler", "FocusStateCollector - window focus changed: " + z10);
        }
        if (z10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23690e;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("WindowLifecycleHandler", "FocusStateCollector - window gained focus, stopping polling");
            }
            H6.a(this.f23691f);
            this.f23691f = null;
        } else {
            InterfaceC3028m9 interfaceC3028m11 = this.f23690e;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).a("WindowLifecycleHandler", "FocusStateCollector - window lost focus, starting polling");
            }
            this.f23691f = nk.j.d(this.f23686a, null, null, new U6(this, null), 3, null);
        }
        boolean z11 = this.f23687b.getWindowVisibility() == 0;
        InterfaceC3028m9 interfaceC3028m12 = this.f23690e;
        if (interfaceC3028m12 != null) {
            ((C3053n9) interfaceC3028m12).a("WindowLifecycleHandler", "FocusStateCollector - setting visibility state: " + z11);
        }
        this.f23689d.setValue(tj.a.a(z11));
        return mj.r.f64562a;
    }

    @Override // qk.d
    public final /* bridge */ /* synthetic */ Object emit(Object obj, rj.c cVar) {
        return a(((Boolean) obj).booleanValue());
    }
}
