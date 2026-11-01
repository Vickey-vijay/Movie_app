package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class T0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f23545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(U0 u10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23545b = u10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23544a = obj;
        this.f23546c |= Integer.MIN_VALUE;
        return this.f23545b.a(null, this);
    }
}
