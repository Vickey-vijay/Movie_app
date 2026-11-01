package com.inmobi.media;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes10.dex */
public final class yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.g f25817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qk.l f25818b;

    public yo(long j10, nk.l0 l0Var, ViewGroup viewGroup, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(viewGroup, "observableView");
        qk.l lVarA = qk.v.a(Boolean.FALSE);
        this.f25818b = lVarA;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + viewGroup + ", isAttachedToWindow: " + viewGroup.isAttachedToWindow());
        }
        qk.u uVarG = qk.e.G(qk.e.w(qk.e.e(new Ao(viewGroup, null)), nk.w0.c()), l0Var, kotlinx.coroutines.flow.a.f63151a.a(), Boolean.valueOf(viewGroup.isAttachedToWindow()));
        M1 m10 = new M1(j10, viewGroup, interfaceC3028m9, l0Var, lVarA);
        ck.p.j(uVarG, "<this>");
        ck.p.j(l0Var, "scope");
        ck.p.j(m10, "collector");
        this.f25817a = nk.j.d(l0Var, null, null, new N4(uVarG, m10, null), 3, null);
    }
}
