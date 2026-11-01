package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class he extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie f78190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ie ieVar, rj.c cVar) {
        super(2, cVar);
        this.f78190c = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new he(this.f78190c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new he(this.f78190c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f78189b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            ie ieVar = this.f78190c;
            this.f78189b = 1;
            obj = nk.h.g(ieVar.f78597a, new ge(ieVar, null), this);
            if (obj == objF) {
                return objF;
            }
        }
        vd vdVar = (vd) obj;
        if (vdVar.f83879a == null && vdVar.f83880b == null) {
            return je.f79005a;
        }
        return new ke(vdVar);
    }
}
