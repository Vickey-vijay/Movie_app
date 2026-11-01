package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class U2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f23610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(W2 w10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23610b = w10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23609a = obj;
        this.f23611c |= Integer.MIN_VALUE;
        return this.f23610b.a(this);
    }
}
