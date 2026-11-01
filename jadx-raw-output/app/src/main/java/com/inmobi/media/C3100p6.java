package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3100p6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3224u6 f25042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3100p6(C3224u6 c3224u6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25042e = c3224u6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25041d = obj;
        this.f25043f |= Integer.MIN_VALUE;
        return this.f25042e.a(0, this);
    }
}
