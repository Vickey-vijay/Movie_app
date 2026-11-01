package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class C8 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f22454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F8 f22456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(F8 f10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22456c = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22455b = obj;
        this.f22457d |= Integer.MIN_VALUE;
        return this.f22456c.a((Rf) null, this);
    }
}
