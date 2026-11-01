package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class r01 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f82061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s01 f82062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r01(s01 s01Var, rj.c cVar) {
        super(cVar);
        this.f82062c = s01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f82061b = obj;
        this.f82063d |= Integer.MIN_VALUE;
        return this.f82062c.a(null, null, this);
    }
}
