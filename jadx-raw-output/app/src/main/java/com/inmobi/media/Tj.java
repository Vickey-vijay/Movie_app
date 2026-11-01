package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Tj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23583b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23582a = obj;
        this.f23583b |= Integer.MIN_VALUE;
        return Wj.b(this);
    }

    public Tj(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
