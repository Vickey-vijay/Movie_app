package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3162rj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3287wj f25273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3162rj(C3287wj c3287wj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25273b = c3287wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25272a = obj;
        this.f25274c |= Integer.MIN_VALUE;
        return this.f25273b.a(this);
    }
}
