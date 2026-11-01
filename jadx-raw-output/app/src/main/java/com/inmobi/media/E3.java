package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class E3 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f22564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E3(bk.l lVar, rj.c cVar) {
        super(1, cVar);
        this.f22564b = (SuspendLambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new E3(this.f22564b, cVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // bk.l
    public final Object invoke(Object obj) {
        return new E3(this.f22564b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22563a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            ?? r10 = this.f22564b;
            this.f22563a = 1;
            if (r10.invoke(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
