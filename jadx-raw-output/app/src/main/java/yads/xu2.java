package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class xu2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5 f84696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v5 f84697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f84698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zu2 f84699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84700f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(zu2 zu2Var, rj.c cVar) {
        super(cVar);
        this.f84699e = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84698d = obj;
        this.f84700f |= Integer.MIN_VALUE;
        return this.f84699e.b(null, this);
    }
}
