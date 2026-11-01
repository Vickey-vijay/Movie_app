package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class A3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nk.p0 f22340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bk.l f22341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(nk.p0 p0Var, bk.l lVar, rj.c cVar) {
        super(2, cVar);
        this.f22340b = p0Var;
        this.f22341c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new A3(this.f22340b, this.f22341c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new A3(this.f22340b, this.f22341c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22339a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.p0 p0Var = this.f22340b;
            this.f22339a = 1;
            obj = p0Var.y(this);
            if (obj == objF) {
                return objF;
            }
        }
        if (obj != null) {
            this.f22341c.invoke(obj);
        }
        return mj.r.f64562a;
    }
}
