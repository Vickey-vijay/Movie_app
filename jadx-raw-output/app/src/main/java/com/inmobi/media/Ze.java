package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Ze extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f23910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2782cf f23912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ze(C2782cf c2782cf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23912c = c2782cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23911b = obj;
        this.f23913d |= Integer.MIN_VALUE;
        return this.f23912c.c(this);
    }
}
