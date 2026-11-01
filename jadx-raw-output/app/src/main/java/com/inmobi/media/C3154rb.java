package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3154rb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3304xb f25257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3154rb(C3304xb c3304xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25257b = c3304xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25256a = obj;
        this.f25258c |= Integer.MIN_VALUE;
        return this.f25257b.a(0L, 0, this);
    }
}
