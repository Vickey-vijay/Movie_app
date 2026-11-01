package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2768c1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2819e1 f24109a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2768c1(AbstractC2819e1 abstractC2819e1, rj.c cVar) {
        super(2, cVar);
        this.f24109a = abstractC2819e1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2768c1(this.f24109a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2768c1(this.f24109a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        AdSession adSession = this.f24109a.f24279c;
        if (adSession != null) {
            adSession.finish();
        }
        this.f24109a.f24279c = null;
        return mj.r.f64562a;
    }
}
