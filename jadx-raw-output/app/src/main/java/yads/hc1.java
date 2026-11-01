package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class hc1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kc1 f78175c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc1(kc1 kc1Var, rj.c cVar) {
        super(2, cVar);
        this.f78175c = kc1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new hc1(this.f78175c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new hc1(this.f78175c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        m90 j90Var;
        Object objF = sj.a.f();
        int i10 = this.f78174b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            iz0 iz0Var = this.f78175c.f79370b;
            this.f78174b = 1;
            o80 o80Var = iz0Var.f78852a;
            obj = nk.h.g(o80Var.f80966f, new n80(o80Var, null), this);
            if (obj == objF) {
                return objF;
            }
        }
        a71 a71Var = (a71) obj;
        if (a71Var instanceof z61) {
            j90Var = new k90(((z61) a71Var).f85229a);
        } else if (a71Var instanceof x61) {
            j90Var = new j90(((x61) a71Var).f84463a);
        } else if (a71Var instanceof y61) {
            j90Var = i90.f78531a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        kc1 kc1Var = this.f78175c;
        nk.j.d(kc1Var.f79369a, null, null, new gc1(kc1Var, j90Var, null), 3, null);
        return mj.r.f64562a;
    }
}
