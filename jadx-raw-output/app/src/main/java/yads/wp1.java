package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class wp1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f84286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f84287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qq1 f84288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, qq1 qq1Var, rj.c cVar) {
        super(2, cVar);
        this.f84286c = aVar;
        this.f84287d = context;
        this.f84288e = qq1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new wp1(this.f84286c, this.f84287d, this.f84288e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((wp1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f84285b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f84286c;
            Context context = this.f84287d;
            qq1 qq1Var = this.f84288e;
            this.f84285b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f42979g;
            if (aVar.a(context, qq1Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
