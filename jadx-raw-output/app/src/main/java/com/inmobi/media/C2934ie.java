package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2934ie extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3182se f24556a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2934ie(C3182se c3182se, rj.c cVar) {
        super(2, cVar);
        this.f24556a = c3182se;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2934ie(this.f24556a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2934ie(this.f24556a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f24556a.f25323h.onVideoCompleted();
        return mj.r.f64562a;
    }
}
