package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class D7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f22506a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(rj.c cVar, N7 n10) {
        super(2, cVar);
        this.f22506a = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new D7(cVar, this.f22506a);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new D7((rj.c) obj2, this.f22506a).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f22506a.f23211p.pause();
        this.f22506a.f23219x.a();
        S7 s10 = this.f22506a.f23220y;
        s10.f23490b.setVolume(0.0f);
        s10.f23492d.a();
        N7 n10 = this.f22506a;
        n10.f23207l.set(EnumC3184sg.STATE_PAUSED);
        N7 n11 = this.f22506a;
        n11.a(new Om(n11.f23211p.getCurrentPosition()));
        return mj.r.f64562a;
    }
}
