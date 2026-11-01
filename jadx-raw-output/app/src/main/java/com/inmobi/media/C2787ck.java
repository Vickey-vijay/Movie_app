package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2787ck extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2813dk f24199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2787ck(C2813dk c2813dk, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24199b = c2813dk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24198a = obj;
        this.f24200c |= Integer.MIN_VALUE;
        return this.f24199b.b(0, this);
    }
}
