package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Z3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2719a4 f23887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23888c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(C2719a4 c2719a4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23887b = c2719a4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23886a = obj;
        this.f23888c |= Integer.MIN_VALUE;
        return this.f23887b.a(this);
    }
}
