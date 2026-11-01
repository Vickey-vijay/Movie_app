package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3054na extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3079oa f24881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3054na(ViewTreeObserverOnGlobalLayoutListenerC3079oa viewTreeObserverOnGlobalLayoutListenerC3079oa, rj.c cVar) {
        super(2, cVar);
        this.f24881a = viewTreeObserverOnGlobalLayoutListenerC3079oa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3054na(this.f24881a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3054na(this.f24881a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        nk.u uVar = this.f24881a.f24975e;
        mj.r rVar = mj.r.f64562a;
        uVar.i(rVar);
        return rVar;
    }
}
