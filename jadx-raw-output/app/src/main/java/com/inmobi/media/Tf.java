package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Tf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uf f23562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tf(Uf uf2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23562b = uf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23561a = obj;
        this.f23563c |= Integer.MIN_VALUE;
        return this.f23562b.b(this);
    }
}
