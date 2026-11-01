package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Tk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23585b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23584a = obj;
        this.f23585b |= Integer.MIN_VALUE;
        return Yk.a(this);
    }

    public Tk(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
