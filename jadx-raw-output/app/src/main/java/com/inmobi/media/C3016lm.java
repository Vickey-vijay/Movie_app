package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3016lm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K3 f24789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3016lm(K3 k10, rj.c cVar) {
        super(2, cVar);
        this.f24789a = k10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3016lm(this.f24789a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3016lm(this.f24789a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f24789a.a();
        return mj.r.f64562a;
    }
}
