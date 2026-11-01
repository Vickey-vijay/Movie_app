package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3356zd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3274w6 f25842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3356zd(AbstractC3274w6 abstractC3274w6, rj.c cVar) {
        super(2, cVar);
        this.f25842b = abstractC3274w6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3356zd(this.f25842b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3356zd(this.f25842b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25841a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        AbstractC3274w6 abstractC3274w6 = this.f25842b;
        this.f25841a = 1;
        Object objA = abstractC3274w6.a(this);
        if (objA == objF) {
            return objF;
        }
        return objA;
    }
}
