package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2751ba extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3130qb f24053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2751ba(C3130qb c3130qb, rj.c cVar) {
        super(2, cVar);
        this.f24053b = c3130qb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2751ba(this.f24053b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2751ba(this.f24053b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24052a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3304xb c3304xb = (C3304xb) AbstractC3329yb.f25781a.getValue();
            C3130qb c3130qb = this.f24053b;
            this.f24052a = 1;
            if (c3304xb.b(c3130qb, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
