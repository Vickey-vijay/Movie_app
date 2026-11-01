package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class lz1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz1 f79998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9 f79999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d12 f80000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz1 f80001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hz1 f80002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz1(mz1 mz1Var, v9 v9Var, d12 d12Var, xz1 xz1Var, hz1 hz1Var, rj.c cVar) {
        super(2, cVar);
        this.f79998b = mz1Var;
        this.f79999c = v9Var;
        this.f80000d = d12Var;
        this.f80001e = xz1Var;
        this.f80002f = hz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new lz1(this.f79998b, this.f79999c, this.f80000d, this.f80001e, this.f80002f, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((lz1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        new kz1(this.f79998b, this.f79999c, this.f80000d, this.f80001e, this.f80002f, new aq2()).run();
        return mj.r.f64562a;
    }
}
