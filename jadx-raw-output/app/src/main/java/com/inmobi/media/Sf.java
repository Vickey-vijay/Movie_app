package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Sf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uf f23521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sf(Uf uf2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23521b = uf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23520a = obj;
        this.f23522c |= Integer.MIN_VALUE;
        return this.f23521b.a(this);
    }
}
