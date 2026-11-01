package yads;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class fx0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx0 f77535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f77536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(gx0 gx0Var, List list, rj.c cVar) {
        super(2, cVar);
        this.f77535c = gx0Var;
        this.f77536d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new fx0(this.f77535c, this.f77536d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new fx0(this.f77535c, this.f77536d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f77534b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            rw0 rw0Var = this.f77535c.f77965a;
            List list = this.f77536d;
            this.f77534b = 1;
            rw0Var.getClass();
            if (kotlinx.coroutines.d.e(new pw0(list, rw0Var, null), this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
