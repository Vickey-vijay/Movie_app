package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3096p2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f25029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3170s2 f25031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3096p2(AbstractC3170s2 abstractC3170s2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25031c = abstractC3170s2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25030b = obj;
        this.f25032d |= Integer.MIN_VALUE;
        return AbstractC3170s2.b(this.f25031c, this);
    }
}
