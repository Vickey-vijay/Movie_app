package com.inmobi.media;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class Q extends FunctionReferenceImpl implements bk.a {
    public Q(Object obj) {
        super(0, obj, U.class, "calculateMetrics", "calculateMetrics()V", 0);
    }

    @Override // bk.a
    public final Object invoke() {
        U u10 = (U) this.receiver;
        u10.getClass();
        u10.f23606n = Ji.f22954d.get();
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        O o10 = u10.f23605m;
        wb2.getClass();
        ck.p.j(o10, "runnable");
        wb2.f23740a.postAtFrontOfQueue(o10);
        return mj.r.f64562a;
    }
}
