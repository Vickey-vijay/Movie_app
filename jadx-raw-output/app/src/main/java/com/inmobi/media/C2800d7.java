package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2800d7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rf f24224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2800d7(C3026m7 c3026m7, Rf rf2, rj.c cVar) {
        super(2, cVar);
        this.f24223b = c3026m7;
        this.f24224c = rf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2800d7(this.f24223b, this.f24224c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2800d7(this.f24223b, this.f24224c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24222a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3026m7 c3026m7 = this.f24223b;
            Rf rf2 = this.f24224c;
            C2774c7 c2774c7 = new C2774c7(this.f24223b);
            this.f24222a = 1;
            if (c3026m7.a(rf2, c2774c7, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
