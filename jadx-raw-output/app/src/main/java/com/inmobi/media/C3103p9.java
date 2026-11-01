package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3103p9 extends SuspendLambda implements bk.l {
    public C3103p9(rj.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3103p9(cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C3103p9((rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3304xb c3304xb = (C3304xb) AbstractC3329yb.f25781a.getValue();
        C3078o9 c3078o9 = AbstractC3128q9.f25159c;
        c3304xb.getClass();
        ck.p.j(c3078o9, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        c3304xb.f25716b = new WeakReference(c3078o9);
        return mj.r.f64562a;
    }
}
