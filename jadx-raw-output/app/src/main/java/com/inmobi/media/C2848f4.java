package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2848f4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2924i4 f24336b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2848f4(C2924i4 c2924i4, rj.c cVar) {
        super(2, cVar);
        this.f24336b = c2924i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2848f4(this.f24336b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2848f4(this.f24336b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24335a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C2924i4 c2924i4 = this.f24336b;
            this.f24335a = 1;
            if (c2924i4.b(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
