package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class jz0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f79245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f79246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kz0 f79247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(kz0 kz0Var, rj.c cVar) {
        super(cVar);
        this.f79247d = kz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f79246c = obj;
        this.f79248e |= Integer.MIN_VALUE;
        return this.f79247d.a(null, false, this);
    }
}
