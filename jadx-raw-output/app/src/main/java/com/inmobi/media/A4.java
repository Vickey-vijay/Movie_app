package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class A4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4 f22343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(C4 c10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22343b = c10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22342a = obj;
        this.f22344c |= Integer.MIN_VALUE;
        return this.f22343b.a(this);
    }
}
