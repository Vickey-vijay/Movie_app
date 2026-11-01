package yads;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class x82 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z82 f84480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f84481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03 f84482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f84483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x82(z82 z82Var, Context context, a03 a03Var, List list, rj.c cVar) {
        super(2, cVar);
        this.f84480c = z82Var;
        this.f84481d = context;
        this.f84482e = a03Var;
        this.f84483f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new x82(this.f84480c, this.f84481d, this.f84482e, this.f84483f, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((x82) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f84479b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            z82 z82Var = this.f84480c;
            Context context = this.f84481d;
            a03 a03Var = this.f84482e;
            List list = this.f84483f;
            this.f84479b = 1;
            obj = z82Var.a(context, a03Var, list, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
