package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2901h6 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2824e6 f24482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3000l6 f24484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2901h6(C2824e6 c2824e6, boolean z10, C3000l6 c3000l6, rj.c cVar) {
        super(2, cVar);
        this.f24482a = c2824e6;
        this.f24483b = z10;
        this.f24484c = c3000l6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2901h6(this.f24482a, this.f24483b, this.f24484c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2901h6) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        return mj.r.f64562a;
    }
}
