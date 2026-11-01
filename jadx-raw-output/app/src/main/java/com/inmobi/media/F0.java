package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class F0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f22616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(H0 h10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22616b = h10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22615a = obj;
        this.f22617c |= Integer.MIN_VALUE;
        return this.f22616b.a(this);
    }
}
