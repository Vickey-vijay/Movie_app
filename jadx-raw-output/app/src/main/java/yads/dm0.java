package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class dm0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public em0 f76731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f76732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em0 f76733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm0(em0 em0Var, rj.c cVar) {
        super(cVar);
        this.f76733d = em0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f76732c = obj;
        this.f76734e |= Integer.MIN_VALUE;
        return this.f76733d.a(null, this);
    }
}
