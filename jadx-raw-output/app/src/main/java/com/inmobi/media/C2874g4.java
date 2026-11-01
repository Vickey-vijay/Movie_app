package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2874g4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2924i4 f24404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2874g4(C2924i4 c2924i4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24404b = c2924i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24403a = obj;
        this.f24405c |= Integer.MIN_VALUE;
        return this.f24404b.b(this);
    }
}
