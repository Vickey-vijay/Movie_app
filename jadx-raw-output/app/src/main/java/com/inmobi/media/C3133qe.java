package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3133qe extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f25181a;

    public C3133qe(rj.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3133qe c3133qe = new C3133qe(cVar);
        c3133qe.f25181a = ((Boolean) obj).booleanValue();
        return c3133qe;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C3133qe c3133qe = new C3133qe((rj.c) obj2);
        c3133qe.f25181a = bool.booleanValue();
        return c3133qe.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        return tj.a.a(this.f25181a);
    }
}
