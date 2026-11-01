package yads;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class v72 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x72 f83799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je3 f83800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v72(x72 x72Var, je3 je3Var, rj.c cVar) {
        super(2, cVar);
        this.f83799c = x72Var;
        this.f83800d = je3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new v72(this.f83799c, this.f83800d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new v72(this.f83799c, this.f83800d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f83798b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            x72 x72Var = this.f83799c;
            List listE = nj.r.e(this.f83800d);
            this.f83798b = 1;
            obj = x72.a(x72Var, listE, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
