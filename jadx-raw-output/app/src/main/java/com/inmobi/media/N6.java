package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class N6 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Yc f23195a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6(Yc yc2, rj.c cVar) {
        super(2, cVar);
        this.f23195a = yc2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new N6(this.f23195a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new N6(this.f23195a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Yc yc2 = this.f23195a;
        Hc hc2 = yc2.f23273d;
        G g10 = yc2.f25754a.f25677b;
        hc2.onAdFetchSuccessful(new AdMetaInfo(g10.f22696e, g10.f22703l));
        return mj.r.f64562a;
    }
}
