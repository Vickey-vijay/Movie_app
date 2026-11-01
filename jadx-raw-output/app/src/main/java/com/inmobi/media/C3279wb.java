package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3279wb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3304xb f25631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3279wb(C3304xb c3304xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25631b = c3304xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25630a = obj;
        this.f25632c |= Integer.MIN_VALUE;
        return this.f25631b.b((C3130qb) null, this);
    }
}
