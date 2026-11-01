package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class uy1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oi f83693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f83694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy1 f83695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy1(yy1 yy1Var, rj.c cVar) {
        super(cVar);
        this.f83695d = yy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f83694c = obj;
        this.f83696e |= Integer.MIN_VALUE;
        return yy1.a(this.f83695d, (oi) null, this);
    }
}
