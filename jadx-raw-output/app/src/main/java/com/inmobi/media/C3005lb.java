package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3005lb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f24760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3030mb f24762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3005lb(C3030mb c3030mb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24762c = c3030mb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24761b = obj;
        this.f24763d |= Integer.MIN_VALUE;
        return this.f24762c.a(this);
    }
}
