package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3220u2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3295x2 f25425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastProperties f25426b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3220u2(AbstractC3295x2 abstractC3295x2, VastProperties vastProperties, rj.c cVar) {
        super(2, cVar);
        this.f25425a = abstractC3295x2;
        this.f25426b = vastProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3220u2(this.f25425a, this.f25426b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3220u2(this.f25425a, this.f25426b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        AdEvents adEvents = this.f25425a.f24281e;
        if (adEvents != null) {
            adEvents.loaded(this.f25426b);
        }
        return mj.r.f64562a;
    }
}
