package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2797d4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2924i4 f24217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2797d4(C2924i4 c2924i4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24217b = c2924i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24216a = obj;
        this.f24218c |= Integer.MIN_VALUE;
        return this.f24217b.a(this);
    }
}
