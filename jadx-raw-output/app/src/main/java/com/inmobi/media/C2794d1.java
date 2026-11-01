package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2794d1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2819e1 f24210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionType f24211b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2794d1(AbstractC2819e1 abstractC2819e1, InteractionType interactionType, rj.c cVar) {
        super(2, cVar);
        this.f24210a = abstractC2819e1;
        this.f24211b = interactionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2794d1(this.f24210a, this.f24211b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2794d1(this.f24210a, this.f24211b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        MediaEvents mediaEvents = this.f24210a.f24280d;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(this.f24211b);
        }
        return mj.r.f64562a;
    }
}
