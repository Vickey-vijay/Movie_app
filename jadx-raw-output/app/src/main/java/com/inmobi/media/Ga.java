package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Ga extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q9 f22724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ La f22726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga(La la2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22726c = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22725b = obj;
        this.f22727d |= Integer.MIN_VALUE;
        return La.a(this.f22726c, null, this);
    }
}
