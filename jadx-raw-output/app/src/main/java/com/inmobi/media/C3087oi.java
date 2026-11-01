package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3087oi extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3161ri f25002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f25003b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3087oi(AbstractC3161ri abstractC3161ri, Map map, rj.c cVar) {
        super(2, cVar);
        this.f25002a = abstractC3161ri;
        this.f25003b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3087oi(this.f25002a, this.f25003b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3087oi(this.f25002a, this.f25003b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f25002a.f25270d.onAdClicked(this.f25003b);
        return mj.r.f64562a;
    }
}
