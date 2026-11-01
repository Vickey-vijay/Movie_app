package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3303xa extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f25714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3303xa(bk.p pVar, rj.c cVar) {
        super(2, cVar);
        this.f25714c = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bk.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3303xa c3303xa = new C3303xa(this.f25714c, cVar);
        c3303xa.f25713b = obj;
        return c3303xa;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bk.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C3303xa c3303xa = new C3303xa(this.f25714c, (rj.c) obj2);
        c3303xa.f25713b = (nk.l0) obj;
        return c3303xa.invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bk.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25712a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f25713b;
            ?? r10 = this.f25714c;
            this.f25712a = 1;
            if (r10.mo1invoke(l0Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
