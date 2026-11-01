package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2951j7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f24592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2951j7(C3026m7 c3026m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24594c = c3026m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24593b = obj;
        this.f24595d |= Integer.MIN_VALUE;
        return this.f24594c.d(this);
    }
}
