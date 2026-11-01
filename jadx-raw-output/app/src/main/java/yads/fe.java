package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class fe extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ie f77362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ie ieVar, rj.c cVar) {
        super(2, cVar);
        this.f77362b = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new fe(this.f77362b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new fe(this.f77362b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        return this.f77362b.f78599c.a();
    }
}
