package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Ul extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2990kl f23658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f23660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ul(Wl wl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23660c = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23659b = obj;
        this.f23661d |= Integer.MIN_VALUE;
        return this.f23660c.a((C2990kl) null, (C3116pm) null, this);
    }
}
