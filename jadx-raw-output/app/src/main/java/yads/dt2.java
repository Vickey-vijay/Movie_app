package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class dt2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j00 f76795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt2(j00 j00Var, rj.c cVar) {
        super(2, cVar);
        this.f76795b = j00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new dt2(this.f76795b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new dt2(this.f76795b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        wq3 wq3Var = (wq3) this.f76795b;
        wq3Var.getClass();
        new CallbackStackTraceMarker(new uq3(wq3Var));
        return mj.r.f64562a;
    }
}
