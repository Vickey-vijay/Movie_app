package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class u72 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x72 f83390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f83391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x72 f83392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u72(x72 x72Var, rj.c cVar) {
        super(cVar);
        this.f83392d = x72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f83391c = obj;
        this.f83393e |= Integer.MIN_VALUE;
        return x72.a(this.f83392d, null, this);
    }
}
