package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class uh2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f83466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh2 f83467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh2(xh2 xh2Var, rj.c cVar) {
        super(cVar);
        this.f83467c = xh2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f83466b = obj;
        this.f83468d |= Integer.MIN_VALUE;
        return xh2.a(0L, null, null, null, this.f83467c, null, this);
    }
}
