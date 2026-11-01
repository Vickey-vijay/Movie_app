package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Rj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wj f23469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rj(Wj wj2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23469c = wj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23468b = obj;
        this.f23470d |= Integer.MIN_VALUE;
        return this.f23469c.a((rj.c) this);
    }
}
