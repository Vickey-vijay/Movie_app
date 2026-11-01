package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Yd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2729ae f23846a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yd(C2729ae c2729ae, rj.c cVar) {
        super(2, cVar);
        this.f23846a = c2729ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Yd(this.f23846a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Yd(this.f23846a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f23846a.f23998g.setActivated(true);
        this.f23846a.f23998g.setFocusable(true);
        C2729ae c2729ae = this.f23846a;
        if (c2729ae.f24000i) {
            c2729ae.a();
        } else {
            P4.a(c2729ae.f23993b, new Zd(c2729ae, null));
        }
        return mj.r.f64562a;
    }
}
