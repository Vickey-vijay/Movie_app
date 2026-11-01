package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Uk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Yk f23656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uk(Yk yk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23656b = yk2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23655a = obj;
        this.f23657c |= Integer.MIN_VALUE;
        return this.f23656b.b(this);
    }
}
