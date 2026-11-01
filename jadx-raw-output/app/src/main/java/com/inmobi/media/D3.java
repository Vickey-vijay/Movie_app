package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class D3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22494b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22493a = obj;
        this.f22494b |= Integer.MIN_VALUE;
        return F3.a((C3136qh) null, (bk.l) null, this);
    }

    public D3(rj.c cVar) {
        super(cVar);
    }
}
