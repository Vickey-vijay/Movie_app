package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class nw0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rw0 f80836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dn2 f80837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f80838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rw0 f80839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80840f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(rw0 rw0Var, rj.c cVar) {
        super(cVar);
        this.f80839e = rw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f80838d = obj;
        this.f80840f |= Integer.MIN_VALUE;
        return this.f80839e.a(null, this);
    }
}
