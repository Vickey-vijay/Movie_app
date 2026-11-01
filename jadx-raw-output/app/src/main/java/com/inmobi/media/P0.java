package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class P0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bk.l f23306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R0 f23308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(R0 r10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23308c = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23307b = obj;
        this.f23309d |= Integer.MIN_VALUE;
        return this.f23308c.a((bk.l) null, this);
    }
}
