package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3010lg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3085og f24776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3010lg(C3085og c3085og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24776b = c3085og;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24775a = obj;
        this.f24777c |= Integer.MIN_VALUE;
        return this.f24776b.a(null, null, this);
    }
}
