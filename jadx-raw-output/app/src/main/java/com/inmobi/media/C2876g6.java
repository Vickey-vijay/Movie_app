package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2876g6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3000l6 f24409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2876g6(C3000l6 c3000l6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24409c = c3000l6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24408b = obj;
        this.f24410d |= Integer.MIN_VALUE;
        return this.f24409c.a(0L, this);
    }
}
