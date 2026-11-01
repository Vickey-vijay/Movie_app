package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class yu2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zu2 f85118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w5 f85119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v5 f85120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f85121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zu2 f85122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85123g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu2(zu2 zu2Var, rj.c cVar) {
        super(cVar);
        this.f85122f = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f85121e = obj;
        this.f85123g |= Integer.MIN_VALUE;
        return this.f85122f.a(this);
    }
}
