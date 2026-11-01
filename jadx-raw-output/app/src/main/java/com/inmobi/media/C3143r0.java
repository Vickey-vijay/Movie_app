package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3143r0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3168s0 f25215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3143r0(C3168s0 c3168s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25215b = c3168s0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25214a = obj;
        this.f25216c |= Integer.MIN_VALUE;
        return this.f25215b.b(null, this);
    }
}
