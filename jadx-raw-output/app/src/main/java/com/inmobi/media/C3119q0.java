package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3119q0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3168s0 f25127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3119q0(C3168s0 c3168s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25127b = c3168s0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25126a = obj;
        this.f25128c |= Integer.MIN_VALUE;
        return this.f25127b.a(null, this);
    }
}
