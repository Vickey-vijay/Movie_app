package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3179sb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3304xb f25316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3179sb(C3304xb c3304xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25316b = c3304xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25315a = obj;
        this.f25317c |= Integer.MIN_VALUE;
        return this.f25316b.a(this);
    }
}
