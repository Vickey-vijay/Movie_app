package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class ez0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f77230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0 f77231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(fz0 fz0Var, rj.c cVar) {
        super(cVar);
        this.f77231c = fz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f77230b = obj;
        this.f77232d |= Integer.MIN_VALUE;
        return this.f77231c.a(false, this);
    }
}
