package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class wy1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yy1 f84380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi f84381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(yy1 yy1Var, oi oiVar, rj.c cVar) {
        super(2, cVar);
        this.f84380c = yy1Var;
        this.f84381d = oiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new wy1(this.f84380c, this.f84381d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new wy1(this.f84380c, this.f84381d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f84379b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            yy1 yy1Var = this.f84380c;
            oi oiVar = this.f84381d;
            this.f84379b = 1;
            obj = yy1.a(yy1Var, oiVar, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
