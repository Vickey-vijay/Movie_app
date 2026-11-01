package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class vu2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zu2 f84010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q61 f84011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w5 f84012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v5 f84013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f84014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f84015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zu2 f84016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu2(zu2 zu2Var, rj.c cVar) {
        super(cVar);
        this.f84016h = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84015g = obj;
        this.f84017i |= Integer.MIN_VALUE;
        return this.f84016h.a(null, this);
    }
}
