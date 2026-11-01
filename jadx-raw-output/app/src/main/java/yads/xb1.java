package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class xb1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f84522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(IntegrationInspectorActivity integrationInspectorActivity, rj.c cVar) {
        super(2, cVar);
        this.f84522c = integrationInspectorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new xb1(this.f84522c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new xb1(this.f84522c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f84521b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            qk.c cVar = this.f84522c.b().f79384p;
            wb1 wb1Var = new wb1(this.f84522c);
            this.f84521b = 1;
            if (cVar.collect(wb1Var, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
