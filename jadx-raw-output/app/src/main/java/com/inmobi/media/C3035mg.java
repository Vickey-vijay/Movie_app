package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3035mg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3085og f24832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3035mg(C3085og c3085og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24832b = c3085og;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24831a = obj;
        this.f24833c |= Integer.MIN_VALUE;
        return this.f24832b.b(null, null, this);
    }
}
