package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class yi0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5 f84968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v5 f84969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f84970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj0 f84971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(cj0 cj0Var, rj.c cVar) {
        super(cVar);
        this.f84971e = cj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84970d = obj;
        this.f84972f |= Integer.MIN_VALUE;
        return this.f84971e.a(this);
    }
}
