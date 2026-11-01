package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3259vg extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3284wg f25574a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3259vg(C3284wg c3284wg, rj.c cVar) {
        super(2, cVar);
        this.f25574a = c3284wg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3259vg(this.f25574a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3259vg(this.f25574a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3284wg c3284wg = this.f25574a;
        c3284wg.f25647b.setValue(c3284wg.f25646a.a());
        return mj.r.f64562a;
    }
}
