package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2958je extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3182se f24607a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2958je(C3182se c3182se, rj.c cVar) {
        super(2, cVar);
        this.f24607a = c3182se;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2958je(this.f24607a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2958je(this.f24607a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f24607a.f25323h.onVideoPaused();
        return mj.r.f64562a;
    }
}
