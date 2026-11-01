package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class vp1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f83976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f83977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f83978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp1(com.monetization.ads.mediation.base.initialize.a aVar, rj.c cVar) {
        super(cVar);
        this.f83978d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f83977c = obj;
        this.f83979e |= Integer.MIN_VALUE;
        return this.f83978d.a(null, null, this);
    }
}
