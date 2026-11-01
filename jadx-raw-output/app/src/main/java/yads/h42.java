package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class h42 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j42 f78062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f78063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry1 f78064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h42(j42 j42Var, Context context, ry1 ry1Var, rj.c cVar) {
        super(2, cVar);
        this.f78062c = j42Var;
        this.f78063d = context;
        this.f78064e = ry1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new h42(this.f78062c, this.f78063d, this.f78064e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((h42) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f78061b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            r72 r72Var = this.f78062c.f78913b;
            Context context = this.f78063d;
            ry1 ry1Var = this.f78064e;
            this.f78061b = 1;
            if (r72Var.a(context, ry1Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
