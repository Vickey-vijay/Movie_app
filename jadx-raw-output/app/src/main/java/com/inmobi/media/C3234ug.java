package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3234ug extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3284wg f25480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3234ug(C3284wg c3284wg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25480b = c3284wg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25479a = obj;
        this.f25481c |= Integer.MIN_VALUE;
        return C3284wg.a(this.f25480b, this);
    }
}
