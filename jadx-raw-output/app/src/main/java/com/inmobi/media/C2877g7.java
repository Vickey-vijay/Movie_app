package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2877g7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rf f24413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2877g7(C3026m7 c3026m7, Rf rf2, rj.c cVar) {
        super(2, cVar);
        this.f24412b = c3026m7;
        this.f24413c = rf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2877g7(this.f24412b, this.f24413c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2877g7(this.f24412b, this.f24413c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24411a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3026m7 c3026m7 = this.f24412b;
            Rf rf2 = this.f24413c;
            C2851f7 c2851f7 = new C2851f7(c3026m7, null);
            this.f24411a = 1;
            if (c3026m7.a(rf2, c2851f7, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
