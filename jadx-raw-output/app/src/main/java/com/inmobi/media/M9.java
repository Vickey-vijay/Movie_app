package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class M9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N9 f23152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9(N9 n10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23152b = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23151a = obj;
        this.f23153c |= Integer.MIN_VALUE;
        return this.f23152b.b(0, this);
    }
}
