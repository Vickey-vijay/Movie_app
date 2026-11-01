package yads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class aj0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj0 f75538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f75539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(cj0 cj0Var, String str, rj.c cVar) {
        super(2, cVar);
        this.f75538b = cj0Var;
        this.f75539c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new aj0(this.f75538b, this.f75539c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new aj0(this.f75538b, this.f75539c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        cj0 cj0Var = this.f75538b;
        String str = this.f75539c;
        AtomicBoolean atomicBoolean = cj0.f76287e;
        cj0Var.a(str);
        return mj.r.f64562a;
    }
}
