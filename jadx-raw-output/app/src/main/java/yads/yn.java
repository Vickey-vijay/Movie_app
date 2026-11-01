package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class yn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zn f85063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ra3 f85064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(zn znVar, ra3 ra3Var, rj.c cVar) {
        super(2, cVar);
        this.f85063c = znVar;
        this.f85064d = ra3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new yn(this.f85063c, this.f85064d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new yn(this.f85063c, this.f85064d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f85062b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            zn znVar = this.f85063c;
            ra3 ra3Var = this.f85064d;
            this.f85062b = 1;
            if (zn.a(znVar, ra3Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
