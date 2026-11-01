package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2956jc extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3006lc f24601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2956jc(C3006lc c3006lc, rj.c cVar) {
        super(2, cVar);
        this.f24601a = c3006lc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2956jc(this.f24601a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2956jc(this.f24601a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3053n9 c3053n9 = this.f24601a.f24764a;
        if (c3053n9 != null) {
            c3053n9.a("MediaViewManager", "destroy called");
        }
        AbstractC2946j2 abstractC2946j2 = this.f24601a.f24765b;
        if (abstractC2946j2 != null) {
            abstractC2946j2.a();
        }
        this.f24601a.f24765b = null;
        return mj.r.f64562a;
    }
}
