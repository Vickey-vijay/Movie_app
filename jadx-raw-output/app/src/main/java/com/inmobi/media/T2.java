package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class T2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f23549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(W2 w10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23549b = w10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23548a = obj;
        this.f23550c |= Integer.MIN_VALUE;
        return this.f23549b.a(0, 0, this);
    }
}
