package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class eh2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f77075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fh2 f77076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh2(fh2 fh2Var, rj.c cVar) {
        super(cVar);
        this.f77076c = fh2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f77075b = obj;
        this.f77077d |= Integer.MIN_VALUE;
        return this.f77076c.a(null, null, this);
    }
}
