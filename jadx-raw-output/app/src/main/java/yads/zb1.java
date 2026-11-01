package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class zb1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f85300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb1(IntegrationInspectorActivity integrationInspectorActivity, rj.c cVar) {
        super(2, cVar);
        this.f85300c = integrationInspectorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new zb1(this.f85300c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new zb1(this.f85300c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f85299b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        } else {
            kotlin.c.b(obj);
            qk.u uVar = this.f85300c.b().f79382n;
            yb1 yb1Var = new yb1(this.f85300c);
            this.f85299b = 1;
            if (uVar.collect(yb1Var, this) == objF) {
                return objF;
            }
        }
        throw new KotlinNothingValueException();
    }
}
