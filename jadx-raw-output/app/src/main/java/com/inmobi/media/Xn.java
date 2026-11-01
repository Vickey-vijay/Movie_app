package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Xn extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Yn f23809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xn(Yn yn2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23809b = yn2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23808a = obj;
        this.f23810c |= Integer.MIN_VALUE;
        return this.f23809b.a(this);
    }
}
