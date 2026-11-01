package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Qd extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sd f23385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qd(Sd sd2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23385b = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23384a = obj;
        this.f23386c |= Integer.MIN_VALUE;
        return this.f23385b.a(null, this);
    }
}
