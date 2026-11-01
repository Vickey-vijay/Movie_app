package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class pd2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f81376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud2 f81377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd2(ud2 ud2Var, rj.c cVar) {
        super(cVar);
        this.f81377c = ud2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f81376b = obj;
        this.f81378d |= Integer.MIN_VALUE;
        return this.f81377c.a(0L, this);
    }
}
