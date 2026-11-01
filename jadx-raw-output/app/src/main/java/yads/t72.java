package yads;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class t72 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sd3 f82903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd3 f82905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x72 f82906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t72(sd3 sd3Var, x72 x72Var, rj.c cVar) {
        super(2, cVar);
        this.f82905d = sd3Var;
        this.f82906e = x72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new t72(this.f82905d, this.f82906e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new t72(this.f82905d, this.f82906e, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sd3 sd3Var;
        Object objF = sj.a.f();
        int i10 = this.f82904c;
        if (i10 != 0) {
            if (i10 == 1) {
                sd3Var = this.f82903b;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            sd3 sd3Var2 = this.f82905d;
            if (sd3Var2 == null) {
                return null;
            }
            x72 x72Var = this.f82906e;
            List list = sd3Var2.f82619a;
            this.f82903b = sd3Var2;
            this.f82904c = 1;
            x72Var.getClass();
            Object objG = nk.h.g(nk.w0.b(), new w72(x72Var, list, null), this);
            if (objG == objF) {
                return objF;
            }
            sd3Var = sd3Var2;
            obj = objG;
        }
        List list2 = (List) obj;
        if (!list2.isEmpty()) {
            return new sd3(list2, sd3Var.f82620b, sd3Var.f82621c);
        }
        throw new z02("Invalid VAST in response");
    }
}
