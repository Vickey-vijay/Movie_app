package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ct2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j00 f76421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a73 f76422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct2(j00 j00Var, a73 a73Var, rj.c cVar) {
        super(2, cVar);
        this.f76421b = j00Var;
        this.f76422c = a73Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new ct2(this.f76421b, this.f76422c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new ct2(this.f76421b, this.f76422c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        j00 j00Var = this.f76421b;
        String str = this.f76422c.f75431a;
        wq3 wq3Var = (wq3) j00Var;
        wq3Var.getClass();
        new CallbackStackTraceMarker(new vq3(wq3Var, str));
        return mj.r.f64562a;
    }
}
