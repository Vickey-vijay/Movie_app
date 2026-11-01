package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class y32 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.c f84812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2 f84813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y32(qk.c cVar, mi2 mi2Var, rj.c cVar2) {
        super(2, cVar2);
        this.f84812c = cVar;
        this.f84813d = mi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new y32(this.f84812c, this.f84813d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new y32(this.f84812c, this.f84813d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f84811b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            qk.c cVar = this.f84812c;
            x32 x32Var = new x32(this.f84813d);
            this.f84811b = 1;
            if (cVar.collect(x32Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
