package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3001l7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f24749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3001l7(C3026m7 c3026m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24751c = c3026m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24750b = obj;
        this.f24752d |= Integer.MIN_VALUE;
        return this.f24751c.e(this);
    }
}
