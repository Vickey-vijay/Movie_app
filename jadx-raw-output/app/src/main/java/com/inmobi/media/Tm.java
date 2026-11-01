package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Tm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Um f23592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tm(Um um2, rj.c cVar) {
        super(cVar);
        this.f23592c = um2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23590a = obj;
        this.f23591b |= Integer.MIN_VALUE;
        return this.f23592c.emit(null, this);
    }
}
