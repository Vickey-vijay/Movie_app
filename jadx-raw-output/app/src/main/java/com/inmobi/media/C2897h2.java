package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2897h2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cc f24474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2897h2(Cc cc2, rj.c cVar) {
        super(2, cVar);
        this.f24474a = cc2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2897h2(this.f24474a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2897h2(this.f24474a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        AdEvents adEvents = this.f24474a.f24281e;
        if (adEvents != null) {
            adEvents.loaded();
        }
        return mj.r.f64562a;
    }
}
