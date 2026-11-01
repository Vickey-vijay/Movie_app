package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2902h7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2902h7(C3026m7 c3026m7, rj.c cVar) {
        super(2, cVar);
        this.f24486b = c3026m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2902h7(this.f24486b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2902h7(this.f24486b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24485a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3026m7 c3026m7 = this.f24486b;
            this.f24485a = 1;
            if (c3026m7.c(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
