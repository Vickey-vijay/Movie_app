package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class ic1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kc1 f78573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f78574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(kc1 kc1Var, String str, rj.c cVar) {
        super(2, cVar);
        this.f78573c = kc1Var;
        this.f78574d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new ic1(this.f78573c, this.f78574d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new ic1(this.f78573c, this.f78574d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f78572b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            pk.d dVar = this.f78573c.f79383o;
            l90 l90Var = new l90(this.f78574d);
            this.f78572b = 1;
            if (dVar.u(l90Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
