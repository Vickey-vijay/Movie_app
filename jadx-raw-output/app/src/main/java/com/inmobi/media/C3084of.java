package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3084of extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3109pf f24995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3084of(C3109pf c3109pf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24995b = c3109pf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24994a = obj;
        this.f24996c |= Integer.MIN_VALUE;
        return this.f24995b.a(null, null, this);
    }
}
