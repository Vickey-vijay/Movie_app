package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class bm0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cm0 f75889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm0 f75891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(cm0 cm0Var, rj.c cVar) {
        super(cVar);
        this.f75891d = cm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f75890c = obj;
        this.f75892e |= Integer.MIN_VALUE;
        return this.f75891d.a(null, this);
    }
}
