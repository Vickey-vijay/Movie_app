package yads;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class zm2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f85487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cn2 f85488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(cn2 cn2Var, rj.c cVar) {
        super(cVar);
        this.f85488c = cn2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f85487b = obj;
        this.f85489d |= Integer.MIN_VALUE;
        Object objA = this.f85488c.a(this);
        return objA == sj.a.f() ? objA : Result.m3457boximpl(objA);
    }
}
