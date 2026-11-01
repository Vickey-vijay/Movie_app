package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Z0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2819e1 f23881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(AbstractC2819e1 abstractC2819e1, rj.c cVar) {
        super(2, cVar);
        this.f23881a = abstractC2819e1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Z0(this.f23881a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Z0(this.f23881a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        AdEvents adEvents = this.f23881a.f24281e;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
        return mj.r.f64562a;
    }
}
