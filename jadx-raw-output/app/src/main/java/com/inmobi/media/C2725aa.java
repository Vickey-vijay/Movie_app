package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2725aa extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2777ca f23971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2725aa(C2777ca c2777ca, rj.c cVar) {
        super(2, cVar);
        this.f23971b = c2777ca;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2725aa(this.f23971b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2725aa(this.f23971b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23970a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3304xb c3304xb = (C3304xb) AbstractC3329yb.f25781a.getValue();
            String str = this.f23971b.f24128a.f23734c.f25161a;
            this.f23970a = 1;
            if (c3304xb.a(str, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
