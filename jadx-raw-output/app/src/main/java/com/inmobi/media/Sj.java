package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Sj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2838ek f23527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Wj f23530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sj(Wj wj2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23530d = wj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23529c = obj;
        this.f23531e |= Integer.MIN_VALUE;
        return this.f23530d.a(null, this);
    }
}
