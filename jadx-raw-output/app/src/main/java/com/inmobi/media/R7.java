package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class R7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S7 f23440a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(S7 s10, rj.c cVar) {
        super(2, cVar);
        this.f23440a = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new R7(this.f23440a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new R7(this.f23440a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        if (this.f23440a.f23492d.d()) {
            S7 s10 = this.f23440a;
            s10.f23490b.setVolume(1.0f);
            P4.a(s10.f23491c, s10.f23489a, new S1(1.0f, false));
            s10.f23493e = false;
        } else {
            this.f23440a.a();
        }
        return mj.r.f64562a;
    }
}
