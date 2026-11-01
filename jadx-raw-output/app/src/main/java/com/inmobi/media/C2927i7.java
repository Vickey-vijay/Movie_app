package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2927i7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2927i7(C3026m7 c3026m7, rj.c cVar) {
        super(2, cVar);
        this.f24546b = c3026m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2927i7(this.f24546b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2927i7(this.f24546b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24545a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3026m7 c3026m7 = this.f24546b;
            this.f24545a = 1;
            if (c3026m7.d(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
