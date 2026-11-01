package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3137qi extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3161ri f25189a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3137qi(AbstractC3161ri abstractC3161ri, rj.c cVar) {
        super(2, cVar);
        this.f25189a = abstractC3161ri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3137qi(this.f25189a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3137qi(this.f25189a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f25189a.f25270d.onUserLeftApplication();
        return mj.r.f64562a;
    }
}
