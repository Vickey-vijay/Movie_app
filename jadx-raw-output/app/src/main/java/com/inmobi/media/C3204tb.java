package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3204tb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3304xb f25382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3204tb(C3304xb c3304xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25382b = c3304xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25381a = obj;
        this.f25383c |= Integer.MIN_VALUE;
        return this.f25382b.b(this);
    }
}
