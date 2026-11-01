package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3046n2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.l f24870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3170s2 f24871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3046n2(qk.l lVar, rj.c cVar, AbstractC3170s2 abstractC3170s2) {
        super(2, cVar);
        this.f24870c = lVar;
        this.f24871d = abstractC3170s2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3046n2 c3046n2 = new C3046n2(this.f24870c, cVar, this.f24871d);
        c3046n2.f24869b = obj;
        return c3046n2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3046n2) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24868a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f24869b;
            qk.l lVar = this.f24870c;
            C3021m2 c3021m2 = new C3021m2(l0Var, this.f24871d);
            this.f24868a = 1;
            if (lVar.collect(c3021m2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
