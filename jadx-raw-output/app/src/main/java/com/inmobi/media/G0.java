package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class G0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f22707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(H0 h10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22707b = h10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22706a = obj;
        this.f22708c |= Integer.MIN_VALUE;
        return this.f22707b.a(null, this);
    }
}
