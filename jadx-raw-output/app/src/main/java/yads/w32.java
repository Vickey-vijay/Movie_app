package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class w32 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z32 f84093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mi2 f84094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ry1 f84095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w5 f84096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v5 f84097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f84098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z32 f84099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84100i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w32(z32 z32Var, rj.c cVar) {
        super(cVar);
        this.f84099h = z32Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84098g = obj;
        this.f84100i |= Integer.MIN_VALUE;
        return this.f84099h.a(null, null, null, this);
    }
}
