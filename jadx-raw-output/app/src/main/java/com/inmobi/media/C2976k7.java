package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2976k7 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2976k7(C3026m7 c3026m7, rj.c cVar) {
        super(1, cVar);
        this.f24659b = c3026m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C2976k7(this.f24659b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C2976k7(this.f24659b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24658a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3026m7 c3026m7 = this.f24659b;
            this.f24658a = 1;
            if (c3026m7.b(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
