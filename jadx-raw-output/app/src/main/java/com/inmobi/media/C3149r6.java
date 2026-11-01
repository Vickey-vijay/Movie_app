package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3149r6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3224u6 f25238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3149r6(C3224u6 c3224u6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25238c = c3224u6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25237b = obj;
        this.f25239d |= Integer.MIN_VALUE;
        return C3224u6.a(this.f25238c, this);
    }
}
