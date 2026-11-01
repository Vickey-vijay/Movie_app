package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3209tg extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3284wg f25393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3209tg(C3284wg c3284wg, rj.c cVar) {
        super(2, cVar);
        this.f25393b = c3284wg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3209tg(this.f25393b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3209tg(this.f25393b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25392a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3284wg c3284wg = this.f25393b;
            this.f25392a = 1;
            if (C3284wg.a(c3284wg, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
