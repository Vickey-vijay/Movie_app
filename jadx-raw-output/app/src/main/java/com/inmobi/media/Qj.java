package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Qj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wj f23404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qj(Wj wj2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23404b = wj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23403a = obj;
        this.f23405c |= Integer.MIN_VALUE;
        return this.f23404b.a((ContinuationImpl) this);
    }
}
