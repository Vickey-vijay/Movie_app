package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class gt2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt2 f77933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt2(jt2 jt2Var, rj.c cVar) {
        super(2, cVar);
        this.f77933c = jt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new gt2(this.f77933c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new gt2(this.f77933c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f77932b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            zu2 zu2Var = this.f77933c.f79176e;
            q61 q61Var = q61.f81724f;
            this.f77932b = 1;
            obj = zu2Var.a(q61Var, this);
            if (obj == objF) {
                return objF;
            }
        }
        ru2 ru2Var = (ru2) obj;
        if (ru2Var instanceof qu2) {
            return null;
        }
        if (ru2Var instanceof pu2) {
            return kt2.f79565c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
