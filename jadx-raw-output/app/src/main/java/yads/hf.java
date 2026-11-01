package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class hf extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nk.u f78200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(nk.u uVar, rj.c cVar) {
        super(2, cVar);
        this.f78200c = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new hf(this.f78200c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new hf(this.f78200c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f78199b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.u uVar = this.f78200c;
            this.f78199b = 1;
            if (uVar.y(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
