package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2829eb extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2855fb f24308a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2829eb(C2855fb c2855fb, rj.c cVar) {
        super(2, cVar);
        this.f24308a = c2855fb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2829eb(this.f24308a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2829eb(this.f24308a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C2855fb c2855fb = this.f24308a;
        c2855fb.f24366f.onAdLoadFailed(c2855fb.f24365e);
        return mj.r.f64562a;
    }
}
