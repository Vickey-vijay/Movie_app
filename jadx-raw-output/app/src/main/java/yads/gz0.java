package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class gz0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hz0 f77982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f77983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz0 f77984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(hz0 hz0Var, rj.c cVar) {
        super(cVar);
        this.f77984d = hz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f77983c = obj;
        this.f77985e |= Integer.MIN_VALUE;
        return this.f77984d.a(false, this);
    }
}
