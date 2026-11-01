package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3060ng extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3085og f24901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3060ng(C3085og c3085og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24901b = c3085og;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24900a = obj;
        this.f24902c |= Integer.MIN_VALUE;
        return this.f24901b.a(null, null, 0L, this);
    }
}
