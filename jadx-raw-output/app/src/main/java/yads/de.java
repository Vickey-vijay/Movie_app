package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class de extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie f76649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ie ieVar, rj.c cVar) {
        super(2, cVar);
        this.f76649c = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new de(this.f76649c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new de(this.f76649c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f76648b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            ud2 ud2Var = this.f76649c.f78601e;
            this.f76648b = 1;
            obj = ud2Var.a(1000L, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
