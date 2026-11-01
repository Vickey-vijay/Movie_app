package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class gc1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kc1 f77735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m90 f77736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc1(kc1 kc1Var, m90 m90Var, rj.c cVar) {
        super(2, cVar);
        this.f77735c = kc1Var;
        this.f77736d = m90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new gc1(this.f77735c, this.f77736d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new gc1(this.f77735c, this.f77736d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f77734b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            pk.d dVar = this.f77735c.f79383o;
            m90 m90Var = this.f77736d;
            this.f77734b = 1;
            if (dVar.u(m90Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
