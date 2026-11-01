package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class D8 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f22507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2860fg f22508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F8 f22510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8(F8 f10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22510d = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22509c = obj;
        this.f22511e |= Integer.MIN_VALUE;
        return this.f22510d.b(null, this);
    }
}
