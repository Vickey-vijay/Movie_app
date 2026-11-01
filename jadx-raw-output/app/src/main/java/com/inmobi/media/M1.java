package com.inmobi.media;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public final class M1 implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f23122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f23123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qk.l f23124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3028m9 f23126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f23127f;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r12.collect(r13, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        if (r14.collect(r2, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.M1 r11, android.view.ViewGroup r12, nk.l0 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M1.a(com.inmobi.media.M1, android.view.ViewGroup, nk.l0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public M1(long j10, ViewGroup viewGroup, InterfaceC3028m9 interfaceC3028m9, nk.l0 l0Var, qk.l lVar) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(viewGroup, "observableView");
        ck.p.j(lVar, "visibilityStateFlow");
        this.f23122a = l0Var;
        this.f23123b = viewGroup;
        this.f23124c = lVar;
        this.f23125d = j10;
        this.f23126e = interfaceC3028m9;
    }

    @Override // qk.d
    public final /* bridge */ /* synthetic */ Object emit(Object obj, rj.c cVar) {
        return a(((Boolean) obj).booleanValue());
    }

    public final mj.r a(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23126e;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("WindowLifecycleHandler", "AttachedStateCollector - view attachment state changed: " + z10);
        }
        if (z10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23126e;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("WindowLifecycleHandler", "AttachedStateCollector - starting visibility observation");
            }
            this.f23127f = nk.j.d(this.f23122a, null, null, new J1(this, null), 3, null);
        } else {
            InterfaceC3028m9 interfaceC3028m11 = this.f23126e;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).a("WindowLifecycleHandler", "AttachedStateCollector - view detached, stopping observation");
            }
            this.f23124c.setValue(tj.a.a(false));
            H6.a(this.f23127f);
            this.f23127f = null;
        }
        return mj.r.f64562a;
    }
}
