package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class O4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk.k f23268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2753bc f23269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4(qk.k kVar, AbstractC2753bc abstractC2753bc, rj.c cVar) {
        super(2, cVar);
        this.f23268b = kVar;
        this.f23269c = abstractC2753bc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new O4(this.f23268b, this.f23269c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new O4(this.f23268b, this.f23269c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23267a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            qk.k kVar = this.f23268b;
            AbstractC2753bc abstractC2753bc = this.f23269c;
            this.f23267a = 1;
            if (kVar.emit(abstractC2753bc, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
