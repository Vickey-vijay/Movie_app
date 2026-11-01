package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3331yd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dd f25785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3331yd(Dd dd2, rj.c cVar) {
        super(2, cVar);
        this.f25785b = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3331yd(this.f25785b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3331yd(this.f25785b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25784a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        C3267w c3267w = this.f25785b.f22523f;
        this.f25784a = 1;
        Object objA = c3267w.a(this);
        if (objA == objF) {
            return objF;
        }
        return objA;
    }
}
