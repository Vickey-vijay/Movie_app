package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class wd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd f84173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(yd ydVar, rj.c cVar) {
        super(2, cVar);
        this.f84173c = ydVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new wd(this.f84173c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new wd(this.f84173c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f84172b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            ie ieVar = this.f84173c.f84889a;
            this.f84172b = 1;
            obj = nk.h.g(ieVar.f78597a, new he(ieVar, null), this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
