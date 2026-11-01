package yads;

import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes2.dex */
public final class a41 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c41 f75388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set f75389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(c41 c41Var, Set set, rj.c cVar) {
        super(2, cVar);
        this.f75388d = c41Var;
        this.f75389e = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        a41 a41Var = new a41(this.f75388d, this.f75389e, cVar);
        a41Var.f75387c = obj;
        return a41Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((a41) create((pk.n) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f75386b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            pk.n nVar = (pk.n) this.f75387c;
            this.f75388d.a(this.f75389e, new z31(nVar));
            this.f75386b = 1;
            if (ProduceKt.c(nVar, null, this, 1, null) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
