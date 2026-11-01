package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3071o2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f24943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3170s2 f24945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3071o2(AbstractC3170s2 abstractC3170s2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24945c = abstractC3170s2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24944b = obj;
        this.f24946d |= Integer.MIN_VALUE;
        return AbstractC3170s2.a(this.f24945c, this);
    }
}
