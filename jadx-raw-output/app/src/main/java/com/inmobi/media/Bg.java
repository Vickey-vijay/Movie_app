package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Bg extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f22425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Bg(bk.l lVar, rj.c cVar) {
        super(2, cVar);
        this.f22425b = (SuspendLambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Bg(this.f22425b, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Bg(this.f22425b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [bk.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22424a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            ?? r10 = this.f22425b;
            this.f22424a = 1;
            if (r10.invoke(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
