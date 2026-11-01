package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2884ge extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3182se f24424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2884ge(C3182se c3182se, boolean z10, rj.c cVar) {
        super(2, cVar);
        this.f24424a = c3182se;
        this.f24425b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2884ge(this.f24424a, this.f24425b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2884ge(this.f24424a, this.f24425b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f24424a.f25323h.onAudioStateChanged(this.f24425b);
        return mj.r.f64562a;
    }
}
